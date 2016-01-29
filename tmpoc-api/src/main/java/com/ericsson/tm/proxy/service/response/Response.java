package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Response")
public class Response
{
    private ContactList ContactList;

    private BillingList BillingList;

    private CustomerAccount CustomerAccount;

    private CommitmentPeriodList CommitmentPeriodList;

    private NonConsumerDemographics NonConsumerDemographics;

    private ConsumerDemographics ConsumerDemographics;

    @XmlElement(name = "ContactList")
    public ContactList getContactList ()
    {
        return ContactList;
    }

    public void setContactList (ContactList ContactList)
    {
        this.ContactList = ContactList;
    }

    @XmlElement(name = "BillingList")
    public BillingList getBillingList ()
    {
        return BillingList;
    }

    public void setBillingList (BillingList BillingList)
    {
        this.BillingList = BillingList;
    }

    @XmlElement(name = "CustomerAccount")
    public CustomerAccount getCustomerAccount ()
    {
        return CustomerAccount;
    }

    public void setCustomerAccount (CustomerAccount CustomerAccount)
    {
        this.CustomerAccount = CustomerAccount;
    }

    @XmlElement(name = "CommitmentPeriodList")
    public CommitmentPeriodList getCommitmentPeriodList ()
    {
        return CommitmentPeriodList;
    }

    public void setCommitmentPeriodList (CommitmentPeriodList CommitmentPeriodList)
    {
        this.CommitmentPeriodList = CommitmentPeriodList;
    }

    @XmlElement(name = "NonConsumerDemographics")
    public NonConsumerDemographics getNonConsumerDemographics ()
    {
        return NonConsumerDemographics;
    }

    public void setNonConsumerDemographics (NonConsumerDemographics NonConsumerDemographics)
    {
        this.NonConsumerDemographics = NonConsumerDemographics;
    }

    @XmlElement(name = "ConsumerDemographics")
    public ConsumerDemographics getConsumerDemographics ()
    {
        return ConsumerDemographics;
    }

    public void setConsumerDemographics (ConsumerDemographics ConsumerDemographics)
    {
        this.ConsumerDemographics = ConsumerDemographics;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ContactList = "+ContactList+", BillingList = "+BillingList+", CustomerAccount = "+CustomerAccount+", CommitmentPeriodList = "+CommitmentPeriodList+", NonConsumerDemographics = "+NonConsumerDemographics+", ConsumerDemographics = "+ConsumerDemographics+"]";
    }
}
