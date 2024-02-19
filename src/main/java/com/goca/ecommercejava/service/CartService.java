package com.goca.ecommercejava.service;

import com.goca.ecommercejava.exception.ProductException;
import com.goca.ecommercejava.modal.Cart;
import com.goca.ecommercejava.modal.CartItem;
import com.goca.ecommercejava.modal.User;
import com.goca.ecommercejava.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);

    public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;

    public Cart findUserCart(Long userId);

}