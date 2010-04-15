/**
 * 
 */
package com.google.code.bing.webservices.client.route.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.route.ArrayOfWaypoint;
import net.virtualearth.dev.webservices.v1.route.IRouteService;
import net.virtualearth.dev.webservices.v1.route.IRouteServiceCalculateRouteResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.route.IRouteServiceCalculateRoutesFromMajorRoadsResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.route.ItineraryItem;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesRequest;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesResponse;
import net.virtualearth.dev.webservices.v1.route.ObjectFactory;
import net.virtualearth.dev.webservices.v1.route.RouteLeg;
import net.virtualearth.dev.webservices.v1.route.RouteOptimization;
import net.virtualearth.dev.webservices.v1.route.RoutePathType;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;
import net.virtualearth.dev.webservices.v1.route.RouteService;
import net.virtualearth.dev.webservices.v1.route.TrafficUsage;
import net.virtualearth.dev.webservices.v1.route.TravelMode;
import net.virtualearth.dev.webservices.v1.route.Waypoint;
import net.virtualearth.dev.webservices.v1.route.contracts.CalculateRouteResponse;
import net.virtualearth.dev.webservices.v1.route.contracts.CalculateRoutesFromMajorRoadsResponse;

import com.google.code.bing.webservices.client.Adaptable;
import com.google.code.bing.webservices.client.AdaptableFuture;
import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;

/**
 * @author nmukhtar
 *
 */
public class BingMapsRouteServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsRouteServiceClient {
	
	private static final ObjectFactory ROUTE_FACTORY = new ObjectFactory();

	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/routeservice/routeservice.wsdl")
	static RouteService routeService;
	
	@Override
	public RouteResponse calculateRoute(RouteRequest request) {
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		try {
			return proxy.calculateRoute(request);
		} catch (IRouteServiceCalculateRouteResponseSummaryFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Future<RouteResponse> calculateRouteAsync(RouteRequest request) {
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		return new AdaptableFuture<RouteResponse, CalculateRouteResponse>(proxy.calculateRouteAsync(request), new Adaptable<RouteResponse, CalculateRouteResponse>() {
			@Override
			public RouteResponse adaptFrom(CalculateRouteResponse adaptee) {
				return adaptee.getCalculateRouteResult();
			}

			@Override
			public CalculateRouteResponse adaptTo(RouteResponse adapter) {
				return null;
			}
		});
	}

	@Override
	public MajorRoutesResponse calculateRoutesFromMajorRoads(
			MajorRoutesRequest request) {
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		try {
			return proxy.calculateRoutesFromMajorRoads(request);
		} catch (IRouteServiceCalculateRoutesFromMajorRoadsResponseSummaryFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Future<MajorRoutesResponse> calculateRoutesFromMajorRoadsAsync(
			MajorRoutesRequest request) {
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		return new AdaptableFuture<MajorRoutesResponse, CalculateRoutesFromMajorRoadsResponse>(proxy.calculateRoutesFromMajorRoadsAsync(request), new Adaptable<MajorRoutesResponse, CalculateRoutesFromMajorRoadsResponse>() {
			@Override
			public MajorRoutesResponse adaptFrom(
					CalculateRoutesFromMajorRoadsResponse adaptee) {
				return adaptee.getCalculateRoutesFromMajorRoadsResult();
			}

			@Override
			public CalculateRoutesFromMajorRoadsResponse adaptTo(
					MajorRoutesResponse adapter) {
				return null;
			}
		});
	}
	
	@Override
	public MajorRoutesRequestBuilder newMajorRoutesRequestBuilder() {
		return new MajorRoutesRequestBuilderImpl();
	}

	@Override
	public RouteRequestBuilder newRouteRequestBuilder() {
		return new RouteRequestBuilderImpl();
	}
	
	public static void main(String[] args) throws Exception {
		routeService = new RouteService();
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		RouteResponse response = proxy.calculateRoute(createRouteRequest());
		
		for (RouteLeg leg : response.getResult().getLegs().getRouteLeg()) {
			for (ItineraryItem item : leg.getItinerary().getItineraryItem()) {			
				System.out.println(item.getText());
			}
		}
	}
	
	private static RouteRequest createRouteRequest() {
		RouteRequest request = ROUTE_FACTORY.createRouteRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		ArrayOfWaypoint arrayOfWaypoint = ROUTE_FACTORY.createArrayOfWaypoint();
		
		Waypoint waypoint1 = ROUTE_FACTORY.createWaypoint();
		waypoint1.setDescription("Start");
		Location location1 = COMMON_FACTORY.createLocation();
		location1.setLatitude(40.0);
		location1.setLongitude(-120.0);
		waypoint1.setLocation(location1);
		arrayOfWaypoint.getWaypoint().add(waypoint1);
		
		Waypoint waypoint2 = ROUTE_FACTORY.createWaypoint();
		waypoint2.setDescription("Stop");
		Location location2 = COMMON_FACTORY.createLocation();
		location2.setLatitude(40.5);
		location2.setLongitude(-120.5);
		waypoint2.setLocation(location2);
		arrayOfWaypoint.getWaypoint().add(waypoint2);
		
		Waypoint waypoint3 = ROUTE_FACTORY.createWaypoint();
		waypoint3.setDescription("End");
		Location location3 = COMMON_FACTORY.createLocation();
		location3.setLatitude(41.0);
		location3.setLongitude(-121.0);
		waypoint3.setLocation(location3);
		arrayOfWaypoint.getWaypoint().add(waypoint3);
		
		request.setWaypoints(arrayOfWaypoint);
		
		return request;
	}
	
	private static class RouteRequestBuilderImpl extends BaseRequestBuilderImpl<RouteRequest, RouteRequestBuilder> implements RouteRequestBuilder {

		protected RouteRequestBuilderImpl() {
			super(ROUTE_FACTORY.createRouteRequest());
		}

		@Override
		public RouteRequestBuilder withOptionsMode(TravelMode travelMode) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createRouteOptions());
			}
			result.getOptions().setMode(travelMode);
			return this;
		}

		@Override
		public RouteRequestBuilder withOptionsOptimization(
				RouteOptimization optimization) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createRouteOptions());
			}
			result.getOptions().setOptimization(optimization);
			return this;
		}

		@Override
		public RouteRequestBuilder withOptionsRoutePathType(
				RoutePathType routePathType) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createRouteOptions());
			}
			result.getOptions().setRoutePathType(routePathType);
			return this;
		}

		@Override
		public RouteRequestBuilder withOptionsTrafficUsage(
				TrafficUsage trafficUsage) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createRouteOptions());
			}
			result.getOptions().setTrafficUsage(trafficUsage);
			return this;
		}

		@Override
		public RouteRequestBuilder withWaypoint(String description,
				Double altitude, Double latitude, Double longitude) {
			if (result.getWaypoints() == null) {
				result.setWaypoints(ROUTE_FACTORY.createArrayOfWaypoint());
			}
			Waypoint waypoint = ROUTE_FACTORY.createWaypoint();
			waypoint.setDescription(description);
			if (altitude != null || latitude != null || longitude != null) {
				Location location = COMMON_FACTORY.createLocation();
				location.setAltitude(altitude);
				location.setLatitude(latitude);
				location.setLongitude(longitude);
				waypoint.setLocation(location);
			}
			result.getWaypoints().getWaypoint().add(waypoint);
			return this;
		}
	}
	
	private static class MajorRoutesRequestBuilderImpl extends BaseRequestBuilderImpl<MajorRoutesRequest, MajorRoutesRequestBuilder> implements MajorRoutesRequestBuilder {

		protected MajorRoutesRequestBuilderImpl() {
			super(ROUTE_FACTORY.createMajorRoutesRequest());
		}

		@Override
		public MajorRoutesRequestBuilder withOptionsMode(TravelMode travelMode) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createMajorRoutesOptions());
			}
			result.getOptions().setMode(travelMode);
			return this;
		}

		@Override
		public MajorRoutesRequestBuilder withOptionsOptimization(
				RouteOptimization optimization) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createMajorRoutesOptions());
			}
			result.getOptions().setOptimization(optimization);
			return this;
		}

		@Override
		public MajorRoutesRequestBuilder withOptionsRoutePathType(
				RoutePathType routePathType) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createMajorRoutesOptions());
			}
			result.getOptions().setRoutePathType(routePathType);
			return this;
		}

		@Override
		public MajorRoutesRequestBuilder withOptionsTrafficUsage(
				TrafficUsage trafficUsage) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createMajorRoutesOptions());
			}
			result.getOptions().setTrafficUsage(trafficUsage);
			return this;
		}
		
		@Override
		public MajorRoutesRequestBuilder withOptionsReturnRoutes(
				Boolean returnRoutes) {
			if (result.getOptions() == null) {
				result.setOptions(ROUTE_FACTORY.createMajorRoutesOptions());				
			}
			result.getOptions().setReturnRoutes(returnRoutes);
			return this;
		}

		@Override
		public MajorRoutesRequestBuilder withDestination(String description,
				Double altitude, Double latitude, Double longitude) {
			if (result.getDestination() == null) {
				result.setDestination(ROUTE_FACTORY.createWaypoint());
			}
			result.getDestination().setDescription(description);
			if (altitude != null || latitude != null || longitude != null) {
				Location location = COMMON_FACTORY.createLocation();
				location.setAltitude(altitude);
				location.setLatitude(latitude);
				location.setLongitude(longitude);
				result.getDestination().setLocation(location);
			}
			return this;
		}
	}
}
