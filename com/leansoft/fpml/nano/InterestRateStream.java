// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type defining the components specifiying an interest rate stream, including both a parametric and cashflow representation for the stream of payments.
 */
public class InterestRateStream extends Leg implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyOrAccountReference payerPartyReference;
	
	@Element
	private PartyOrAccountReference receiverPartyReference;
	
	@Element
	private CalculationPeriodDates calculationPeriodDates;
	
	@Element
	private PaymentDates paymentDates;
	
	@Element
	private ResetDates resetDates;
	
	@Element
	private CalculationPeriodAmount calculationPeriodAmount;
	
	@Element
	private StubCalculationPeriodAmount stubCalculationPeriodAmount;
	
	@Element
	private PrincipalExchanges principalExchanges;
	
	@Element
	private Cashflows cashflows;
	
	@Element
	private SettlementProvision settlementProvision;
	
	@Element
	private Formula formula;
	
    
	/**
     * public getter
     *
     * A reference to the party responsible for making the payments defined by this structure.
     *
     * @returns com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public PartyOrAccountReference getPayerPartyReference() {
	    return this.payerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party responsible for making the payments defined by this structure.
     *
     * @param com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public void setPayerPartyReference(PartyOrAccountReference payerPartyReference) {
	    this.payerPartyReference = payerPartyReference;
	}
	/**
     * public getter
     *
     * A reference to the party that receives the payments corresponding to this structure.
     *
     * @returns com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public PartyOrAccountReference getReceiverPartyReference() {
	    return this.receiverPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that receives the payments corresponding to this structure.
     *
     * @param com.leansoft.fpml.nano.PartyOrAccountReference
	 */
	public void setReceiverPartyReference(PartyOrAccountReference receiverPartyReference) {
	    this.receiverPartyReference = receiverPartyReference;
	}
	/**
     * public getter
     *
     * The calculation periods dates schedule.
     *
     * @returns com.leansoft.fpml.nano.CalculationPeriodDates
	 */
	public CalculationPeriodDates getCalculationPeriodDates() {
	    return this.calculationPeriodDates;
	}
	
	/**
	 * public setter
	 *
     * The calculation periods dates schedule.
     *
     * @param com.leansoft.fpml.nano.CalculationPeriodDates
	 */
	public void setCalculationPeriodDates(CalculationPeriodDates calculationPeriodDates) {
	    this.calculationPeriodDates = calculationPeriodDates;
	}
	/**
     * public getter
     *
     * The payment dates schedule.
     *
     * @returns com.leansoft.fpml.nano.PaymentDates
	 */
	public PaymentDates getPaymentDates() {
	    return this.paymentDates;
	}
	
	/**
	 * public setter
	 *
     * The payment dates schedule.
     *
     * @param com.leansoft.fpml.nano.PaymentDates
	 */
	public void setPaymentDates(PaymentDates paymentDates) {
	    this.paymentDates = paymentDates;
	}
	/**
     * public getter
     *
     * The reset dates schedule. The reset dates schedule only applies for a floating rate stream.
     *
     * @returns com.leansoft.fpml.nano.ResetDates
	 */
	public ResetDates getResetDates() {
	    return this.resetDates;
	}
	
	/**
	 * public setter
	 *
     * The reset dates schedule. The reset dates schedule only applies for a floating rate stream.
     *
     * @param com.leansoft.fpml.nano.ResetDates
	 */
	public void setResetDates(ResetDates resetDates) {
	    this.resetDates = resetDates;
	}
	/**
     * public getter
     *
     * The calculation period amount parameters.
     *
     * @returns com.leansoft.fpml.nano.CalculationPeriodAmount
	 */
	public CalculationPeriodAmount getCalculationPeriodAmount() {
	    return this.calculationPeriodAmount;
	}
	
	/**
	 * public setter
	 *
     * The calculation period amount parameters.
     *
     * @param com.leansoft.fpml.nano.CalculationPeriodAmount
	 */
	public void setCalculationPeriodAmount(CalculationPeriodAmount calculationPeriodAmount) {
	    this.calculationPeriodAmount = calculationPeriodAmount;
	}
	/**
     * public getter
     *
     * The stub calculation period amount parameters. This element must only be included if there is an initial or final stub calculation period. Even then, it must only be included if either the stub references a different floating rate tenor to the regular calculation periods, or if the stub is calculated as a linear interpolation of two different floating rate tenors, or if a specific stub rate or stub amount has been negotiated.
     *
     * @returns com.leansoft.fpml.nano.StubCalculationPeriodAmount
	 */
	public StubCalculationPeriodAmount getStubCalculationPeriodAmount() {
	    return this.stubCalculationPeriodAmount;
	}
	
	/**
	 * public setter
	 *
     * The stub calculation period amount parameters. This element must only be included if there is an initial or final stub calculation period. Even then, it must only be included if either the stub references a different floating rate tenor to the regular calculation periods, or if the stub is calculated as a linear interpolation of two different floating rate tenors, or if a specific stub rate or stub amount has been negotiated.
     *
     * @param com.leansoft.fpml.nano.StubCalculationPeriodAmount
	 */
	public void setStubCalculationPeriodAmount(StubCalculationPeriodAmount stubCalculationPeriodAmount) {
	    this.stubCalculationPeriodAmount = stubCalculationPeriodAmount;
	}
	/**
     * public getter
     *
     * The true/false flags indicating whether initial, intermediate or final exchanges of principal should occur.
     *
     * @returns com.leansoft.fpml.nano.PrincipalExchanges
	 */
	public PrincipalExchanges getPrincipalExchanges() {
	    return this.principalExchanges;
	}
	
	/**
	 * public setter
	 *
     * The true/false flags indicating whether initial, intermediate or final exchanges of principal should occur.
     *
     * @param com.leansoft.fpml.nano.PrincipalExchanges
	 */
	public void setPrincipalExchanges(PrincipalExchanges principalExchanges) {
	    this.principalExchanges = principalExchanges;
	}
	/**
     * public getter
     *
     * The cashflows representation of the swap stream.
     *
     * @returns com.leansoft.fpml.nano.Cashflows
	 */
	public Cashflows getCashflows() {
	    return this.cashflows;
	}
	
	/**
	 * public setter
	 *
     * The cashflows representation of the swap stream.
     *
     * @param com.leansoft.fpml.nano.Cashflows
	 */
	public void setCashflows(Cashflows cashflows) {
	    this.cashflows = cashflows;
	}
	/**
     * public getter
     *
     * A provision that allows the specification of settlement terms, occuring when the settlement currency is different to the notional currency of the trade.
     *
     * @returns com.leansoft.fpml.nano.SettlementProvision
	 */
	public SettlementProvision getSettlementProvision() {
	    return this.settlementProvision;
	}
	
	/**
	 * public setter
	 *
     * A provision that allows the specification of settlement terms, occuring when the settlement currency is different to the notional currency of the trade.
     *
     * @param com.leansoft.fpml.nano.SettlementProvision
	 */
	public void setSettlementProvision(SettlementProvision settlementProvision) {
	    this.settlementProvision = settlementProvision;
	}
	/**
     * public getter
     *
     * An interest rate derivative formula.
     *
     * @returns com.leansoft.fpml.nano.Formula
	 */
	public Formula getFormula() {
	    return this.formula;
	}
	
	/**
	 * public setter
	 *
     * An interest rate derivative formula.
     *
     * @param com.leansoft.fpml.nano.Formula
	 */
	public void setFormula(Formula formula) {
	    this.formula = formula;
	}

}