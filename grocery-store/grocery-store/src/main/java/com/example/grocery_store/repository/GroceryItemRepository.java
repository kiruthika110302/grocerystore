package com.example.grocery_store.repository;

import com.example.grocery_store.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
    // You can add custom queries here if needed
}
