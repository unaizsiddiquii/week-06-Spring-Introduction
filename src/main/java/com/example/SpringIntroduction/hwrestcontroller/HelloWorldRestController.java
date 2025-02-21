package com.example.SpringIntroduction.hwrestcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//hello world in Rest Call
@RestController
public class HelloWorldRestController {

    @RequestMapping("/")
    public String index() {
        return "Hello From BridgeLabz";
    }
}
