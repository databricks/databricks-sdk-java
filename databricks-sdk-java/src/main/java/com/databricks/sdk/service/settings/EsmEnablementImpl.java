// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of EsmEnablement */
@Generated
class EsmEnablementImpl implements EsmEnablementService {
  private final ApiClient apiClient;

  public EsmEnablementImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EsmEnablementSetting get(GetEsmEnablementRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EsmEnablementSetting.class, headers);
  }

  @Override
  public EsmEnablementSetting update(UpdateEsmEnablementSettingRequest request) {
    String path = "/api/2.0/settings/types/shield_esm_enablement_ws_db/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, EsmEnablementSetting.class, headers);
  }
}
