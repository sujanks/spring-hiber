package com.springapp.service;

import com.springapp.model.Shop;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */

public interface ShopService {
    public void addShop(Shop shop);
    public void updateShop(Shop shop);
    public void deleteShop(int id);
    public Shop getShop(int id);
    public List<Shop> getShops();
}
