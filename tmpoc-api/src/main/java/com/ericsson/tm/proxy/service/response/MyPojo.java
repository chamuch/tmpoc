package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MyPojo") 
public class MyPojo
{
	//@XmlElement(name = "PortalMessage", required = true)
    private PortalMessageNew PortalMessage;

    @XmlElement(name = "PortalMessage")
    public PortalMessageNew getPortalMessage ()
    {
        return PortalMessage;
    }

   // @XmlElement
    public void setPortalMessage (PortalMessageNew PortalMessage)
    {
    	System.out.println("PortalMessage"+PortalMessage);
        this.PortalMessage = PortalMessage;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PortalMessage = "+PortalMessage+"]";
    }
}
	
