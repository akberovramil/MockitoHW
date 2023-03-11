package com.example.mockitohomework.service;

import com.example.mockitohomework.dao.UserDaoImpl;
import com.example.mockitohomework.exceptions.UserNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static com.example.mockitohomework.constant.UserConstants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDaoImpl userDao;

    @InjectMocks
    private UserService out;


    @Test
    public void shouldReturnTrueForCorrectUser() {
        when(userDao.getUserByName(CORRECT_USER1.getName())).thenReturn(CORRECT_USER1);
        assertTrue(out.checkUserExist(CORRECT_USER1));

    }

    @Test
    public void shouldThrowUserNotFoundException() {
        when(userDao.getUserByName(INVALID_USER2.getName())).thenThrow(UserNotFoundException.class);
        assertFalse(out.checkUserExist(INVALID_USER2));

    }




}
