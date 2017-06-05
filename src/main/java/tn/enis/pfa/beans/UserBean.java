package tn.enis.pfa.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import tn.enis.pfa.model.User;
import tn.enis.pfa.service.UserService;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	@ManagedProperty(value = "#{userService}")
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
	private String gender;
	private String confidentialCode;
	private boolean message = false;

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

	public boolean getMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

	public void persistUser() {
		User user = new User();
		user.setName(getName());
		user.setSurname(getSurname());
		user.setUsername(getUsername());
		user.setPassword(getPassword());
		user.setCin(getCin());
		user.setBirthDate(getBirthDate());
		user.setGender(getGender());
		user.setAdress(getAdress());
		user.setConfidentialCode(getConfidentialCode());
		user.setPhone(getPhone());
		user.setMobilePhone(getMobilePhone());
		user.setEmail(getEmail());

		userService.persistUser(user);
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("success.xhtml?faces-redirect=true");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void login() {
		User user = userService.login(getUsername(), getPassword());
		if (user != null) {
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("success.xhtml?faces-redirect=true");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Invalid Login ! Please Try Again ", ""));
		}
	}

	public void searchByUsername() {
		User user = userService.findUserByUserName(getUsername());
		if (user != null) {
			FacesContext.getCurrentInstance().addMessage("usernamegrowl",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "username is alredy used", ""));
			setMessage(true);
		} else
			setMessage(false);
	}

	public void searchByEmail() {
		User user = userService.findUserByEmail(getEmail());
		if (user != null) {
			FacesContext.getCurrentInstance().addMessage("usernamegrowl",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email is alredy used", ""));
			setMessage(true);
		} else 
			setMessage(false);
	}

	public void searchBycin() {
		User user = userService.findUserByCIN(getCin());
		if (user != null) {
			FacesContext.getCurrentInstance().addMessage("usernamegrowl",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cin is alredy used", ""));
			setMessage(true);
		} else 
			setMessage(false);
	}

	public void searchByCC() {
		User user = userService.findUserByConfidetialCode(getConfidentialCode());
		if (user != null) {
			FacesContext.getCurrentInstance().addMessage("usernamegrowl",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Confidetial Code is alredy used", ""));
			setMessage(true);
		} else 
			setMessage(false);
	}

}
