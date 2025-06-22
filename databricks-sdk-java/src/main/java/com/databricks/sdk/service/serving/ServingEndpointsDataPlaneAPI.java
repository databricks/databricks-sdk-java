// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Serving endpoints DataPlane provides a set of operations to interact with data plane endpoints
 * for Serving endpoints service.
 */
@Generated
public class ServingEndpointsDataPlaneAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServingEndpointsDataPlaneAPI.class);

  private final ServingEndpointsDataPlaneService impl;

  /** Regular-use constructor */
  public ServingEndpointsDataPlaneAPI(
      ApiClient apiClient, DatabricksConfig config, ServingEndpointsAPI servingEndpointsAPI) {
    impl = new ServingEndpointsDataPlaneImpl(apiClient, config, servingEndpointsAPI);
  }

  /** Constructor for mocks */
  public ServingEndpointsDataPlaneAPI(ServingEndpointsDataPlaneService mock) {
    impl = mock;
  }

  public QueryEndpointResponse query(String name) {
    return query(new QueryEndpointInput().setName(name));
  }

  public QueryEndpointResponse query(QueryEndpointInput request) {
    return impl.query(request);
  }

  public ServingEndpointsDataPlaneService impl() {
    return impl;
  }
}
