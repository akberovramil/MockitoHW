package com.example.mockitohomework.dao;

import com.example.mockitohomework.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class UserDaoImpl implements UserDao {





    private final  List<User> userList;

    public UserDaoImpl() {
         userList = new ArrayList<>(List.of(new User("Рамиль", 26), new User("Екатерина", 19), new User("Василий", 35)));

    }

    @Override
    public User getUserByName(String userName) {

        return userList.stream()
                .filter(user -> user.getName().equals(userName))
                .findAny()
                .orElseThrow(NullPointerException::new);
    }



    @Override
    public List<User> findAllUsers() {
        return userList;
    }


}
