// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of DisableLegacyAccess */
@Generated
class DisableLegacyAccessImpl implements DisableLegacyAccessService {
  private final ApiClient apiClient;

  public DisableLegacyAccessImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDisableLegacyAccessResponse delete(DeleteDisableLegacyAccessRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_access/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE", path, request, DeleteDisableLegacyAccessResponse.class, headers);
  }

  @Override
  public DisableLegacyAccess get(GetDisableLegacyAccessRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_access/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, DisableLegacyAccess.class, headers);
  }

  @Override
  public DisableLegacyAccess update(UpdateDisableLegacyAccessRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_access/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, DisableLegacyAccess.class, headers);
  }
}
