package com.MTCsport.MTCsport.services;

import java.util.List;

import com.MTCsport.MTCsport.models.PlayerModel;

public interface PlayerServices {
	public List<PlayerModel> getAllPlayres();
    public PlayerModel getPlayerById(Long id);
    public PlayerModel addPlayer(PlayerModel P);
    public PlayerModel editPlayer(PlayerModel P);
    public void deletPlayerById(Long id);
}
