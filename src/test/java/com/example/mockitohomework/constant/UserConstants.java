package com.example.mockitohomework.constant;

import com.example.mockitohomework.model.User;

import java.util.List;

public class UserConstants {
    public static final String USER_NAME = "Рамиль";
    public static final String INVALID_NAME = "Павел";

    public static final User CORRECT_USER1 = new User("Рамиль", 26);
    public static final User CORRECT_USER2 = new User("Василий", 35);

    public static final User CORRECT_USER3 = new User("Екатерина", 19);

    public static final User INVALID_USER = new User("Павел", 35);
    public static final User INVALID_USER2 = new User("Константин", 35);


    public static final List<User> USER_LIST = List.of(CORRECT_USER1, CORRECT_USER2, CORRECT_USER3);


}
