package com.qsp.springboot_cartitems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_cartitems.dto.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> 
{

}
