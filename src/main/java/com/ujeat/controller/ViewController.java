package com.ujeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
public class ViewController {
    @RequestMapping("/{view}")
    public String view(@PathVariable("view") String view){
        if(view == null || view == ""){
            view = "index";
        }
        return view;
    }
}
