package com.simple.rest.api.simpleRestApi.com.simple.rest.api.simpleRestApi.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kkumar1 on 6/19/19.
 */

@Configuration
@EnableAutoConfiguration
@RestController

public class HelloWorldService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET,headers="Accept=application/json")
    public String sayHello()
    {
        return "Hello world!";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET,headers="Accept=application/json")
    public String giveError()
    {
        return "Error!";
    }

}
