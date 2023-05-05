// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, Object.class);
    try {
      return apiClient
          .getObjectMapper()
          .readValue(new Gson().toJson(apiClient.GET(path, Collection.class)), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
