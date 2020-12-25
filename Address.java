package net.codejava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")

public class Address {
	
	private Long id;
	private String postalCode;
	private String street;
	private String city;
	private String state;
	/**
	 * @return the id
	 * 
	 * 
	 */
	
	public Address()
	{
		
	}
	
	public Address(Long id2, String street2, String city2, String state2, String postalCode2) {
		// TODO Auto-generated constructor stub
		 this.id = id2;
	        this.street = street2;
	        this.state = state2;
	        this.postalCode = postalCode2;
	        this.city = city2;
	}
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the postalCode
	 */
	   @Column(name = "PostalCode", nullable = false)
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the street
	 */
	   @Column(name = "Street", nullable = false)
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	 @Column(name = "City", nullable = false)
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	 @Column(name = "State", nullable = false)
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", postalCode=" + postalCode + ", street=" + street + ", city=" + city + ", state="
				+ state + "]";
	}

}
