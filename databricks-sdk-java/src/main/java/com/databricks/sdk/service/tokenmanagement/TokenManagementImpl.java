// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tokenmanagement;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/** Package-local implementation of TokenManagement */
class TokenManagementImpl implements TokenManagementService {
  private final ApiClient apiClient;

  public TokenManagementImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
    String path = "/api/2.0/token-management/on-behalf-of/tokens";
    return apiClient.POST(path, request, CreateOboTokenResponse.class);
  }

  @Override
  public void delete(Delete request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public TokenInfo get(Get request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    return apiClient.GET(path, request, TokenInfo.class);
  }

  @Override
  public ListTokensResponse list(List request) {
    String path = "/api/2.0/token-management/tokens";
    return apiClient.GET(path, request, ListTokensResponse.class);
  }
}
