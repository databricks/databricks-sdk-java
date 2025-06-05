// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CustomAppIntegration */
@Generated
class CustomAppIntegrationImpl implements CustomAppIntegrationService {
  private final ApiClient apiClient;

  public CustomAppIntegrationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateCustomAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteCustomAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetCustomAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetCustomAppIntegrationsOutput list(ListCustomAppIntegrationsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetCustomAppIntegrationsOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, UpdateCustomAppIntegrationOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
