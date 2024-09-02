package com.MTCsport.MTCsport.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Matches")
public class MatchModel {
 @Id
 @Column(name="Matchid")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String teamOne;
 private String teamTwo;
 private int scoreOne;
 private int scoreTwo;
public MatchModel() {
	
}
private MatchModel(String teamOne, String teamTwo, int scoreOne, int scoreTwo) {
	super();
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
	this.scoreOne = scoreOne;
	this.scoreTwo = scoreTwo;
}
public Long getId() {
	return id;
}
public String getTeamOne() {
	return teamOne;
}
public void setTeamOne(String teamOne) {
	this.teamOne = teamOne;
}
public String getTeamTwo() {
	return teamTwo;
}
public void setTeamTwo(String teamTwo) {
	this.teamTwo = teamTwo;
}
public int getScoreOne() {
	return scoreOne;
}
public void setScoreOne(int scoreOne) {
	this.scoreOne = scoreOne;
}
public int getScoreTwo() {
	return scoreTwo;
}
public void setScoreTwo(int scoreTwo) {
	this.scoreTwo = scoreTwo;
}
@Override
public String toString() {
	return "MatchModel [id=" + id + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", scoreOne=" + scoreOne
			+ ", scoreTwo=" + scoreTwo + "]";
}

	
}

