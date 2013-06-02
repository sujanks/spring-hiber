package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.ref.ReferenceQueue;

/**
 * Created with IntelliJ IDEA.
 * User: shresthas
 * Date: 2/06/13
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LinkController {
    @RequestMapping(value = "/")
    public ModelAndView mainPage() {
        return new ModelAndView("home");
    }

    @RequestMapping(value="/index")
    public ModelAndView indexPage() {
        return new ModelAndView("home");
    }

}
