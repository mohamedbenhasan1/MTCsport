package com.MTCsport.MTCsport.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Stadiums")
public class StadiumModel {
        
	@Id
	@Column(name="Playerid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int capacity;
    private String name;
    private String adresse;
    @ManyToOne
    @JoinColumn(name="country_id")
    @JsonIgnoreProperties("Stadiums")
    private CountryModel country;
    
    public StadiumModel() {}
	public StadiumModel(String name, String adressee) {
		this.name = name;
		this.adresse = adresse;
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getadresse() {
		return adresse;
	}
	public void setcountry(String a) {
		this.adresse = a;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "StadiumModel [id=" + id + ", capacity=" + capacity + ", name=" + name + ", country=" + country + "]";
	}
	public CountryModel getCountry() {
		return country;
	}
	public void setCountry(CountryModel country) {
		this.country = country;
	}
	
	
}
