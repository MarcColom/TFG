/*
 * @author Marc Colom Royo - mcolomro@gmail.com
 */

package jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "segurosyviajes.insurance")
public class InsuranceJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;	
	private Integer code;
	private String name;
	private String policyNumber;
	private String image;
	private String logoCia;
	private String coverage;
	private String generalConditions;
	private CompanyJPA company;	
	private float grossPrice;
	private float netPrice;	
	private Date initDate;
	private Date endDate;
	private String origin;
	private String destination;
	private Integer duracion;
	private Integer destinationCode;
	private Integer duracionCode;	
	

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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COMPANY_ID")
	public CompanyJPA getCompany() {
		return company;
	}

	public void setCompany(CompanyJPA company) {
		this.company = company;
	}

	public float getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(float grossPrice) {
		this.grossPrice = grossPrice;
	}

	public float getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(float netPrice) {
		this.netPrice = netPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLogoCia() {
		return logoCia;
	}

	public void setLogoCia(String logoCia) {
		this.logoCia = logoCia;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(Integer destinationCode) {
		this.destinationCode = destinationCode;
	}

	public Integer getDuracionCode() {
		return duracionCode;
	}

	public void setDuracionCode(Integer duracionCode) {
		this.duracionCode = duracionCode;
	}
	
	
	
}
