package com.example.bookstore.book.repository;

import com.example.bookstore.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer> {
}
