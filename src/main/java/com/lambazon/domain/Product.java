package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;
	private double totalPrice;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 1) // If the quantity is higher or equal 1,so the quantity is the the quantity in BDD
			this.quantity = quantity;
        else if (quantity < 1)// If the quantity is lower 1, the quantity is 0
         	quantity = 0;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
        if (price < 0) // if the price is lower 1 so the price is 0
		 	price = 0;
        else if (price > 1000) // if the price is higher 1000 so the price is 1000
            price = 1000;

        if (price >= 1 && price <= 1000) // if the price is greater than or equal 1 and lower ou equal at 1000 so the price is the price in BDD
            this.price = price;
	}

	public double getInventoryPrice() {
		// TODO Auto-generated method stub
		totalPrice = price * quantity;
		return totalPrice ;
	}
}
