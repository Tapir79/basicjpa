package fi.tapir.basicjpa.controllers;

import fi.tapir.basicjpa.repos.TestEntity;
import fi.tapir.basicjpa.repos.TestService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public String hello() {

        return "Hello World";
    }


    @GetMapping(value="/admin/test")
    public List<TestEntity> getTest(){
        return testService.getAll();
    }


}
