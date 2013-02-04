// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * An exchange traded bond.
 */
@RootElement(name = "bond", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class Bond extends ExchangeTraded implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String issuerName;
	
	@Element
	private PartyReference issuerPartyReference;
	
	@Element
	private CreditSeniority seniority;
	
	@Element
	private CouponType couponType;
	
	@Element
	private BigDecimal couponRate;
	
	@Element
	private Date maturity;
	
	@Element
	private BigDecimal parValue;
	
	@Element
	private BigDecimal faceAmount;
	
	@Element
	private Interval paymentFrequency;
	
	@Element
	private DayCountFraction dayCountFraction;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getIssuerName() {
	    return this.issuerName;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setIssuerName(String issuerName) {
	    this.issuerName = issuerName;
	}
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.PartyReference
	 */
	public PartyReference getIssuerPartyReference() {
	    return this.issuerPartyReference;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.PartyReference
	 */
	public void setIssuerPartyReference(PartyReference issuerPartyReference) {
	    this.issuerPartyReference = issuerPartyReference;
	}
	/**
     * public getter
     *
     * The repayment precedence of a debt instrument.
     *
     * @returns com.leansoft.fpml.nano.CreditSeniority
	 */
	public CreditSeniority getSeniority() {
	    return this.seniority;
	}
	
	/**
	 * public setter
	 *
     * The repayment precedence of a debt instrument.
     *
     * @param com.leansoft.fpml.nano.CreditSeniority
	 */
	public void setSeniority(CreditSeniority seniority) {
	    this.seniority = seniority;
	}
	/**
     * public getter
     *
     * Specifies if the bond has a variable coupon, step-up/down coupon or a zero-coupon.
     *
     * @returns com.leansoft.fpml.nano.CouponType
	 */
	public CouponType getCouponType() {
	    return this.couponType;
	}
	
	/**
	 * public setter
	 *
     * Specifies if the bond has a variable coupon, step-up/down coupon or a zero-coupon.
     *
     * @param com.leansoft.fpml.nano.CouponType
	 */
	public void setCouponType(CouponType couponType) {
	    this.couponType = couponType;
	}
	/**
     * public getter
     *
     * Specifies the coupon rate (expressed in percentage) of a fixed income security or convertible bond.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getCouponRate() {
	    return this.couponRate;
	}
	
	/**
	 * public setter
	 *
     * Specifies the coupon rate (expressed in percentage) of a fixed income security or convertible bond.
     *
     * @param java.math.BigDecimal
	 */
	public void setCouponRate(BigDecimal couponRate) {
	    this.couponRate = couponRate;
	}
	/**
     * public getter
     *
     * The date when the principal amount of a security becomes due and payable.
     *
     * @returns java.util.Date
	 */
	public Date getMaturity() {
	    return this.maturity;
	}
	
	/**
	 * public setter
	 *
     * The date when the principal amount of a security becomes due and payable.
     *
     * @param java.util.Date
	 */
	public void setMaturity(Date maturity) {
	    this.maturity = maturity;
	}
	/**
     * public getter
     *
     * Specifies the nominal amount of a fixed income security or convertible bond.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getParValue() {
	    return this.parValue;
	}
	
	/**
	 * public setter
	 *
     * Specifies the nominal amount of a fixed income security or convertible bond.
     *
     * @param java.math.BigDecimal
	 */
	public void setParValue(BigDecimal parValue) {
	    this.parValue = parValue;
	}
	/**
     * public getter
     *
     * Specifies the total amount of the issue. Corresponds to the par value multiplied by the number of issued security.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getFaceAmount() {
	    return this.faceAmount;
	}
	
	/**
	 * public setter
	 *
     * Specifies the total amount of the issue. Corresponds to the par value multiplied by the number of issued security.
     *
     * @param java.math.BigDecimal
	 */
	public void setFaceAmount(BigDecimal faceAmount) {
	    this.faceAmount = faceAmount;
	}
	/**
     * public getter
     *
     * Specifies the frequency at which the bond pays, e.g. 6M.
     *
     * @returns com.leansoft.fpml.nano.Interval
	 */
	public Interval getPaymentFrequency() {
	    return this.paymentFrequency;
	}
	
	/**
	 * public setter
	 *
     * Specifies the frequency at which the bond pays, e.g. 6M.
     *
     * @param com.leansoft.fpml.nano.Interval
	 */
	public void setPaymentFrequency(Interval paymentFrequency) {
	    this.paymentFrequency = paymentFrequency;
	}
	/**
     * public getter
     *
     * The day count basis for the bond.
     *
     * @returns com.leansoft.fpml.nano.DayCountFraction
	 */
	public DayCountFraction getDayCountFraction() {
	    return this.dayCountFraction;
	}
	
	/**
	 * public setter
	 *
     * The day count basis for the bond.
     *
     * @param com.leansoft.fpml.nano.DayCountFraction
	 */
	public void setDayCountFraction(DayCountFraction dayCountFraction) {
	    this.dayCountFraction = dayCountFraction;
	}

}