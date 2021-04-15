package com.company.settings;

import com.company.entity.Contact;
import com.company.entity.User;
import com.company.enums.ContactType;

import java.util.Arrays;
import java.util.List;

public class Data {
    private List<User> userList = Arrays.asList(
      new User(0L,"jjjjj","aaaaa"),
      new User(1L,"fffff","bbbbb"),
      new User(2L,"ggggg","ccccc"),
      new User(3L,"kkkkk","ddddd")
    );
   private List<Contact> contactList = Arrays.asList(
      new Contact(0L, ContactType.SKYPE,"alex"),
      new Contact(1L, ContactType.EMAIL, "boris"),
      new Contact(2L, ContactType.EMAIL,"claus"),
      new Contact(3L,ContactType.SKYPE, "derek"),
      new Contact(4L,ContactType.TELEPHONE, "elena"),
      new Contact(5L,ContactType.SKYPE, "fernando"),
      new Contact(6L,ContactType.TELEPHONE, "diego"),
      new Contact(7L,ContactType.SKYPE,"doris")
    );

    public Data() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
