package com.MTCsport.MTCsport.servicesmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTCsport.MTCsport.models.TeamModel;
import com.MTCsport.MTCsport.repositories.TeamRepo;
import com.MTCsport.MTCsport.services.TeamServices;

@Service
public class TeamServiceImpl implements TeamServices {
	@Autowired 
	private TeamRepo tRepo;
	@Override
	public List<TeamModel> getAllTeams() {
		// TODO Auto-generated method stub
		return tRepo.findAll();
	}

	@Override
	public TeamModel getTeamById(Long id) {
		// TODO Auto-generated method stub
		Optional<TeamModel> t = tRepo.findById(id);
	    return t.isPresent() ? t.get() : null ;
	}

	@Override
	public TeamModel addTeam(TeamModel t) {
		// TODO Auto-generated method stub
		return tRepo.save(t);
	}

	@Override
	public TeamModel editTeam(TeamModel T) {
		// TODO Auto-generated method stub
		return tRepo.save(T);
	}

	@Override
	public void deletTeamById(Long id) {
		// TODO Auto-generated method stub
		tRepo.deleteById(id);
	}

}
