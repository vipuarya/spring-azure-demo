package com.azure.azurelearning1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController
{
    @GetMapping("/msg")
    public String hello()
    {
        return "Hello, Springboot app deployed in Azure";
    }
}