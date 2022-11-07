package com.example.bookstore.student.controller;

import com.example.bookstore.student.model.Student;
import com.example.bookstore.student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api/v1/example/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service){this.service = service;}

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Object> createStudent(@RequestBody Student student){

        return new ResponseEntity<>(service.createStudent(student), HttpStatus.OK);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<Object> getStudentList(){

        return new ResponseEntity<>(service.getStudentList(), HttpStatus.OK);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Object> updateStudent(@RequestBody Student student){

        return new ResponseEntity<>(service.createStudent(student), HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable int id){
        service.deleteStudent(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getStudentById(@PathVariable int id){


        return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
    }

}
