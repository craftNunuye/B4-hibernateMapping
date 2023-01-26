package com.orm_JPA_CapstoneProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role_type {
	
	
	@Id
	private int role_id;
	@Column(length=45)
	private String role_name;
	
	@OneToMany(mappedBy="role_type")
	private List<Users> users = new ArrayList<Users>();
	
	
	

	public Role_type() {
		super();
	}

	public Role_type(int role_id, String role_name, List<Users> users) {
		super();
		
		this.role_id = role_id;
		this.role_name = role_name;
		this.users = users;
	}

	

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role_type [role_id=" + role_id + ", role_name=" + role_name + ", users=" + users + "]";
	}

}
