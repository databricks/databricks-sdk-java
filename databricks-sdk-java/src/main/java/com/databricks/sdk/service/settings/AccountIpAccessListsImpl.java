// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountIpAccessLists */
@Generated
class AccountIpAccessListsImpl implements AccountIpAccessListsService {
  private final ApiClient apiClient;

  public AccountIpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path =
        String.format("/api/2.0/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateIpAccessListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetIpAccessListResponse get(GetAccountIpAccessListRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetIpAccessListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetIpAccessListsResponse list() {
    String path =
        String.format("/api/2.0/accounts/%s/ip-access-lists", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetIpAccessListsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void replace(ReplaceIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, ReplaceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdateIpAccessList request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/ip-access-lists/%s",
            apiClient.configuredAccountID(), request.getIpAccessListId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, UpdateResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
