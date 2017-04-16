package com.cart.eureka_feign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eureka_feign.mapper.CartMapper;
import com.cart.eureka_feign.model.Cart;

@Service
public class CartService {
	@Autowired
	private CartMapper cartMapper;

	public List<Cart> getCartByUserID(int userID) {
		// TODO Auto-generated method stub
		return cartMapper.getCartByUserID(userID);
	}
	
}
