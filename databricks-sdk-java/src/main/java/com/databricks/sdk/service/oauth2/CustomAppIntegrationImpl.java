// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateCustomAppIntegrationOutput.class, headers);
  }

  @Override
  public DeleteCustomAppIntegrationOutput delete(DeleteCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, DeleteCustomAppIntegrationOutput.class, headers);
  }

  @Override
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetCustomAppIntegrationOutput.class, headers);
  }

  @Override
  public GetCustomAppIntegrationsOutput list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetCustomAppIntegrationsOutput.class, headers);
  }

  @Override
  public UpdateCustomAppIntegrationOutput update(UpdateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, UpdateCustomAppIntegrationOutput.class, headers);
  }
}
