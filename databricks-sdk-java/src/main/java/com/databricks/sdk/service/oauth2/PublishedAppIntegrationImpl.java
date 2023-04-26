// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of PublishedAppIntegration */
class PublishedAppIntegrationImpl implements PublishedAppIntegrationService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for PublishedAppIntegrationImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PublishedAppIntegrationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreatePublishedAppIntegrationOutput create(CreatePublishedAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations",
            apiClient.configuredAccountID());
    return apiClient.POST(path, request, CreatePublishedAppIntegrationOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeletePublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetPublishedAppIntegrationOutput get(GetPublishedAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    return apiClient.GET(path, request, GetPublishedAppIntegrationOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetPublishedAppIntegrationsOutput list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations",
            apiClient.configuredAccountID());
    return apiClient.GET(path, GetPublishedAppIntegrationsOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(UpdatePublishedAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.PATCH(path, request, Void.class);
  }
}
