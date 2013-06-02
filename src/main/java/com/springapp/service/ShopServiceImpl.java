package com.springapp.service;

import com.springapp.dao.ShopDao;
import com.springapp.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public void addShop(Shop shop) {
        shopDao.addShop(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        shopDao.updateShop(shop);
    }

    @Override
    public void deleteShop(int id) {
        shopDao.deleteShop(id);
    }

    @Override
    public Shop getShop(int id) {
        return shopDao.getShop(id);
    }

    @Override
    public List<Shop> getShops() {
        return shopDao.getShops();
    }
}
