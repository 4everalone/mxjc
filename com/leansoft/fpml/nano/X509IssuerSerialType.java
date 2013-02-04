// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;

@RootElement(name = "X509IssuerSerial", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class X509IssuerSerialType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "X509IssuerName")
	private String x509IssuerName;
	
	@Element(name = "X509SerialNumber")
	private BigInteger x509SerialNumber;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getX509IssuerName() {
	    return this.x509IssuerName;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setX509IssuerName(String x509IssuerName) {
	    this.x509IssuerName = x509IssuerName;
	}
	/**
	 * public getter
	 *
     * @returns java.math.BigInteger
	 */
	public BigInteger getX509SerialNumber() {
	    return this.x509SerialNumber;
	}
	
	/**
	 * public setter
	 *
     * @param java.math.BigInteger
	 */
	public void setX509SerialNumber(BigInteger x509SerialNumber) {
	    this.x509SerialNumber = x509SerialNumber;
	}

}