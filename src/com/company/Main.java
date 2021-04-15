package com.company;

import com.company.entity.Contact;
import com.company.enums.ContactType;

public class Main {

    public static void main(String[] args) {

        Contact contact = new Contact();
        Contact contact1 = new Contact(0L, ContactType.SKYPE, "hhhhh");

    }
}
