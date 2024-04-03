// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CspEnablementAccount */
@Generated
class CspEnablementAccountImpl implements CspEnablementAccountService {
  private final ApiClient apiClient;

  public CspEnablementAccountImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CspEnablementAccountSetting get(GetCspEnablementAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/shield_csp_enablement_ac/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CspEnablementAccountSetting.class, headers);
  }

  @Override
  public CspEnablementAccountSetting update(UpdateCspEnablementAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/shield_csp_enablement_ac/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CspEnablementAccountSetting.class, headers);
  }
}
