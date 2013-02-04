// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A type that is used for an option whose payout is based on the average of the price of the underlying over a specific period of time. The payout is the difference between the predetermined, fixed strike price and the average of spot rates observed and is used for hedging against prevailing spot rates over a given time period.
 */
@RootElement(name = "fxAverageRateOption", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class FxAverageRateOption extends Product implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private PartyOrTradeSideReference buyerPartyReference;
	
	@Element
	private PartyOrTradeSideReference sellerPartyReference;
	
	@Element
	private ExpiryDateTime expiryDateTime;
	
	@Element
	private ExerciseStyleEnum exerciseStyle;
	
	@Element
	private List<FxOptionPremium> fxOptionPremium;
	
	@Element
	private Date valueDate;
	
	@Element
	private Money putCurrencyAmount;
	
	@Element
	private Money callCurrencyAmount;
	
	@Element
	private FxStrikePrice fxStrikePrice;
	
	@Element
	private BigDecimal spotRate;
	
	@Element
	private Currency payoutCurrency;
	
	@Element
	private StrikeQuoteBasisEnum averageRateQuoteBasis;
	
	@Element
	private BigInteger precision;
	
	@Element
	private String payoutFormula;
	
	@Element
	private InformationSource primaryRateSource;
	
	@Element
	private InformationSource secondaryRateSource;
	
	@Element
	private BusinessCenterTime fixingTime;
	
	@Element
	private FxAverageRateObservationSchedule averageRateObservationSchedule;
	
	@Element
	private List<FxAverageRateObservationDate> averageRateObservationDate;
	
	@Element
	private List<ObservedRates> observedRates;
	
    
	/**
     * public getter
     *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getBuyerPartyReference() {
	    return this.buyerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that buys this instrument, ie. pays for this instrument and receives the rights defined by it. See 2000 ISDA definitions Article 11.1 (b). In the case of FRAs this the fixed rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setBuyerPartyReference(PartyOrTradeSideReference buyerPartyReference) {
	    this.buyerPartyReference = buyerPartyReference;
	}
	/**
     * public getter
     *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @returns com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public PartyOrTradeSideReference getSellerPartyReference() {
	    return this.sellerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the party that sells ("writes") this instrument, i.e. that grants the rights defined by this instrument and in return receives a payment for it. See 2000 ISDA definitions Article 11.1 (a). In the case of FRAs this is the floating rate payer.
     *
     * @param com.leansoft.fpml.nano.PartyOrTradeSideReference
	 */
	public void setSellerPartyReference(PartyOrTradeSideReference sellerPartyReference) {
	    this.sellerPartyReference = sellerPartyReference;
	}
	/**
     * public getter
     *
     * The date and time in a location of the option expiry. In the case of american options this is the latest possible expiry date and time.
     *
     * @returns com.leansoft.fpml.nano.ExpiryDateTime
	 */
	public ExpiryDateTime getExpiryDateTime() {
	    return this.expiryDateTime;
	}
	
	/**
	 * public setter
	 *
     * The date and time in a location of the option expiry. In the case of american options this is the latest possible expiry date and time.
     *
     * @param com.leansoft.fpml.nano.ExpiryDateTime
	 */
	public void setExpiryDateTime(ExpiryDateTime expiryDateTime) {
	    this.expiryDateTime = expiryDateTime;
	}
	/**
     * public getter
     *
     * The manner in which the option can be exercised.
     *
     * @returns com.leansoft.fpml.nano.ExerciseStyleEnum
	 */
	public ExerciseStyleEnum getExerciseStyle() {
	    return this.exerciseStyle;
	}
	
	/**
	 * public setter
	 *
     * The manner in which the option can be exercised.
     *
     * @param com.leansoft.fpml.nano.ExerciseStyleEnum
	 */
	public void setExerciseStyle(ExerciseStyleEnum exerciseStyle) {
	    this.exerciseStyle = exerciseStyle;
	}
	/**
     * public getter
     *
     * Premium amount or premium installment amount for an option.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.FxOptionPremium>
	 */
	public List<FxOptionPremium> getFxOptionPremium() {
	    return this.fxOptionPremium;
	}
	
	/**
	 * public setter
	 *
     * Premium amount or premium installment amount for an option.
     *
     * @param java.util.List<com.leansoft.fpml.nano.FxOptionPremium>
	 */
	public void setFxOptionPremium(List<FxOptionPremium> fxOptionPremium) {
	    this.fxOptionPremium = fxOptionPremium;
	}
	/**
     * public getter
     *
     * The date on which both currencies traded will settle.
     *
     * @returns java.util.Date
	 */
	public Date getValueDate() {
	    return this.valueDate;
	}
	
	/**
	 * public setter
	 *
     * The date on which both currencies traded will settle.
     *
     * @param java.util.Date
	 */
	public void setValueDate(Date valueDate) {
	    this.valueDate = valueDate;
	}
	/**
     * public getter
     *
     * The currency amount that the option gives the right to sell.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getPutCurrencyAmount() {
	    return this.putCurrencyAmount;
	}
	
	/**
	 * public setter
	 *
     * The currency amount that the option gives the right to sell.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setPutCurrencyAmount(Money putCurrencyAmount) {
	    this.putCurrencyAmount = putCurrencyAmount;
	}
	/**
     * public getter
     *
     * The currency amount that the option gives the right to buy.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getCallCurrencyAmount() {
	    return this.callCurrencyAmount;
	}
	
	/**
	 * public setter
	 *
     * The currency amount that the option gives the right to buy.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setCallCurrencyAmount(Money callCurrencyAmount) {
	    this.callCurrencyAmount = callCurrencyAmount;
	}
	/**
     * public getter
     *
     * TBA
     *
     * @returns com.leansoft.fpml.nano.FxStrikePrice
	 */
	public FxStrikePrice getFxStrikePrice() {
	    return this.fxStrikePrice;
	}
	
	/**
	 * public setter
	 *
     * TBA
     *
     * @param com.leansoft.fpml.nano.FxStrikePrice
	 */
	public void setFxStrikePrice(FxStrikePrice fxStrikePrice) {
	    this.fxStrikePrice = fxStrikePrice;
	}
	/**
     * public getter
     *
     * An optional element used for FX forwards and certain types of FX OTC options. For deals consumated in the FX Forwards Market, this represents the current market rate for a particular currency pair. For barrier and digital/binary options, it can be useful to include the spot rate at the time the option was executed to make it easier to know whether the option needs to move "up" or "down" to be triggered.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getSpotRate() {
	    return this.spotRate;
	}
	
	/**
	 * public setter
	 *
     * An optional element used for FX forwards and certain types of FX OTC options. For deals consumated in the FX Forwards Market, this represents the current market rate for a particular currency pair. For barrier and digital/binary options, it can be useful to include the spot rate at the time the option was executed to make it easier to know whether the option needs to move "up" or "down" to be triggered.
     *
     * @param java.math.BigDecimal
	 */
	public void setSpotRate(BigDecimal spotRate) {
	    this.spotRate = spotRate;
	}
	/**
     * public getter
     *
     * The ISO code of the currency in which a payout (if any) is to be made when a trigger is hit on a digital or barrier option.
     *
     * @returns com.leansoft.fpml.nano.Currency
	 */
	public Currency getPayoutCurrency() {
	    return this.payoutCurrency;
	}
	
	/**
	 * public setter
	 *
     * The ISO code of the currency in which a payout (if any) is to be made when a trigger is hit on a digital or barrier option.
     *
     * @param com.leansoft.fpml.nano.Currency
	 */
	public void setPayoutCurrency(Currency payoutCurrency) {
	    this.payoutCurrency = payoutCurrency;
	}
	/**
     * public getter
     *
     * The method by which the average rate that is being observed is quoted.
     *
     * @returns com.leansoft.fpml.nano.StrikeQuoteBasisEnum
	 */
	public StrikeQuoteBasisEnum getAverageRateQuoteBasis() {
	    return this.averageRateQuoteBasis;
	}
	
	/**
	 * public setter
	 *
     * The method by which the average rate that is being observed is quoted.
     *
     * @param com.leansoft.fpml.nano.StrikeQuoteBasisEnum
	 */
	public void setAverageRateQuoteBasis(StrikeQuoteBasisEnum averageRateQuoteBasis) {
	    this.averageRateQuoteBasis = averageRateQuoteBasis;
	}
	/**
     * public getter
     *
     * Specifies the rounding precision in terms of a number of decimal places. Note how a percentage rate rounding of 5 decimal places is expressed as a rounding precision of 7 in the FpML document since the percentage is expressed as a decimal, e.g. 9.876543% (or 0.09876543) being rounded to the nearest 5 decimal places is 9.87654% (or 0.0987654).
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getPrecision() {
	    return this.precision;
	}
	
	/**
	 * public setter
	 *
     * Specifies the rounding precision in terms of a number of decimal places. Note how a percentage rate rounding of 5 decimal places is expressed as a rounding precision of 7 in the FpML document since the percentage is expressed as a decimal, e.g. 9.876543% (or 0.09876543) being rounded to the nearest 5 decimal places is 9.87654% (or 0.0987654).
     *
     * @param java.math.BigInteger
	 */
	public void setPrecision(BigInteger precision) {
	    this.precision = precision;
	}
	/**
     * public getter
     *
     * The description of the mathematical computation for how the payout is computed.
     *
     * @returns java.lang.String
	 */
	public String getPayoutFormula() {
	    return this.payoutFormula;
	}
	
	/**
	 * public setter
	 *
     * The description of the mathematical computation for how the payout is computed.
     *
     * @param java.lang.String
	 */
	public void setPayoutFormula(String payoutFormula) {
	    this.payoutFormula = payoutFormula;
	}
	/**
     * public getter
     *
     * The primary source for where the rate observation will occur. Will typically be either a page or a reference bank published rate.
     *
     * @returns com.leansoft.fpml.nano.InformationSource
	 */
	public InformationSource getPrimaryRateSource() {
	    return this.primaryRateSource;
	}
	
	/**
	 * public setter
	 *
     * The primary source for where the rate observation will occur. Will typically be either a page or a reference bank published rate.
     *
     * @param com.leansoft.fpml.nano.InformationSource
	 */
	public void setPrimaryRateSource(InformationSource primaryRateSource) {
	    this.primaryRateSource = primaryRateSource;
	}
	/**
     * public getter
     *
     * An alternative, or secondary, source for where the rate observation will occur. Will typically be either a page or a reference bank published rate.
     *
     * @returns com.leansoft.fpml.nano.InformationSource
	 */
	public InformationSource getSecondaryRateSource() {
	    return this.secondaryRateSource;
	}
	
	/**
	 * public setter
	 *
     * An alternative, or secondary, source for where the rate observation will occur. Will typically be either a page or a reference bank published rate.
     *
     * @param com.leansoft.fpml.nano.InformationSource
	 */
	public void setSecondaryRateSource(InformationSource secondaryRateSource) {
	    this.secondaryRateSource = secondaryRateSource;
	}
	/**
     * public getter
     *
     * The time at which the spot currency exchange rate will be observed. It is specified as a time in a specific business center, e.g. 11:00am London time.
     *
     * @returns com.leansoft.fpml.nano.BusinessCenterTime
	 */
	public BusinessCenterTime getFixingTime() {
	    return this.fixingTime;
	}
	
	/**
	 * public setter
	 *
     * The time at which the spot currency exchange rate will be observed. It is specified as a time in a specific business center, e.g. 11:00am London time.
     *
     * @param com.leansoft.fpml.nano.BusinessCenterTime
	 */
	public void setFixingTime(BusinessCenterTime fixingTime) {
	    this.fixingTime = fixingTime;
	}
	/**
     * public getter
     *
     * Parametric schedule of rate observations.
     *
     * @returns com.leansoft.fpml.nano.FxAverageRateObservationSchedule
	 */
	public FxAverageRateObservationSchedule getAverageRateObservationSchedule() {
	    return this.averageRateObservationSchedule;
	}
	
	/**
	 * public setter
	 *
     * Parametric schedule of rate observations.
     *
     * @param com.leansoft.fpml.nano.FxAverageRateObservationSchedule
	 */
	public void setAverageRateObservationSchedule(FxAverageRateObservationSchedule averageRateObservationSchedule) {
	    this.averageRateObservationSchedule = averageRateObservationSchedule;
	}
	/**
     * public getter
     *
     * One of more specific rate observation dates.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.FxAverageRateObservationDate>
	 */
	public List<FxAverageRateObservationDate> getAverageRateObservationDate() {
	    return this.averageRateObservationDate;
	}
	
	/**
	 * public setter
	 *
     * One of more specific rate observation dates.
     *
     * @param java.util.List<com.leansoft.fpml.nano.FxAverageRateObservationDate>
	 */
	public void setAverageRateObservationDate(List<FxAverageRateObservationDate> averageRateObservationDate) {
	    this.averageRateObservationDate = averageRateObservationDate;
	}
	/**
     * public getter
     *
     * Describes prior rate observations within average rate options. Periodically, an average rate option agreement will be struck whereby some rates have already been observed in the past but will become part of computation of the average rate of the option. This structure provides for these previously observed rates to be included in the description of the trade.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ObservedRates>
	 */
	public List<ObservedRates> getObservedRates() {
	    return this.observedRates;
	}
	
	/**
	 * public setter
	 *
     * Describes prior rate observations within average rate options. Periodically, an average rate option agreement will be struck whereby some rates have already been observed in the past but will become part of computation of the average rate of the option. This structure provides for these previously observed rates to be included in the description of the trade.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ObservedRates>
	 */
	public void setObservedRates(List<ObservedRates> observedRates) {
	    this.observedRates = observedRates;
	}

}