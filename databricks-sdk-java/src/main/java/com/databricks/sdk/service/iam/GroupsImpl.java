// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Groups */
class GroupsImpl implements GroupsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for GroupsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GroupsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Group create(Group request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    return apiClient.POST(path, request, Group.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Group get(GetGroupRequest request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    return apiClient.GET(path, request, Group.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListGroupsResponse list(ListGroupsRequest request) {
    String path = "/api/2.0/preview/scim/v2/Groups";
    return apiClient.GET(path, request, ListGroupsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patch(PartialUpdate request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(Group request) {
    String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
