package com.example.grocery_store.controller;

import com.example.grocery_store.model.GroceryItem;
import com.example.grocery_store.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/grocery-items")
public class GroceryItemController {

    @Autowired
    private GroceryItemService groceryItemService;

    // Get all grocery items
    @GetMapping
    public List<GroceryItem> getAllItems() {
        return groceryItemService.getAllItems();
    }

    // Get a single grocery item by ID
    @GetMapping("/{id}")
    public ResponseEntity<GroceryItem> getItemById(@PathVariable Long id) {
        Optional<GroceryItem> item = groceryItemService.getItemById(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new grocery item
    @PostMapping
    public ResponseEntity<GroceryItem> createItem(@RequestBody GroceryItem groceryItem) {
        GroceryItem savedItem = groceryItemService.saveItem(groceryItem);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    // Delete a grocery item by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        groceryItemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}
