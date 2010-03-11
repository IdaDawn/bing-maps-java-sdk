package com.google.code.bing.webservices.client.imagery.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;
import net.virtualearth.dev.webservices.v1.imagery.IImageryService;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataRequest;
import net.virtualearth.dev.webservices.v1.imagery.ImageryService;
import net.virtualearth.dev.webservices.v1.imagery.MapUriOptions;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;
import net.virtualearth.dev.webservices.v1.imagery.ObjectFactory;

import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;

public class BingMapsImageryServiceClientImpl implements
		BingMapsImageryServiceClient {
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/imageryservice/imageryservice.wsdl")
	static ImageryService imageryService;
	
	@Override
	public ImageryMetadataRequestBuilder newImageryMetadataRequestBuilder() {
		return new ImageryMetadataRequestBuilderImpl();
	}

	@Override
	public MapUriRequestBuilder newMapUriRequestBuilder() {
		return new MapUriRequestBuilderImpl();
	}
	
	public static void main(String[] args) throws Exception {
		imageryService = new ImageryService();
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		MapUriResponse response = proxy.getMapUri(createMapUriRequest());
		System.out.println(response.getUri());
	}
	
	private static MapUriRequest createMapUriRequest() {
		ObjectFactory imageryFactory = new ObjectFactory();
		MapUriRequest request = imageryFactory.createMapUriRequest();
		
		net.virtualearth.dev.webservices.v1.common.ObjectFactory commonFactory = new net.virtualearth.dev.webservices.v1.common.ObjectFactory();
		
		Credentials credential = commonFactory.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		Location location = commonFactory.createLocation();
		location.setLatitude(24.826942);
		location.setLongitude(67.033665);
		request.setCenter(location);
		
		MapUriOptions mapUriOptions = imageryFactory.createMapUriOptions();
		mapUriOptions.setStyle(MapStyle.AERIAL_WITH_LABELS);
		mapUriOptions.setZoomLevel(10);
		
		SizeOfint sizeOfInt = commonFactory.createSizeOfint();
		sizeOfInt.setHeight(400);
		sizeOfInt.setWidth(400);
		mapUriOptions.setImageSize(sizeOfInt);
		request.setOptions(mapUriOptions);
		
		return request;
	}
	
	private static class MapUriRequestBuilderImpl implements MapUriRequestBuilder {

		@Override
		public MapUriRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MapUriRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MapUriRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MapUriRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private static class ImageryMetadataRequestBuilderImpl implements ImageryMetadataRequestBuilder {

		@Override
		public ImageryMetadataRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ImageryMetadataRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ImageryMetadataRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ImageryMetadataRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
