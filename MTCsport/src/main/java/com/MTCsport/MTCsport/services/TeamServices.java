package com.MTCsport.MTCsport.services;

import java.util.List;

import com.MTCsport.MTCsport.models.TeamModel;

public interface TeamServices {
	public List<TeamModel> getAllTeams();
	public TeamModel getTeamById(Long id);
	public TeamModel addTeam(TeamModel T);
    public TeamModel editTeam(TeamModel T);
    public void deletTeamById(Long id);
	
	

}
