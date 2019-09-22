package com.example.demo.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;


@Entity
@Data
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String tname;
	
	private String task_owner;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "project_id" , nullable = true)
	private Project project;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",nullable = true)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	private User user;

	private Date start_date;
	
	private Date end_date;
	
	private String status;
	private String requirement_domain;
	
	public Task(String tname, String task_owner, Date start_date, Date end_date, String status,
			String requirement_domain) {
		super();
		this.tname = tname;
		this.task_owner = task_owner;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
		this.requirement_domain = requirement_domain;
	}
	public Task() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTask_owner() {
		return task_owner;
	}
	public void setTask_owner(String task_owner) {
		this.task_owner = task_owner;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRequirement_domain() {
		return requirement_domain;
	}
	public void setRequirement_domain(String requirement_domain) {
		this.requirement_domain = requirement_domain;
	}

	
}