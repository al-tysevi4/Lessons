package com.company.access;

import com.company.entity.User;

import java.util.List;

public interface UserAccessService {
    List<User> getUsers();
    void updateUsers(List<User> userList);
}
