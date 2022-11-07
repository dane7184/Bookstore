package com.example.bookstore.student.service;

import com.example.bookstore.book.model.Book;
import com.example.bookstore.student.repository.StudentRepository;
import com.example.bookstore.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){this.repository = repository;}
    public Student createStudent(Student student){

        return repository.save(student);
    }
    public List<Student> getStudentList(){return repository.findAll();}
    public void deleteStudent(int id){repository.deleteById(id);}
    public Optional<Student> getStudentById(int id){return repository.findById(id);}
}
