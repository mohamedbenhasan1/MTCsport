package com.MTCsport.MTCsport.servicesmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTCsport.MTCsport.models.MatchModel;
import com.MTCsport.MTCsport.repositories.MatchRepo;
import com.MTCsport.MTCsport.services.MatchService;
 @Service
public class MatcheServiceImpl implements MatchService {
    @Autowired 
	private MatchRepo mRepo;
	
	@Override
	public List<MatchModel> getAllMatches() {
		// TODO Auto-generated method stub
		return mRepo.findAll();
	}

	@Override
	public MatchModel getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> m = mRepo.findById(id);
	    return m.isPresent() ? m.get() : null ;
	}

	@Override
	public MatchModel addMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return mRepo.save(m);
	}

	@Override
	public MatchModel editMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return mRepo.save(m);
	}

	@Override
	public void deletMatchById(Long id) {
		// TODO Auto-generated method stub
		mRepo.deleteById(id);
	}
	
	

}
