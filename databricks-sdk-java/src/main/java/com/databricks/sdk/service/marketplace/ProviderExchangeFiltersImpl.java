// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ProviderExchangeFilters */
@Generated
class ProviderExchangeFiltersImpl implements ProviderExchangeFiltersService {
  private final ApiClient apiClient;

  public ProviderExchangeFiltersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateExchangeFilterResponse create(CreateExchangeFilterRequest request) {
    String path = "/api/2.0/marketplace-exchange/filters";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateExchangeFilterResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteExchangeFilterRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/filters/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListExchangeFiltersResponse list(ListExchangeFiltersRequest request) {
    String path = "/api/2.0/marketplace-exchange/filters";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListExchangeFiltersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateExchangeFilterResponse update(UpdateExchangeFilterRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/filters/%s", request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateExchangeFilterResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
