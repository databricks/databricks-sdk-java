// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CspEnablement */
@Generated
class CspEnablementImpl implements CspEnablementService {
  private final ApiClient apiClient;

  public CspEnablementImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CspEnablementSetting get(GetCspEnablementRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CspEnablementSetting.class, headers);
  }

  @Override
  public CspEnablementSetting update(UpdateCspEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_csp_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CspEnablementSetting.class, headers);
  }
}
