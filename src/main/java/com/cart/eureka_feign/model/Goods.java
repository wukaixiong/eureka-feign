package com.cart.eureka_feign.model;

public class Goods {
	private int goodsID;
	private String goodName;
	private int goodPrice;//单价
	private int Inventory;//库存
//	private String createTime;
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodID(int goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public int getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(int goodPrice) {
		this.goodPrice = goodPrice;
	}
	public int getInventory() {
		return Inventory;
	}
	public void setInventory(int inventory) {
		Inventory = inventory;
	}
	
}
