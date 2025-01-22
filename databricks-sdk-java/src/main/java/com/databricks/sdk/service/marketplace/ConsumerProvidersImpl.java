// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ConsumerProviders */
@Generated
class ConsumerProvidersImpl implements ConsumerProvidersService {
  private final ApiClient apiClient;

  public ConsumerProvidersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BatchGetProvidersResponse batchGet(BatchGetProvidersRequest request) {
    String path = "/api/2.1/marketplace-consumer/providers:batchGet";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, BatchGetProvidersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetProviderResponse get(GetProviderRequest request) {
    String path = String.format("/api/2.1/marketplace-consumer/providers/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetProviderResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListProvidersResponse list(ListProvidersRequest request) {
    String path = "/api/2.1/marketplace-consumer/providers";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListProvidersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
