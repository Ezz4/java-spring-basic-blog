package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
public class BlogController {

    @RequestMapping("/")
    public String listPosts(ModelMap map){
        map.put("title", "Blog Post1");
        return "home";
    }



}
