// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of EsmEnablementAccount */
@Generated
class EsmEnablementAccountImpl implements EsmEnablementAccountService {
  private final ApiClient apiClient;

  public EsmEnablementAccountImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EsmEnablementAccountSetting get(GetEsmEnablementAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/shield_esm_enablement_ac/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EsmEnablementAccountSetting.class, headers);
  }

  @Override
  public EsmEnablementAccountSetting update(UpdateEsmEnablementAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/shield_esm_enablement_ac/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, EsmEnablementAccountSetting.class, headers);
  }
}
