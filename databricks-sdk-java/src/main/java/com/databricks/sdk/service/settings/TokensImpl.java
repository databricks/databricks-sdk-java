// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Tokens */
class TokensImpl implements TokensService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for TokensImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public TokensImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateTokenResponse create(CreateTokenRequest request) {
    String path = "/api/2.0/token/create";
    return apiClient.POST(path, request, CreateTokenResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(RevokeTokenRequest request) {
    String path = "/api/2.0/token/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListTokensResponse list() {
    String path = "/api/2.0/token/list";
    return apiClient.GET(path, ListTokensResponse.class);
  }
}
