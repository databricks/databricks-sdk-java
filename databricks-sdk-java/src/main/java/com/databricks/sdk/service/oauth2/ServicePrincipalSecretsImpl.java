// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.POST(path, request, CreateServicePrincipalSecretResponse.class, headers);
  }

  @Override
  public void delete(DeleteServicePrincipalSecretRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/credentials/secrets/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getSecretId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public ListServicePrincipalSecretsResponse list(ListServicePrincipalSecretsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/credentials/secrets",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListServicePrincipalSecretsResponse.class, headers);
  }
}
