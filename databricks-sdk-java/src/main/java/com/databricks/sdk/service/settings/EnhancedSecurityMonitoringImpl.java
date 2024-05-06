// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EnhancedSecurityMonitoringSetting.class, headers);
  }

  @Override
  public EnhancedSecurityMonitoringSetting update(
      UpdateEnhancedSecurityMonitoringSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, EnhancedSecurityMonitoringSetting.class, headers);
  }
}
