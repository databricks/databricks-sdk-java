// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateOboTokenResponse.class, headers);
  }

  @Override
  public void delete(DeleteTokenManagementRequest request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public GetTokenResponse get(GetTokenManagementRequest request) {
    String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetTokenResponse.class, headers);
  }

  @Override
  public GetTokenPermissionLevelsResponse getPermissionLevels() {
    String path = "/api/2.0/permissions/authorization/tokens/permissionLevels";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetTokenPermissionLevelsResponse.class, headers);
  }

  @Override
  public TokenPermissions getPermissions() {
    String path = "/api/2.0/permissions/authorization/tokens";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, TokenPermissions.class, headers);
  }

  @Override
  public ListTokensResponse list(ListTokenManagementRequest request) {
    String path = "/api/2.0/token-management/tokens";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListTokensResponse.class, headers);
  }

  @Override
  public TokenPermissions setPermissions(TokenPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/tokens";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, TokenPermissions.class, headers);
  }

  @Override
  public TokenPermissions updatePermissions(TokenPermissionsRequest request) {
    String path = "/api/2.0/permissions/authorization/tokens";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, TokenPermissions.class, headers);
  }
}
