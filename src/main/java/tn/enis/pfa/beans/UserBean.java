package tn.enis.pfa.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import tn.enis.pfa.model.User;
import tn.enis.pfa.service.UserService;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	
	@ManagedProperty(value="#{userService}")
	UserService userService;
	
	private Integer id;
	private String name;
	private String surname;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String mobilePhone;
	private Date birthDate; 
	private String adress;
	private String cin;
	private String  gender;
	private String confidentialCode;
	private String message;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getConfidentialCode() {
		return confidentialCode;
	}


	public void setConfidentialCode(String confidentialCode) {
		this.confidentialCode = confidentialCode;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
/*	public void persistUser(){
		User user = new User();
		user.setName(getName());
		user.setSurname(getSurname());
		userService.persistUser(user);
	}*/
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String login(){
		User user = userService.login(getUsername(), getPassword());
		if (user!=null){
			message ="Successfully logged-in.";
    		return "success";
		}
		else{
			message ="Wrong credentials.";
    		return "login";
		}
			
		
	}
	
	
	
}
