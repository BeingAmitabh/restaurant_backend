package com.restaurant.restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.Entity.restroEntity;

public interface restroRepo extends JpaRepository<restroEntity,Long> {
    
}
