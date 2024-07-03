// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, QueryEndpointResponse.class, headers);
  }
}
