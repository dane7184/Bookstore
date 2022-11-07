package com.example.bookstore.borrow.repository;

import com.example.bookstore.borrow.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {

}
