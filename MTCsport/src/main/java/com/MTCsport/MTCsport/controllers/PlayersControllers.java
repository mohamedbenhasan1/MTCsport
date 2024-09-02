package com.MTCsport.MTCsport.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.MTCsport.MTCsport.models.PlayerModel;
import com.MTCsport.MTCsport.models.TeamModel;
import com.MTCsport.MTCsport.repositories.TeamRepo;
import com.MTCsport.MTCsport.services.PlayerServices;

@RequestMapping("/api/Players")
@RestController
public class PlayersControllers {
	@Autowired
	private TeamRepo teamRepo;
	@Autowired
	private PlayerServices pService;
	
	@GetMapping
	public List<PlayerModel> getAll(){
		return pService.getAllPlayres();
	}
	@PostMapping
	public PlayerModel addPlayer(@RequestBody PlayerModel player) {
		Long teamID=player.getTeam().getId();
		Optional<TeamModel> team = teamRepo.findById(teamID);
		player.setTeam(team.get());
		return pService.addPlayer(player);
	}
	@PutMapping
	public PlayerModel updatePlayer(@RequestBody PlayerModel newplayer) {
		return pService.editPlayer(newplayer);
	}
	@DeleteMapping("/{id}")
	public void deletePlayerById(@PathVariable Long id) {
		pService.deletPlayerById(id);
	}
	@GetMapping("/{id}")
	public PlayerModel getPlayerById(@PathVariable Long id) {
		return pService.getPlayerById(id);
	}
	
      

}
