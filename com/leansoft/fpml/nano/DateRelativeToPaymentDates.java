// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type to provide the ability to point to multiple payment nodes in the document through the unbounded paymentDatesReference.
 */
public class DateRelativeToPaymentDates implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<PaymentDatesReference> paymentDatesReference;
	
    
	/**
     * public getter
     *
     * A set of href pointers to payment dates defined somewhere else in the document.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PaymentDatesReference>
	 */
	public List<PaymentDatesReference> getPaymentDatesReference() {
	    return this.paymentDatesReference;
	}
	
	/**
	 * public setter
	 *
     * A set of href pointers to payment dates defined somewhere else in the document.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PaymentDatesReference>
	 */
	public void setPaymentDatesReference(List<PaymentDatesReference> paymentDatesReference) {
	    this.paymentDatesReference = paymentDatesReference;
	}

}