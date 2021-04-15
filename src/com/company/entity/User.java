package com.company.entity;

import com.company.enums.ContactType;

import java.util.List;

public class User {
    private Long id;
    private String password;
    private String name;
    private List<Contact> contactList;

    public User(Long id, ContactType contactType) {

    }

    public User(Long id, String name, String password) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public User(Long id, String name, String password, List<Contact> contactList) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.contactList = contactList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

}
