package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ContactList")
public class ContactList
{
    private Contact[] Contact;

    @XmlElement(name = "Contact")
    public Contact[] getContact ()
    {
        return Contact;
    }

    public void setContact (Contact[] Contact)
    {
        this.Contact = Contact;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Contact = "+Contact+"]";
    }
}

