// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * An event type that defines the content of an Increase transaction.
 */
public class Increase extends Event implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Trade trade;
	
	@Element
	private PartyTradeIdentifiers tradeReference;
	
	@Element
	private Date increaseTradeDate;
	
	@Element
	private Date increaseEffectiveDate;
	
	@Element
	private Money increaseInNotionalAmount;
	
	@Element
	private Money outstandingNotionalAmount;
	
	@Element
	private BigDecimal increaseInNumberOfOptions;
	
	@Element
	private BigDecimal outstandingNumberOfOptions;
	
	@Element
	private Payment payment;
	
    
	/**
     * public getter
     *
     * An element that allows the full details of the trade to be used as a mechanism for identifying the trade for which the post-trade event pertains
     *
     * @returns com.leansoft.fpml.nano.Trade
	 */
	public Trade getTrade() {
	    return this.trade;
	}
	
	/**
	 * public setter
	 *
     * An element that allows the full details of the trade to be used as a mechanism for identifying the trade for which the post-trade event pertains
     *
     * @param com.leansoft.fpml.nano.Trade
	 */
	public void setTrade(Trade trade) {
	    this.trade = trade;
	}
	/**
     * public getter
     *
     * A container since an individual trade can be referenced by two or more different partyTradeIdentifier elements - each allocated by a different party.
     *
     * @returns com.leansoft.fpml.nano.PartyTradeIdentifiers
	 */
	public PartyTradeIdentifiers getTradeReference() {
	    return this.tradeReference;
	}
	
	/**
	 * public setter
	 *
     * A container since an individual trade can be referenced by two or more different partyTradeIdentifier elements - each allocated by a different party.
     *
     * @param com.leansoft.fpml.nano.PartyTradeIdentifiers
	 */
	public void setTradeReference(PartyTradeIdentifiers tradeReference) {
	    this.tradeReference = tradeReference;
	}
	/**
     * public getter
     *
     * The date on which the the parties enter into the Increase transaction
     *
     * @returns java.util.Date
	 */
	public Date getIncreaseTradeDate() {
	    return this.increaseTradeDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which the the parties enter into the Increase transaction
     *
     * @param java.util.Date
	 */
	public void setIncreaseTradeDate(Date increaseTradeDate) {
	    this.increaseTradeDate = increaseTradeDate;
	}
	/**
     * public getter
     *
     * The date on which the Increase becomes effective
     *
     * @returns java.util.Date
	 */
	public Date getIncreaseEffectiveDate() {
	    return this.increaseEffectiveDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which the Increase becomes effective
     *
     * @param java.util.Date
	 */
	public void setIncreaseEffectiveDate(Date increaseEffectiveDate) {
	    this.increaseEffectiveDate = increaseEffectiveDate;
	}
	/**
     * public getter
     *
     * Specifies the fixed amount by which the Notional increases due to the Increase transaction.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getIncreaseInNotionalAmount() {
	    return this.increaseInNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * Specifies the fixed amount by which the Notional increases due to the Increase transaction.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setIncreaseInNotionalAmount(Money increaseInNotionalAmount) {
	    this.increaseInNotionalAmount = increaseInNotionalAmount;
	}
	/**
     * public getter
     *
     * Specifies the Notional amount after the Increase.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getOutstandingNotionalAmount() {
	    return this.outstandingNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * Specifies the Notional amount after the Increase.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setOutstandingNotionalAmount(Money outstandingNotionalAmount) {
	    this.outstandingNotionalAmount = outstandingNotionalAmount;
	}
	/**
     * public getter
     *
     * Specifies the fixed amount by which the Number of Options increases due to the Increase transaction.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getIncreaseInNumberOfOptions() {
	    return this.increaseInNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * Specifies the fixed amount by which the Number of Options increases due to the Increase transaction.
     *
     * @param java.math.BigDecimal
	 */
	public void setIncreaseInNumberOfOptions(BigDecimal increaseInNumberOfOptions) {
	    this.increaseInNumberOfOptions = increaseInNumberOfOptions;
	}
	/**
     * public getter
     *
     * Specifies the Number of Options after the Increase.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getOutstandingNumberOfOptions() {
	    return this.outstandingNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * Specifies the Number of Options after the Increase.
     *
     * @param java.math.BigDecimal
	 */
	public void setOutstandingNumberOfOptions(BigDecimal outstandingNumberOfOptions) {
	    this.outstandingNumberOfOptions = outstandingNumberOfOptions;
	}
	/**
     * public getter
     *
     * A payment for the right to increase the trade.
     *
     * @returns com.leansoft.fpml.nano.Payment
	 */
	public Payment getPayment() {
	    return this.payment;
	}
	
	/**
	 * public setter
	 *
     * A payment for the right to increase the trade.
     *
     * @param com.leansoft.fpml.nano.Payment
	 */
	public void setPayment(Payment payment) {
	    this.payment = payment;
	}

}