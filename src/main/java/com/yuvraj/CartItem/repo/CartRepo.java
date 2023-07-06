package com.yuvraj.CartItem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvraj.CartItem.dto.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
