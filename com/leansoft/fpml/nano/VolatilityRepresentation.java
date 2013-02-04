// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A representation of volatilities of an asset. This is a generic structure whose values can be supplied in a specific volatility matrix.
 */
@RootElement(name = "volatilityRepresentation", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class VolatilityRepresentation extends PricingStructure implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private AnyAssetReference asset;
	
    
	/**
     * public getter
     *
     * A reference to the asset whose volatility is modeled.
     *
     * @returns com.leansoft.fpml.nano.AnyAssetReference
	 */
	public AnyAssetReference getAsset() {
	    return this.asset;
	}
	
	/**
	 * public setter
	 *
     * A reference to the asset whose volatility is modeled.
     *
     * @param com.leansoft.fpml.nano.AnyAssetReference
	 */
	public void setAsset(AnyAssetReference asset) {
	    this.asset = asset;
	}

}