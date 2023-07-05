package com.qsp.springboot_cartitems.service;

import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.springboot_cartitems.dao.Cartdao;
import com.qsp.springboot_cartitems.dto.Cart;
import com.qsp.springboot_cartitems.dto.Item;

@Service
public class CartService 
{
	@Autowired
	private Cartdao cartdao;
	public Cart saveCart(Cart cart)
	{
		List<Item> item=cart.getItems(); //Iterator<Item>();
		double totalcost=0;
		for(Item item2:item)
		{
			double cost=item2.getCost();
			int quantity=item2.getQuantity();
			totalcost=cost*quantity;
			
		}
		cart.setTotalcost(totalcost);
		return cartdao.saveCart(cart);
	}

}
