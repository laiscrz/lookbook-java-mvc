package com.leadtech.lookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadtech.lookbook.model.ClothingItem;

@Repository
public interface ClothingItemRepository extends JpaRepository<ClothingItem, Long> {
}
