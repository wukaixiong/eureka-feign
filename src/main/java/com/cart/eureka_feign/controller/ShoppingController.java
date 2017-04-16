package com.cart.eureka_feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {
    
    @RequestMapping(value = "/shopping" ,method = RequestMethod.GET)
    public void add(@RequestParam String code, @RequestParam Integer num) {
        System.out.println(num+"件"+code+"(商品编码)添加进购物车");
    }
}
