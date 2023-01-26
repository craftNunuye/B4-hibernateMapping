package com.orm_JPA_CapstoneProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Policy_type {
	
	@Id
	private int policy_type_id;
	@Column(length=45)
	private String policy_type_name;
	@Column(length=500)
	private String description;
	
	@OneToMany(mappedBy="policy_type")
	private List <Policy> policy = new ArrayList<Policy>();
	

	public List<Policy> getPolicy() {
		return policy;
	}

	public void setPolicy(List<Policy> policy) {
		this.policy = policy;
	}

	public int getPolicy_type_id() {
		return policy_type_id;
	}

	public void setPolicy_type_id(int policy_type_id) {
		this.policy_type_id = policy_type_id;
	}

	public String getPolicy_type_name() {
		return policy_type_name;
	}

	public void setPolicy_type_name(String policy_type_name) {
		this.policy_type_name = policy_type_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Policy_type [policy_type_id=" + policy_type_id + ", policy_type_name=" + policy_type_name
				+ ", description=" + description + ", policy=" + policy + "]";
	}

	
}
