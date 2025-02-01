package com.example.grocery_store.controller;

import com.example.grocery_store.model.GroceryItem;
import com.example.grocery_store.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping("/")
    public String home(Model model) {
        List<GroceryItem> items = groceryService.getAllItems();
        model.addAttribute("items", items);
        return "index";  // Return the HTML template
    }
}
