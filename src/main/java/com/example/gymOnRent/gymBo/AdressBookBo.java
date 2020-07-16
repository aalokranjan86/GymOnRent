package com.example.gymOnRent.gymBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adressbook")
public class AdressBookBo {

	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="id")
	   private int adressId;
	   
	   @Column(name="plotno")
	   private int HouseNo;
	   
	   @Column(name="adress_street")
	   private String street;
	   
	   @Column(name="city")
	   private String City;
	   
	   @Column(name="district")
	   private String District;
	   
	   @Column(name="state")
	   private String State;
	   
	   @Column(name="pincode")
	   private int PinCode;
	   
	   @Column(name="country")
	   private String Country;
	   
	   public AdressBookBo() {
		   
	   }

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public int getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	   
}
