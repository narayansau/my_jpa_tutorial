package com.example.jpatutorial.my_jpa_tutorial.Rest_API_And_Controller;

import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    public String list() {
        return "products" ;
    }

}
