package com.intuit.demo.shopping_cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailInfo {
    private String id;

    private String productCode;
    private String productName;

    private int quanity;
    private double price;
    private double amount;
}