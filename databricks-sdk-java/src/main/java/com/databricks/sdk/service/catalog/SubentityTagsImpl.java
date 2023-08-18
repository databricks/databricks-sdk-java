// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of SubentityTags */
@Generated
class SubentityTagsImpl implements SubentityTagsService {
  private final ApiClient apiClient;

  public SubentityTagsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TagSubentityAssignmentsList list(ListSubentityTagsRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/subentity-tags/%s/%s/%s",
            request.getSecurableType(), request.getFullName(), request.getSubentityName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, TagSubentityAssignmentsList.class, headers);
  }

  @Override
  public TagSubentityAssignmentsList update(UpdateTags request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/subentity-tags/%s/%s/%s",
            request.getSecurableType(), request.getFullName(), request.getSubentityName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, TagSubentityAssignmentsList.class, headers);
  }
}
