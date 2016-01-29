package com.ericsson.tm.proxy.service.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CommitmentPeriod")
public class CommitmentPeriod
{
    private String CommitmentName;

    private String CommitmentDuration;

    @XmlElement(name = "CommitmentNam")
    public String getCommitmentName ()
    {
        return CommitmentName;
    }

    public void setCommitmentName (String CommitmentName)
    {
        this.CommitmentName = CommitmentName;
    }

    @XmlElement(name = "CommitmentDuration")
    public String getCommitmentDuration ()
    {
        return CommitmentDuration;
    }

    public void setCommitmentDuration (String CommitmentDuration)
    {
        this.CommitmentDuration = CommitmentDuration;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CommitmentName = "+CommitmentName+", CommitmentDuration = "+CommitmentDuration+"]";
    }
}
