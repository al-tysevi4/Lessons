package com.company.access;

import com.company.entity.Contact;
import com.company.entity.User;

import java.util.List;

public interface ContactAccessService {
    List<Contact> getContacts();
    void updateContacts(List<Contact> contactList);
}
