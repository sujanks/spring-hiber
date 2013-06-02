package com.springapp.controller;

import com.springapp.model.Shop;
import com.springapp.service.ShopService;
import com.springapp.service.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping(value="/shop")
public class ShopController {

    @Autowired
    public ShopService shopService;

    @RequestMapping(value="/add", method= RequestMethod.GET)
    public ModelAndView addShopPage() {
        ModelAndView mv = new ModelAndView("add-shop-form");
        mv.addObject("shop", new Shop());
        return mv;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView addShop(@ModelAttribute Shop shop) {
        shopService.addShop(shop);

        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Added Succesfully");
        return mv;
    }

    @RequestMapping(value="/list")
    public ModelAndView listOfShops() {
        ModelAndView modelAndView = new ModelAndView("list-of-shops");

        List<Shop> shops = shopService.getShops();
        modelAndView.addObject("shops", shops);

        return modelAndView;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editShopPage(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("edit-shop-form");
        Shop shop = shopService.getShop(id);
        mv.addObject("shop", shop);
        return mv;
    }

    @RequestMapping(value="/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editShop(@ModelAttribute Shop shop, @PathVariable Integer id) {
        shopService.updateShop(shop);
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("message", "Update success");
        return mv;
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView deleteShop(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("home");
        shopService.deleteShop(id);
        String message = "Shop was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}
