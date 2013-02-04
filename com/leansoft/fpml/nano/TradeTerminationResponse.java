// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A response to the request for Termination.
 */
@RootElement(name = "tradeTerminationResponse", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class TradeTerminationResponse extends ResponseMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Termination termination;
	
	@Element
	private List<Party> party;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.Termination
	 */
	public Termination getTermination() {
	    return this.termination;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.Termination
	 */
	public void setTermination(Termination termination) {
	    this.termination = termination;
	}
	/**
     * public getter
     *
     * One party element for each of the principal parties and any other party that is referenced.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * One party element for each of the principal parties and any other party that is referenced.
     *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}

}