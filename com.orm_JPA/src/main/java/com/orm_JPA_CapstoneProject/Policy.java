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
public class Policy {

	@Id
	private int policy_id;
	@Column(length=45)
	private String policy_name;
	@Column(length=45)
	private String description;
	

	@OneToMany(mappedBy="policy")
	private List<User_policy> userPolicy = new ArrayList<User_policy>();
	
	
	@ManyToOne(targetEntity = Policy_type.class )
	@JoinColumn(name="policy_type_id")
	private Policy_type policy_type;
	
	@Column(insertable = false, updatable = false)
	private int policy_type_id;

	public Policy() {
	super();
	}


	public Policy(int policy_id, String policy_name, String description, List<User_policy> userPolicy,
			Policy_type policy_type, int policy_type_id) {
		super();
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.description = description;
		this.userPolicy = userPolicy;
		this.policy_type = policy_type;
		this.policy_type_id = policy_type_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	

	public List<User_policy> getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(List<User_policy> userPolicy) {
		this.userPolicy = userPolicy;
	}

	public Policy_type getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(Policy_type policy_type) {
		this.policy_type = policy_type;
	}

	public int getPolicy_type_id() {
		return policy_type_id;
	}

	public void setPolicy_type_id(int policy_type_id) {
		this.policy_type_id = policy_type_id;
	}

	@Override
	public String toString() {
		return "Policy [policy_id=" + policy_id + ", policy_name=" + policy_name + ", description=" + description
				+ ", userPolicy=" + userPolicy + ", policy_type=" + policy_type + ", policy_type_id=" + policy_type_id
				+ "]";
	}


}
