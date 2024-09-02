package com.MTCsport.MTCsport.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country")
public class CountryModel {
	
	@Id
	@Column(name="countryid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String capital;
	private int ranking;
	@OneToMany(mappedBy = "stadium", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("stadium")
	private List<StadiumModel> stadiums;
	
	public CountryModel() {}
	public CountryModel(String name, String capital, int ranking) {
		super();
		this.name = name;
		this.capital = capital;
		this.ranking = ranking;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	@Override
	public String toString() {
		return "CountryModel [id=" + id + ", name=" + name + ", capital=" + capital + ", ranking=" + ranking + "]";
	}
	public List<StadiumModel> getStadiums() {
		return stadiums;
	}
	public void setStadiums(List<StadiumModel> stadiums) {
		this.stadiums = stadiums;
	}
	

}
