// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The method of calculation to be used when averaging rates. Per ISDA 2000 Definitions, Section 6.2. Certain Definitions Relating to Floating Amounts.
 */
public enum AveragingMethodEnum {

    /**
     * The arithmetic mean of the relevant rates for each reset date.
     */
    UNWEIGHTED("Unweighted"),
  

    /**
     * The arithmetic mean of the relevant rates in effect for each day in a calculation period calculated by multiplying each relevant rate by the number of days such relevant rate is in effect, determining the sum of such products and dividing such sum by the number of days in the calculation period.
     */
    WEIGHTED("Weighted");
  
  
    private final String value;
  
    AveragingMethodEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static AveragingMethodEnum fromValue(String v) {
        if (v != null) {
            for (AveragingMethodEnum c: AveragingMethodEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}