package com.contact.servce;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"sowrav1@gmail.com","sowrav1",1311L),
            new Contact(2L,"sowra2v@gmail.com","sowrav2",1311L),
            new Contact(3L,"teja1@gmail.com","teja1",1312L),
            new Contact(4L,"teja2@gmail.com","teja2",1312L),
            new Contact(5L,"sai1@gmail.com","sai1",1313L),
            new Contact(6L,"sai2@gmail.com","sai2",1313L)
    );

    @Override
    public List<Contact> getContactsofUser(long id) {
        return list.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
    }
}
