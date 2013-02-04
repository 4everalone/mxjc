// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of the consequences of Index Events.
 */
public enum IndexEventConsequenceEnum {

    /**
     * Calculation Agent Adjustment
     */
    CALCULATION_AGENT_ADJUSTMENT("CalculationAgentAdjustment"),
  

    /**
     * Negotiated Close Out
     */
    NEGOTIATED_CLOSE_OUT("NegotiatedCloseOut"),
  

    /**
     * Cancellation and Payment
     */
    CANCELLATION_AND_PAYMENT("CancellationAndPayment");
  
  
    private final String value;
  
    IndexEventConsequenceEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static IndexEventConsequenceEnum fromValue(String v) {
        if (v != null) {
            for (IndexEventConsequenceEnum c: IndexEventConsequenceEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}