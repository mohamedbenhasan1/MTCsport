package com.MTCsport.MTCsport.services;

import java.util.List;

import com.MTCsport.MTCsport.models.MatchModel;

public interface MatchService {
	
	public List<MatchModel> getAllMatches();
    public MatchModel getMatchById(Long id);
    public MatchModel addMatch(MatchModel m);
    public MatchModel editMatch(MatchModel m);
    public void deletMatchById(Long id);
}
