package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Header")
public class Header
{
    private String BusinessEvent;

    private String ErrorMessage;

    private String ReqResType;

    private String ErrorCode;

    private String Timestamp;

    @XmlElement(name = "BusinessEvent")
    public String getBusinessEvent ()
    {
        return BusinessEvent;
    }

   // @XmlElement
    public void setBusinessEvent (String BusinessEvent)
    {
        this.BusinessEvent = BusinessEvent;
    }

    @XmlElement(name = "ErrorMessage")
    public String getErrorMessage ()
    {
        return ErrorMessage;
    }

    //@XmlElement
    public void setErrorMessage (String ErrorMessage)
    {
        this.ErrorMessage = ErrorMessage;
    }

    @XmlElement(name = "ReqResType")
    public String getReqResType ()
    {
        return ReqResType;
    }

    //@XmlElement
    public void setReqResType (String ReqResType)
    {
        this.ReqResType = ReqResType;
    }

    @XmlElement(name = "ErrorCode")
    public String getErrorCode ()
    {
        return ErrorCode;
    }

   // @XmlElement
    public void setErrorCode (String ErrorCode)
    {
        this.ErrorCode = ErrorCode;
    }

    @XmlElement(name = "Timestamp")
    public String getTimestamp ()
    {
        return Timestamp;
    }

   // @XmlElement
    public void setTimestamp (String Timestamp)
    {
        this.Timestamp = Timestamp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [BusinessEvent = "+BusinessEvent+", ErrorMessage = "+ErrorMessage+", ReqResType = "+ReqResType+", ErrorCode = "+ErrorCode+", Timestamp = "+Timestamp+"]";
    }
}
