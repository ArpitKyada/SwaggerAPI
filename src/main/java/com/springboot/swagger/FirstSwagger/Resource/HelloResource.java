package com.springboot.swagger.FirstSwagger.Resource;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloResource {
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }

}
