package com.example.bookstore.book.controller;

import com.example.bookstore.book.model.Book;
import com.example.bookstore.book.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/v1/example/book")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Object> createBook(@RequestBody Book book){

        return new ResponseEntity<>(service.createBook(book), HttpStatus.OK);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<Object> getBookList(){

        return new ResponseEntity<>(service.getBookList(), HttpStatus.OK);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Object> updateBook(@RequestBody Book book){

        return new ResponseEntity<>(service.createBook(book), HttpStatus.OK);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteBook(@PathVariable int id){
        service.deleteBook(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getBookById(@PathVariable int id){


        return new ResponseEntity<>(service.getBookById(id),HttpStatus.OK);
    }

}
