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
@Table(name="Players")
public class PlayerModel {
	@Id
	@Column(name="Playerid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private int age;
    private String position;
    private int nbr;
    @ManyToOne
    @JoinColumn(name="team_id")
    @JsonIgnoreProperties("player")
    private TeamModel team;
    
    public PlayerModel() {}
	public PlayerModel(String name, int age, String position, int nbr) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.nbr = nbr;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	@Override
	public String toString() {
		return "PlayerModel [name=" + name + ", age=" + age + ", position=" + position + ", nbr=" + nbr + "]";
	}
	public TeamModel getTeam() {
		return team;
	}
	public void setTeam(TeamModel team) {
		this.team = team;
	}
	
    
}
