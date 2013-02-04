// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * Lender share of the borrower re-payment
 */
public class FacilityRepayment implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Boolean refusalAllowed;
	
	@Element
	private Boolean adjustsCommitment;
	
	@Element
	private BreakageCostEnum breakageCost;
	
	@Element
	private Date repaymentDate;
	
	@Element
	private ParticipationAmount amount;
	
    
	/**
     * public getter
     *
     * Defines whether the lender has an option to accept or deny the payment
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getRefusalAllowed() {
	    return this.refusalAllowed;
	}
	
	/**
	 * public setter
	 *
     * Defines whether the lender has an option to accept or deny the payment
     *
     * @param java.lang.Boolean
	 */
	public void setRefusalAllowed(Boolean refusalAllowed) {
	    this.refusalAllowed = refusalAllowed;
	}
	/**
     * public getter
     *
     * Defines whether repayment comes with commitment adjustments
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getAdjustsCommitment() {
	    return this.adjustsCommitment;
	}
	
	/**
	 * public setter
	 *
     * Defines whether repayment comes with commitment adjustments
     *
     * @param java.lang.Boolean
	 */
	public void setAdjustsCommitment(Boolean adjustsCommitment) {
	    this.adjustsCommitment = adjustsCommitment;
	}
	/**
     * public getter
     *
     * When breakage cost is applicable, defines who is calculating it.
     *
     * @returns com.leansoft.fpml.nano.BreakageCostEnum
	 */
	public BreakageCostEnum getBreakageCost() {
	    return this.breakageCost;
	}
	
	/**
	 * public setter
	 *
     * When breakage cost is applicable, defines who is calculating it.
     *
     * @param com.leansoft.fpml.nano.BreakageCostEnum
	 */
	public void setBreakageCost(BreakageCostEnum breakageCost) {
	    this.breakageCost = breakageCost;
	}
	/**
     * public getter
     *
     * Date on which principal repayment was paid to the lender by the agent bank>
     *
     * @returns java.util.Date
	 */
	public Date getRepaymentDate() {
	    return this.repaymentDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which principal repayment was paid to the lender by the agent bank>
     *
     * @param java.util.Date
	 */
	public void setRepaymentDate(Date repaymentDate) {
	    this.repaymentDate = repaymentDate;
	}
	/**
     * public getter
     *
     * Global and share amount
     *
     * @returns com.leansoft.fpml.nano.ParticipationAmount
	 */
	public ParticipationAmount getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * Global and share amount
     *
     * @param com.leansoft.fpml.nano.ParticipationAmount
	 */
	public void setAmount(ParticipationAmount amount) {
	    this.amount = amount;
	}

}