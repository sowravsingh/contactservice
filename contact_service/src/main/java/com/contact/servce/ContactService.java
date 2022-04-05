package com.contact.servce;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsofUser(long id);
}
