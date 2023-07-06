package com.yuvraj.CartItem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvraj.CartItem.dto.Item;

public interface  ItemRepo extends JpaRepository<Item	, Integer>{

}
