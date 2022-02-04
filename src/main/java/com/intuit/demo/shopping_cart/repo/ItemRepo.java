package com.intuit.demo.shopping_cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.demo.shopping_cart.entity.Item;

public interface ItemRepo extends JpaRepository<Item, String>{
	
}
