package com.goca.ecommercejava.service;

import java.util.List;

import com.goca.ecommercejava.exception.ProductException;
import com.goca.ecommercejava.modal.Review;
import com.goca.ecommercejava.modal.User;
import com.goca.ecommercejava.request.ReviewRequest;

public interface ReviewService {

    public Review createReview(ReviewRequest req,User user) throws ProductException;

    public List<Review> getAllReview(Long productId);


}