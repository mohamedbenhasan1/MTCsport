package com.MTCsport.MTCsport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.MTCsport.MTCsport.models.TeamModel;
import com.MTCsport.MTCsport.services.TeamServices;


@RequestMapping("/api/teams")
@RestController
public class TeamController {
	@Autowired
	private TeamServices tService;
	
	@GetMapping
	public List<TeamModel> getAll(){
		return tService.getAllTeams();
	}
	@PostMapping
	public TeamModel addTeam(@RequestBody TeamModel team) {
		return tService.addTeam(team);
	}
	@PutMapping
	public TeamModel updateTeam(@RequestBody TeamModel newteam) {
		return tService.editTeam(newteam);
	}
	@DeleteMapping("/{id}")
	public void deleteTeamById(@PathVariable Long id) {
		tService.deletTeamById(id);
	}
	@GetMapping("/{id}")
	public TeamModel getTeamById(@PathVariable Long id) {
		return tService.getTeamById(id);
	}
	
    

}
