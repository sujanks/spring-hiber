package com.springapp.dao;

import com.springapp.model.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class ShopDaoImpl implements ShopDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addShop(Shop shop) {
        getCurrentSession().save(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        Shop shopToUpdate = getShop(shop.getId());
        shopToUpdate.setName("New Shop");
        shopToUpdate.setRating(2);
        getCurrentSession().update(shopToUpdate);
    }

    @Override
    public void deleteShop(int id) {
        Shop shop = getShop(id);
        getCurrentSession().delete(shop);
    }

    @Override
    public Shop getShop(int id) {
        Shop shop = (Shop)getCurrentSession().get(Shop.class, id);
        return shop;
    }

    @Override
    public List<Shop> getShops() {
        return getCurrentSession().createQuery("from Shop").list();
    }
}
