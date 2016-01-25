/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities.service;

import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.AbstractECMModel;


/**
 * ecm.ServiceDomain.ResourceFacingServiceSpecABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ResourceFacingServiceSpec extends AbstractECMModel {

    private List<String> chargingServices;

    public List<String> getChargingServices() {
        return chargingServices;
    }

    public void setChargingServices(List<String> chargingServices) {
        this.chargingServices = chargingServices;
    }
}
