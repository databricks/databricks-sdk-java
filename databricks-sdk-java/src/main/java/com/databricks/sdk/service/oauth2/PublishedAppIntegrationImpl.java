// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of PublishedAppIntegration */
@Generated
class PublishedAppIntegrationImpl implements PublishedAppIntegrationService {
  private final ApiClient apiClient;

  public PublishedAppIntegrationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreatePublishedAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeletePublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
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
  public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPublishedAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetPublishedAppIntegrationsOutput list(ListPublishedAppIntegrationsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPublishedAppIntegrationsOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdatePublishedAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
