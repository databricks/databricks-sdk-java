// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Lorem Ipsum */
@Generated
public class HttpCallV2API {
  private static final Logger LOG = LoggerFactory.getLogger(HttpCallV2API.class);

  private final HttpCallV2Service impl;

  /** Regular-use constructor */
  public HttpCallV2API(ApiClient apiClient) {
    impl = new HttpCallV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public HttpCallV2API(HttpCallV2Service mock) {
    impl = mock;
  }

  /** This mimics "old" style post requests which have the resource inlined. */
  public Resource createResource(CreateResourceRequest request) {
    return impl.createResource(request);
  }

  public Resource getResource(String pathParamString, long pathParamInt, boolean pathParamBool) {
    return getResource(
        new GetResourceRequest()
            .setPathParamString(pathParamString)
            .setPathParamInt(pathParamInt)
            .setPathParamBool(pathParamBool));
  }

  public Resource getResource(GetResourceRequest request) {
    return impl.getResource(request);
  }

  /** This mimics "new" style post requests which have a body field. */
  public Resource updateResource(UpdateResourceRequest request) {
    return impl.updateResource(request);
  }

  public HttpCallV2Service impl() {
    return impl;
  }
}
