package com.example.demo.model;

public class CreateUserResponseModel {
	
	
	private String username;
	private String ulocation;
	private String avialability;
	private String email;
	private String img;
	private String udomain;
	private String previous_project;
	public CreateUserResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateUserResponseModel(String username, String ulocation, String avialability, String email, String img,
			String udomain, String previous_project) {
		super();
		this.username = username;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.previous_project = previous_project;
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
	
}
