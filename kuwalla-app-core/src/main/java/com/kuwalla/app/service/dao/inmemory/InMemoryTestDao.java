package com.kuwalla.app.service.dao.inmemory;

import com.kuwalla.app.dto.User;
import com.kuwalla.app.service.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roei.azar on 23/06/2017
 */
public class InMemoryTestDao implements UserDao {

    private final Map<String, User> users = new HashMap<>();

    public User get(String name) {
        return null;
    }

    public boolean update(User userDto) {
        return false;
    }
}
