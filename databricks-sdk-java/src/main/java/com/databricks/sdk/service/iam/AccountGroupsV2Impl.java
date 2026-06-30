// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountGroupsV2 */
@Generated
class AccountGroupsV2Impl implements AccountGroupsV2Service {
  private final ApiClient apiClient;

  public AccountGroupsV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountGroup create(CreateAccountGroupRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountGroup get(GetAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountGroup.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAccountGroupsResponse list(ListAccountGroupsRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAccountGroupsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void patch(PatchAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdateAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
