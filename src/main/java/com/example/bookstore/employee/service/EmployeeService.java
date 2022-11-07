package com.example.bookstore.employee.service;

import com.example.bookstore.employee.model.Employee;
import com.example.bookstore.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){this.repository= repository;}
    public Employee createEmployee(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> getEmployeeList(){return repository.findAll();}
    public void deleleEmployee(int id){repository.deleteById(id);}
    public Optional<Employee> getEmployeeById(int id){return repository.findById(id);}
}
