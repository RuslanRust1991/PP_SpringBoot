package com.ruslan.spring.PP_SpringBoot.dao;



import com.ruslan.spring.PP_SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User showUser(long id);

    void removeUserById(long id);

    List<User> getAllUsers();

    void updateUser(User user);
}
