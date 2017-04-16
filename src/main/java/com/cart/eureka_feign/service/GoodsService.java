package com.cart.eureka_feign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cart.eureka_feign.mapper.GoodsMapper;
import com.cart.eureka_feign.model.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	public List<Goods> getAllGoods() {
		// TODO Auto-generated method stub
		return goodsMapper.getAllGoods();
	}

}
