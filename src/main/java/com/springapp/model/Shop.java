package com.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name="shops")
public class Shop {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer rating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
