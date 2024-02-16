package com.goca.ecommercejava.service;

import com.goca.ecommercejava.exception.CartItemException;
import com.goca.ecommercejava.exception.UserException;
import com.goca.ecommercejava.modal.Cart;
import com.goca.ecommercejava.modal.CartItem;
import com.goca.ecommercejava.modal.Product;

public interface CartItemService {

    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);

    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}