// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of IpAccessLists */
@Generated
class IpAccessListsImpl implements IpAccessListsService {
  private final ApiClient apiClient;

  public IpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    String path = "/api/2.0/ip-access-lists";
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
  public void delete(DeleteIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
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
  public FetchIpAccessListResponse get(GetIpAccessListRequest request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FetchIpAccessListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListIpAccessListResponse list() {
    String path = "/api/2.0/ip-access-lists";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListIpAccessListResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void replace(ReplaceIpAccessList request) {
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
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
    String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
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
