package fi.tapir.basicjpa.controllers;

import org.aspectj.weaver.ast.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

    @GetMapping
    public String hello() {

        return "Hello World";
    }

    /*
    @GetMapping(value="/admin/test")
    public ResponseEntity getTest(){
        return testService.getAll();
    }

    */
}
