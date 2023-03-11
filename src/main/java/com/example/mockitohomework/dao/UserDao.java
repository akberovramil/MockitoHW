package com.example.mockitohomework.dao;

import com.example.mockitohomework.model.User;

import java.util.Collection;

public interface UserDao {

    User getUserByName(String userName);


    Collection<User> findAllUsers();






}
