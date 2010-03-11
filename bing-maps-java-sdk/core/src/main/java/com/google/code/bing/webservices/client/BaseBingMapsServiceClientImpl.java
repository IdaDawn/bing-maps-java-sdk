package com.google.code.bing.webservices.client;

import net.virtualearth.dev.webservices.v1.common.ObjectFactory;
import net.virtualearth.dev.webservices.v1.common.RequestBase;

public class BaseBingMapsServiceClientImpl implements
	BingMapsWebServicesClient {
	
	protected static final ObjectFactory COMMON_FACTORY = new ObjectFactory();
	
	protected abstract static class BaseRequestBuilderImpl<T extends RequestBase> implements RequestBuilder<T> {
		protected T result;
		
		protected BaseRequestBuilderImpl(T result) {
			this.result = result;
		}

		@Override
		public RequestBuilder<T> withCredentials(String applicationId,
				String token) {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public RequestBuilder<T> withCulture(String culture) {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public RequestBuilder<T> withExecutionOptions(boolean suppressFaults) {
			// TODO Auto-generated method stub
			return this;
		}
		
		public T getResult() {
			return result;
		}
	}
}
