// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A type to hold early exercise provisions.
 */
public class MakeWholeProvisions implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date makeWholeDate;
	
	@Element
	private BigDecimal recallSpread;
	
    
	/**
     * public getter
     *
     * Date through which option can not be exercised without penalty.
     *
     * @returns java.util.Date
	 */
	public Date getMakeWholeDate() {
	    return this.makeWholeDate;
	}
	
	/**
	 * public setter
	 *
     * Date through which option can not be exercised without penalty.
     *
     * @param java.util.Date
	 */
	public void setMakeWholeDate(Date makeWholeDate) {
	    this.makeWholeDate = makeWholeDate;
	}
	/**
     * public getter
     *
     * Spread used if exercised before make whole date. Early termination penalty. Expressed in bp, e.g. 25 bp.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getRecallSpread() {
	    return this.recallSpread;
	}
	
	/**
	 * public setter
	 *
     * Spread used if exercised before make whole date. Early termination penalty. Expressed in bp, e.g. 25 bp.
     *
     * @param java.math.BigDecimal
	 */
	public void setRecallSpread(BigDecimal recallSpread) {
	    this.recallSpread = recallSpread;
	}

}