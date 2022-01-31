package com.intuit.demo.shopping_cart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Accounts")
@Data
public class Account {
	
	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";
	
	@Id
    @Column(name = "User_Name", length = 20, nullable = false)
    private String userName;

    @Column(name = "Password", length = 128, nullable = false)
    private String password;

    @Column(name = "Active", length = 1, nullable = false)
    private boolean active;

    @Column(name = "User_Role", length = 20, nullable = false)
    private String userRole;
}
