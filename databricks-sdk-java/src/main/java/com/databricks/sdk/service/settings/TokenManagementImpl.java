// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of TokenManagement */
@Generated
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
  public void delete(DeleteTokenManagementRequest request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public TokenInfo get(GetTokenManagementRequest request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    return apiClient.GET(path, request, TokenInfo.class);
  }

  @Override
  public GetTokenPermissionLevelsResponse getTokenPermissionLevels() {
    String path = "/api/2.0/permissions/authorization/tokens/permissionLevels";
    return apiClient.GET(path, GetTokenPermissionLevelsResponse.class);
  }

  @Override
  public TokenPermissions getTokenPermissions() {
    String path = "/api/2.0/permissions/authorization/tokens";
    return apiClient.GET(path, TokenPermissions.class);
  }

  @Override
  public ListTokensResponse list(ListTokenManagementRequest request) {
    String path = "/api/2.0/token-management/tokens";
    return apiClient.GET(path, request, ListTokensResponse.class);
  }

  @Override
  public TokenPermissions setTokenPermissions(TokenPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/tokens";
    return apiClient.PUT(path, request, TokenPermissions.class);
  }

  @Override
  public TokenPermissions updateTokenPermissions(TokenPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/tokens";
    return apiClient.PATCH(path, request, TokenPermissions.class);
  }
}
