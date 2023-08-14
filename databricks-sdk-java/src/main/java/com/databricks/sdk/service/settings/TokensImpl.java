// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Tokens */
@Generated
class TokensImpl implements TokensService {
  private final ApiClient apiClient;

  public TokensImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateTokenResponse create(CreateTokenRequest request) {
    String path = "/api/2.0/token/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, CreateTokenResponse.class, headers);
  }

  @Override
  public void delete(RevokeTokenRequest request) {
    String path = "/api/2.0/token/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ListTokensResponse list() {
    String path = "/api/2.0/token/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, ListTokensResponse.class, headers);
  }
}
