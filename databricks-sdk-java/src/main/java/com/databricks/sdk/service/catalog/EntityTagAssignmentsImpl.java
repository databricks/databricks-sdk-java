// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EntityTagAssignments */
@Generated
class EntityTagAssignmentsImpl implements EntityTagAssignmentsService {
  private final ApiClient apiClient;

  public EntityTagAssignmentsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EntityTagAssignment create(CreateEntityTagAssignmentRequest request) {
    String path = "/api/2.1/unity-catalog/entity-tag-assignments";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTagAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, EntityTagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteEntityTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityName(), request.getTagKey());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EntityTagAssignment get(GetEntityTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityName(), request.getTagKey());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, EntityTagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListEntityTagAssignmentsResponse list(ListEntityTagAssignmentsRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/entity-tag-assignments/%s/%s/tags",
            request.getEntityType(), request.getEntityName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListEntityTagAssignmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EntityTagAssignment update(UpdateEntityTagAssignmentRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/entity-tag-assignments/%s/%s/tags/%s",
            request.getEntityType(), request.getEntityName(), request.getTagKey());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getTagAssignment()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, EntityTagAssignment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
