// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of RecipientActivation */
class RecipientActivationImpl implements RecipientActivationService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for RecipientActivationImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public RecipientActivationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/public/data_sharing_activation_info/%s",
            request.getActivationUrl());
    apiClient.GET(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/public/data_sharing_activation/%s", request.getActivationUrl());
    return apiClient.GET(path, request, RetrieveTokenResponse.class);
  }
}
