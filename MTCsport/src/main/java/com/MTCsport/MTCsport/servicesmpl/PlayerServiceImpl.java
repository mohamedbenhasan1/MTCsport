package com.MTCsport.MTCsport.servicesmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTCsport.MTCsport.models.PlayerModel;
import com.MTCsport.MTCsport.repositories.PlayerRepo;
import com.MTCsport.MTCsport.services.PlayerServices;

@Service
public class PlayerServiceImpl implements PlayerServices {
    
	@Autowired 
	private PlayerRepo pRepo;
	@Override
	public List<PlayerModel> getAllPlayres() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public PlayerModel getPlayerById(Long id) {
		// TODO Auto-generated method stub
		Optional<PlayerModel> p = pRepo.findById(id);
	    return p.isPresent() ? p.get() : null ;
	}

	@Override
	public PlayerModel addPlayer(PlayerModel p) {
		// TODO Auto-generated method stub
		return pRepo.save(p);
	}

	@Override
	public PlayerModel editPlayer(PlayerModel P) {
		// TODO Auto-generated method stub
		return pRepo.save(P);
	}

	@Override
	public void deletPlayerById(Long id) {
		// TODO Auto-generated method stub
		pRepo.deleteById(id);
	}

}
