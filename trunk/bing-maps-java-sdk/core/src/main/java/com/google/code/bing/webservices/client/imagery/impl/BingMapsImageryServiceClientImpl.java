package com.google.code.bing.webservices.client.imagery.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Heading;
import net.virtualearth.dev.webservices.v1.common.ImageType;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.ResponseSummary;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;
import net.virtualearth.dev.webservices.v1.common.UriScheme;
import net.virtualearth.dev.webservices.v1.imagery.IImageryService;
import net.virtualearth.dev.webservices.v1.imagery.IImageryServiceGetImageryMetadataResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.imagery.IImageryServiceGetMapUriResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataRequest;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataResponse;
import net.virtualearth.dev.webservices.v1.imagery.ImageryService;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;
import net.virtualearth.dev.webservices.v1.imagery.ObjectFactory;
import net.virtualearth.dev.webservices.v1.imagery.contracts.GetImageryMetadataResponse;
import net.virtualearth.dev.webservices.v1.imagery.contracts.GetMapUriResponse;

import com.google.code.bing.webservices.client.Adaptable;
import com.google.code.bing.webservices.client.AdaptableFuture;
import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.constant.ApplicationConstants;
import com.google.code.bing.webservices.client.exception.BingMapsImageryServiceClientException;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;

public class BingMapsImageryServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsImageryServiceClient {
	
	private static final ObjectFactory IMAGERY_FACTORY = new ObjectFactory();
	private static final com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory ARRAYS_FACTORY = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/imageryservice/imageryservice.wsdl")
	static ImageryService imageryService;
	
	static {
		if (ApplicationConstants.STANDALONE_MODE) {
			imageryService = new ImageryService();
		}
	}
	
	@Override
	public ImageryMetadataResponse getImageryMetadata(
			ImageryMetadataRequest request) {
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		try {
			return proxy.getImageryMetadata(request);
		} catch (IImageryServiceGetImageryMetadataResponseSummaryFaultFaultMessage e) {
			throw createException(e.getMessage(), e.getCause(), e.getFaultInfo());
		}
	}

	@Override
	public Future<ImageryMetadataResponse> getImageryMetadataAsync(
			ImageryMetadataRequest request) {
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		return new AdaptableFuture<ImageryMetadataResponse, GetImageryMetadataResponse>(proxy.getImageryMetadataAsync(request), new Adaptable<ImageryMetadataResponse, GetImageryMetadataResponse>() {
			@Override
			public ImageryMetadataResponse adaptFrom(
					GetImageryMetadataResponse adaptee) {
				return adaptee.getGetImageryMetadataResult();
			}

			@Override
			public GetImageryMetadataResponse adaptTo(
					ImageryMetadataResponse adapter) {
				return null;
			}
		});
	}

	@Override
	public MapUriResponse getMapUri(MapUriRequest request) {
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		try {
			return proxy.getMapUri(request);
		} catch (IImageryServiceGetMapUriResponseSummaryFaultFaultMessage e) {
			throw createException(e.getMessage(), e.getCause(), e.getFaultInfo());
		}
	}

	@Override
	public Future<MapUriResponse> getMapUriAsync(MapUriRequest request) {
		IImageryService proxy = imageryService.getBasicHttpBindingIImageryService();
		return new AdaptableFuture<MapUriResponse, GetMapUriResponse>(proxy.getMapUriAsync(request), new Adaptable<MapUriResponse, GetMapUriResponse>() {
			@Override
			public MapUriResponse adaptFrom(GetMapUriResponse adaptee) {
				return adaptee.getGetMapUriResult();
			}

			@Override
			public GetMapUriResponse adaptTo(MapUriResponse adapter) {
				return null;
			}
		});
	}
	
	@Override
	public ImageryMetadataRequestBuilder newImageryMetadataRequestBuilder() {
		return new ImageryMetadataRequestBuilderImpl();
	}

	@Override
	public MapUriRequestBuilder newMapUriRequestBuilder() {
		return new MapUriRequestBuilderImpl();
	}
	
	/**
	 * @param e
	 */
	private BingMapsImageryServiceClientException createException(String message, Throwable cause, ResponseSummary faultInfo) {
		String authenticationResultCode = (faultInfo.getAuthenticationResultCode() == null) ? null : faultInfo.getAuthenticationResultCode().value();
		String statusCode = (faultInfo.getStatusCode() == null)? null : faultInfo.getStatusCode().value();
		return new BingMapsImageryServiceClientException(message, cause, authenticationResultCode, faultInfo.getCopyright(), faultInfo.getFaultReason(), statusCode, faultInfo.getTraceId());
	}
	
	
	private static class MapUriRequestBuilderImpl extends BaseRequestBuilderImpl<MapUriRequest> implements MapUriRequestBuilder {
		protected MapUriRequestBuilderImpl() {
			super(IMAGERY_FACTORY.createMapUriRequest());
		}

		@Override
		public MapUriRequestBuilder withCenter(Double altitude,
				Double latitude, Double longitude) {
			if (result.getCenter() == null) {
				result.setCenter(COMMON_FACTORY.createLocation());
			}
			result.getCenter().setAltitude(altitude);
			result.getCenter().setLatitude(latitude);
			result.getCenter().setLongitude(longitude);
			return this;
		}

		@Override
		public MapUriRequestBuilder withMajorRoutesDestination(Double altitude,
				Double latitude, Double longitude) {
			if (result.getMajorRoutesDestination() == null) {
				result.setMajorRoutesDestination(COMMON_FACTORY.createLocation());
			}
			result.getMajorRoutesDestination().setAltitude(altitude);
			result.getMajorRoutesDestination().setLatitude(latitude);
			result.getMajorRoutesDestination().setLongitude(longitude);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsDisplayLayer(String displayLayer) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			if (result.getOptions().getDisplayLayers() == null) {
				result.getOptions().setDisplayLayers(ARRAYS_FACTORY.createArrayOfstring());
			}
			result.getOptions().getDisplayLayers().getString().add(displayLayer);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsImageSize(Integer width,
				Integer height) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			SizeOfint sizeOfint = COMMON_FACTORY.createSizeOfint();
			sizeOfint.setWidth(width);
			sizeOfint.setHeight(height);
			result.getOptions().setImageSize(sizeOfint);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsImageType(ImageType imageType) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setImageType(imageType);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsPreventIconCollision(
				Boolean preventIconCollision) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setPreventIconCollision(preventIconCollision);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsStyle(MapStyle mapStyle) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setStyle(mapStyle);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsUriScheme(UriScheme uriScheme) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setUriScheme(uriScheme);
			return this;
		}

		@Override
		public MapUriRequestBuilder withOptionsZoomLevel(Integer zoomLevel) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createMapUriOptions());
			}
			result.getOptions().setZoomLevel(zoomLevel);
			return this;
		}

		@Override
		public MapUriRequestBuilder withPushpin(String iconStyle, String label,
				Double altitude, Double latitude, Double longitude) {
			if (result.getPushpins() == null) {
//				result.setPushpins(COMMON_FACTORY_FACTORY.c);
			}
			// TODO Auto-generated method stub
			return this;
		}
	}
	
	private static class ImageryMetadataRequestBuilderImpl extends BaseRequestBuilderImpl<ImageryMetadataRequest> implements ImageryMetadataRequestBuilder {

		protected ImageryMetadataRequestBuilderImpl() {
			super(IMAGERY_FACTORY.createImageryMetadataRequest());
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsHeading(
				Double orientation) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			Heading heading = COMMON_FACTORY.createHeading();
			heading.setOrientation(orientation);
			result.getOptions().setHeading(heading);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsLocation(
				Double altitude, Double latitude, Double longitude) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			Location location = COMMON_FACTORY.createLocation();
			location.setAltitude(altitude);
			location.setLatitude(latitude);
			location.setLongitude(longitude);
			result.getOptions().setLocation(location);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsReturnImageryProviders(
				Boolean returnImageryProviders) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setReturnImageryProviders(returnImageryProviders);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsUriScheme(
				UriScheme uriScheme) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setUriScheme(uriScheme);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withOptionsZoomLevel(
				Integer zoomLevel) {
			if (result.getOptions() == null) {
				result.setOptions(IMAGERY_FACTORY.createImageryMetadataOptions());
			}
			result.getOptions().setZoomLevel(zoomLevel);
			return this;
		}

		@Override
		public ImageryMetadataRequestBuilder withStyle(MapStyle mapStyle) {
			result.setStyle(mapStyle);
			return this;
		}
	}
}
