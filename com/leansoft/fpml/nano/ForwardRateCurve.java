// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A curve used to model a set of forward interest rates. Used for forecasting interest rates as part of a pricing calculation.
 */
public class ForwardRateCurve implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private AssetReference assetReference;
	
	@Element
	private TermCurve rateCurve;
	
    
	/**
     * public getter
     *
     * A reference to the rate index whose forwards are modeled.
     *
     * @returns com.leansoft.fpml.nano.AssetReference
	 */
	public AssetReference getAssetReference() {
	    return this.assetReference;
	}
	
	/**
	 * public setter
	 *
     * A reference to the rate index whose forwards are modeled.
     *
     * @param com.leansoft.fpml.nano.AssetReference
	 */
	public void setAssetReference(AssetReference assetReference) {
	    this.assetReference = assetReference;
	}
	/**
     * public getter
     *
     * The curve of forward values.
     *
     * @returns com.leansoft.fpml.nano.TermCurve
	 */
	public TermCurve getRateCurve() {
	    return this.rateCurve;
	}
	
	/**
	 * public setter
	 *
     * The curve of forward values.
     *
     * @param com.leansoft.fpml.nano.TermCurve
	 */
	public void setRateCurve(TermCurve rateCurve) {
	    this.rateCurve = rateCurve;
	}

}