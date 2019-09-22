package com.example.demo.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDto {
	private String username;
	private String password;
	private String ulocation;
	private String avialability;
	private String email;
	private String img;
	private String udomain;
	private String bcrypt;
	private String previous_project;
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(String username, String password, String ulocation, String avialability, String email, String img,
			String udomain, String bcrypt, String previous_project) {
		super();
		this.username = username;
		this.password = password;
		this.ulocation = ulocation;
		this.avialability = avialability;
		this.email = email;
		this.img = img;
		this.udomain = udomain;
		this.bcrypt = bcrypt;
		this.previous_project = previous_project;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getBcrypt() {
		return bcrypt;
	}

	public void setBcrypt(String bcrypt) {
		this.bcrypt = bcrypt;
	}

	public String getPrevious_project() {
		return previous_project;
	}

	public void setPrevious_project(String previous_project) {
		this.previous_project = previous_project;
	}
	
	
	
    
}
