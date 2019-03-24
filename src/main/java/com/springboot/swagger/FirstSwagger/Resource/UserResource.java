package com.springboot.swagger.FirstSwagger.Resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(
                new User("Sam", 1000L),
                new User("Douglas", 2000L)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, 1000L);
    }

    private class User{
        private String userName;
        private Long Salary;

        public User(String userName, Long Salary) {
            this.userName = userName;
            this.Salary = Salary;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getSalary() {
            return Salary;
        }

        public void setSalary(Long Salary) {
           this.Salary = Salary;
        }
    }
}
