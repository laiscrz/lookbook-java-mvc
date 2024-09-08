package com.leadtech.lookbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadtech.lookbook.model.Lookbook;

@Repository
public interface LookbookRepository extends JpaRepository<Lookbook, Long> {
}