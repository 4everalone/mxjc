// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A period within which the lender maintains certain loan contract position
 */
public class LenderLoanContractPeriod implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date startDate;
	
	@Element
	private Date endDate;
	
	@Element
	private Money shareCommitmentAmount;
	
	@Element
	private Money shareLoanContractAmount;
	
    
	/**
     * public getter
     *
     * Date on which this period begins.
     *
     * @returns java.util.Date
	 */
	public Date getStartDate() {
	    return this.startDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which this period begins.
     *
     * @param java.util.Date
	 */
	public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	}
	/**
     * public getter
     *
     * Date on which this period ends.
     *
     * @returns java.util.Date
	 */
	public Date getEndDate() {
	    return this.endDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which this period ends.
     *
     * @param java.util.Date
	 */
	public void setEndDate(Date endDate) {
	    this.endDate = endDate;
	}
	/**
     * public getter
     *
     * Current lender share.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getShareCommitmentAmount() {
	    return this.shareCommitmentAmount;
	}
	
	/**
	 * public setter
	 *
     * Current lender share.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setShareCommitmentAmount(Money shareCommitmentAmount) {
	    this.shareCommitmentAmount = shareCommitmentAmount;
	}
	/**
     * public getter
     *
     * Lender share of a loan contract. This is based on the share of the overall commitment that the lender is assigned.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getShareLoanContractAmount() {
	    return this.shareLoanContractAmount;
	}
	
	/**
	 * public setter
	 *
     * Lender share of a loan contract. This is based on the share of the overall commitment that the lender is assigned.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setShareLoanContractAmount(Money shareLoanContractAmount) {
	    this.shareLoanContractAmount = shareLoanContractAmount;
	}

}