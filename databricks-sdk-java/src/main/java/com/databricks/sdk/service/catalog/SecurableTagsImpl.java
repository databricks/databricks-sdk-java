// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of SecurableTags */
@Generated
class SecurableTagsImpl implements SecurableTagsService {
  private final ApiClient apiClient;

  public SecurableTagsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TagSecurableAssignmentsList list(ListSecurableTagsRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/securable-tags/%s/%s",
            request.getSecurableType(), request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, TagSecurableAssignmentsList.class, headers);
  }

  @Override
  public TagSecurableAssignmentsList update(UpdateTags request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/securable-tags/%s/%s",
            request.getSecurableType(), request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, TagSecurableAssignmentsList.class, headers);
  }
}
