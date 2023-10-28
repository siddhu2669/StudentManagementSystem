package com.example5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example5.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>
{

}