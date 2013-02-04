// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A set of characteristics describing a sensitivity
 */
public class SensitivityDefinition implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private String name;
	
	@Element
	private ValuationScenarioReference valuationScenarioReference;
	
	@Element
	private List<PricingParameterDerivative> partialDerivative;
	
	@Element
	private DerivativeFormula formula;
	
	@Element
	private TimeDimension term;
	
	@Element
	private List<Object> pricingCoordinateOrReferenceModel;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The name of the derivative, e.g. first derivative, Hessian, etc. Typically not required, but may be used to explain more complex derivative calculations.
     *
     * @returns java.lang.String
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 * public setter
	 *
     * The name of the derivative, e.g. first derivative, Hessian, etc. Typically not required, but may be used to explain more complex derivative calculations.
     *
     * @param java.lang.String
	 */
	public void setName(String name) {
	    this.name = name;
	}
	/**
     * public getter
     *
     * Reference to the valuation scenario to which this sensitivity definition applies. If the SensitivityDefinition occurs within a SensitivitySetDefinition, this is not required and normally not used. In this case, if it is supplied it overrides the valuationScenarioReference in the SensitivitySetDefinition.
     *
     * @returns com.leansoft.fpml.nano.ValuationScenarioReference
	 */
	public ValuationScenarioReference getValuationScenarioReference() {
	    return this.valuationScenarioReference;
	}
	
	/**
	 * public setter
	 *
     * Reference to the valuation scenario to which this sensitivity definition applies. If the SensitivityDefinition occurs within a SensitivitySetDefinition, this is not required and normally not used. In this case, if it is supplied it overrides the valuationScenarioReference in the SensitivitySetDefinition.
     *
     * @param com.leansoft.fpml.nano.ValuationScenarioReference
	 */
	public void setValuationScenarioReference(ValuationScenarioReference valuationScenarioReference) {
	    this.valuationScenarioReference = valuationScenarioReference;
	}
	/**
     * public getter
     *
     * A partial derivative of the measure with respect to an input.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.PricingParameterDerivative>
	 */
	public List<PricingParameterDerivative> getPartialDerivative() {
	    return this.partialDerivative;
	}
	
	/**
	 * public setter
	 *
     * A partial derivative of the measure with respect to an input.
     *
     * @param java.util.List<com.leansoft.fpml.nano.PricingParameterDerivative>
	 */
	public void setPartialDerivative(List<PricingParameterDerivative> partialDerivative) {
	    this.partialDerivative = partialDerivative;
	}
	/**
     * public getter
     *
     * A formula defining how to compute the derivative from the partial derivatives. If absent, the derivative is just the product of the partial derivatives. Normally only required for more higher-order derivatives, e.g. Hessians.
     *
     * @returns com.leansoft.fpml.nano.DerivativeFormula
	 */
	public DerivativeFormula getFormula() {
	    return this.formula;
	}
	
	/**
	 * public setter
	 *
     * A formula defining how to compute the derivative from the partial derivatives. If absent, the derivative is just the product of the partial derivatives. Normally only required for more higher-order derivatives, e.g. Hessians.
     *
     * @param com.leansoft.fpml.nano.DerivativeFormula
	 */
	public void setFormula(DerivativeFormula formula) {
	    this.formula = formula;
	}
	/**
     * public getter
     *
     * The time dimension of the sensitivity point (tenor and/or date)
     *
     * @returns com.leansoft.fpml.nano.TimeDimension
	 */
	public TimeDimension getTerm() {
	    return this.term;
	}
	
	/**
	 * public setter
	 *
     * The time dimension of the sensitivity point (tenor and/or date)
     *
     * @param com.leansoft.fpml.nano.TimeDimension
	 */
	public void setTerm(TimeDimension term) {
	    this.term = term;
	}
	/**
     * public getter
     *
     * A pricing structure coordinate, or a reference to one. This can be used to either directly define a coordinate or reference an existing coordinate.
     *
     * @returns java.util.List<java.lang.Object>
	 */
	public List<Object> getPricingCoordinateOrReferenceModel() {
	    return this.pricingCoordinateOrReferenceModel;
	}
	
	/**
	 * public setter
	 *
     * A pricing structure coordinate, or a reference to one. This can be used to either directly define a coordinate or reference an existing coordinate.
     *
     * @param java.util.List<java.lang.Object>
	 */
	public void setPricingCoordinateOrReferenceModel(List<Object> pricingCoordinateOrReferenceModel) {
	    this.pricingCoordinateOrReferenceModel = pricingCoordinateOrReferenceModel;
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