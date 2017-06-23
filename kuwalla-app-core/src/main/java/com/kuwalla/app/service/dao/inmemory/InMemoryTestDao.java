package com.kuwalla.app.service.dao.inmemory;

import com.kuwalla.app.service.dao.UserDao;

/**
 * Created by roei.azar on 23/06/2017
 */
public class InMemoryTestDao implements UserDao {

    private final Map<String, User> tests = new HashMap<>();

    public UserDao get(String name) {
        return null;
    }

    public boolean update(UserDao userDto) {
        return false;
    }
}
