package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ConsumerDemographics")
public class ConsumerDemographics
{
    private DeviceOwnership DeviceOwnership;

    private Hobbies Hobbies;

    private String Race;

    private ChildrenInAge7to21 ChildrenInAge7to21;

    private String Nationality;

    private String DateOfBirth;

    private String HouseholdSize;

    private String StayingWith;

    private String Occupation;

    private String Gender;

    private String HouseOwnership;

    private String MaritalStatus;

    private String JobTitle;

    private String PrimaryFestiveCelebration;

    private String MonthlyHouseholdIncome;

    @XmlElement(name = "DeviceOwnership")
    public DeviceOwnership getDeviceOwnership ()
    {
        return DeviceOwnership;
    }

    public void setDeviceOwnership (DeviceOwnership DeviceOwnership)
    {
        this.DeviceOwnership = DeviceOwnership;
    }

    @XmlElement(name = "Hobbies")
    public Hobbies getHobbies ()
    {
        return Hobbies;
    }

    public void setHobbies (Hobbies Hobbies)
    {
        this.Hobbies = Hobbies;
    }

    @XmlElement(name = "Race")
    public String getRace ()
    {
        return Race;
    }

    public void setRace (String Race)
    {
        this.Race = Race;
    }

    @XmlElement(name = "ChildrenInAge7to21")
    public ChildrenInAge7to21 getChildrenInAge7to21 ()
    {
        return ChildrenInAge7to21;
    }

    public void setChildrenInAge7to21 (ChildrenInAge7to21 ChildrenInAge7to21)
    {
        this.ChildrenInAge7to21 = ChildrenInAge7to21;
    }
    
    @XmlElement(name = "Nationality")
    public String getNationality ()
    {
        return Nationality;
    }

    public void setNationality (String Nationality)
    {
        this.Nationality = Nationality;
    }

    @XmlElement(name = "DateOfBirth")
    public String getDateOfBirth ()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth (String DateOfBirth)
    {
        this.DateOfBirth = DateOfBirth;
    }

    @XmlElement(name = "HouseholdSize")
    public String getHouseholdSize ()
    {
        return HouseholdSize;
    }

    public void setHouseholdSize (String HouseholdSize)
    {
        this.HouseholdSize = HouseholdSize;
    }

    @XmlElement(name = "StayingWith")
    public String getStayingWith ()
    {
        return StayingWith;
    }

    public void setStayingWith (String StayingWith)
    {
        this.StayingWith = StayingWith;
    }

    @XmlElement(name = "Occupation")
    public String getOccupation ()
    {
        return Occupation;
    }

    public void setOccupation (String Occupation)
    {
        this.Occupation = Occupation;
    }

    @XmlElement(name = "Gender")
    public String getGender ()
    {
        return Gender;
    }

    public void setGender (String Gender)
    {
        this.Gender = Gender;
    }

    @XmlElement(name = "HouseOwnership")
    public String getHouseOwnership ()
    {
        return HouseOwnership;
    }

    public void setHouseOwnership (String HouseOwnership)
    {
        this.HouseOwnership = HouseOwnership;
    }

    @XmlElement(name = "MaritalStatus")
    public String getMaritalStatus ()
    {
        return MaritalStatus;
    }

    public void setMaritalStatus (String MaritalStatus)
    {
        this.MaritalStatus = MaritalStatus;
    }

    @XmlElement(name = "JobTitl")
    public String getJobTitle ()
    {
        return JobTitle;
    }

    public void setJobTitle (String JobTitle)
    {
        this.JobTitle = JobTitle;
    }

    @XmlElement(name = "PrimaryFestiveCelebration")
    public String getPrimaryFestiveCelebration ()
    {
        return PrimaryFestiveCelebration;
    }

    public void setPrimaryFestiveCelebration (String PrimaryFestiveCelebration)
    {
        this.PrimaryFestiveCelebration = PrimaryFestiveCelebration;
    }

    @XmlElement(name = "MonthlyHouseholdIncome")
    public String getMonthlyHouseholdIncome ()
    {
        return MonthlyHouseholdIncome;
    }

    public void setMonthlyHouseholdIncome (String MonthlyHouseholdIncome)
    {
        this.MonthlyHouseholdIncome = MonthlyHouseholdIncome;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DeviceOwnership = "+DeviceOwnership+", Hobbies = "+Hobbies+", Race = "+Race+", ChildrenInAge7to21 = "+ChildrenInAge7to21+", Nationality = "+Nationality+", DateOfBirth = "+DateOfBirth+", HouseholdSize = "+HouseholdSize+", StayingWith = "+StayingWith+", Occupation = "+Occupation+", Gender = "+Gender+", HouseOwnership = "+HouseOwnership+", MaritalStatus = "+MaritalStatus+", JobTitle = "+JobTitle+", PrimaryFestiveCelebration = "+PrimaryFestiveCelebration+", MonthlyHouseholdIncome = "+MonthlyHouseholdIncome+"]";
    }
}
