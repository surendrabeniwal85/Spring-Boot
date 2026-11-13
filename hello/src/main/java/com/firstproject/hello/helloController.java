package com.firstproject.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/hello")
    public String hello()
    {
        return "<h1>Hello</h1>";
    }
    @GetMapping("/bye")
    public String bye()
    {
        return "<i>Bye</i>";
    }
}
