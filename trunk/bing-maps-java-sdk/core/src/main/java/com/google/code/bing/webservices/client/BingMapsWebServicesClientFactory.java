/**
 *
 */
package com.google.code.bing.webservices.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;
import com.google.code.bing.webservices.client.geocode.impl.BingMapsGeocodeServiceClientImpl;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;
import com.google.code.bing.webservices.client.imagery.impl.BingMapsImageryServiceClientImpl;
import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;
import com.google.code.bing.webservices.client.route.impl.BingMapsRouteServiceClientImpl;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;
import com.google.code.bing.webservices.client.search.impl.BingMapsSearchServiceClientImpl;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class BingMapsWebServicesClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    private BingMapsWebServicesClientFactory() {}

    /**
     * Sets the task executor to be used for asynchronous API calls. 
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}
	
	public static BingMapsWebServicesClientFactory newInstance() {
		return new BingMapsWebServicesClientFactory();
	}
	
	public BingMapsGeocodeServiceClient createGeocodeServiceClient() {
		BingMapsGeocodeServiceClient client = new BingMapsGeocodeServiceClientImpl();
		client.setTaskExecutor(taskExecutor);
		return client;
	}
	
	public BingMapsImageryServiceClient createImageryServiceClient() {
		BingMapsImageryServiceClient client = new BingMapsImageryServiceClientImpl();
		client.setTaskExecutor(taskExecutor);
		return client;
	}
	
	public BingMapsRouteServiceClient createRouteServiceClient() {
		BingMapsRouteServiceClient client = new BingMapsRouteServiceClientImpl();
		client.setTaskExecutor(taskExecutor);
		return client;
	}
	
	public BingMapsSearchServiceClient createSearchServiceClient() {
		BingMapsSearchServiceClient client = new BingMapsSearchServiceClientImpl();
		client.setTaskExecutor(taskExecutor);
		return client;
	}
}
