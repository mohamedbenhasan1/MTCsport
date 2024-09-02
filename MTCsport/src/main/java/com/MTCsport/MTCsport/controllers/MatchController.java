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

import com.MTCsport.MTCsport.models.MatchModel;
import com.MTCsport.MTCsport.services.MatchService;

@RequestMapping("/api/matches")
@RestController
public class MatchController {
	@Autowired
	private MatchService mService;
	
	@GetMapping
	public List<MatchModel> getAll(){
		return mService.getAllMatches();
	}
	@PostMapping
	public MatchModel addMatch(@RequestBody MatchModel match) {
		return mService.addMatch(match);
	}
	@PutMapping
	public MatchModel updateMatch(@RequestBody MatchModel newmatch) {
		return mService.editMatch(newmatch);
	}
	@DeleteMapping("/{id}")
	public void deleteMatchById(@PathVariable Long id) {
		mService.deletMatchById(id);
	}
	@GetMapping("/{id}")
	public MatchModel getMatchById(@PathVariable Long id) {
		return mService.getMatchById(id);
	}
	
      
}
