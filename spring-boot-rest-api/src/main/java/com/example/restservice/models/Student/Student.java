package com.example.restservice.models.Student;


import javax.persistence.*;


@Entity
@Table(name = "Student")

public class Student{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reg_id;

    @Column(name = "institution_id")
    private String institution_id;

    @Column(name = "student_id")
    private String student_id;

    @Column(name = "first_name")
    private String first_name;
    
    @Column(name = "last_name")
    private String last_name;
    
    @Column(name = "date_of_birth")
    private String date_of_birth;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "email")
    private String email;

    
	public Student() {
	    	
	    }

	public Student(long reg_id, String institution_id, String student_id, String first_name, String last_name,
			String date_of_birth, String gender, String email) {
		this.reg_id = reg_id;
		this.institution_id = institution_id;
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.email = email;
	}


	public long getReg_id() {
		return reg_id;
	}


	public void setReg_id(long reg_id) {
		this.reg_id = reg_id;
	}


	public String getInstitution_id() {
		return institution_id;
	}


	public void setInstitution_id(String institution_id) {
		this.institution_id = institution_id;
	}


	public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [reg_id=" + reg_id + ", institution_id=" + institution_id + ", student_id=" + student_id
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", date_of_birth=" + date_of_birth
				+ ", gender=" + gender + ", email=" + email + "]";
	}
	
	
	
}