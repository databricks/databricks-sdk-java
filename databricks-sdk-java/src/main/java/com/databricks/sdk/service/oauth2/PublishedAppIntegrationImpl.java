// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreatePublishedAppIntegrationOutput.class, headers);
  }

  @Override
  public void delete(DeletePublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetPublishedAppIntegrationOutput.class, headers);
  }

  @Override
  public GetPublishedAppIntegrationsOutput list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetPublishedAppIntegrationsOutput.class, headers);
  }

  @Override
  public void update(UpdatePublishedAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }
}
