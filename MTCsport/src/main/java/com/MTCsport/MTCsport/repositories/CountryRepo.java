package com.MTCsport.MTCsport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTCsport.MTCsport.models.CountryModel;

@Repository
public interface CountryRepo extends JpaRepository<CountryModel, Long> {

}
