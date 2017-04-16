package com.cart.eureka_feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.eureka_feign.model.Cart;
import com.cart.eureka_feign.model.User;
import com.cart.eureka_feign.service.CartService;
import com.cart.eureka_feign.service.UserService;

@RestController
public class ShoppingController {
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;
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
    @RequestMapping(value = "/getCartByUserID" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> getCartByUserID(@RequestParam int userID) {
    	List<Cart> listCart = cartService.getCartByUserID(userID);
    	
        if(!listCart.isEmpty()){
            System.out.println("listCart.get(0).getGoodsCount():"+listCart.get(0).getGoodsCount());
        }
        return listCart;
    }
    @RequestMapping(value = "/addGoodtoCartByUserID" ,method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> addGoodtoCartByUserID(@RequestParam int userID) {
    	List<Cart> listCart = cartService.getCartByUserID(userID);
    	
        if(!listCart.isEmpty()){
            System.out.println("listCart.get(0).getGoodsCount():"+listCart.get(0).getGoodsCount());
        }
        return listCart;
    }
}
