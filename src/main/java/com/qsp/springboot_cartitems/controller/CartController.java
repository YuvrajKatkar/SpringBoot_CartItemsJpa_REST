package com.qsp.springboot_cartitems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_cartitems.dto.Cart;
import com.qsp.springboot_cartitems.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController 
{
	@Autowired
	private CartService service;
	@PostMapping
	public Cart saveCart(@RequestBody Cart cart)
	{
		
		return service.saveCart(cart);
	}

}
