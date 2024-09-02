package com.MTCsport.MTCsport.servicesmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTCsport.MTCsport.models.StadiumModel;
import com.MTCsport.MTCsport.repositories.StadiumRepo;
import com.MTCsport.MTCsport.services.StadiumServices;

@Service
public class StadiumServiceImpl implements StadiumServices {

	@Autowired 
	private StadiumRepo sRepo;
	@Override
	public List<StadiumModel> getAllStadium() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
	}

	@Override
	public StadiumModel getStadiumById(Long id) {
		// TODO Auto-generated method stub
		Optional<StadiumModel> s = sRepo.findById(id);
	    return s.isPresent() ? s.get() : null ;
	}

	@Override
	public StadiumModel addStadium(StadiumModel S) {
		// TODO Auto-generated method stub
		return sRepo.save(S);
	}

	@Override
	public StadiumModel editStadium(StadiumModel S) {
		// TODO Auto-generated method stub
		return sRepo.save(S);
	}

	@Override
	public void deletStadiumById(Long id) {
		// TODO Auto-generated method stub
		sRepo.deleteById(id);
	}

}
