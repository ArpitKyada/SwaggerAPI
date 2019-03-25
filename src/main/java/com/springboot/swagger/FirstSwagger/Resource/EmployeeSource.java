package com.springboot.swagger.FirstSwagger.Resource;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/employee")
@Api(value = "Employee Resource", description ="Displays the Employee details" )
public class EmployeeSource {

    @GetMapping
    public List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee("Sam", 1000L),
                new Employee("Douglas", 2000L)
        );
    }

    @GetMapping("/{employeeName}")
    public Employee getEmployee(@PathVariable("employeeName") final String employeeName){
        return new Employee(employeeName, 1000L);
    }

    private class Employee{

        @ApiModelProperty(notes = "Name of the Employee")
        private String employeeName;
        @ApiModelProperty(notes = "Salary of the Employee")
        private Long Salary;

        public Employee(String employeeName, Long Salary) {
            this.employeeName = employeeName;
            this.Salary = Salary;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public Long getSalary() {
            return Salary;
        }

        public void setSalary(Long Salary) {
           this.Salary = Salary;
        }
    }
}
