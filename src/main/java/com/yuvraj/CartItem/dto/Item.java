package com.yuvraj.CartItem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	double price;
	String manufacturer;
	int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item(String name, double price, String manufacturer, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + ", quantity=" + quantity
				+ "]";
	}
	
	
}
