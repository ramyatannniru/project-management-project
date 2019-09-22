package com.example.demo.entity;
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
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String username;
	
	private String password;
	
	private String ulocation;
	
	private String avialability;

	private String email;
	private String img;
	
	private String udomain;

	private String previous_project;
	
	@Transient
	private int projectid;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", nullable = true)
	private Project project;

	public User(String username, String ulocation, String avialability, String email, String img, String udomain,
			String previous_project) {
		super();
		this.username = username;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.previous_project = previous_project;
	}
	
	
	
	public User(String username, String password, String ulocation, String avialability, String email, String img,
			String udomain, String previous_project, int projectid) {
		super();
		this.username = username;
		this.password = password;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.previous_project = previous_project;
		this.projectid = projectid;
	}



	public User(String username, String password, String ulocation, String avialability, String email, String img,
			String udomain, String previous_project) {
		super();
		this.username = username;
		this.password = password;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.previous_project = previous_project;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUlocation() {
		return ulocation;
	}

	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}

	public String getAvialability() {
		return avialability;
	}

	public void setAvialability(String avialability) {
		this.avialability = avialability;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getUdomain() {
		return udomain;
	}

	public void setUdomain(String udomain) {
		this.udomain = udomain;
	}

	

	public String getPrevious_project() {
		return previous_project;
	}

	public void setPrevious_project(String previous_project) {
		this.previous_project = previous_project;
	}



	public int getProjectid() {
		return projectid;
	}



	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}



	public Project getProject() {
		return project;
	}



	public void setProject(Project project) {
		this.project = project;
	}

	

	
}