package com.intuit.demo.shopping_cart.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.demo.shopping_cart.entity.Item;
import com.intuit.demo.shopping_cart.repo.ItemRepo;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepo itemRepo;
	
	@GetMapping("/item")
	public List<Item> getItem(){
		return itemRepo.findAll();
	}
	
	@GetMapping("/item/{id}")
	public Item getSingleItem(@PathVariable("id") Long id){
		Item item = itemRepo.getById(id);
		return item;
	}
}
