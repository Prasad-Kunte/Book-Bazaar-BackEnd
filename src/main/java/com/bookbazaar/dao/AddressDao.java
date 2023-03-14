package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Address;

@Repository
public interface AddressDao extends CrudRepository<Address , Integer>{

}
