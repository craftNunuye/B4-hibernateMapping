package com.orm_JPA_CapstoneProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	private int user_id;
	@Column(length=45)
	private String fname;
	@Column(length=45)
	private String lname;
	
	@Column(insertable=false, updatable = false)
	private int role_id;
	
	private String address;
	private String phone;
	private String email;
	private String password;

	@OneToMany(mappedBy="users")
	private List<User_policy> userPolicy = new ArrayList<User_policy>();

	@ManyToOne(targetEntity = Role_type.class )
	@JoinColumn(name="role_id")
	private Role_type role_type;
	
	

	
	
	public Users() {
		super();
	}

	public Users(int user_id, String fname, String lname, int role_id, String address, String phone, String email,
			String password, List<User_policy> userPolicy, Role_type role_type) {
		super();
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.role_id = role_id;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.userPolicy = userPolicy;
		this.role_type = role_type;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User_policy> getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(List<User_policy> userPolicy) {
		this.userPolicy = userPolicy;
	}

	public Role_type getRole_type() {
		return role_type;
	}

	public void setRole_type(Role_type role_type) {
		this.role_type = role_type;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", role_id=" + role_id
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", userPolicy=" + userPolicy + ", role_type=" + role_type + "]";
	}
	
}
