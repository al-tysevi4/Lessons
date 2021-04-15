package com.company.business;

import com.company.access.ContactAccessService;
import com.company.access.ContactAccessServiceImpl;
import com.company.entity.Contact;
import com.company.entity.User;
import com.company.enums.ContactType;

import java.util.List;

public class ContactBusinessServiceImpl implements ContactBusinessService{
    private ContactAccessService contactAccessService = new ContactAccessServiceImpl();
    @Override
    public void create(ContactType contactType, String value) {
       List<Contact> contactList = contactAccessService.getContacts();
        Long id = Long.valueOf(contactList.size());
        Contact contact = new Contact(id, contactType, value);
        contactList.add(contact);
        contactAccessService.updateContacts(contactList);
    }

    @Override
    public void delete(Long id) {
        List<Contact> contactList = contactAccessService.getContacts();
        for(Contact contact : contactList) {
            if(contact.getId() == id){
                contactList.remove(contact);
                break;
            }
        }
        contactAccessService.updateContacts(contactList);
    }

    @Override
    public void update(Contact contact, ContactType contactType, String value) {
        List<Contact> contactList = contactAccessService.getContacts();
        for(Contact contact2: contactList) {
            if(contact2.equals(contact)) {
                contact2.setContactType(contactType);
                contact2.setValue(value);
                contactAccessService.updateContacts(contactList);
                break;
            }
        }
    }
}
