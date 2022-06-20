package com.example.swingApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String fName;
	private String lName;
	private String email;
	private String gender;
	private String age;
	private String username;
	private String password;

	public User(int uId, String fName, String lName, String email, String gender, String age, String username,
			String password) {
		super();
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	public User(String fName, String lName, String email, String gender, String age, String username, String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "User [uId=" + uId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + ", username=" + username + ", password=" + password + "]";
	}

	public String[] toArray() {
		String user[] = { fName, lName, email, gender, age.toString(), username, password };
		return user;
	}

}
