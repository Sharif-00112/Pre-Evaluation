package com.example.restservice.controllers.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.models.Student.Student;
import com.example.restservice.models.tutorial.Tutorial;
import com.example.restservice.repository.StudentRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
    StudentRepository studentRepository;
	
	@PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        try {
        	Student _student = studentRepository
                    .save(new Student(student.getReg_id(), student.getInstitution_id(), student.getStudent_id(), student.getFirst_name(), student.getLast_name(), student.getDate_of_birth(), student.getGender(), student.getEmail()));
            return new ResponseEntity<>(_student, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
	@GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required = false) String first_name) {
        try {
            List<Student> students = new ArrayList<Student>();

            if (first_name == null)
            	studentRepository.findAll().forEach(students::add);
            else
            	studentRepository.findByFirstName(first_name).forEach(students::add);

            if (students.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
	
	
}