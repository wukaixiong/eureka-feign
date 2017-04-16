package com.cart.eureka_feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.eureka_feign.model.Cart;
import com.cart.eureka_feign.model.Goods;
import com.cart.eureka_feign.model.User;
import com.cart.eureka_feign.service.CartService;
import com.cart.eureka_feign.service.GoodsService;
import com.cart.eureka_feign.service.UserService;

@RestController
public class ShoppingController {
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;
	@Autowired
	private GoodsService goodsService;
    @RequestMapping(value = "/shopping" ,method = RequestMethod.GET)
    public void add(@RequestParam String code, @RequestParam Integer num) {
        System.out.println(num+"件"+code+"(商品编码)添加进购物车");
    }
    
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
         
        }
        return user;
    }
    //根据返回所有商品
    @RequestMapping(value = "/getAllGoods" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> getAllGoods() {
    	List<Goods> listGoods = goodsService.getAllGoods();
    	
        if(!listGoods.isEmpty()){
            System.out.println("listCart.get(0).getGoodsCount():"+listGoods.get(0).getGoodName());
        }
        return listGoods;
    }
    //根据用户ID返回购物车
    @RequestMapping(value = "/getCartByUserID" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> getCartByUserID(@RequestParam int userID) {
    	List<Cart> listCart = cartService.getCartByUserID(userID);
    	
        if(!listCart.isEmpty()){
            System.out.println("listCart.get(0).getGoodsCount():"+listCart.get(0).getGoodsCount());
        }
        return listCart;
    }
    //添加到购物车 参数userID,goodsID,goodsCount
    @RequestMapping(value = "/addGoodtoCart" ,method = RequestMethod.GET)
    @ResponseBody
    public String addGoodtoCart(Cart cart) {
    	int addFlag = cartService.addGoodtoCart(cart);
    	
        if(addFlag>0){
            System.out.println("addFlag:"+addFlag);
        }
        return "sss";
    }
  //修改购物车 参数userID,goodsID,goodsCount （只修改数量)
    @RequestMapping(value = "/updateCount" ,method = RequestMethod.GET)
    @ResponseBody
    public String updateCountByGoodsID(Cart cart) {
    	int updateFlag = cartService.updateCountByGoodsID(cart);
    	
        if(updateFlag>0){
            System.out.println("updateFlag:"+updateFlag);
        }
        return "修改成功";
    }
    //根据ID删除购物车中的内容
    @RequestMapping(value = "/deleteCart" ,method = RequestMethod.GET)
    @ResponseBody
    public String deleteCart(@RequestParam int cartID) {
    	int deleteFlag = cartService.deleteCart(cartID);
    	
        if(deleteFlag>0){
            System.out.println("updateFlag:"+deleteFlag);
        }
        return "修改成功";
    }
}
