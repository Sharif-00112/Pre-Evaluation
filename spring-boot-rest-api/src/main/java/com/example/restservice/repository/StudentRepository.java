package com.example.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restservice.models.Student.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByID(long reg_id);
    List<Student> findByFirstName(String first_name);
    List<Student> findAll();
    void deleteAll();
    List<Student> deleteById(long reg_id);
    List<Student> save();

    
}