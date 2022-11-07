package com.example.bookstore.borrow.controller;

import com.example.bookstore.borrow.model.Borrow;
import com.example.bookstore.borrow.service.BorrowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api/v1/example/borrow")
public class BorrowController {
    private final BorrowService service;

    public BorrowController(BorrowService service) {
        this.service = service;
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Object> borrowBook(@RequestBody Borrow borrow){
        return new ResponseEntity<>(service.borrowBook(borrow), HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBorrowById(@PathVariable int id){

        return new ResponseEntity<>(service.getBorrowById(id), HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteBorrow(@PathVariable int id) {
        service.deleteBorrow(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateBorrow(@RequestBody Borrow borrow){
        return new ResponseEntity<>(service.borrowBook(borrow), HttpStatus.OK);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<Object> getBorrowList(){

        return new ResponseEntity<>(service.getborrowList(), HttpStatus.OK);
    }
}
