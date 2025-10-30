// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CredentialsManager */
@Generated
class CredentialsManagerImpl implements CredentialsManagerService {
  private final ApiClient apiClient;

  public CredentialsManagerImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ExchangeTokenResponse exchangeToken(ExchangeTokenRequest request) {
    String path = "/api/2.0/credentials-manager/exchange-tokens/token";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ExchangeTokenResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
