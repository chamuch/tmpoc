package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ChildrenInAge7to21")
public class DeviceOwnership
{
    private String Name;

    private String Value;

    private String RowId;

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

    @XmlElement(name = "RowId")
    public String getRowId ()
    {
        return RowId;
    }

    public void setRowId (String RowId)
    {
        this.RowId = RowId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", Value = "+Value+", RowId = "+RowId+"]";
    }
}
			
			
