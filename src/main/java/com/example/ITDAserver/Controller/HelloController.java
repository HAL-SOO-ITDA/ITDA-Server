package com.example.ITDAserver.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    @ResponseBody
    public String Hello() {
        return "Hello from Spring boot.";
    }
}