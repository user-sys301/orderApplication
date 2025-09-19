package com.example.orderservice.orderservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
