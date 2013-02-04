// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;

/**
 * A type that describes the rate of exchange at which the option has been struck.
 */
public class FxStrikePrice implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigDecimal rate;
	
	@Element
	private StrikeQuoteBasisEnum strikeQuoteBasis;
	
    
	/**
     * public getter
     *
     * The rate of exchange between the two currencies of the leg of a deal. Must be specified with a quote basis.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getRate() {
	    return this.rate;
	}
	
	/**
	 * public setter
	 *
     * The rate of exchange between the two currencies of the leg of a deal. Must be specified with a quote basis.
     *
     * @param java.math.BigDecimal
	 */
	public void setRate(BigDecimal rate) {
	    this.rate = rate;
	}
	/**
     * public getter
     *
     * The method by which the strike rate is quoted.
     *
     * @returns com.leansoft.fpml.nano.StrikeQuoteBasisEnum
	 */
	public StrikeQuoteBasisEnum getStrikeQuoteBasis() {
	    return this.strikeQuoteBasis;
	}
	
	/**
	 * public setter
	 *
     * The method by which the strike rate is quoted.
     *
     * @param com.leansoft.fpml.nano.StrikeQuoteBasisEnum
	 */
	public void setStrikeQuoteBasis(StrikeQuoteBasisEnum strikeQuoteBasis) {
	    this.strikeQuoteBasis = strikeQuoteBasis;
	}

}