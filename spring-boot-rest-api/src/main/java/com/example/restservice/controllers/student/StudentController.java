package com.example.restservice.controllers.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.example.restservice.repository.StudentRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
    StudentRepository studentRepository;
	
	//1 | User Create API
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
	
	
	//2 | Get user List API
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
	
	
	//3 | Update user API
	@PutMapping("/students/{reg_id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("reg_id") long reg_id, @RequestBody Student student) {
        Optional<Student> studentData = studentRepository.findById(reg_id);

        if (studentData.isPresent()) {
        	Student _student = studentData.get();
        	_student.setInstitution_id(student.getInstitution_id());
        	_student.setStudent_id(student.getStudent_id());
        	_student.setFirst_name(student.getFirst_name());
        	_student.setLast_name(student.getLast_name());
        	_student.setDate_of_birth(student.getDate_of_birth());
        	_student.setGender(student.getGender());
        	_student.setEmail(student.getEmail());
            return new ResponseEntity<>(studentRepository.save(_student), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	
	//4 | Delete all user API
	@DeleteMapping("/students")
    public ResponseEntity<HttpStatus> deleteAllStudents() {
        try {
        	studentRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	
	//5 | Get user by Id API
	@GetMapping("/students/{reg_id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("reg_id") long reg_id) {
        Optional<Student> studentData = studentRepository.findById(reg_id);

        if (studentData.isPresent()) {
            return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	/*
	//6 | Get user by first name API
	@GetMapping("/students/{first_name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable("first_name") String first_name) {
        Optional<Student> studentData = studentRepository.findByFirstName(first_name);

        if (studentData.isPresent()) {
            return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	*/
	
	//7 | Delete user by ID API
	@DeleteMapping("/students/{reg_id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("reg_id") long reg_id) {
        try {
        	studentRepository.deleteById(reg_id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	

	
}