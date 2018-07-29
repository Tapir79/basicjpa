package fi.tapir.basicjpa.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/rest/admin/test/**")
                .hasAnyRole("admin").and().formLogin();
        http.csrf().disable().authorizeRequests()
                .antMatchers("/rest/hello/**")
                .hasAnyRole("admin", "user").and().formLogin();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("admin", "user");
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("user")
                .roles("user");

    }

}
