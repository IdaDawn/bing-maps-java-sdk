/**
 *
 */
package com.google.code.bing.webservices.client.geocode;

import net.virtualearth.dev.webservices.v1.common.Confidence;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsGeocodeServiceClient extends BingMapsWebServicesClient {
	
	public GeocodeRequestBuilder newGeocodeRequestBuilder();
	
	public ReverseGeocodeRequestBuilder newReverseGeocodeRequestBuilder();
	
	public interface GeocodeRequestBuilder extends RequestBuilder<GeocodeRequest> {
		public GeocodeRequestBuilder withQuery(String query);
		public GeocodeRequestBuilder withAddressLine(String addressLine);
		public GeocodeRequestBuilder withAddressAdminDistrict(String adminDistrict);
		public GeocodeRequestBuilder withAddressCountryRegion(String countryRegion);
		public GeocodeRequestBuilder withAddressDistrict(String district);
		public GeocodeRequestBuilder withAddressFormattedAddress(String formattedAddress);
		public GeocodeRequestBuilder withAddressLocality(String locality);
		public GeocodeRequestBuilder withAddressPostalCode(String postalCode);
		public GeocodeRequestBuilder withAddressPostalTown(String postalTown);
		public GeocodeRequestBuilder withOptionsCount(Integer count);
		public GeocodeRequestBuilder withOptionsFilter(Confidence confidence);
	}
	
	public interface ReverseGeocodeRequestBuilder extends RequestBuilder<ReverseGeocodeRequest> {
		public ReverseGeocodeRequestBuilder withLocation(Double altitude, Double latitude, Double longitude);
	}
}
