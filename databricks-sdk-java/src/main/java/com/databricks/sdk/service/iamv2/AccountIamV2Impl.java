// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountIamV2 */
@Generated
class AccountIamV2Impl implements AccountIamV2Service {
  private final ApiClient apiClient;

  public AccountIamV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public WorkspaceAccessDetail getWorkspaceAccessDetail(GetWorkspaceAccessDetailRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/workspaces/%s/workspaceAccessDetails/%s",
            apiClient.configuredAccountID(), request.getWorkspaceId(), request.getPrincipalId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WorkspaceAccessDetail.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveGroupResponse resolveGroup(ResolveGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/groups/resolveByExternalId",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveGroupResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/servicePrincipals/resolveByExternalId",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveServicePrincipalResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ResolveUserResponse resolveUser(ResolveUserRequest request) {
    String path =
        String.format(
            "/api/2.0/identity/accounts/%s/users/resolveByExternalId",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ResolveUserResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
