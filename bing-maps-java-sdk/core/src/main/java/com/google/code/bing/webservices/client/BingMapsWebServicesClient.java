/**
 *
 */
package com.google.code.bing.webservices.client;

import net.virtualearth.dev.webservices.v1.common.RequestBase;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsWebServicesClient {
	
	public interface RequestBuilder<T extends RequestBase> {
		
		public RequestBuilder<T> withCredentials(String applicationId, String token);
		
		public RequestBuilder<T> withCulture(String culture);
		
		public RequestBuilder<T> withExecutionOptions(boolean suppressFaults);
		
		public T getResult();
	}
}
