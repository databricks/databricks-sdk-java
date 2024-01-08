// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of VectorSearchEndpoints */
@Generated
class VectorSearchEndpointsImpl implements VectorSearchEndpointsService {
  private final ApiClient apiClient;

  public VectorSearchEndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EndpointInfo createEndpoint(CreateEndpoint request) {
    String path = "/api/2.0/vector-search/endpoints";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, EndpointInfo.class, headers);
  }

  @Override
  public void deleteEndpoint(DeleteEndpointRequest request) {
    String path = String.format("/api/2.0/vector-search/endpoints/%s", request.getEndpointName());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public EndpointInfo getEndpoint(GetEndpointRequest request) {
    String path = String.format("/api/2.0/vector-search/endpoints/%s", request.getEndpointName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EndpointInfo.class, headers);
  }

  @Override
  public ListEndpointResponse listEndpoints(ListEndpointsRequest request) {
    String path = "/api/2.0/vector-search/endpoints";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListEndpointResponse.class, headers);
  }
}
