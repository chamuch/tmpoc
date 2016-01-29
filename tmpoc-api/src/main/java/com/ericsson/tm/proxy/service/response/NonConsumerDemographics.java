package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NonConsumerDemographics")
public class NonConsumerDemographics
{
    private String NoOfEmployees;

    private String NoOfBranches;

    private String CompanyAnnualRevenue;

    private String NatureOfBusiness;

    private String RetailIndustry;

    private String HeadquarterLocation;

    @XmlElement(name = "NoOfEmployees")
    public String getNoOfEmployees ()
    {
        return NoOfEmployees;
    }

    public void setNoOfEmployees (String NoOfEmployees)
    {
        this.NoOfEmployees = NoOfEmployees;
    }

    @XmlElement(name = "NoOfBranches")
    public String getNoOfBranches ()
    {
        return NoOfBranches;
    }

    public void setNoOfBranches (String NoOfBranches)
    {
        this.NoOfBranches = NoOfBranches;
    }

    @XmlElement(name = "CompanyAnnualRevenue")
    public String getCompanyAnnualRevenue ()
    {
        return CompanyAnnualRevenue;
    }

    public void setCompanyAnnualRevenue (String CompanyAnnualRevenue)
    {
        this.CompanyAnnualRevenue = CompanyAnnualRevenue;
    }

    @XmlElement(name = "NatureOfBusiness")
    public String getNatureOfBusiness ()
    {
        return NatureOfBusiness;
    }

    public void setNatureOfBusiness (String NatureOfBusiness)
    {
        this.NatureOfBusiness = NatureOfBusiness;
    }

    @XmlElement(name = "RetailIndustry")
    public String getRetailIndustry ()
    {
        return RetailIndustry;
    }

    public void setRetailIndustry (String RetailIndustry)
    {
        this.RetailIndustry = RetailIndustry;
    }

    @XmlElement(name = "HeadquarterLocation")
    public String getHeadquarterLocation ()
    {
        return HeadquarterLocation;
    }

    public void setHeadquarterLocation (String HeadquarterLocation)
    {
        this.HeadquarterLocation = HeadquarterLocation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NoOfEmployees = "+NoOfEmployees+", NoOfBranches = "+NoOfBranches+", CompanyAnnualRevenue = "+CompanyAnnualRevenue+", NatureOfBusiness = "+NatureOfBusiness+", RetailIndustry = "+RetailIndustry+", HeadquarterLocation = "+HeadquarterLocation+"]";
    }
}
		
