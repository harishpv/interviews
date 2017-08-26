package com.db.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.db.entities.Country;

@Repository
public interface CountryRepo extends CrudRepository<Country, String> {

}
