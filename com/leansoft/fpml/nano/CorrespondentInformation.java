// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type that describes the information to identify a correspondent bank that will make delivery of the funds on the paying bank's behalf in the country where the payment is to be made.
 */
public class CorrespondentInformation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private RoutingIds routingIds;
	
	@Element
	private RoutingExplicitDetails routingExplicitDetails;
	
	@Element
	private RoutingIdsAndExplicitDetails routingIdsAndExplicitDetails;
	
	@Element
	private PartyReference correspondentPartyReference;
	
    
	/**
     * public getter
     *
     * A set of unique identifiers for a party, eachone identifying the party within a payment system. The assumption is that each party will not have more than one identifier within the same payment system.
     *
     * @returns com.leansoft.fpml.nano.RoutingIds
	 */
	public RoutingIds getRoutingIds() {
	    return this.routingIds;
	}
	
	/**
	 * public setter
	 *
     * A set of unique identifiers for a party, eachone identifying the party within a payment system. The assumption is that each party will not have more than one identifier within the same payment system.
     *
     * @param com.leansoft.fpml.nano.RoutingIds
	 */
	public void setRoutingIds(RoutingIds routingIds) {
	    this.routingIds = routingIds;
	}
	/**
     * public getter
     *
     * A set of details that is used to identify a party involved in the routing of a payment when the party does not have a code that identifies it within one of the recognized payment systems.
     *
     * @returns com.leansoft.fpml.nano.RoutingExplicitDetails
	 */
	public RoutingExplicitDetails getRoutingExplicitDetails() {
	    return this.routingExplicitDetails;
	}
	
	/**
	 * public setter
	 *
     * A set of details that is used to identify a party involved in the routing of a payment when the party does not have a code that identifies it within one of the recognized payment systems.
     *
     * @param com.leansoft.fpml.nano.RoutingExplicitDetails
	 */
	public void setRoutingExplicitDetails(RoutingExplicitDetails routingExplicitDetails) {
	    this.routingExplicitDetails = routingExplicitDetails;
	}
	/**
     * public getter
     *
     * A combination of coded payment system identifiers and details for physical addressing for a party involved in the routing of a payment.
     *
     * @returns com.leansoft.fpml.nano.RoutingIdsAndExplicitDetails
	 */
	public RoutingIdsAndExplicitDetails getRoutingIdsAndExplicitDetails() {
	    return this.routingIdsAndExplicitDetails;
	}
	
	/**
	 * public setter
	 *
     * A combination of coded payment system identifiers and details for physical addressing for a party involved in the routing of a payment.
     *
     * @param com.leansoft.fpml.nano.RoutingIdsAndExplicitDetails
	 */
	public void setRoutingIdsAndExplicitDetails(RoutingIdsAndExplicitDetails routingIdsAndExplicitDetails) {
	    this.routingIdsAndExplicitDetails = routingIdsAndExplicitDetails;
	}
	/**
     * public getter
     *
     * Link to the party acting as correspondent. This element can only appear within the correspondentInformation container element.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getCorrespondentPartyReference() {
	    return this.correspondentPartyReference;
	}
	
	/**
	 * public setter
	 *
     * Link to the party acting as correspondent. This element can only appear within the correspondentInformation container element.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setCorrespondentPartyReference(PartyReference correspondentPartyReference) {
	    this.correspondentPartyReference = correspondentPartyReference;
	}

}