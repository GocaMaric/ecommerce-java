package com.goca.ecommercejava.service;

import java.util.List;

import com.goca.ecommercejava.exception.UserException;
import com.goca.ecommercejava.modal.User;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

    public List<User> findAllUsers();

}
