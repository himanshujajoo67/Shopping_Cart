package com.intuit.demo.shopping_cart.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/item/{code}")
	public Item getSingleItem(@PathVariable("code") String code){
		Item item = itemRepo.getById(code);
		return item;
	}
	
	@PostMapping("/item")
	public Item saveItem(@RequestBody Item item) {
		return itemRepo.save(item);
	}
}
