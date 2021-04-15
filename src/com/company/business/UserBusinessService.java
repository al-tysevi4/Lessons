package com.company.business;

import com.company.entity.Contact;
import com.company.entity.User;

public interface UserBusinessService {

    void create(String name, String password);
    void delete(Long id);

    User findByContact(Contact contact);
    void update(User user, String name, String password);

}
