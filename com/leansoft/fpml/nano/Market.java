// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A collection of pricing inputs.
 */
@RootElement(name = "market", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class Market implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String name;
	
	@Element
	private QuotedAssetSet benchmarkQuotes;
	
	@Element
	private List<PricingMethod> benchmarkPricingMethod;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The name of the market, e.g. the USDLIBOR market. Used for description and understandability.
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * The name of the market, e.g. the USDLIBOR market. Used for description and understandability.
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * A collection of benchmark instruments and quotes used as inputs to the pricing models.
     *
     * @returns com.leansoft.fpml.nano.QuotedAssetSet
	 */
	public QuotedAssetSet getBenchmarkQuotes() {
	    return this.benchmarkQuotes;
	}
	
	/**
	 * public setter
	 *
     * A collection of benchmark instruments and quotes used as inputs to the pricing models.
     *
     * @param com.leansoft.fpml.nano.QuotedAssetSet
	 */
	public void setBenchmarkQuotes(QuotedAssetSet benchmarkQuotes) {
	    this.benchmarkQuotes = benchmarkQuotes;
	}
	/**
     * public getter
     *
     * The pricing structure used to quote a benchmark instrument.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PricingMethod>
	 */
	public List<PricingMethod> getBenchmarkPricingMethod() {
	    return this.benchmarkPricingMethod;
	}
	
	/**
	 * public setter
	 *
     * The pricing structure used to quote a benchmark instrument.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PricingMethod>
	 */
	public void setBenchmarkPricingMethod(List<PricingMethod> benchmarkPricingMethod) {
	    this.benchmarkPricingMethod = benchmarkPricingMethod;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}

}