// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ProviderListings */
@Generated
class ProviderListingsImpl implements ProviderListingsService {
  private final ApiClient apiClient;

  public ProviderListingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateListingResponse create(CreateListingRequest request) {
    String path = "/api/2.0/marketplace-provider/listing";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetListingResponse get(GetListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetListingsResponse list(GetListingsRequest request) {
    String path = "/api/2.0/marketplace-provider/listings";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetListingsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateListingResponse update(UpdateListingRequest request) {
    String path = String.format("/api/2.0/marketplace-provider/listings/%s", request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
