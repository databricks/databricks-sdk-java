// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ConsumerInstallations */
@Generated
class ConsumerInstallationsImpl implements ConsumerInstallationsService {
  private final ApiClient apiClient;

  public ConsumerInstallationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Installation create(CreateInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations", request.getListingId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Installation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations/%s",
            request.getListingId(), request.getInstallationId());
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
  public ListAllInstallationsResponse list(ListAllInstallationsRequest request) {
    String path = "/api/2.1/marketplace-consumer/installations";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAllInstallationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListInstallationsResponse listListingInstallations(ListInstallationsRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations", request.getListingId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListInstallationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateInstallationResponse update(UpdateInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations/%s",
            request.getListingId(), request.getInstallationId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateInstallationResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
