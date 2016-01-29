package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="BillingAccount")
public class BillingAccount
{
    private String BillingSalesPTT;

    private String BillingCycle;

    private String BillingAccountNo;

    private String BillingName;

    private BillingAddress BillingAddress;

    private String BillingAccountRowID;

    private String BillingType;

    private String HsbaBtuFlag;

    private String BillingProfileRowID;

    private String BillAccountStatus;

    @XmlElement(name = "BillingSalesPTT")
    public String getBillingSalesPTT ()
    {
        return BillingSalesPTT;
    }

    public void setBillingSalesPTT (String BillingSalesPTT)
    {
        this.BillingSalesPTT = BillingSalesPTT;
    }

    @XmlElement(name = "BillingCycle")
    public String getBillingCycle ()
    {
        return BillingCycle;
    }

    public void setBillingCycle (String BillingCycle)
    {
        this.BillingCycle = BillingCycle;
    }

    @XmlElement(name = "BillingAccountNo")
    public String getBillingAccountNo ()
    {
        return BillingAccountNo;
    }

    public void setBillingAccountNo (String BillingAccountNo)
    {
        this.BillingAccountNo = BillingAccountNo;
    }

    @XmlElement(name = "BillingName")
    public String getBillingName ()
    {
        return BillingName;
    }

    public void setBillingName (String BillingName)
    {
        this.BillingName = BillingName;
    }

    @XmlElement(name = "BillingAddress")
    public BillingAddress getBillingAddress ()
    {
        return BillingAddress;
    }

    public void setBillingAddress (BillingAddress BillingAddress)
    {
        this.BillingAddress = BillingAddress;
    }

    @XmlElement(name = "BillingAccountRowID")
    public String getBillingAccountRowID ()
    {
        return BillingAccountRowID;
    }

    public void setBillingAccountRowID (String BillingAccountRowID)
    {
        this.BillingAccountRowID = BillingAccountRowID;
    }

    @XmlElement(name = "BillingType")
    public String getBillingType ()
    {
        return BillingType;
    }

    public void setBillingType (String BillingType)
    {
        this.BillingType = BillingType;
    }

    @XmlElement(name = "HsbaBtuFlag")
    public String getHsbaBtuFlag ()
    {
        return HsbaBtuFlag;
    }

    public void setHsbaBtuFlag (String HsbaBtuFlag)
    {
        this.HsbaBtuFlag = HsbaBtuFlag;
    }

    @XmlElement(name = "BillingProfileRowID")
    public String getBillingProfileRowID ()
    {
        return BillingProfileRowID;
    }

    public void setBillingProfileRowID (String BillingProfileRowID)
    {
        this.BillingProfileRowID = BillingProfileRowID;
    }

    @XmlElement(name = "BillAccountStatus")
    public String getBillAccountStatus ()
    {
        return BillAccountStatus;
    }

    public void setBillAccountStatus (String BillAccountStatus)
    {
        this.BillAccountStatus = BillAccountStatus;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [BillingSalesPTT = "+BillingSalesPTT+", BillingCycle = "+BillingCycle+", BillingAccountNo = "+BillingAccountNo+", BillingName = "+BillingName+", BillingAddress = "+BillingAddress+", BillingAccountRowID = "+BillingAccountRowID+", BillingType = "+BillingType+", HsbaBtuFlag = "+HsbaBtuFlag+", BillingProfileRowID = "+BillingProfileRowID+", BillAccountStatus = "+BillAccountStatus+"]";
    }
}
