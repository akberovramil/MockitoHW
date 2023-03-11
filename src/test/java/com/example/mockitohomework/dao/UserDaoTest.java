package com.example.mockitohomework.dao;

import com.example.mockitohomework.model.User;
import com.example.mockitohomework.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static com.example.mockitohomework.constant.UserConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
public class UserDaoTest {


    @Autowired
    UserDaoImpl userDao;


    @Test
    public void shouldGetUserByName() {
        assertEquals(USER_NAME, userDao.getUserByName(USER_NAME).getName());

    }

    @Test
    public void shouldReturnNullForInvalidName() {
        assertThrows(NullPointerException.class,  ()-> userDao.getUserByName(INVALID_NAME));
    }



}
