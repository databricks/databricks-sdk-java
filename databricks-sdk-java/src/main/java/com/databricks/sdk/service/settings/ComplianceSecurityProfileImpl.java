// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ComplianceSecurityProfile */
@Generated
class ComplianceSecurityProfileImpl implements ComplianceSecurityProfileService {
  private final ApiClient apiClient;

  public ComplianceSecurityProfileImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ComplianceSecurityProfileSetting get(GetComplianceSecurityProfileSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ComplianceSecurityProfileSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ComplianceSecurityProfileSetting update(
      UpdateComplianceSecurityProfileSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, ComplianceSecurityProfileSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
