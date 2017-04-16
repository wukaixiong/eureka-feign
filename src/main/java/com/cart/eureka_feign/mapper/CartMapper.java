package com.cart.eureka_feign.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cart.eureka_feign.model.Cart;

public interface CartMapper {

	public List<Cart> getCartByUserID(@Param(value="userID")int userID);

	public int addGoodtoCart(Cart cart);

	public int updateCountByGoodsID(Cart cart);

	public int deleteCart(@Param(value="cartID")int cartID);


}
