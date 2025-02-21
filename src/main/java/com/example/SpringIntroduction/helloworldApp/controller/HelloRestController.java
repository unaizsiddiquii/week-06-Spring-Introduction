package com.example.SpringIntroduction.helloworldApp.controller;

import com.example.SpringIntroduction.helloworldApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping({"/home"})
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestParam User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastname") String lastName) {
        return "Hello  " + firstName + " " + lastName + "!";
    }


}
