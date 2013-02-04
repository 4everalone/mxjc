// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The amount of principal repayment associated with a single loan contract
 */
public class LoanContractRepayment implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private LoanContractIdentifier loanContractIdentifier;
	
	@Element
	private ParticipationAmount amount;
	
	@Element
	private InterestPaidWithRepaymentEnum interestPaidWithRepayment;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.LoanContractIdentifier
	 */
	public LoanContractIdentifier getLoanContractIdentifier() {
	    return this.loanContractIdentifier;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.LoanContractIdentifier
	 */
	public void setLoanContractIdentifier(LoanContractIdentifier loanContractIdentifier) {
	    this.loanContractIdentifier = loanContractIdentifier;
	}
	/**
     * public getter
     *
     * The amount of the repayment associated with this loan contract.
     *
     * @returns com.leansoft.fpml.nano.ParticipationAmount
	 */
	public ParticipationAmount getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * The amount of the repayment associated with this loan contract.
     *
     * @param com.leansoft.fpml.nano.ParticipationAmount
	 */
	public void setAmount(ParticipationAmount amount) {
	    this.amount = amount;
	}
	/**
     * public getter
     *
     * Defines the option of paying interest on repayment date.
     *
     * @returns com.leansoft.fpml.nano.InterestPaidWithRepaymentEnum
	 */
	public InterestPaidWithRepaymentEnum getInterestPaidWithRepayment() {
	    return this.interestPaidWithRepayment;
	}
	
	/**
	 * public setter
	 *
     * Defines the option of paying interest on repayment date.
     *
     * @param com.leansoft.fpml.nano.InterestPaidWithRepaymentEnum
	 */
	public void setInterestPaidWithRepayment(InterestPaidWithRepaymentEnum interestPaidWithRepayment) {
	    this.interestPaidWithRepayment = interestPaidWithRepayment;
	}

}