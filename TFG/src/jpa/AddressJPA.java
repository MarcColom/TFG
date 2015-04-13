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
@Table(name = "segurosyviajes.address")
public class AddressJPA implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	private String country;
	
	public AddressJPA(){
		this.id=getId();
	}		
	
	@GeneratedValue
	@Id
	@Column(name = "ADDRESS_ID")
	public Integer getId() {
		return id;
	}	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
