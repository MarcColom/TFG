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
@Table(name = "segurosyviajes.customer")
public class CustomerJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private PersonJPA name;
	private String email;
	private String phone;
	private AddressJPA address;
	
	public CustomerJPA(){
		this.id=getId();
	}		
	
	@GeneratedValue
	@Id
	@Column(name = "CUSTOMER_ID")
	public Integer getId() {
		return id;
	}	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PersonJPA getName() {
		return name;
	}

	public void setName(PersonJPA name) {
		this.name = name;
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

	public AddressJPA getAddress() {
		return address;
	}

	public void setAddress(AddressJPA address) {
		this.address = address;
	}	
}

