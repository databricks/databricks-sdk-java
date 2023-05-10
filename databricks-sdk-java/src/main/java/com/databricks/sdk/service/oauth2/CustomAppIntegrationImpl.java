// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, CreateCustomAppIntegrationOutput.class);
  }

  @Override
  public void delete(DeleteCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    return apiClient.GET(path, request, GetCustomAppIntegrationOutput.class);
  }

  @Override
  public GetCustomAppIntegrationsOutput list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    return apiClient.GET(path, GetCustomAppIntegrationsOutput.class);
  }

  @Override
  public void update(UpdateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.PATCH(path, request, Void.class);
  }
}
