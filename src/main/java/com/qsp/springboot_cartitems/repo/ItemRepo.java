package com.qsp.springboot_cartitems.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.springboot_cartitems.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> 
{

}
