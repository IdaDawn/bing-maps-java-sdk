/**
 * 
 */
package com.google.code.bing.webservices.client.exception;

/**
 * @author nmukhtar
 *
 */
public class BingMapsGeocodeServiceClientException extends
		BingMapsWebServicesClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8093177324428029624L;

	/**
	 * 
	 */
	public BingMapsGeocodeServiceClientException() {}

	/**
	 * @param message
	 */
	public BingMapsGeocodeServiceClientException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public BingMapsGeocodeServiceClientException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BingMapsGeocodeServiceClientException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param authenticationResultCode
	 * @param copyright
	 * @param faultReason
	 * @param statusCode
	 * @param traceId
	 */
	public BingMapsGeocodeServiceClientException(String message, Throwable cause, String authenticationResultCode,
			String copyright, String faultReason, String statusCode,
			String traceId) {
		super(message, cause, authenticationResultCode, copyright, faultReason, statusCode,
				traceId);
	}

}
