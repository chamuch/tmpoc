package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CommitmentPeriodList")
public class CommitmentPeriodList
{
    private CommitmentPeriod CommitmentPeriod;

    @XmlElement(name = "CommitmentPeriod")
    public CommitmentPeriod getCommitmentPeriod ()
    {
        return CommitmentPeriod;
    }

    public void setCommitmentPeriod (CommitmentPeriod CommitmentPeriod)
    {
        this.CommitmentPeriod = CommitmentPeriod;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CommitmentPeriod = "+CommitmentPeriod+"]";
    }
}
