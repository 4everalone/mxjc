// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A formula for computing a complex derivative from partial derivatives. Its value is the sum of the terms divided by the product of the denominator terms.
 */
public class DerivativeFormula implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private FormulaTerm term;
	
	@Element
	private DenominatorTerm denominatorTerm;
	
    
	/**
     * public getter
     *
     * A term of the formula. Its value is the product of the its coefficient and the referenced partial derivatives.
     *
     * @returns com.leansoft.fpml.nano.FormulaTerm
	 */
	public FormulaTerm getTerm() {
	    return this.term;
	}
	
	/**
	 * public setter
	 *
     * A term of the formula. Its value is the product of the its coefficient and the referenced partial derivatives.
     *
     * @param com.leansoft.fpml.nano.FormulaTerm
	 */
	public void setTerm(FormulaTerm term) {
	    this.term = term;
	}
	/**
     * public getter
     *
     * A denominator term of the formula. Its value is (sum of weighted partials) ^ power.
     *
     * @returns com.leansoft.fpml.nano.DenominatorTerm
	 */
	public DenominatorTerm getDenominatorTerm() {
	    return this.denominatorTerm;
	}
	
	/**
	 * public setter
	 *
     * A denominator term of the formula. Its value is (sum of weighted partials) ^ power.
     *
     * @param com.leansoft.fpml.nano.DenominatorTerm
	 */
	public void setDenominatorTerm(DenominatorTerm denominatorTerm) {
	    this.denominatorTerm = denominatorTerm;
	}

}