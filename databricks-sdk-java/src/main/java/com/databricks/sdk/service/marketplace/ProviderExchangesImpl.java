// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ProviderExchanges */
@Generated
class ProviderExchangesImpl implements ProviderExchangesService {
  private final ApiClient apiClient;

  public ProviderExchangesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AddExchangeForListingResponse addListingToExchange(AddExchangeForListingRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges-for-listing";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AddExchangeForListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CreateExchangeResponse create(CreateExchangeRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateExchangeResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteExchangeResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteListingFromExchange(RemoveExchangeForListingRequest request) {
    String path =
        String.format("/api/2.0/marketplace-exchange/exchanges-for-listing/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, RemoveExchangeForListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetExchangeResponse get(GetExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetExchangeResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListExchangesResponse list(ListExchangesRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListExchangesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListExchangesForListingResponse listExchangesForListing(
      ListExchangesForListingRequest request) {
    String path = "/api/2.0/marketplace-exchange/exchanges-for-listing";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListExchangesForListingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListListingsForExchangeResponse listListingsForExchange(
      ListListingsForExchangeRequest request) {
    String path = "/api/2.0/marketplace-exchange/listings-for-exchange";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListListingsForExchangeResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateExchangeResponse update(UpdateExchangeRequest request) {
    String path = String.format("/api/2.0/marketplace-exchange/exchanges/%s", request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateExchangeResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
