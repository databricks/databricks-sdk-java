// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AutomaticClusterUpdate */
@Generated
class AutomaticClusterUpdateImpl implements AutomaticClusterUpdateService {
  private final ApiClient apiClient;

  public AutomaticClusterUpdateImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AutomaticClusterUpdateSetting get(GetAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, AutomaticClusterUpdateSetting.class, headers);
  }

  @Override
  public AutomaticClusterUpdateSetting update(UpdateAutomaticClusterUpdateSettingRequest request) {
    String path = "/api/2.0/settings/types/automatic_cluster_update/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, AutomaticClusterUpdateSetting.class, headers);
  }
}
