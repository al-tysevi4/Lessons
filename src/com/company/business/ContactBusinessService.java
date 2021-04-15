package com.company.business;

import com.company.entity.Contact;
import com.company.enums.ContactType;

public interface ContactBusinessService {
    void create(ContactType contactType, String value);
    void delete(Long id);

    void update(Contact contact, ContactType contactType, String value);



}
