/**
 *
 */
package com.google.code.bing.webservices.client.exception;


/**
 * Class description
 *
 *
 */
public class BingMapsWebServicesClientException extends RuntimeException {
    protected String authenticationResultCode;
    protected String copyright;
    protected String faultReason;
    protected String statusCode;
    protected String traceId;

    /**
	 *
	 */
	private static final long serialVersionUID = -4345556572105572685L;

	/**
     * Constructs ...
     *
     */
    public BingMapsWebServicesClientException() {
        super();
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     */
    public BingMapsWebServicesClientException(String message) {
        super(message);
    }

    /**
     * Constructs ...
     *
     *
     * @param cause
     */
    public BingMapsWebServicesClientException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     */
    public BingMapsWebServicesClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     */
    public BingMapsWebServicesClientException(String message, Throwable cause,  String authenticationResultCode, String copyright, String faultReason, String statusCode, String traceId) {
        super(message, cause);
    	this.authenticationResultCode = authenticationResultCode;
    	this.copyright = copyright;
    	this.faultReason = faultReason;
    	this.statusCode = statusCode;
    	this.traceId = traceId;
    }
    
	/**
	 * @return the authenticationResultCode
	 */
	public String getAuthenticationResultCode() {
		return authenticationResultCode;
	}

	/**
	 * @param authenticationResultCode the authenticationResultCode to set
	 */
	public void setAuthenticationResultCode(String authenticationResultCode) {
		this.authenticationResultCode = authenticationResultCode;
	}

	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * @return the faultReason
	 */
	public String getFaultReason() {
		return faultReason;
	}

	/**
	 * @param faultReason the faultReason to set
	 */
	public void setFaultReason(String faultReason) {
		this.faultReason = faultReason;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the traceId
	 */
	public String getTraceId() {
		return traceId;
	}

	/**
	 * @param traceId the traceId to set
	 */
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
}
