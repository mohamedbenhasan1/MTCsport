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

import com.MTCsport.MTCsport.models.CountryModel;
import com.MTCsport.MTCsport.models.StadiumModel;
import com.MTCsport.MTCsport.repositories.CountryRepo;
import com.MTCsport.MTCsport.services.StadiumServices;

@RequestMapping("/api/Stadiums")
@RestController
public class StadiumController {
	@Autowired
	private CountryRepo CountryRepo;
	@Autowired
	private StadiumServices sService;
	
	@GetMapping
	public List<StadiumModel> getAll(){
		return sService.getAllStadium();
	}
	@PostMapping
	public StadiumModel addPlayer(@RequestBody StadiumModel stadium) {
		Long countryID=stadium.getCountry().getId();
		Optional<CountryModel> Country = CountryRepo.findById(countryID);
		stadium.setCountry(Country.get());
		return sService.addStadium(stadium);
	}
	@PutMapping
	public StadiumModel updatePlayer(@RequestBody StadiumModel newsta) {
		return sService.editStadium(newsta);
	}
	@DeleteMapping("/{id}")
	public void deleteStadiumById(@PathVariable Long id) {
		 sService.deletStadiumById(id);
	}
	@GetMapping("/{id}")
	public StadiumModel getStadiumById(@PathVariable Long id) {
		return sService.getStadiumById(id);
	}
	
      

}
