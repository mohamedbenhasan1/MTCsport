package com.MTCsport.MTCsport.servicesmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTCsport.MTCsport.models.CountryModel;
import com.MTCsport.MTCsport.repositories.CountryRepo;
import com.MTCsport.MTCsport.services.CountryService;
@Service
public class CountryServiceImpl implements CountryService  {
 @Autowired
 private CountryRepo cRepo ;
    @Override
	public List<CountryModel> getAllCountryes() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public CountryModel getCountryById(Long id) {
		// TODO Auto-generated method stub
		Optional<CountryModel> c = cRepo.findById(id);
	    return c.isPresent() ? c.get() : null ;
	}

	@Override
	public CountryModel addCountry(CountryModel c) {
		// TODO Auto-generated method stub
		return cRepo.save(c);
	}

	@Override
	public CountryModel editCountry(CountryModel c) {
		// TODO Auto-generated method stub
		return cRepo.save(c);
	}

	@Override
	public void deletCountryById(Long id) {
		// TODO Auto-generated method stub
		cRepo.deleteById(id);
	}
 
}
