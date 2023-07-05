package com.qsp.springboot_cartitems.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private double totalcost;
	@OneToMany(cascade = CascadeType.ALL)
	List<Item> items;

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public double getTotalcost() {
		return totalcost;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
