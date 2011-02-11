/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.bing.maps.rest.services.impl;

import java.util.List;

import com.bing.maps.rest.schema.GeoLocation;
import com.bing.maps.rest.schema.PlacesResult;
import com.bing.maps.rest.services.BingMapsException;
import com.bing.maps.rest.services.PlacesQuery;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.googleapis.maps.services.BaseGoogleMapsApiQuery;
import com.googleapis.maps.services.GoogleMapsApiUrls;
import com.googleapis.maps.services.ParameterNames;
import com.googleapis.maps.services.UrlSigner;

/**
 * The Class PlacesQueryImpl.
 */
public class PlacesQueryImpl extends BaseBingMapsApiQuery<PlacesResult> implements
	PlacesQuery {
	
	/** The private key. */
	private String privateKey;
	
	/**
	 * Instantiates a new places query impl.
	 * 
	 * @param applicationId the application id
	 */
	public PlacesQueryImpl(String applicationId) {
		super(applicationId);
	}
	
	
	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.GoogleSearchQuery#reset()
	 */
	@Override
	public void reset() {
		apiUrlBuilder = createGoogleSearchApiUrlBuilder(BingMapsApiUrls.PLACE_URL);
	}

	/* (non-Javadoc)
	 * @see com.google.code.googlesearch.client.impl.BaseGoogleSearchApiQuery#unmarshall(com.google.gson.JsonElement)
	 */
	@Override
	protected PlacesResult unmarshall(JsonElement object) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(object, PlacesResult.class);
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.PlacesQuery#withClient(java.lang.String)
	 */
	@Override
	public PlacesQuery withClient(String client) {
		apiUrlBuilder.withParameter(ParameterNames.CLIENT, client);
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.PlacesQuery#withLocation(com.googleapis.maps.schema.GeoLocation)
	 */
	@Override
	public PlacesQuery withLocation(GeoLocation location) {
		apiUrlBuilder.withParameter(ParameterNames.LOCATION, toParameterString(location));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.PlacesQuery#withPrivateKey(java.lang.String)
	 */
	@Override
	public PlacesQuery withPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.PlacesQuery#withRadius(double)
	 */
	@Override
	public PlacesQuery withRadius(double radius) {
		apiUrlBuilder.withParameter(ParameterNames.RADIUS, String.valueOf(radius));
		return this;
	}


	/* (non-Javadoc)
	 * @see com.googleapis.maps.services.PlacesQuery#withSensor(boolean)
	 */
	@Override
	public PlacesQuery withSensor(boolean sensor) {
		apiUrlBuilder.withParameter(ParameterNames.SENSOR, String.valueOf(sensor));
		return this;
	}
	
	@Override
	public List<PlacesResult> list() {
		try {
			String signature = UrlSigner.getUrlSignature(apiUrlBuilder.buildUrl(), privateKey);
			apiUrlBuilder.withParameter(ParameterNames.SIGNATURE, signature);
			return super.list();
		} catch (Exception e) {
			throw new BingMapsException(e);
		}
	}
}
