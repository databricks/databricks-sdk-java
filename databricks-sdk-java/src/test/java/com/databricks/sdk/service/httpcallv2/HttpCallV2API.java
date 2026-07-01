// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

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

  /**
   * This mimics "old" style post requests which have the resource inlined.
   *
   * <p>Set the `path_param_string` value before calling. The _resource_ is sent as the request
   * **body**. See the [API overview] for details.
   *
   * <p>Supported body styles:
   *
   * <p>- [inline] - referenced
   *
   * <p>Resolution order:
   *
   * <p>1. inline body 2. referenced resource
   *
   * <p>[API overview]: https://docs.databricks.com/api [inline]:
   * https://docs.databricks.com/api/inline
   */
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

  /**
   * This mimics a parameterless custom method: a body:"*" request whose fields are all path-bound,
   * so the request carries Content-Type: application/json but has no JSON body fields to serialize.
   * The canonical body for such a request is the empty object {}. The :sync verb sits after a
   * literal path segment because Databricks rejects a custom verb placed directly after a path
   * variable as ambiguous.
   */
  public Resource syncResource(SyncResourceRequest request) {
    return impl.syncResource(request);
  }

  /**
   * This mimics "new" style post requests which have a body field.
   *
   * <p>> Prefer this over the inline form.
   */
  public Resource updateResource(UpdateResourceRequest request) {
    return impl.updateResource(request);
  }

  public HttpCallV2Service impl() {
    return impl;
  }
}
