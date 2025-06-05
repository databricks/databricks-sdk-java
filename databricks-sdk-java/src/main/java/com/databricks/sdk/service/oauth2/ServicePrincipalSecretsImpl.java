// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ServicePrincipalSecrets */
@Generated
class ServicePrincipalSecretsImpl implements ServicePrincipalSecretsService {
  private final ApiClient apiClient;

  public ServicePrincipalSecretsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateServicePrincipalSecretResponse create(CreateServicePrincipalSecretRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/credentials/secrets",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateServicePrincipalSecretResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteServicePrincipalSecretRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/credentials/secrets/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getSecretId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListServicePrincipalSecretsResponse list(ListServicePrincipalSecretsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/credentials/secrets",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListServicePrincipalSecretsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
