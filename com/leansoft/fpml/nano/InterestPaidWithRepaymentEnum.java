// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * >Defines the options of paying interest with repayment.
 */
public enum InterestPaidWithRepaymentEnum {

    /**
     * Interest is not payed with repayment.
     */
    NO_INTEREST("NoInterest"),
  

    /**
     * Interest is payed with repayment. Interest accrual amount is based on lender loan contract share amount.
     */
    PAYED_ON_SHARE_AMOUNT("PayedOnShareAmount"),
  

    /**
     * Interest is payed with repayment. Interest accrual amount is based on lender share repayment amount.
     */
    PAYED_ON_REPAYMENT_AMOUNT("PayedOnRepaymentAmount");
  
  
    private final String value;
  
    InterestPaidWithRepaymentEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static InterestPaidWithRepaymentEnum fromValue(String v) {
        if (v != null) {
            for (InterestPaidWithRepaymentEnum c: InterestPaidWithRepaymentEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}