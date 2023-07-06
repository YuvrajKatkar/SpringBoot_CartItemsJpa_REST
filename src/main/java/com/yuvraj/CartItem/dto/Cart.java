package com.yuvraj.CartItem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String email;
	String password;
	double totalPrice;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> items;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Cart(String email, String password, double totalPrice, List<Item> items) {
		super();
		this.email = email;
		this.password = password;
		this.totalPrice = totalPrice;
		this.items = items;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [email=" + email + ", password=" + password + ", totalPrice=" + totalPrice + ", items=" + items
				+ "]";
	}
	
	
}
