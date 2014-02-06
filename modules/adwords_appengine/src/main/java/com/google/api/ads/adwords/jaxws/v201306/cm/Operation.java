
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201306.billing.BudgetOrderOperation;
import com.google.api.ads.adwords.jaxws.v201306.mcm.LinkOperation;
import com.google.api.ads.adwords.jaxws.v201306.mcm.ManagedCustomerOperation;
import com.google.api.ads.adwords.jaxws.v201306.mcm.MoveOperation;
import com.google.api.ads.adwords.jaxws.v201306.rm.UserListOperation;


/**
 * 
 *             This represents an operation that includes an operator and an operand
 *             specified type.
 *           
 * 
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{https://adwords.google.com/api/adwords/cm/v201306}Operator" minOccurs="0"/>
 *         &lt;element name="Operation.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation", propOrder = {
    "operator",
    "operationType"
})
@XmlSeeAlso({
    AdParamOperation.class,
    BiddingStrategyOperation.class,
    FeedItemOperation.class,
    AdGroupAdOperation.class,
    CampaignCriterionOperation.class,
    AdGroupFeedOperation.class,
    FeedOperation.class,
    BudgetOperation.class,
    SharedCriterionOperation.class,
    ExperimentOperation.class,
    FeedMappingOperation.class,
    CampaignSharedSetOperation.class,
    AdGroupOperation.class,
    ConversionTrackerOperation.class,
    CampaignAdExtensionOperation.class,
    AdExtensionOverrideOperation.class,
    CampaignFeedOperation.class,
    CampaignOperation.class,
    AdGroupBidModifierOperation.class,
    CampaignTargetOperation.class,
    SharedSetOperation.class,
    AdGroupCriterionOperation.class,
    BudgetOrderOperation.class,
    UserListOperation.class,
    ManagedCustomerOperation.class,
    LinkOperation.class,
    MoveOperation.class
})
public abstract class Operation {

    protected Operator operator;
    @XmlElement(name = "Operation.Type")
    protected String operationType;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

}