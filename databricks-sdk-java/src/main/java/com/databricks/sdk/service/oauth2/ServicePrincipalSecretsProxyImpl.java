// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ServicePrincipalSecretsProxy */
@Generated
class ServicePrincipalSecretsProxyImpl implements ServicePrincipalSecretsProxyService {
  private final ApiClient apiClient;

  public ServicePrincipalSecretsProxyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateServicePrincipalSecretResponse create(CreateServicePrincipalSecretRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/servicePrincipals/%s/credentials/secrets",
            request.getServicePrincipalId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CreateServicePrincipalSecretResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteServicePrincipalSecretRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/servicePrincipals/%s/credentials/secrets/%s",
            request.getServicePrincipalId(), request.getSecretId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListServicePrincipalSecretsResponse list(ListServicePrincipalSecretsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/servicePrincipals/%s/credentials/secrets",
            request.getServicePrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListServicePrincipalSecretsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
