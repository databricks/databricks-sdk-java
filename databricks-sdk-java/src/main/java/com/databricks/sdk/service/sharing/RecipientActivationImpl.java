// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, GetActivationUrlInfoResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/public/data_sharing_activation/%s", request.getActivationUrl());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, RetrieveTokenResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
