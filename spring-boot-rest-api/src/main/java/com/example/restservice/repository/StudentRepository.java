package com.example.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restservice.models.Student.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByID(String student_id);
    List<Student> findByFirstName(String first_name);
}