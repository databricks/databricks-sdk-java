// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of VpcEndpoints */
class VpcEndpointsImpl implements VpcEndpointsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for VpcEndpointsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public VpcEndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public VpcEndpoint create(CreateVpcEndpointRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/vpc-endpoints", apiClient.configuredAccountID());
    return apiClient.POST(path, request, VpcEndpoint.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public VpcEndpoint get(GetVpcEndpointRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/vpc-endpoints/%s",
            apiClient.configuredAccountID(), request.getVpcEndpointId());
    return apiClient.GET(path, request, VpcEndpoint.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<VpcEndpoint> list() {
    String path =
        String.format("/api/2.0/accounts/%s/vpc-endpoints", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }
}
