// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, Group.class);
  }

  @Override
  public void delete(DeleteGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Group get(GetGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    return apiClient.GET(path, request, Group.class, "application/json");
  }

  @Override
  public ListGroupsResponse list(ListGroupsRequest request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    return apiClient.GET(path, request, ListGroupsResponse.class, "application/json");
  }

  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  @Override
  public void update(Group request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
