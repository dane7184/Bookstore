package com.example.bookstore.employee.controller;

import com.example.bookstore.employee.model.Employee;
import com.example.bookstore.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api/v1/example/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) { this.service = service; }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(service.createEmployee(employee), HttpStatus.OK);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<Object> getEmployeeList(){

        return new ResponseEntity<>(service.getEmployeeList(), HttpStatus.OK);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(service.createEmployee(employee), HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteEmployee(@PathVariable int id){
        service.deleleEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getEmployeeById(@PathVariable int id){

        return new ResponseEntity<>(service.getEmployeeById(id), HttpStatus.OK);
    }

}
