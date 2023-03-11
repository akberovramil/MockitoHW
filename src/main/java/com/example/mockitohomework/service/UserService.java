package com.example.mockitohomework.service;

import com.example.mockitohomework.dao.UserDao;
import com.example.mockitohomework.dao.UserDaoImpl;
import com.example.mockitohomework.exceptions.UserNotFoundException;
import com.example.mockitohomework.model.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
@EqualsAndHashCode
public class UserService {

    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        try {
            userDao.getUserByName(user.getName());
        } catch (UserNotFoundException e) {
            return false;

        }
        return true;
    }


}
