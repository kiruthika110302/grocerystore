package com.example.grocery_store.repository;

import com.example.grocery_store.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryRepository extends JpaRepository<GroceryItem, Long> {
}
