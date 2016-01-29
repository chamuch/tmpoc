package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CustomerAddress")
public class CustomerAddress
{
    private String Postcode;

    private String HouseUnitLot;

    private String Section;

    private String State;

    private String StreetName;

    private String BuildingName;

    private String StreetType;

    private String TMAddressID;

    private String AddressType;

    private String Country;

    private String Floor;

    private String City;

    @XmlElement(name = "Postcode")
    public String getPostcode ()
    {
        return Postcode;
    }

    public void setPostcode (String Postcode)
    {
        this.Postcode = Postcode;
    }

    @XmlElement(name = "HouseUnitLot")
    public String getHouseUnitLot ()
    {
        return HouseUnitLot;
    }

    public void setHouseUnitLot (String HouseUnitLot)
    {
        this.HouseUnitLot = HouseUnitLot;
    }

    @XmlElement(name = "Section")
    public String getSection ()
    {
        return Section;
    }

    public void setSection (String Section)
    {
        this.Section = Section;
    }

    @XmlElement(name = "State")
    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    @XmlElement(name = "StreetName")
    public String getStreetName ()
    {
        return StreetName;
    }

    public void setStreetName (String StreetName)
    {
        this.StreetName = StreetName;
    }

    @XmlElement(name = "BuildingName")
    public String getBuildingName ()
    {
        return BuildingName;
    }

    public void setBuildingName (String BuildingName)
    {
        this.BuildingName = BuildingName;
    }

    @XmlElement(name = "StreetType")
    public String getStreetType ()
    {
        return StreetType;
    }

    public void setStreetType (String StreetType)
    {
        this.StreetType = StreetType;
    }

    @XmlElement(name = "TMAddressID")
    public String getTMAddressID ()
    {
        return TMAddressID;
    }

    public void setTMAddressID (String TMAddressID)
    {
        this.TMAddressID = TMAddressID;
    }

    @XmlElement(name = "AddressType")
    public String getAddressType ()
    {
        return AddressType;
    }

    public void setAddressType (String AddressType)
    {
        this.AddressType = AddressType;
    }

    @XmlElement(name = "Country")
    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    @XmlElement(name = "Floor")
    public String getFloor ()
    {
        return Floor;
    }

    public void setFloor (String Floor)
    {
        this.Floor = Floor;
    }

    @XmlElement(name = "City")
    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Postcode = "+Postcode+", HouseUnitLot = "+HouseUnitLot+", Section = "+Section+", State = "+State+", StreetName = "+StreetName+", BuildingName = "+BuildingName+", StreetType = "+StreetType+", TMAddressID = "+TMAddressID+", AddressType = "+AddressType+", Country = "+Country+", Floor = "+Floor+", City = "+City+"]";
    }
}
			
			
