package com.MTCsport.MTCsport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTCsport.MTCsport.models.PlayerModel;

@Repository
public interface PlayerRepo extends JpaRepository<PlayerModel, Long>  {

}
