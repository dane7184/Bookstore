package com.example.bookstore.borrow.model;

import com.example.bookstore.book.model.Book;
import com.example.bookstore.employee.model.Employee;
import com.example.bookstore.student.model.Student;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Borrow {
    @Id
    @NotNull
    @GeneratedValue
    private int id;
    @OneToOne
    private Book book;
    @OneToOne
    private Student student;
    @OneToOne
    private Employee employee;
    private Date borrowDate;
    private Character status;
    private Date createDate;

    public Borrow(int id, Book book, Student student, Employee employee, Date borrowDate, Character status, Date createDate) {
        this.id = id;
        this.book = book;
        this.student = student;
        this.employee = employee;
        this.borrowDate = borrowDate;
        this.status = status;
        this.createDate = createDate;
    }

    public Borrow() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
