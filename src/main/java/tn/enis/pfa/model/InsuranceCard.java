package tn.enis.pfa.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InsuranceCard")
public class InsuranceCard  implements Serializable{
	private int id;
	private String insuranceNumber;
	private String insuranceType;
	private Date startDate;
	private Date endDate;
	
	public InsuranceCard(){
		
	}
	
	
	
	public InsuranceCard(int id, String insuranceNumber, String insuranceType, Date startDate, Date endDate) {
		this.id = id;
		this.insuranceNumber = insuranceNumber;
		this.insuranceType = insuranceType;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "insuranceNumber" , nullable = false)
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	@Column(name = "insuranceType" , nullable = false)
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	@Column(name = "startDate" , nullable = false)
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@Column(name = "endDate" , nullable = false)
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	

}
