// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A legal entity identifier (e.g. RED entity code).
 */
@RootElement(name = "entityId", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class EntityId implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String entityIdScheme;
	
    
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
	public String getEntityIdScheme() {
	    return this.entityIdScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setEntityIdScheme(String entityIdScheme) {
	    this.entityIdScheme = entityIdScheme;
	}

}