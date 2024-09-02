package com.MTCsport.MTCsport.services;

import java.util.List;

import com.MTCsport.MTCsport.models.CountryModel;

public interface CountryService {
	public List<CountryModel> getAllCountryes();
    public CountryModel getCountryById(Long id);
    public CountryModel addCountry(CountryModel c);
    public CountryModel editCountry(CountryModel c);
    public void deletCountryById(Long id);
}
