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
		public MapUriRequestBuilder withCenter(Double altitude, Double latitude, Double longitude);
		public MapUriRequestBuilder withMajorRoutesDestination(Double altitude, Double latitude, Double longitude);
		
		public MapUriRequestBuilder withOptionsImageSize(Integer width, Integer height);
		public MapUriRequestBuilder withOptionsImageType(ImageType imageType);
		public MapUriRequestBuilder withOptionsPreventIconCollision(Boolean preventIconCollision);
		public MapUriRequestBuilder withOptionsStyle(MapStyle mapStyle);
		public MapUriRequestBuilder withOptionsUriScheme(UriScheme uriScheme);
		public MapUriRequestBuilder withOptionsZoomLevel(Integer zoomLevel);
		public MapUriRequestBuilder withOptionsDisplayLayer(String displayLayer);
		
		public MapUriRequestBuilder withPushpin(String iconStyle, String label, Double altitude, Double latitude, Double longitude);
	}
	
	public interface ImageryMetadataRequestBuilder extends RequestBuilder<ImageryMetadataRequest> {
		public ImageryMetadataRequestBuilder withStyle(MapStyle mapStyle);
		public ImageryMetadataRequestBuilder withOptionsUriScheme(UriScheme uriScheme);
		public ImageryMetadataRequestBuilder withOptionsZoomLevel(Integer zoomLevel);
		public ImageryMetadataRequestBuilder withOptionsLocation(Double altitude, Double latitude, Double longitude);
		public ImageryMetadataRequestBuilder withOptionsHeading(Double orientation);
		public ImageryMetadataRequestBuilder withOptionsReturnImageryProviders(Boolean returnImageryProviders);
	}
}
