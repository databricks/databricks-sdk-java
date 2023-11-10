// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ExchangeTokenResponse.class, headers);
  }
}
