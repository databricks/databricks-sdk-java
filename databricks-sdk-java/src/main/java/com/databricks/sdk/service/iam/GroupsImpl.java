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
    return apiClient.POST(path, request, Group.class, headers);
  }

  @Override
  public void delete(DeleteGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public Group get(GetGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Group.class, headers);
  }

  @Override
  public ListGroupsResponse list(ListGroupsRequest request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListGroupsResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }

  @Override
  public void update(Group request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, Void.class, headers);
  }
}
