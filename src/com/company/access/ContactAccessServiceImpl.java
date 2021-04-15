package com.company.access;

import com.company.entity.Contact;
import com.company.entity.User;
import com.company.settings.Data;

import java.util.List;

public class ContactAccessServiceImpl implements ContactAccessService{
    Data data = new Data();

    @Override
    public List<Contact> getContacts() {
        return data.getContactList();
    }

    @Override
    public void updateContacts(List<Contact> contactList) {
        data.setContactList(contactList);
    }
}
