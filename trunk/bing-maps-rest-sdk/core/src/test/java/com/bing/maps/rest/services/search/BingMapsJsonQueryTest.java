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
package com.bing.maps.rest.services.search;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bing.maps.rest.services.BingMapsQueryFactory;
import com.bing.maps.rest.services.constant.TestConstants;
import com.googleapis.maps.services.BaseGoogleMapsClientTest;

/**
 * The Class GoogleMapsJsonQueryTest.
 */
public class BingMapsJsonQueryTest extends BaseBingMapsClientTest {
	
	/** The factory. */
	private BingMapsQueryFactory factory;
	

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		factory = BingMapsQueryFactory.newInstance(TestConstants.TEST_API_KEY);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		factory = null;
	}

	/**
	 * Test geocode query.
	 */
	@Test
	public void testGeocodeQuery() {
	}
	
	/**
	 * Test directions query.
	 */
	@Test
	public void testDirectionsQuery() {
	}
	
	/**
	 * Test elevation query.
	 */
	@Test
	public void testElevationQuery() {
	}
	
	/**
	 * Test place query.
	 */
	@Test
	public void testPlaceQuery() {
	}
}
