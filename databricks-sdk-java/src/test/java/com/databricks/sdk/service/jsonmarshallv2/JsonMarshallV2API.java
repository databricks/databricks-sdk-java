// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Lorem Ipsum */
@Generated
public class JsonMarshallV2API {
  private static final Logger LOG = LoggerFactory.getLogger(JsonMarshallV2API.class);

  private final JsonMarshallV2Service impl;

  /** Regular-use constructor */
  public JsonMarshallV2API(ApiClient apiClient) {
    impl = new JsonMarshallV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public JsonMarshallV2API(JsonMarshallV2Service mock) {
    impl = mock;
  }

  public Resource getResource(String name, Resource resource) {
    return getResource(new GetResourceRequest().setName(name).setResource(resource));
  }

  public Resource getResource(GetResourceRequest request) {
    return impl.getResource(request);
  }

  public JsonMarshallV2Service impl() {
    return impl;
  }
}
