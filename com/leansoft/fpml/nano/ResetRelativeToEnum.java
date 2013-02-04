// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of whether resets occur relative to the first or last day of a calculation period.
 */
public enum ResetRelativeToEnum {

    /**
     * Resets will occur relative to the first day of each calculation period.
     */
    CALCULATION_PERIOD_START_DATE("CalculationPeriodStartDate"),
  

    /**
     * Resets will occur relative to the last day of each calculation period.
     */
    CALCULATION_PERIOD_END_DATE("CalculationPeriodEndDate");
  
  
    private final String value;
  
    ResetRelativeToEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ResetRelativeToEnum fromValue(String v) {
        if (v != null) {
            for (ResetRelativeToEnum c: ResetRelativeToEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}