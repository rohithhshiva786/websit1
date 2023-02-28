package com.example.demo.DatabaseExample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Child;

public interface childrepo extends JpaRepository<Child, Integer>{

}
