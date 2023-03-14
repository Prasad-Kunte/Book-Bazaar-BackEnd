package com.bookbazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookbazaar.model.Cart;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer>{

}
