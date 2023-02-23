package com.example.demo.Databaseexample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface employeerepo extends JpaRepository<Employee, Integer>
{

}
