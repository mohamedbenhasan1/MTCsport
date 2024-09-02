package com.MTCsport.MTCsport.services;

import java.util.List;

import com.MTCsport.MTCsport.models.StadiumModel;

public interface StadiumServices {
	public List<StadiumModel> getAllStadium();
    public StadiumModel getStadiumById(Long id);
    public StadiumModel addStadium(StadiumModel S);
    public StadiumModel editStadium(StadiumModel S);
    public void deletStadiumById(Long id);
}
