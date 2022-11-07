package com.example.bookstore.borrow.service;

import com.example.bookstore.borrow.model.Borrow;
import com.example.bookstore.borrow.repository.BorrowRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowService {

    private final BorrowRepository repository;

    public BorrowService(BorrowRepository repository) {
        this.repository = repository;
    }

    public Borrow borrowBook(Borrow borrow) {
        borrow.setBorrowDate(new Date());
        borrow.setCreateDate(new Date());
        borrow.setStatus('A');
        return repository.save(borrow);
    }
    public void deleteBorrow(int id){repository.deleteById(id);}
    public Optional<Borrow> getBorrowById(int id){ return repository.findById(id);}
    public List<Borrow> getborrowList(){return repository.findAll();}
}
