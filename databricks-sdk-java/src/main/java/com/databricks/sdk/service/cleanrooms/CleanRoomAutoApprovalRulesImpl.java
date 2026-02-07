// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CleanRoomAutoApprovalRules */
@Generated
class CleanRoomAutoApprovalRulesImpl implements CleanRoomAutoApprovalRulesService {
  private final ApiClient apiClient;

  public CleanRoomAutoApprovalRulesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CleanRoomAutoApprovalRule create(CreateCleanRoomAutoApprovalRuleRequest request) {
    String path =
        String.format("/api/2.0/clean-rooms/%s/auto-approval-rules", request.getCleanRoomName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CleanRoomAutoApprovalRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteCleanRoomAutoApprovalRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/auto-approval-rules/%s",
            request.getCleanRoomName(), request.getRuleId());
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
  public CleanRoomAutoApprovalRule get(GetCleanRoomAutoApprovalRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/auto-approval-rules/%s",
            request.getCleanRoomName(), request.getRuleId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CleanRoomAutoApprovalRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCleanRoomAutoApprovalRulesResponse list(
      ListCleanRoomAutoApprovalRulesRequest request) {
    String path =
        String.format("/api/2.0/clean-rooms/%s/auto-approval-rules", request.getCleanRoomName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ListCleanRoomAutoApprovalRulesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CleanRoomAutoApprovalRule update(UpdateCleanRoomAutoApprovalRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/clean-rooms/%s/auto-approval-rules/%s",
            request.getCleanRoomName(), request.getRuleId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getAutoApprovalRule()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, CleanRoomAutoApprovalRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
