package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.Review;
import com.example.demo.Repository.ReviewRepository;


@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
	
	@Autowired
	private ReviewRepository reviewRepository;

	// GET /api/reviews/hostel/{hostelId}
    @GetMapping("/hostel/{hostelId}")
    public List<Review> getReviewsByHostel(@PathVariable Long hostelId) {
        return reviewRepository.findByHostelId(hostelId);
    }
}
