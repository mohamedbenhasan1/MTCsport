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
import com.MTCsport.MTCsport.repositories.CountryRepo;
import com.MTCsport.MTCsport.services.CountryService;

@RequestMapping("/api/Countryes")
@RestController
public class CountryController {
	@Autowired
	private CountryService cService ;
	@GetMapping
	public List<CountryModel> getAll(){
		return cService.getAllCountryes();
	}
	@PostMapping
	public CountryModel addCountry(@RequestBody CountryModel country) {
		return cService.addCountry(country);
	}
	@PutMapping
	public CountryModel updateCountry(@RequestBody CountryModel newcountry) {
		return cService.editCountry(newcountry);
	}
	@DeleteMapping("/{id}")
	public void deleteCountryById(@PathVariable Long id) {
		cService.deletCountryById(id);
	}
	@GetMapping("/{id}")
	public CountryModel getCountryById(@PathVariable Long id) {
		return cService.getCountryById(id);
	}

}
