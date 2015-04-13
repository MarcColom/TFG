/*
 * @author Marc Colom Royo - mcolomro@gmail.com
 */

package jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "segurosyviajes.insurance")
public class InsuranceJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer code;
	private String name;
	private String policyNumber;
	private String coverage;
	private String generalConditions;
	private CompanyJPA company;
		
	public InsuranceJPA(){
		this.id=getId();
	}
	
	public InsuranceJPA(Integer code, String name, String policyNumber, String coverage, String generalConditions){
		super();
		this.code=code;
		this.name=name;
		this.policyNumber=policyNumber;
		this.coverage=coverage;
		this.generalConditions=generalConditions;		
	}	
	
	@GeneratedValue
	@Id
	@Column(name = "INSURANCE_ID")
	public Integer getId() {
		return id;
	}	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getGeneralConditions() {
		return generalConditions;
	}

	public void setGeneralConditions(String generalConditions) {
		this.generalConditions = generalConditions;
	}

	public CompanyJPA getCompany() {
		return company;
	}

	public void setCompany(CompanyJPA company) {
		this.company = company;
	}
}
