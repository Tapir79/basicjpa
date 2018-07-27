package fi.tapir.basicjpa;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages = "fi.tapir.basicjpa.repos")
@EnableTransactionManagement
public class ApplicationConfig {

    @Bean
    public DataSource dataSource() {
        String url = "jdbc:postgresql://localhost";
        String port = "5433";

        DataSource dataSource = DataSourceBuilder.create().url(url + ":" + port + "/test")
                .driverClassName("org.postgresql.Driver").username("postgres").password("postgres").build();

        return dataSource;
    }
}