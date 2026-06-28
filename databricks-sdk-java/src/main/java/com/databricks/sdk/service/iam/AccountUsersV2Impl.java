// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountUsersV2 */
@Generated
class AccountUsersV2Impl implements AccountUsersV2Service {
  private final ApiClient apiClient;

  public AccountUsersV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountUser create(CreateAccountUserRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Users", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountUser.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
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
  public AccountUser get(GetAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountUser.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAccountUsersResponse list(ListAccountUsersRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Users", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAccountUsersResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void patch(PatchAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdateAccountUserRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Users/%s",
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
