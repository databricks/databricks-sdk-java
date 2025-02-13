// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ServingEndpointsDataPlane */
@Generated
class ServingEndpointsDataPlaneImpl implements ServingEndpointsDataPlaneService {
  private final ApiClient apiClient;

  public ServingEndpointsDataPlaneImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public QueryEndpointResponse query(QueryEndpointInput request) {
    String path = String.format("/serving-endpoints/%s/invocations", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QueryEndpointResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
