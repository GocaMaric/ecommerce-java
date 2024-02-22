package com.goca.ecommercejava.service;


import java.util.List;

import com.goca.ecommercejava.exception.ProductException;
import com.goca.ecommercejava.modal.Rating;
import com.goca.ecommercejava.modal.User;
import com.goca.ecommercejava.request.RatingRequest;

public interface RatingServices {

    public Rating createRating(RatingRequest req,User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);

}
