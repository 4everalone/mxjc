// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of how an OTC option will be exercised.
 */
public enum ExerciseStyleEnum {

    /**
     * Option can be exercised on any date up to the expiry date.
     */
    AMERICAN("American"),
  

    /**
     * Option can be exercised on specified dates up to the expiry date.
     */
    BERMUDA("Bermuda"),
  

    /**
     * Option can only be exercised on the expiry date.
     */
    EUROPEAN("European");
  
  
    private final String value;
  
    ExerciseStyleEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ExerciseStyleEnum fromValue(String v) {
        if (v != null) {
            for (ExerciseStyleEnum c: ExerciseStyleEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}