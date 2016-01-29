package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ChildrenInAge7to21")
public class BillingList
{
    private BillingAccount BillingAccount;

    @XmlElement(name = "BillingAccount")
    public BillingAccount getBillingAccount ()
    {
        return BillingAccount;
    }

    public void setBillingAccount (BillingAccount BillingAccount)
    {
        this.BillingAccount = BillingAccount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [BillingAccount = "+BillingAccount+"]";
    }
}
