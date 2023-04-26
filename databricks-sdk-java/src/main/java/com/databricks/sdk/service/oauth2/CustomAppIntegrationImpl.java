// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of CustomAppIntegration */
class CustomAppIntegrationImpl implements CustomAppIntegrationService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for CustomAppIntegrationImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CustomAppIntegrationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateCustomAppIntegrationOutput create(CreateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    return apiClient.POST(path, request, CreateCustomAppIntegrationOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetCustomAppIntegrationOutput get(GetCustomAppIntegrationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    return apiClient.GET(path, request, GetCustomAppIntegrationOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetCustomAppIntegrationsOutput list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations", apiClient.configuredAccountID());
    return apiClient.GET(path, GetCustomAppIntegrationsOutput.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(UpdateCustomAppIntegration request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/custom-app-integrations/%s",
            apiClient.configuredAccountID(), request.getIntegrationId());
    apiClient.PATCH(path, request, Void.class);
  }
}
