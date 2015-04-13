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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "segurosyviajes.order")
public class OrderJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer code;
	private Integer localizador;
	private Date orderDate;
	private Date initDate;
	private Date endDate;
	private Integer personNum;
	private float grossPrice;
	private float netPrice;
	private InsuranceJPA insurance;
	private CustomerJPA customer;
	private Set<PersonJPA> persons;
	
	
	public OrderJPA(){
		this.id=getId();
	}		
	
	@GeneratedValue
	@Id
	@Column(name = "ORDER_ID")
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

	public Integer getLocalizador() {
		return localizador;
	}

	public void setLocalizador(Integer localizador) {
		this.localizador = localizador;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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

	public Integer getPersonNum() {
		return personNum;
	}

	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
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

	public InsuranceJPA getInsurance() {
		return insurance;
	}

	public void setInsurance(InsuranceJPA insurance) {
		this.insurance = insurance;
	}

	public CustomerJPA getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerJPA customer) {
		this.customer = customer;
	}	
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "segurosyviajes.ORDER_PERSONS", joinColumns = { @JoinColumn(name = "ORDER_ID") }, inverseJoinColumns = { @JoinColumn(name = "PERSON_ID") })
	public Set<PersonJPA> getPersons() {
		return persons;
	}

	public void setPersons(Set<PersonJPA> persons) { 
		this.persons = persons;
	}
	
}
