package com.example.bookstore.book.service;

import com.example.bookstore.book.model.Book;
import com.example.bookstore.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book createBook(Book book){

        return  repository.save(book);
    }
    public List<Book> getBookList(){
        return repository.findAll();
    }
    public void deleteBook(int id){
        repository.deleteById(id);
    }
    public Optional<Book> getBookById(int id){
        return repository.findById(id);
    }
}

