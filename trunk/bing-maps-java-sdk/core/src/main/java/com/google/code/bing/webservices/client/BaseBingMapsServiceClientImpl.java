package com.google.code.bing.webservices.client;

import net.virtualearth.dev.webservices.v1.common.ObjectFactory;
import net.virtualearth.dev.webservices.v1.common.RequestBase;

public class BaseBingMapsServiceClientImpl implements
	BingMapsWebServicesClient {
	
	protected static final ObjectFactory COMMON_FACTORY = new ObjectFactory();
	
	protected abstract static class BaseRequestBuilderImpl<T extends RequestBase, B extends RequestBuilder<T>> implements RequestBuilder<T> {
		protected T result;
		
		protected BaseRequestBuilderImpl(T result) {
			this.result = result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public B withCredentials(String applicationId,
				String token) {
			// TODO Auto-generated method stub
			return (B) this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public B withCulture(String culture) {
			// TODO Auto-generated method stub
			return (B) this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public B withExecutionOptions(boolean suppressFaults) {
			// TODO Auto-generated method stub
			return (B) this;
		}
		
		public T getResult() {
			return result;
		}
	}
}
