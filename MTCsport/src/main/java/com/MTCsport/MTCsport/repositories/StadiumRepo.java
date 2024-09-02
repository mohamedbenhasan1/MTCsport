package com.MTCsport.MTCsport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTCsport.MTCsport.models.StadiumModel;

@Repository
public interface StadiumRepo extends JpaRepository<StadiumModel, Long>{

}
