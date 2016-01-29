package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ChildrenInAge7to21")
public class Contact
{
    private String ContactPrimaryIdNo;

    private String OfficePhone;

    private String ContactPrimaryIdType;

    private String ContactName;

    private String PrimaryContactIndicator;

    private String ContactID;

    private String EmailAddress;

    private String MobilePhone;

    private String PortalID;

    private String HomePhone;

    private String Designation;

    @XmlElement(name = "ContactPrimaryIdNo")
    public String getContactPrimaryIdNo ()
    {
        return ContactPrimaryIdNo;
    }

    public void setContactPrimaryIdNo (String ContactPrimaryIdNo)
    {
        this.ContactPrimaryIdNo = ContactPrimaryIdNo;
    }

    @XmlElement(name = "OfficePhone")
    public String getOfficePhone ()
    {
        return OfficePhone;
    }

    public void setOfficePhone (String OfficePhone)
    {
        this.OfficePhone = OfficePhone;
    }

    @XmlElement(name = "ContactPrimaryIdType")
    public String getContactPrimaryIdType ()
    {
        return ContactPrimaryIdType;
    }

    public void setContactPrimaryIdType (String ContactPrimaryIdType)
    {
        this.ContactPrimaryIdType = ContactPrimaryIdType;
    }

    @XmlElement(name = "ContactName")
    public String getContactName ()
    {
        return ContactName;
    }

    public void setContactName (String ContactName)
    {
        this.ContactName = ContactName;
    }

    @XmlElement(name = "PrimaryContactIndicator")
    public String getPrimaryContactIndicator ()
    {
        return PrimaryContactIndicator;
    }

    public void setPrimaryContactIndicator (String PrimaryContactIndicator)
    {
        this.PrimaryContactIndicator = PrimaryContactIndicator;
    }

    @XmlElement(name = "ContactID")
    public String getContactID ()
    {
        return ContactID;
    }

    public void setContactID (String ContactID)
    {
        this.ContactID = ContactID;
    }

    @XmlElement(name = "EmailAddress")
    public String getEmailAddress ()
    {
        return EmailAddress;
    }

    public void setEmailAddress (String EmailAddress)
    {
        this.EmailAddress = EmailAddress;
    }

    @XmlElement(name = "MobilePhone")
    public String getMobilePhone ()
    {
        return MobilePhone;
    }

    public void setMobilePhone (String MobilePhone)
    {
        this.MobilePhone = MobilePhone;
    }

    @XmlElement(name = "PortalID")
    public String getPortalID ()
    {
        return PortalID;
    }

    public void setPortalID (String PortalID)
    {
        this.PortalID = PortalID;
    }

    @XmlElement(name = "HomePhone")
    public String getHomePhone ()
    {
        return HomePhone;
    }

    public void setHomePhone (String HomePhone)
    {
        this.HomePhone = HomePhone;
    }

    @XmlElement(name = "Designation")
    public String getDesignation ()
    {
        return Designation;
    }

    public void setDesignation (String Designation)
    {
        this.Designation = Designation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ContactPrimaryIdNo = "+ContactPrimaryIdNo+", OfficePhone = "+OfficePhone+", ContactPrimaryIdType = "+ContactPrimaryIdType+", ContactName = "+ContactName+", PrimaryContactIndicator = "+PrimaryContactIndicator+", ContactID = "+ContactID+", EmailAddress = "+EmailAddress+", MobilePhone = "+MobilePhone+", PortalID = "+PortalID+", HomePhone = "+HomePhone+", Designation = "+Designation+"]";
    }
}

