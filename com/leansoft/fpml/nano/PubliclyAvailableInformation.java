// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.List;

public class PubliclyAvailableInformation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Empty standardPublicSources;
	
	@Element
	private List<String> publicSource;
	
	@Element
	private BigInteger specifiedNumber;
	
    
	/**
     * public getter
     *
     * If this element is specified, indicates that ISDA defined Standard Public Sources are applicable.
     *
     * @returns com.leansoft.fpml.nano.Empty
	 */
	public Empty getStandardPublicSources() {
	    return this.standardPublicSources;
	}
	
	/**
	 * public setter
	 *
     * If this element is specified, indicates that ISDA defined Standard Public Sources are applicable.
     *
     * @param com.leansoft.fpml.nano.Empty
	 */
	public void setStandardPublicSources(Empty standardPublicSources) {
	    this.standardPublicSources = standardPublicSources;
	}
	/**
     * public getter
     *
     * A public information source, e.g. a particular newspaper or electronic news service, that may publish relevant information used in the determination of whether or not a credit event has occurred. ISDA 2003 Term: Public Source
     *
     * @returns java.util.List<java.lang.String>
	 */
	public List<String> getPublicSource() {
	    return this.publicSource;
	}
	
	/**
	 * public setter
	 *
     * A public information source, e.g. a particular newspaper or electronic news service, that may publish relevant information used in the determination of whether or not a credit event has occurred. ISDA 2003 Term: Public Source
     *
     * @param java.util.List<java.lang.String>
	 */
	public void setPublicSource(List<String> publicSource) {
	    this.publicSource = publicSource;
	}
	/**
     * public getter
     *
     * The minimum number of the specified public information sources that must publish information that reasonably confirms that a credit event has occurred. The market convention is two. ISDA 2003 Term: Specified Number
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getSpecifiedNumber() {
	    return this.specifiedNumber;
	}
	
	/**
	 * public setter
	 *
     * The minimum number of the specified public information sources that must publish information that reasonably confirms that a credit event has occurred. The market convention is two. ISDA 2003 Term: Specified Number
     *
     * @param java.math.BigInteger
	 */
	public void setSpecifiedNumber(BigInteger specifiedNumber) {
	    this.specifiedNumber = specifiedNumber;
	}

}