package com.intuit.demo.shopping_cart.model;

import lombok.Data;

@Data
public class CartLineInfo {
	 
    private ItemInfo itemInfo;
    private int quantity;
 
    public CartLineInfo() {
        this.quantity = 0;
    }
 
    public double getAmount() {
        return this.itemInfo.getPrice() * this.quantity;
    }
    
}
