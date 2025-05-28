package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modal.Review;

public interface ReviewRepository  extends JpaRepository<Review, Long> {
    List<Review> findByHostelId(Long hostelId);
    
}
