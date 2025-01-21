// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Groups */
@Generated
class GroupsImpl implements GroupsService {
  private final ApiClient apiClient;

  public GroupsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Group create(Group request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, Group.class, headers);
  }

  @Override
  public void delete(DeleteGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public Group get(GetGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Group.class, headers);
  }

  @Override
  public ListGroupsResponse list(ListGroupsRequest request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListGroupsResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, PatchResponse.class, headers);
  }

  @Override
  public void update(Group request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PUT", path, request, UpdateResponse.class, headers);
  }
}
