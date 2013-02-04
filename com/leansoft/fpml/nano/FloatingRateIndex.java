// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * The ISDA Floating Rate Option, i.e. the floating rate index.
 */
public class FloatingRateIndex implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String floatingRateIndexScheme;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getFloatingRateIndexScheme() {
	    return this.floatingRateIndexScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setFloatingRateIndexScheme(String floatingRateIndexScheme) {
	    this.floatingRateIndexScheme = floatingRateIndexScheme;
	}

}