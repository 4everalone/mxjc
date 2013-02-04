// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the buyer and seller of an option.
 */
public class SinglePartyOption implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyOrTradeSideReference buyerPartyReference;
	
	@Element
	private PartyOrTradeSideReference sellerPartyReference;
	
    
	/**
     * public getter
     *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getBuyerPartyReference() {
	    return this.buyerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setBuyerPartyReference(PartyOrTradeSideReference buyerPartyReference) {
	    this.buyerPartyReference = buyerPartyReference;
	}
	/**
     * public getter
     *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getSellerPartyReference() {
	    return this.sellerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setSellerPartyReference(PartyOrTradeSideReference sellerPartyReference) {
	    this.sellerPartyReference = sellerPartyReference;
	}

}