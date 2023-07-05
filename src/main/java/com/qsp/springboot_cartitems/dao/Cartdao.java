package com.qsp.springboot_cartitems.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_cartitems.dto.Cart;
import com.qsp.springboot_cartitems.repo.CartRepo;

@Repository
public class Cartdao {

	@Autowired
	private CartRepo repo;
	public Cart saveCart(Cart cart)
	{
		return repo.save(cart);
	}
}
