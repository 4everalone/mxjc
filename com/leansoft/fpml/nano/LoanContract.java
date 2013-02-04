// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A basic structure descibing an outstanding loan agreement between borrower and lenders made within a facility under a deal. Examples: loan contract, letter of credit, bank acceptance
 */
public class LoanContract implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private LoanContractIdentifier loanContractIdentifier;
	
	@Element
	private DealIdentifier dealIdentifier;
	
	@Element
	private FacilityIdentifier facilityIdentifier;
	
	@Element
	private PartyReference borrowerPartyReference;
	
	@Element
	private Money amount;
	
	@Element
	private Date effectiveDate;
	
	@Element
	private Boolean conditionsPrecedentMet;
	
	@Element
	private String conditionsPrecedentComment;
	
	@Element
	private FxTerms fxTerms;
	
	@Element
	private InterestRatePeriod currentInterestRatePeriod;
	
	@Element
	private Interval interestPaymentTenor;
	
	@Element
	private Date nextInterestPaymentDate;
	
    
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
     * @returns com.leansoft.fpml.nano.DealIdentifier
	 */
	public DealIdentifier getDealIdentifier() {
	    return this.dealIdentifier;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.DealIdentifier
	 */
	public void setDealIdentifier(DealIdentifier dealIdentifier) {
	    this.dealIdentifier = dealIdentifier;
	}
	/**
     * public getter
     *
     * Set of fields identifying instrument.
     *
     * @returns com.leansoft.fpml.nano.FacilityIdentifier
	 */
	public FacilityIdentifier getFacilityIdentifier() {
	    return this.facilityIdentifier;
	}
	
	/**
	 * public setter
	 *
     * Set of fields identifying instrument.
     *
     * @param com.leansoft.fpml.nano.FacilityIdentifier
	 */
	public void setFacilityIdentifier(FacilityIdentifier facilityIdentifier) {
	    this.facilityIdentifier = facilityIdentifier;
	}
	/**
     * public getter
     *
     * There could be multiple borrowers against a loan contract however the agents have been trying to promote the concept of an administrative borrower. Hence, only one being shown in the field list.
     *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getBorrowerPartyReference() {
	    return this.borrowerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * There could be multiple borrowers against a loan contract however the agents have been trying to promote the concept of an administrative borrower. Hence, only one being shown in the field list.
     *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setBorrowerPartyReference(PartyReference borrowerPartyReference) {
	    this.borrowerPartyReference = borrowerPartyReference;
	}
	/**
     * public getter
     *
     * An amount associated with the loan contract with loan contract currency.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * An amount associated with the loan contract with loan contract currency.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setAmount(Money amount) {
	    this.amount = amount;
	}
	/**
     * public getter
     *
     * Effective date of the loan contract. This is the date on which the funds are passed to the borrower.
     *
     * @returns java.util.Date
	 */
	public Date getEffectiveDate() {
	    return this.effectiveDate;
	}
	
	/**
	 * public setter
	 *
     * Effective date of the loan contract. This is the date on which the funds are passed to the borrower.
     *
     * @param java.util.Date
	 */
	public void setEffectiveDate(Date effectiveDate) {
	    this.effectiveDate = effectiveDate;
	}
	/**
     * public getter
     *
     * The flag defining whether coditions precedent defined in the credit agreement is met and borrower can start drawing against deal facilities.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getConditionsPrecedentMet() {
	    return this.conditionsPrecedentMet;
	}
	
	/**
	 * public setter
	 *
     * The flag defining whether coditions precedent defined in the credit agreement is met and borrower can start drawing against deal facilities.
     *
     * @param java.lang.Boolean
	 */
	public void setConditionsPrecedentMet(Boolean conditionsPrecedentMet) {
	    this.conditionsPrecedentMet = conditionsPrecedentMet;
	}
	/**
     * public getter
     *
     * A free text field defining the resons why conditions precedent has not been met.
     *
     * @returns java.lang.String
	 */
	public String getConditionsPrecedentComment() {
	    return this.conditionsPrecedentComment;
	}
	
	/**
	 * public setter
	 *
     * A free text field defining the resons why conditions precedent has not been met.
     *
     * @param java.lang.String
	 */
	public void setConditionsPrecedentComment(String conditionsPrecedentComment) {
	    this.conditionsPrecedentComment = conditionsPrecedentComment;
	}
	/**
     * public getter
     *
     * Defines FX exchange rate when loan contract and facility currencies are different.>
     *
     * @returns com.leansoft.fpml.nano.FxTerms
	 */
	public FxTerms getFxTerms() {
	    return this.fxTerms;
	}
	
	/**
	 * public setter
	 *
     * Defines FX exchange rate when loan contract and facility currencies are different.>
     *
     * @param com.leansoft.fpml.nano.FxTerms
	 */
	public void setFxTerms(FxTerms fxTerms) {
	    this.fxTerms = fxTerms;
	}
	/**
     * public getter
     *
     * The current interest period defining interest rate on the contract>
     *
     * @returns com.leansoft.fpml.nano.InterestRatePeriod
	 */
	public InterestRatePeriod getCurrentInterestRatePeriod() {
	    return this.currentInterestRatePeriod;
	}
	
	/**
	 * public setter
	 *
     * The current interest period defining interest rate on the contract>
     *
     * @param com.leansoft.fpml.nano.InterestRatePeriod
	 */
	public void setCurrentInterestRatePeriod(InterestRatePeriod currentInterestRatePeriod) {
	    this.currentInterestRatePeriod = currentInterestRatePeriod;
	}
	/**
     * public getter
     *
     * The frequency in which interest payments made, as defined in the credit agreement.>
     *
     * @returns com.leansoft.fpml.nano.Interval
	 */
	public Interval getInterestPaymentTenor() {
	    return this.interestPaymentTenor;
	}
	
	/**
	 * public setter
	 *
     * The frequency in which interest payments made, as defined in the credit agreement.>
     *
     * @param com.leansoft.fpml.nano.Interval
	 */
	public void setInterestPaymentTenor(Interval interestPaymentTenor) {
	    this.interestPaymentTenor = interestPaymentTenor;
	}
	/**
     * public getter
     *
     * Next interest payment is due on this date.>
     *
     * @returns java.util.Date
	 */
	public Date getNextInterestPaymentDate() {
	    return this.nextInterestPaymentDate;
	}
	
	/**
	 * public setter
	 *
     * Next interest payment is due on this date.>
     *
     * @param java.util.Date
	 */
	public void setNextInterestPaymentDate(Date nextInterestPaymentDate) {
	    this.nextInterestPaymentDate = nextInterestPaymentDate;
	}

}