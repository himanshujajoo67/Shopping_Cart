package com.intuit.demo.shopping_cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.demo.shopping_cart.entity.Order;

public interface OrderRepo extends JpaRepository<Order, String> {

}
