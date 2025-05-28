package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modal.Review;
import com.example.demo.Repository.ReviewRepository;
import com.example.demo.Service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	 public List<Review> getReviewsByHostelId(Long hostelId) {
	        return reviewRepository.findByHostelId(hostelId);
	    }

}
