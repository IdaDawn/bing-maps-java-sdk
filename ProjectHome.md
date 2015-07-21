# This project is open for adoption. #
**I am no longer available to maintain it and am looking for developers who can take on the responsibility. Please send me an email at nabeelmukhtar@gmail.com with links to your Github or Google Code accounts. Thanks.**

Microsoft® Bing Maps Web Services is a set of programmable SOAP services that allow you to match addresses to the map, search for points of interest, integrate maps and imagery, return driving directions, and incorporate other location intelligence into your Web application.

This project provides a Java wrapper to the Bing Maps Web Services using the JAX-WS API. Most of the domain classes were automatically generated using the wsimport tool, but the API also provides simplified client classes to make requests to the web services.

A typical usage of the API is given below:

```
BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
BingMapsSearchServiceClient client = factory.createSearchServiceClient();

SearchRequestBuilder builder = client.newSearchRequestBuilder();
builder.withCredentials(applicationKey, null);
builder.withQuery("restaurant in Seattle, WA");

SearchResponse response = client.search(builder.getResult());

for (SearchResultSet result : response.getResultSets().getSearchResultSet()) {
	for (SearchResultBase searchResult : result.getResults().getSearchResultBase()) {
		System.out.println(searchResult.getName());
	}
}
```

Before you can use the Bing Maps Web Services you will have to create an account and get an application key from Bing Maps from here (https://www.bingmapsportal.com).

For additional examples see the examples source code here (http://code.google.com/p/bing-maps-java-sdk/source/browse/#svn/trunk/bing-maps-java-sdk/examples).

The library assumes that the code using it is running inside a JEE container that supports JAX-WS dependency injection.
For running standalone clients you will have to set the system property com.google.code.bing.webservices.client.standalone to true. e.g.<br />
java -Dcom.google.code.bing.webservices.client.standalone=true com.google.code.bing.webservices.example.BingMapsSearchServiceSample

If needed the JAX-WS reference implementation can be downloaded from https://jax-ws.dev.java.net.