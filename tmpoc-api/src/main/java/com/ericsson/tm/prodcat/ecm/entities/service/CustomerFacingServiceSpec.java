/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities.service;

import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.AbstractECMModel;


/**
 * com.ericsson.ecm.ServiceDomain.CustomerFacingServiceSpecABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class CustomerFacingServiceSpec extends AbstractECMModel {

    private List<String> rules;
    private List<String> ruleLogics;
    private List<String> groups;
    private List<String> actions;
    private List<String> domains;

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public List<String> getRuleLogics() {
        return ruleLogics;
    }

    public void setRuleLogics(List<String> ruleLogics) {
        this.ruleLogics = ruleLogics;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}
