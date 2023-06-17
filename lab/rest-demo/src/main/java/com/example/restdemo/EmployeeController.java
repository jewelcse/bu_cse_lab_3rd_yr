package com.example.restdemo;

// CRUD
// C- CREATE
// R- READ
// U - UPDATE
// D - DELETE

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/api/v1") // to set api's prefix
public class EmployeeController {

    @GetMapping("/headers")
    public void headers(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });

    }

    @GetMapping("/headers2")
    public void headers2(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        // get specific header
        System.out.println(request.getRemoteUser());
        System.out.println(request.getHeader("Accept"));
        System.out.println(request.getQueryString());

    }
    // to fetch we use getMapping
    // host:port/
    @GetMapping("/message")
    public String message(){
        return "Hello Rest Service!";
    }

    @GetMapping("/message2")
    public String customMessage(@RequestParam String data){
        return "Hello "+data;
    }

    // for data sorting
    @GetMapping("/message3")
    public String customMessage2(@RequestParam String uni, @RequestParam String dept){
        return "Hello "+uni + " " + dept;
    }

    // for dynamic routing @PathVariable is used mostly
    @GetMapping("/message4/{data}")
    public String customMessage4(@PathVariable String data){
        return "Hello "+data;
    }

    // header - application specific data
    // payload - data
    // serialization and deserialization
    @PostMapping("/save/employee")
    public void save(@RequestBody String name){ // payload - name
        System.out.println(name);
    }

    @PostMapping("/save2/employee")
    public void save(@RequestBody Employee employee){ // payload - employee
        System.out.println(employee.toString());
    }

    @PostMapping("/save3/employee")
    public Employee save3(@RequestBody Employee employee){ // payload - employee
        return employee;
    }

    // @PutMapping - for updating full object
    // @PatchMapping - for partial update
    // @DeletingMapping






}
