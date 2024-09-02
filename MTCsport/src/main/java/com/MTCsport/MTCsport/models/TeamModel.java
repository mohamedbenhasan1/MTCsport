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

/**
 * @author Mohamed Benhasan
 *
 */
@Entity
@Table(name="teams")
public class TeamModel {
	@Id
	@Column(name="Teamid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	private String name;
	private String fondation;
	private String owner;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("team")
	private List<PlayerModel> players;
	
	public TeamModel() {}
	public TeamModel(String name, String fondation, String owner) {
		super();
		this.name = name;
		this.fondation = fondation;
		this.owner = owner;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFondation() {
		return fondation;
	}
	public void setFondation(String fondation) {
		this.fondation = fondation;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<PlayerModel> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerModel> players) {
		this.players = players;
	}
	
	

}
