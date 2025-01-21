// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of DisableLegacyDbfs */
@Generated
class DisableLegacyDbfsImpl implements DisableLegacyDbfsService {
  private final ApiClient apiClient;

  public DisableLegacyDbfsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDisableLegacyDbfsResponse delete(DeleteDisableLegacyDbfsRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_dbfs/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE", path, request, DeleteDisableLegacyDbfsResponse.class, headers);
  }

  @Override
  public DisableLegacyDbfs get(GetDisableLegacyDbfsRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_dbfs/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, DisableLegacyDbfs.class, headers);
  }

  @Override
  public DisableLegacyDbfs update(UpdateDisableLegacyDbfsRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_dbfs/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, DisableLegacyDbfs.class, headers);
  }
}
