// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

/**
 * An exchange traded derivative contract.
 */
public class ExchangeTradedContract extends ExchangeTraded implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigInteger multiplier;
	
	@Element
	private String contractReference;
	
	@Element
	private AdjustableOrRelativeDate expirationDate;
	
    
	/**
     * public getter
     *
     * Specifies the contract multiplier that can be associated with the number of units.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getMultiplier() {
	    return this.multiplier;
	}
	
	/**
	 * public setter
	 *
     * Specifies the contract multiplier that can be associated with the number of units.
     *
     * @param java.math.BigInteger
	 */
	public void setMultiplier(BigInteger multiplier) {
	    this.multiplier = multiplier;
	}
	/**
     * public getter
     *
     * Specifies the contract that can be referenced, besides the undelyer type.
     *
     * @returns java.lang.String
	 */
	public String getContractReference() {
	    return this.contractReference;
	}
	
	/**
	 * public setter
	 *
     * Specifies the contract that can be referenced, besides the undelyer type.
     *
     * @param java.lang.String
	 */
	public void setContractReference(String contractReference) {
	    this.contractReference = contractReference;
	}
	/**
     * public getter
     *
     * The date when the contract expires.
     *
     * @returns com.leansoft.fpml.nano.AdjustableOrRelativeDate
	 */
	public AdjustableOrRelativeDate getExpirationDate() {
	    return this.expirationDate;
	}
	
	/**
	 * public setter
	 *
     * The date when the contract expires.
     *
     * @param com.leansoft.fpml.nano.AdjustableOrRelativeDate
	 */
	public void setExpirationDate(AdjustableOrRelativeDate expirationDate) {
	    this.expirationDate = expirationDate;
	}

}