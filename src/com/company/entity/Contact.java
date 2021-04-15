package com.company.entity;

import com.company.enums.ContactType;

public class Contact {
    private Long id;
    private ContactType contactType;
    private String value;

    public Contact() {

    }

    public Contact(Long id, ContactType contactType, String value) {
        this.id = id;
        this.contactType = contactType;
        this.value = value;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
