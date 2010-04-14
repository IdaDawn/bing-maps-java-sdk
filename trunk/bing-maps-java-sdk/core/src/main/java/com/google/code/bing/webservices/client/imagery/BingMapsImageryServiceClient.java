/**
 *
 */
package com.google.code.bing.webservices.client.imagery;

import net.virtualearth.dev.webservices.v1.common.ImageType;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.UriScheme;
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
		public MapUriRequestBuilder withCenterAltitude(double altitude);
		public MapUriRequestBuilder withCenterLatitude(double latitude);
		public MapUriRequestBuilder withCenterLongitude(double longitude);
		
		public MapUriRequestBuilder withMajorRouteAltitude(double altitude);
		public MapUriRequestBuilder withMajorRouteLatitude(double latitude);
		public MapUriRequestBuilder withMajorRouteLongitude(double longitude);
		
		public MapUriRequestBuilder withImageSize(int width, int height);
		public MapUriRequestBuilder withImageType(ImageType imageType);
		public MapUriRequestBuilder withPreventIconCollision(boolean preventIconCollision);
		public MapUriRequestBuilder withStyle(MapStyle mapStyle);
		public MapUriRequestBuilder withUriScheme(UriScheme uriScheme);
		public MapUriRequestBuilder withZoomLevel(int zoomLevel);
		public MapUriRequestBuilder withDisplayLayer(String displayLayer);
	}
	
	public interface ImageryMetadataRequestBuilder extends RequestBuilder<ImageryMetadataRequest> {
		public ImageryMetadataRequestBuilder withStyle(MapStyle mapStyle);
		public ImageryMetadataRequestBuilder withUriScheme(UriScheme uriScheme);
		public ImageryMetadataRequestBuilder withZoomLevel(int zoomLevel);
		public ImageryMetadataRequestBuilder withLocationAltitude(double altitude);
		public ImageryMetadataRequestBuilder withLocationLatitude(double latitude);
		public ImageryMetadataRequestBuilder withLocationLongitude(double longitude);
		public ImageryMetadataRequestBuilder withHeadingOrientation(double orientation);
		public ImageryMetadataRequestBuilder withReturnImageryProviders(boolean returnImageryProviders);
	}
}
