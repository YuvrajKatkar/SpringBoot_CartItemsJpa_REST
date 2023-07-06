package com.yuvraj.CartItem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuvraj.CartItem.dao.CartDao;
import com.yuvraj.CartItem.dto.Cart;
import com.yuvraj.CartItem.dto.Item;
import com.yuvraj.CartItem.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@PostMapping
	public Cart saveCart(@RequestBody Cart cart) {
		return cartService.saveCart(cart);
	}
	
	@GetMapping
	public Cart getCart(@RequestParam int id) {
		return cartService.getCart(id);
	}
	
	@DeleteMapping
	public Cart deleteCart(@RequestParam int id) {
		return cartService.deleteCart(id);
	}
	
	@GetMapping("/findAllCarts")
	public List<Cart> findAllCarts() {
		return cartService.findAll();
	}
	
	@GetMapping("/findAllItems")
	public List<Item> findAllItems() {
		return cartService.findAllItems();
	}
	
	@PutMapping
	public Cart updateCartOnly(@RequestBody Cart cart,@RequestParam int id ) {
		return cartService.updateCartOnly(cart,id);
	}
	@PutMapping("/updateCartAndItemCompletely")
	public Cart updateCartAndItemCompletely(@RequestBody Cart cart,@RequestParam int id) {
		return cartService.updateCartAndItemCompletely(cart, id);
	}
	
	@PutMapping("/addNewItemsToCart")
	public Cart addNewItemsToCart(@RequestParam int id ,@RequestBody List<Item> newItems) {
		return cartService.addNewItemsToCart(id, newItems);
	}
}
