
package com.ericsson.tm.cbio.contractsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractsSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractsSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="contracts" type="{http://ericsson.com/services/ws_CIL_5/contractssearch}contractsResponse" minOccurs="0"/>
 *         &lt;element name="searchIsComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractsSearchResponse", propOrder = {

})
public class ContractsSearchResponse {

    protected ContractsResponse contracts;
    protected Boolean searchIsComplete;

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link ContractsResponse }
     *     
     */
    public ContractsResponse getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractsResponse }
     *     
     */
    public void setContracts(ContractsResponse value) {
        this.contracts = value;
    }

    /**
     * Gets the value of the searchIsComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchIsComplete() {
        return searchIsComplete;
    }

    /**
     * Sets the value of the searchIsComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchIsComplete(Boolean value) {
        this.searchIsComplete = value;
    }

}
