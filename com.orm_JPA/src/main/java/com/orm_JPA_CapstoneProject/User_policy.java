package com.orm_JPA_CapstoneProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User_policy {
	@Id
	private int user_policy_id;
	
	@Temporal(TemporalType.DATE)
	private Date offered_date;
	@Temporal(TemporalType.DATE)
	private Date expiry_date;
	private boolean is_active;
	
	
	@ManyToOne(targetEntity=Users.class)
	@JoinColumn(name="user_id")
	private Users users;
	
	@Column(insertable= false, updatable=false)
	private int user_id;
	
	
	@ManyToOne(targetEntity=Policy.class)
	@JoinColumn(name="policy_id")
	private Policy policy;
	
	@Column(insertable= false, updatable=false)
	private int policy_id;
	
	

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public int getUser_policy_id() {
		return user_policy_id;
	}

	public void setUser_policy_id(int user_policy_id) {
		this.user_policy_id = user_policy_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	

	public Date getOffered_date() {
		return offered_date;
	}

	public void setOffered_date(Date offered_date) {
		this.offered_date = offered_date;
	}
	

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "User_policy [user_policy_id=" + user_policy_id + ", offered_date=" + offered_date + ", expiry_date="
				+ expiry_date + ", is_active=" + is_active + ", users=" + users + ", user_id=" + user_id + ", policy="
				+ policy + ", policy_id=" + policy_id + "]";
	}

	
	
}
