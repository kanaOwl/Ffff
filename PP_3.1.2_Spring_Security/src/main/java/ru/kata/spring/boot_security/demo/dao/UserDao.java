package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(User user);

    void setUser(User user);

    User loadByUsername(String username);
}
