/**
 *
 */
package com.google.code.bing.webservices.client;

import java.util.concurrent.ExecutorService;

import net.virtualearth.dev.webservices.v1.common.RequestBase;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsWebServicesClient {
	
	public void setTaskExecutor(ExecutorService taskExecutor);
	
	public interface RequestBuilder<T extends RequestBase> {
		
		public RequestBuilder<T> withCredentials(String applicationId, String token);
		
		public RequestBuilder<T> withCulture(String culture);
		
		public RequestBuilder<T> withExecutionOptions(Boolean suppressFaults);
		
		public T getResult();
	}
}
