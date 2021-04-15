package com.company.business;

import com.company.access.UserAccessService;
import com.company.access.UserAccessServiceImpl;
import com.company.entity.Contact;
import com.company.entity.User;

import java.util.List;

public class UserBusinessServiceImpl implements UserBusinessService {
    private UserAccessService userAccessService = new UserAccessServiceImpl();
    @Override
    public void create(String name, String password) {
        List<User> userList = userAccessService.getUsers();
        Long id = Long.valueOf(userList.size());
        User user = new User(id,name,password);
        userList.add(user);
        userAccessService.updateUsers(userList);
    }

    @Override
    public void delete(Long id) {
        List<User> userList = userAccessService.getUsers();
        for(User user: userList) {
            if (user.getId() == id) {
                userList.remove(user);
                break;
            }
        }
        userAccessService.updateUsers(userList);
    }

    @Override
    public User findByContact(Contact contact) {
        List<User> userList = userAccessService.getUsers();
        for(User user: userList) {
            for(Contact contact1: user.getContactList()){
                if(contact1.equals(contact)) {
                    return user;
                }
            }
        }
        return null;
    }

    @Override
    public void update(User user, String name, String password) {
        List<User> userList = userAccessService.getUsers();
        for(User user1: userList) {
            if(user1.equals(user)){
                user1.setName(name);
                user1.setPassword(password);
                userAccessService.updateUsers(userList);
                break;
            }
        }
    }
    void getSomething() {
        int i = 0;
    }
}
