// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.math.BigDecimal;

/**
 * A type describing the commission that will be charged for each of the hedge transactions.
 */
public class Commission implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private CommissionDenominationEnum commissionDenomination;
	
	@Element
	private BigDecimal commissionAmount;
	
	@Element
	private Currency currency;
	
	@Element
	private BigDecimal commissionPerTrade;
	
	@Element
	private List<FxRate> fxRate;
	
    
	/**
     * public getter
     *
     * The type of units used to express a commission.
     *
     * @returns com.leansoft.fpml.nano.CommissionDenominationEnum
	 */
	public CommissionDenominationEnum getCommissionDenomination() {
	    return this.commissionDenomination;
	}
	
	/**
	 * public setter
	 *
     * The type of units used to express a commission.
     *
     * @param com.leansoft.fpml.nano.CommissionDenominationEnum
	 */
	public void setCommissionDenomination(CommissionDenominationEnum commissionDenomination) {
	    this.commissionDenomination = commissionDenomination;
	}
	/**
     * public getter
     *
     * The commission amount, expressed in the way indicated by the commissionType element.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getCommissionAmount() {
	    return this.commissionAmount;
	}
	
	/**
	 * public setter
	 *
     * The commission amount, expressed in the way indicated by the commissionType element.
     *
     * @param java.math.BigDecimal
	 */
	public void setCommissionAmount(BigDecimal commissionAmount) {
	    this.commissionAmount = commissionAmount;
	}
	/**
     * public getter
     *
     * The currency in which an amount is denominated.
     *
     * @returns com.leansoft.fpml.nano.Currency
	 */
	public Currency getCurrency() {
	    return this.currency;
	}
	
	/**
	 * public setter
	 *
     * The currency in which an amount is denominated.
     *
     * @param com.leansoft.fpml.nano.Currency
	 */
	public void setCurrency(Currency currency) {
	    this.currency = currency;
	}
	/**
     * public getter
     *
     * The total commission per trade.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getCommissionPerTrade() {
	    return this.commissionPerTrade;
	}
	
	/**
	 * public setter
	 *
     * The total commission per trade.
     *
     * @param java.math.BigDecimal
	 */
	public void setCommissionPerTrade(BigDecimal commissionPerTrade) {
	    this.commissionPerTrade = commissionPerTrade;
	}
	/**
     * public getter
     *
     * FX Rates that have been used to convert commissions to a single currency.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.FxRate>
	 */
	public List<FxRate> getFxRate() {
	    return this.fxRate;
	}
	
	/**
	 * public setter
	 *
     * FX Rates that have been used to convert commissions to a single currency.
     *
     * @param java.util.List<com.leansoft.fpml.nano.FxRate>
	 */
	public void setFxRate(List<FxRate> fxRate) {
	    this.fxRate = fxRate;
	}

}