package com.example.grocery_store.service;

import com.example.grocery_store.model.GroceryItem;
import com.example.grocery_store.repository.GroceryRepository;
import com.example.grocery_store.model.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {

    @Autowired
    private GroceryRepository groceryRepository;

    public List<GroceryItem> getAllItems() {
        return groceryRepository.findAll();
    }
}
