package com.example.bookstore.employee.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @NotNull
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private double selary;

    public Employee(int id, String name, int age, double selary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.selary = selary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSelary() {
        return selary;
    }

    public void setSelary(double selary) {
        this.selary = selary;
    }
}
