// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, VpcEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, VpcEndpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
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
