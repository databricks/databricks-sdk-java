// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tags;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of TagAssignments */
@Generated
class TagAssignmentsImpl implements TagAssignmentsService {
  private final ApiClient apiClient;

  public TagAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TagAssignment createTagAssignment(CreateTagAssignmentRequest request) {
    String path = "/api/2.0/entity-tag-assignments";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTagAssignment()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, TagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteTagAssignment(DeleteTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityId(), request.getTagKey());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public TagAssignment getTagAssignment(GetTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityId(), request.getTagKey());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, TagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListTagAssignmentsResponse listTagAssignments(ListTagAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.0/entity-tag-assignments/%s/%s/tags",
            request.getEntityType(), request.getEntityId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListTagAssignmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public TagAssignment updateTagAssignment(UpdateTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.0/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityId(), request.getTagKey());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getTagAssignment()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, TagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
