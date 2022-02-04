package com.intuit.demo.shopping_cart.web;

import java.util.List;

import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.WebApplicationType;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.demo.shopping_cart.entity.Account;
import com.intuit.demo.shopping_cart.repo.AccountRepo;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepo accountRepo;
	
	@GetMapping("/account")
	public List<Account> getAcount(){
		return accountRepo.findAll();
	}

	@GetMapping("/account/{username}")
	public ResponseEntity<Object> getSingleAccount(@PathVariable("username") String username){
		Account account = accountRepo.getById(username);
		if (account == null) {
	        return ResponseEntity
	                .status(HttpStatus.NOT_FOUND)
	                .body(MessageUtil.fail(username));
	    }
	    return ResponseEntity.ok(account);
	}
	
	@PostMapping("/account")
	//@RequestMapping(method = RequestMethod.POST, path = "/account", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Account saveAccount(@RequestBody Account account) {
		return accountRepo.save(account);
	}
//	
//	@DeleteMapping("/account/{username}")
//	public void 
}
