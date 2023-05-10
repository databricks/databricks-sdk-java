// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of RecipientActivation */
@Generated
class RecipientActivationImpl implements RecipientActivationService {
  private final ApiClient apiClient;

  public RecipientActivationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/public/data_sharing_activation_info/%s",
            request.getActivationUrl());
    apiClient.GET(path, request, Void.class);
  }

  @Override
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/public/data_sharing_activation/%s", request.getActivationUrl());
    return apiClient.GET(path, request, RetrieveTokenResponse.class);
  }
}
