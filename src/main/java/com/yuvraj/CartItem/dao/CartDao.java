package com.yuvraj.CartItem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuvraj.CartItem.dto.Cart;
import com.yuvraj.CartItem.dto.Item;
import com.yuvraj.CartItem.repo.CartRepo;

@Repository
public class CartDao {
	@Autowired
	CartRepo cartRepo;
	
	public Cart saveCart(Cart cart) {
		return cartRepo.save(cart);
	}

	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	public Cart getCart(int id) {
		// TODO Auto-generated method stub
		Optional<Cart> optional= cartRepo.findById(id);
		if(optional.isPresent())return optional.get();
		return null;
	}

	public Cart deleteCart(int id) {
		// TODO Auto-generated method stub
		Optional<Cart> optional= cartRepo.findById(id);
		if(optional.isPresent()) {
			cartRepo.deleteById(id);
			return optional.get();
		
		}
		return null;
	}

	public Cart updateCartOnly(Cart cart,int id) {
		// TODO Auto-generated method stub
		Optional<Cart> optional = cartRepo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		cart.setId(id);
		cart.setTotalPrice(optional.get().getTotalPrice());
		cart.setItems(optional.get().getItems());
		return cartRepo.save(cart);
	}

	public Cart updateCartAndItemCompletely(Cart cart, int id) {
		// TODO Auto-generated method stub
		Optional<Cart> optional = cartRepo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		return cartRepo.save(cart);
	}

	public Cart addNewItemsToCart(int id, List<Item> newItems, double totalCost) {
		// TODO Auto-generated method stub
		Optional<Cart> optional = cartRepo.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		Cart cart = optional.get();
		double oldPrice = cart.getTotalPrice();
		cart.setTotalPrice(totalCost+oldPrice);
		List<Item> list = cart.getItems();
		list.addAll(newItems);
		cart.setItems(list);
		return cartRepo.save(cart);
	}
}
