// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;

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
    return apiClient.POST(path, request, VpcEndpoint.class);
  }

  @Override
  public void delete(DeleteVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    return apiClient.GET(path, request, VpcEndpoint.class);
  }

  @Override
  public Collection<VpcEndpoint> list() {
    String path =
        String.format("/api/2.0/accounts/%s/vpc-endpoints", apiClient.configuredAccountID());
    return apiClient.getCollection(path, null, VpcEndpoint.class);
  }
}
