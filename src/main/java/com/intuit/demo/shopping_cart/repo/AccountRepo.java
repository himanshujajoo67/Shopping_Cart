package com.intuit.demo.shopping_cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.demo.shopping_cart.entity.Account;

public interface AccountRepo extends JpaRepository<Account, String> {
	Account findByUserName(String username);
	
}
