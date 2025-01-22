// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EnhancedSecurityMonitoring */
@Generated
class EnhancedSecurityMonitoringImpl implements EnhancedSecurityMonitoringService {
  private final ApiClient apiClient;

  public EnhancedSecurityMonitoringImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnhancedSecurityMonitoringSetting get(
      GetEnhancedSecurityMonitoringSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, EnhancedSecurityMonitoringSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EnhancedSecurityMonitoringSetting update(
      UpdateEnhancedSecurityMonitoringSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EnhancedSecurityMonitoringSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
