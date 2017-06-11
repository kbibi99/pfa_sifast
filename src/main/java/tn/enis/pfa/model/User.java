package tn.enis.pfa.model;

// default package
// Generated 14.�ub.2015 03:57:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

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
	private String gender;
	private String confidentialCode;

	
	public User() {
	}

	public User(Integer id, String name, String surname, String username, String password, String email, String phone,
			String mobilePhone, Date birthDate, String adress, String cin, String gender, String confidentialCode) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.birthDate = birthDate;
		this.adress = adress;
		this.cin = cin;
		this.gender = gender;
		this.confidentialCode = confidentialCode;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 20, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "surname", length = 20, nullable = false)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "password", length = 50, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "username", unique = true, length = 50, nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "email", unique = true, length = 50, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", length = 8, nullable = false)

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "mobilephone", length = 50, nullable = true)

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "birthdate", length = 50, nullable = false)
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "adress", length = 250, nullable = false)

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "cin", length = 8, nullable = false)
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Column(name = "gender", length = 1, nullable = false)

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "confidetialcode", length = 20, nullable = false)
	public String getConfidentialCode() {
		return confidentialCode;
	}

	public void setConfidentialCode(String confidentialCode) {
		this.confidentialCode = confidentialCode;
	}

}
