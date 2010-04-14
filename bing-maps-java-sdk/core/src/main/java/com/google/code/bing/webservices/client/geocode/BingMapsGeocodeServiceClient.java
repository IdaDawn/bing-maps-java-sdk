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
		public GeocodeRequestBuilder withAdminDistrict(String adminDistrict);
		public GeocodeRequestBuilder withCountryRegion(String countryRegion);
		public GeocodeRequestBuilder withDistrict(String district);
		public GeocodeRequestBuilder withFormattedAddress(String formattedAddress);
		public GeocodeRequestBuilder withLocality(String locality);
		public GeocodeRequestBuilder withPostalCode(String postalCode);
		public GeocodeRequestBuilder withPostalTown(String postalTown);
		public GeocodeRequestBuilder withCount(int count);
		public GeocodeRequestBuilder withConfidence(Confidence confidence);
	}
	
	public interface ReverseGeocodeRequestBuilder extends RequestBuilder<ReverseGeocodeRequest> {
		public ReverseGeocodeRequestBuilder withAltitude(double altitude);
		public ReverseGeocodeRequestBuilder withLatitude(double latitude);
		public ReverseGeocodeRequestBuilder withLongitude(double longitude);
	}
}
