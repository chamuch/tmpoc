package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//import src.main.java.com.ericsson.tm.proxy.service.response.XmlElement;

@XmlRootElement(name="PortalMessage")
public class PortalMessageNew
{
    private Header Header;

    private Response Response;

    @XmlElement(name = "Header")
    public Header getHeader ()
    {
        return Header;
    }
    //@XmlElement
    public void setHeader (Header Header)
    {
        this.Header = Header;
    }

    @XmlElement(name = "Response")
    public Response getResponse ()
    {
        return Response;
    }
   // @XmlElement
    public void setResponse (Response Response)
    {
        this.Response = Response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Header = "+Header+", Response = "+Response+"]";
    }
}
