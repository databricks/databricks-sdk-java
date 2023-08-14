// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of VpcEndpoints */
@Generated
class VpcEndpointsImpl implements VpcEndpointsService {
  private final ApiClient apiClient;

  public VpcEndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public VpcEndpoint create(CreateVpcEndpointRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/vpc-endpoints", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, VpcEndpoint.class, headers);
  }

  @Override
  public void delete(DeleteVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, VpcEndpoint.class, headers);
  }

  @Override
  public Collection<VpcEndpoint> list() {
    String path =
        String.format("/api/2.0/accounts/%s/vpc-endpoints", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.getCollection(path, null, VpcEndpoint.class, headers);
  }
}
