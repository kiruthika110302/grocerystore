package com.example.grocery_store.service;

import com.example.grocery_store.model.GroceryItem;
import com.example.grocery_store.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public List<GroceryItem> getAllItems() {
        return groceryItemRepository.findAll();
    }

    public Optional<GroceryItem> getItemById(Long id) {
        return groceryItemRepository.findById(id);
    }

    public GroceryItem saveItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}
