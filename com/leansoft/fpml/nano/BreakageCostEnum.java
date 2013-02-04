// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * When breakage cost is applicable, defines who is calculating it.
 */
public enum BreakageCostEnum {

    /**
     * Breakage cost is calculated by the agent bank.
     */
    AGENT_BANK("AgentBank"),
  

    /**
     * Breakage cost is calculated by the lender.
     */
    LENDER("Lender");
  
  
    private final String value;
  
    BreakageCostEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BreakageCostEnum fromValue(String v) {
        if (v != null) {
            for (BreakageCostEnum c: BreakageCostEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}