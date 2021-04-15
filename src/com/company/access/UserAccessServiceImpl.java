package com.company.access;

import com.company.entity.User;
import com.company.settings.Data;

import java.util.List;

public class UserAccessServiceImpl implements UserAccessService {
    Data data = new Data();
    @Override
    public List<User> getUsers() {
        return data.getUserList();
    }

    @Override
    public void updateUsers(List<User> userList) {
        data.setUserList(userList);
    }
}
