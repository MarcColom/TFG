package jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "segurosyviajes.payment")
public class PaymentJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ccType;
	private String ccNumber;
	private String ccExp;
	private String ccCvs;
	private String ccName;	
	
	public PaymentJPA(){
		this.id=getId();
	}		
	
	@GeneratedValue
	@Id
	@Column(name = "PAYMENT_ID")
	public Integer getId() {
		return id;
	}	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcExp() {
		return ccExp;
	}

	public void setCcExp(String ccExp) {
		this.ccExp = ccExp;
	}

	public String getCcCvs() {
		return ccCvs;
	}

	public void setCcCvs(String ccCvs) {
		this.ccCvs = ccCvs;
	}

	public String getCcName() {
		return ccName;
	}

	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

		
}