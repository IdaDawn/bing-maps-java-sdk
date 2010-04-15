/**
 * 
 */
package com.google.code.bing.webservices.client.exception;

/**
 * @author nmukhtar
 *
 */
public class BingMapsImageryServiceClientException extends
		BingMapsWebServicesClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8093177324428029624L;

	/**
	 * 
	 */
	public BingMapsImageryServiceClientException() {}

	/**
	 * @param message
	 */
	public BingMapsImageryServiceClientException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public BingMapsImageryServiceClientException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BingMapsImageryServiceClientException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param authenticationResultCode
	 * @param copyright
	 * @param faultReason
	 * @param statusCode
	 * @param traceId
	 */
	public BingMapsImageryServiceClientException(String message, Throwable cause, String authenticationResultCode,
			String copyright, String faultReason, String statusCode,
			String traceId) {
		super(message, cause, authenticationResultCode, copyright, faultReason, statusCode,
				traceId);
	}

}
