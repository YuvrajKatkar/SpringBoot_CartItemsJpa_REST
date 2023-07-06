package com.yuvraj.CartItem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuvraj.CartItem.dao.CartDao;
import com.yuvraj.CartItem.dto.Cart;
import com.yuvraj.CartItem.dto.Item;

@Service
public class CartService {
	@Autowired
	CartDao cartDao;

	public Cart saveCart(Cart cart) {
		// TODO Auto-generated method stub
		List<Item> listOfItems = cart.getItems();
		double totalCost=0;
		for(Item item :listOfItems) {
			totalCost += item.getPrice()*item.getQuantity();
		}
		cart.setTotalPrice(totalCost);
		return cartDao.saveCart(cart);
	}

	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return cartDao.findAll();
	}

	public List<Item> findAllItems() {
		// TODO Auto-generated method stub
		List<Item> items = new ArrayList<>();
		List<Cart> carts = findAll();
		for(Cart cart :carts) {
			for(Item item  :cart.getItems()) {
				items.add(item);
			}
		}
		return items;
	}

	public Cart getCart(int id) {
		// TODO Auto-generated method stub
		return cartDao.getCart(id);
	}

	public Cart deleteCart(int id) {
		// TODO Auto-generated method stub
		return cartDao.deleteCart(id);
	}

	public Cart updateCartOnly(Cart cart,int id) {
		// TODO Auto-generated method stub
		return cartDao.updateCartOnly(cart,id);
	}

	public Cart updateCartAndItemCompletely(Cart cart, int id) {
		// TODO Auto-generated method stub
		List<Item> listOfItems = cart.getItems();
		double totalCost=0;
		for(Item item :listOfItems) {
			totalCost += item.getPrice()*item.getQuantity();
		}
		cart.setTotalPrice(totalCost);
		return cartDao.updateCartAndItemCompletely(cart,id);
	}

	public Cart addNewItemsToCart(int id, List<Item> newItems) {
		// TODO Auto-generated method stub
		double totalCost=0;
		for(Item item :newItems) {
			totalCost += item.getPrice()*item.getQuantity();
		}
		
		return cartDao.addNewItemsToCart(id,newItems,totalCost);
	}

	public Item updateItemOnly(int id, Item item) {
		// TODO Auto-generated method stub
		return cartDao.updateItemOnly(id,item);
	}
	
}
