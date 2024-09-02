package com.MTCsport.MTCsport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTCsport.MTCsport.models.TeamModel;

@Repository
public interface TeamRepo extends JpaRepository<TeamModel, Long> {

}
