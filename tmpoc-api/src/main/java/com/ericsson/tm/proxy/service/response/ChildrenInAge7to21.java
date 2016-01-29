package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ChildrenInAge7to21")
public class ChildrenInAge7to21
{
    private String Name;

    private String Value;

    @XmlElement(name = "Name")
    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @XmlElement(name = "Value")
    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", Value = "+Value+"]";
    }
}

