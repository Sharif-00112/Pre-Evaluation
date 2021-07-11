package com.example.restservice.models.Student;


import javax.persistence.*;


@Entity
@Table(name = "StudentInfo")

public class StudentInfo{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reg_id;

    @Column(name = "institution_id")
    private String institution_id;

    @Column(name = "student_id")
    private String student_id;

    @Column(name = "present_address")
    private String present_address;
    
    @Column(name = "permanent_address")
    private String permanent_address;
    
    @Column(name = "contact_no")
    private long contact_no;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "photo")
    private String photo;
    
    @Column(name = "created_on")
    private String created_on;
    
    @Column(name = "created_by")
    private String created_by;
    
    @Column(name = "academic_info")
    private String academic_info;

    public StudentInfo() {
    	
    }

	public StudentInfo(long reg_id, String institution_id, String student_id, String present_address,
			String permanent_address, long contact_no, String email, String photo, String created_on, String created_by,
			String academic_info) {
		this.reg_id = reg_id;
		this.institution_id = institution_id;
		this.student_id = student_id;
		this.present_address = present_address;
		this.permanent_address = permanent_address;
		this.contact_no = contact_no;
		this.email = email;
		this.photo = photo;
		this.created_on = created_on;
		this.created_by = created_by;
		this.academic_info = academic_info;
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

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getAcademic_info() {
		return academic_info;
	}

	public void setAcademic_info(String academic_info) {
		this.academic_info = academic_info;
	}

	@Override
	public String toString() {
		return "StudentInfo [reg_id=" + reg_id + ", institution_id=" + institution_id + ", student_id=" + student_id
				+ ", present_address=" + present_address + ", permanent_address=" + permanent_address + ", contact_no="
				+ contact_no + ", email=" + email + ", photo=" + photo + ", created_on=" + created_on + ", created_by="
				+ created_by + ", academic_info=" + academic_info + "]";
	}
    
		
	
}