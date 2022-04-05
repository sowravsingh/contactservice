package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.servce.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

   @Autowired
   private ContactService contactService;

    @GetMapping("/{userId}")
    public List<Contact> getContactById(@PathVariable("userId") Long id){
        return contactService.getContactsofUser(id);
    }
}
