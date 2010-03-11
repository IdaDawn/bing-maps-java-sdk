/**
 *
 */
package com.google.code.bing.webservices.client.imagery;

import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsImageryServiceClient extends BingMapsWebServicesClient {
	
	public MapUriRequestBuilder newMapUriRequestBuilder();
	
	public ImageryMetadataRequestBuilder newImageryMetadataRequestBuilder();
	
	public interface MapUriRequestBuilder extends RequestBuilder<MapUriRequest> {
		
	}
	
	public interface ImageryMetadataRequestBuilder extends RequestBuilder<ImageryMetadataRequest> {
		
	}
}
