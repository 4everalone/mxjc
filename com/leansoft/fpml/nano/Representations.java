// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type for defining ISDA 2002 Equity Derivative Representations.
 */
public class Representations implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private boolean nonReliance;
	
	@Element
	private boolean agreementsRegardingHedging;
	
	@Element
	private Boolean indexDisclaimer;
	
	@Element
	private boolean additionalAcknowledgements;
	
    
	/**
     * public getter
     *
     * If true, then non reliance is applicable.
     *
     * @returns .boolean
	 */
	public boolean getNonReliance() {
	    return this.nonReliance;
	}
	
	/**
	 * public setter
	 *
     * If true, then non reliance is applicable.
     *
     * @param .boolean
	 */
	public void setNonReliance(boolean nonReliance) {
	    this.nonReliance = nonReliance;
	}
	/**
     * public getter
     *
     * If true, then agreements regarding hedging are applicable.
     *
     * @returns .boolean
	 */
	public boolean getAgreementsRegardingHedging() {
	    return this.agreementsRegardingHedging;
	}
	
	/**
	 * public setter
	 *
     * If true, then agreements regarding hedging are applicable.
     *
     * @param .boolean
	 */
	public void setAgreementsRegardingHedging(boolean agreementsRegardingHedging) {
	    this.agreementsRegardingHedging = agreementsRegardingHedging;
	}
	/**
     * public getter
     *
     * If present and true, then index disclaimer is applicable
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getIndexDisclaimer() {
	    return this.indexDisclaimer;
	}
	
	/**
	 * public setter
	 *
     * If present and true, then index disclaimer is applicable
     *
     * @param java.lang.Boolean
	 */
	public void setIndexDisclaimer(Boolean indexDisclaimer) {
	    this.indexDisclaimer = indexDisclaimer;
	}
	/**
     * public getter
     *
     * If true, then additional acknowledgements are applicable.
     *
     * @returns .boolean
	 */
	public boolean getAdditionalAcknowledgements() {
	    return this.additionalAcknowledgements;
	}
	
	/**
	 * public setter
	 *
     * If true, then additional acknowledgements are applicable.
     *
     * @param .boolean
	 */
	public void setAdditionalAcknowledgements(boolean additionalAcknowledgements) {
	    this.additionalAcknowledgements = additionalAcknowledgements;
	}

}