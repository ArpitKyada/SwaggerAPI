package com.springboot.swagger.FirstSwagger.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resource", description = "Displays the HelloWorld")
public class HelloResource {

    @ApiOperation(value = "Returns HelloWorld")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 Continue"),
                    @ApiResponse(code = 200, message = "GET Sucessfull")
            }
    )
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @ApiOperation(value = "Returns Users Input")
    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return hello;
    }

    @ApiOperation(value = "PUT method")
    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }

}
