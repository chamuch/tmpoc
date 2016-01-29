package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CustomerAccount")
public class CustomerAccount
{
    private String ServiceProvider;

    private String TMExternalSource;

    private String LARSMembershipNo;

    private String LARSLastRedemTrnDesc;

    private String Blacklist;

    private String HomePhone;

    private String PrimaryIDType;

    private String LARSLastEarnTrnDate;

    private CustomerAddress CustomerAddress;

    private String LARSLastRedemTrnPoint;

    private String FaxNumber;

    private String LARSPointExpiryDate;

    private String ContactMethod;

    private String EmailAddress;

    private String SegmentGroup;

    private String AccountNo;

    private String MobilePhone;

    private String LARSMemberCategory;

    private String PrimaryIDNo;

    private String LARSMemberStatus;

    private String LARSPointExpiry;

    private String LARSTotalPoint;

    private RegisteredAddress RegisteredAddress;

    private String LARSProfileEnrollFlag;

    private String LARSLastEarnTrnDesc;

    private String CustomerName;

    private String SegmentCode;

    private String TMBRNSubType;

    private String Priority;

    private String ExpiryDate;

    private String PassportCountry;

    private String OfficePhone;

    private String LARSTotalPointDate;

    private String LARSRewardsNo;

    private String LARSLastRedemTrnDate;

    private String Industry;

    private String LARSLastEarnTrnPoint;

    @XmlElement(name = "ServiceProvide")
    public String getServiceProvider ()
    {
        return ServiceProvider;
    }

    public void setServiceProvider (String ServiceProvider)
    {
        this.ServiceProvider = ServiceProvider;
    }

    @XmlElement(name = "TMExternalSource")
    public String getTMExternalSource ()
    {
        return TMExternalSource;
    }

    public void setTMExternalSource (String TMExternalSource)
    {
        this.TMExternalSource = TMExternalSource;
    }

    @XmlElement(name = "LARSMembershipNo")
    public String getLARSMembershipNo ()
    {
        return LARSMembershipNo;
    }

    public void setLARSMembershipNo (String LARSMembershipNo)
    {
        this.LARSMembershipNo = LARSMembershipNo;
    }

    @XmlElement(name = "LARSLastRedemTrnDesc")
    public String getLARSLastRedemTrnDesc ()
    {
        return LARSLastRedemTrnDesc;
    }

    public void setLARSLastRedemTrnDesc (String LARSLastRedemTrnDesc)
    {
        this.LARSLastRedemTrnDesc = LARSLastRedemTrnDesc;
    }

    @XmlElement(name = "Blacklist")
    public String getBlacklist ()
    {
        return Blacklist;
    }

    public void setBlacklist (String Blacklist)
    {
        this.Blacklist = Blacklist;
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

    @XmlElement(name = "PrimaryIDType")
    public String getPrimaryIDType ()
    {
        return PrimaryIDType;
    }

    public void setPrimaryIDType (String PrimaryIDType)
    {
        this.PrimaryIDType = PrimaryIDType;
    }

    @XmlElement(name = "LARSLastEarnTrnDate")
    public String getLARSLastEarnTrnDate ()
    {
        return LARSLastEarnTrnDate;
    }

    public void setLARSLastEarnTrnDate (String LARSLastEarnTrnDate)
    {
        this.LARSLastEarnTrnDate = LARSLastEarnTrnDate;
    }

    @XmlElement(name = "CustomerAddress")
    public CustomerAddress getCustomerAddress ()
    {
        return CustomerAddress;
    }

    public void setCustomerAddress (CustomerAddress CustomerAddress)
    {
        this.CustomerAddress = CustomerAddress;
    }

    @XmlElement(name = "LARSLastRedemTrnPoint")
    public String getLARSLastRedemTrnPoint ()
    {
        return LARSLastRedemTrnPoint;
    }

    public void setLARSLastRedemTrnPoint (String LARSLastRedemTrnPoint)
    {
        this.LARSLastRedemTrnPoint = LARSLastRedemTrnPoint;
    }

    @XmlElement(name = "FaxNumber")
    public String getFaxNumber ()
    {
        return FaxNumber;
    }

    public void setFaxNumber (String FaxNumber)
    {
        this.FaxNumber = FaxNumber;
    }

    @XmlElement(name = "LARSPointExpiryDate")
    public String getLARSPointExpiryDate ()
    {
        return LARSPointExpiryDate;
    }

    public void setLARSPointExpiryDate (String LARSPointExpiryDate)
    {
        this.LARSPointExpiryDate = LARSPointExpiryDate;
    }

    @XmlElement(name = "ContactMethod")
    public String getContactMethod ()
    {
        return ContactMethod;
    }

    public void setContactMethod (String ContactMethod)
    {
        this.ContactMethod = ContactMethod;
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

    @XmlElement(name = "SegmentGroup")
    public String getSegmentGroup ()
    {
        return SegmentGroup;
    }

    public void setSegmentGroup (String SegmentGroup)
    {
        this.SegmentGroup = SegmentGroup;
    }

    @XmlElement(name = "AccountNo")
    public String getAccountNo ()
    {
        return AccountNo;
    }

    public void setAccountNo (String AccountNo)
    {
        this.AccountNo = AccountNo;
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

    @XmlElement(name = "LARSMemberCategory")
    public String getLARSMemberCategory ()
    {
        return LARSMemberCategory;
    }

    public void setLARSMemberCategory (String LARSMemberCategory)
    {
        this.LARSMemberCategory = LARSMemberCategory;
    }

    @XmlElement(name = "PrimaryIDNo")
    public String getPrimaryIDNo ()
    {
        return PrimaryIDNo;
    }

    public void setPrimaryIDNo (String PrimaryIDNo)
    {
        this.PrimaryIDNo = PrimaryIDNo;
    }

    @XmlElement(name = "LARSMemberStatus")
    public String getLARSMemberStatus ()
    {
        return LARSMemberStatus;
    }

    public void setLARSMemberStatus (String LARSMemberStatus)
    {
        this.LARSMemberStatus = LARSMemberStatus;
    }

    @XmlElement(name = "LARSPointExpiry")
    public String getLARSPointExpiry ()
    {
        return LARSPointExpiry;
    }

    public void setLARSPointExpiry (String LARSPointExpiry)
    {
        this.LARSPointExpiry = LARSPointExpiry;
    }

    @XmlElement(name = "LARSTotalPoint")
    public String getLARSTotalPoint ()
    {
        return LARSTotalPoint;
    }

    public void setLARSTotalPoint (String LARSTotalPoint)
    {
        this.LARSTotalPoint = LARSTotalPoint;
    }

    @XmlElement(name = "RegisteredAddress")
    public RegisteredAddress getRegisteredAddress ()
    {
        return RegisteredAddress;
    }

    public void setRegisteredAddress (RegisteredAddress RegisteredAddress)
    {
        this.RegisteredAddress = RegisteredAddress;
    }

    @XmlElement(name = "LARSProfileEnrollFlag")
    public String getLARSProfileEnrollFlag ()
    {
        return LARSProfileEnrollFlag;
    }

    public void setLARSProfileEnrollFlag (String LARSProfileEnrollFlag)
    {
        this.LARSProfileEnrollFlag = LARSProfileEnrollFlag;
    }

    @XmlElement(name = "LARSLastEarnTrnDesc")
    public String getLARSLastEarnTrnDesc ()
    {
        return LARSLastEarnTrnDesc;
    }

    public void setLARSLastEarnTrnDesc (String LARSLastEarnTrnDesc)
    {
        this.LARSLastEarnTrnDesc = LARSLastEarnTrnDesc;
    }

    @XmlElement(name = "CustomerName")
    public String getCustomerName ()
    {
        return CustomerName;
    }

    public void setCustomerName (String CustomerName)
    {
        this.CustomerName = CustomerName;
    }

    @XmlElement(name = "SegmentCode")
    public String getSegmentCode ()
    {
        return SegmentCode;
    }

    public void setSegmentCode (String SegmentCode)
    {
        this.SegmentCode = SegmentCode;
    }

    @XmlElement(name = "TMBRNSubType")
    public String getTMBRNSubType ()
    {
        return TMBRNSubType;
    }

    public void setTMBRNSubType (String TMBRNSubType)
    {
        this.TMBRNSubType = TMBRNSubType;
    }

    @XmlElement(name = "Priority")
    public String getPriority ()
    {
        return Priority;
    }

    public void setPriority (String Priority)
    {
        this.Priority = Priority;
    }

    @XmlElement(name = "ExpiryDate")
    public String getExpiryDate ()
    {
        return ExpiryDate;
    }

    public void setExpiryDate (String ExpiryDate)
    {
        this.ExpiryDate = ExpiryDate;
    }

    @XmlElement(name = "PassportCountry")
    public String getPassportCountry ()
    {
        return PassportCountry;
    }

    public void setPassportCountry (String PassportCountry)
    {
        this.PassportCountry = PassportCountry;
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

    @XmlElement(name = "LARSTotalPointDate")
    public String getLARSTotalPointDate ()
    {
        return LARSTotalPointDate;
    }

    public void setLARSTotalPointDate (String LARSTotalPointDate)
    {
        this.LARSTotalPointDate = LARSTotalPointDate;
    }

    @XmlElement(name = "LARSRewardsNo")
    public String getLARSRewardsNo ()
    {
        return LARSRewardsNo;
    }

    public void setLARSRewardsNo (String LARSRewardsNo)
    {
        this.LARSRewardsNo = LARSRewardsNo;
    }

    @XmlElement(name = "LARSLastRedemTrnDate")
    public String getLARSLastRedemTrnDate ()
    {
        return LARSLastRedemTrnDate;
    }

    public void setLARSLastRedemTrnDate (String LARSLastRedemTrnDate)
    {
        this.LARSLastRedemTrnDate = LARSLastRedemTrnDate;
    }

    @XmlElement(name = "Industry")
    public String getIndustry ()
    {
        return Industry;
    }

    public void setIndustry (String Industry)
    {
        this.Industry = Industry;
    }

    @XmlElement(name = "LARSLastEarnTrnPoint")
    public String getLARSLastEarnTrnPoint ()
    {
        return LARSLastEarnTrnPoint;
    }

    public void setLARSLastEarnTrnPoint (String LARSLastEarnTrnPoint)
    {
        this.LARSLastEarnTrnPoint = LARSLastEarnTrnPoint;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ServiceProvider = "+ServiceProvider+", TMExternalSource = "+TMExternalSource+", LARSMembershipNo = "+LARSMembershipNo+", LARSLastRedemTrnDesc = "+LARSLastRedemTrnDesc+", Blacklist = "+Blacklist+", HomePhone = "+HomePhone+", PrimaryIDType = "+PrimaryIDType+", LARSLastEarnTrnDate = "+LARSLastEarnTrnDate+", CustomerAddress = "+CustomerAddress+", LARSLastRedemTrnPoint = "+LARSLastRedemTrnPoint+", FaxNumber = "+FaxNumber+", LARSPointExpiryDate = "+LARSPointExpiryDate+", ContactMethod = "+ContactMethod+", EmailAddress = "+EmailAddress+", SegmentGroup = "+SegmentGroup+", AccountNo = "+AccountNo+", MobilePhone = "+MobilePhone+", LARSMemberCategory = "+LARSMemberCategory+", PrimaryIDNo = "+PrimaryIDNo+", LARSMemberStatus = "+LARSMemberStatus+", LARSPointExpiry = "+LARSPointExpiry+", LARSTotalPoint = "+LARSTotalPoint+", RegisteredAddress = "+RegisteredAddress+", LARSProfileEnrollFlag = "+LARSProfileEnrollFlag+", LARSLastEarnTrnDesc = "+LARSLastEarnTrnDesc+", CustomerName = "+CustomerName+", SegmentCode = "+SegmentCode+", TMBRNSubType = "+TMBRNSubType+", Priority = "+Priority+", ExpiryDate = "+ExpiryDate+", PassportCountry = "+PassportCountry+", OfficePhone = "+OfficePhone+", LARSTotalPointDate = "+LARSTotalPointDate+", LARSRewardsNo = "+LARSRewardsNo+", LARSLastRedemTrnDate = "+LARSLastRedemTrnDate+", Industry = "+Industry+", LARSLastEarnTrnPoint = "+LARSLastEarnTrnPoint+"]";
    }
}
			
			
