// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ExternalLineage */
@Generated
class ExternalLineageImpl implements ExternalLineageService {
  private final ApiClient apiClient;

  public ExternalLineageImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ExternalLineageRelationship createExternalLineageRelationship(
      CreateExternalLineageRelationshipRequest request) {
    String path = "/api/2.0/lineage-tracking/external-lineage";
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getExternalLineageRelationship()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ExternalLineageRelationship.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteExternalLineageRelationship(DeleteExternalLineageRelationshipRequest request) {
    String path = "/api/2.0/lineage-tracking/external-lineage";
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
  public ListExternalLineageRelationshipsResponse listExternalLineageRelationships(
      ListExternalLineageRelationshipsRequest request) {
    String path = "/api/2.0/lineage-tracking/external-lineage";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListExternalLineageRelationshipsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalLineageRelationship updateExternalLineageRelationship(
      UpdateExternalLineageRelationshipRequest request) {
    String path = "/api/2.0/lineage-tracking/external-lineage";
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getExternalLineageRelationship()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ExternalLineageRelationship.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
