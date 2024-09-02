package com.MTCsport.MTCsport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTCsport.MTCsport.models.MatchModel;

@Repository
public interface MatchRepo extends JpaRepository<MatchModel, Long>{

}
