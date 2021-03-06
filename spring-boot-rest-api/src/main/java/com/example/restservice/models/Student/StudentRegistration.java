package com.example.restservice.models.Student;


import javax.persistence.*;


@Entity
@Table(name = "StudentRegistration")

public class StudentRegistration{
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
    
    @Column(name = "registration_date")
    private String registration_date;
    
    @Column(name = "date_of_birth")
    private String date_of_birth;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "nid")
    private long nid;
    
    @Column(name = "occupation")
    private String occupation;

    
    public StudentRegistration() {
    	
    }
    
	public StudentRegistration(long reg_id, String institution_id, String student_id, String first_name,
			String last_name, String registration_date, String date_of_birth, String gender, int age, long nid,
			String occupation) {
		this.reg_id = reg_id;
		this.institution_id = institution_id;
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.registration_date = registration_date;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.age = age;
		this.nid = nid;
		this.occupation = occupation;
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

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getNid() {
		return nid;
	}

	public void setNid(long nid) {
		this.nid = nid;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "StudentRegistration [reg_id=" + reg_id + ", institution_id=" + institution_id + ", student_id="
				+ student_id + ", first_name=" + first_name + ", last_name=" + last_name + ", registration_date="
				+ registration_date + ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", age=" + age
				+ ", nid=" + nid + ", occupation=" + occupation + "]";
	}
		
	
}