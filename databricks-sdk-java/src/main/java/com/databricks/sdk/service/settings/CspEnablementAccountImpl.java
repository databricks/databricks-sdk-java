// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CspEnablementAccountSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CspEnablementAccountSetting update(UpdateCspEnablementAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/shield_csp_enablement_ac/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CspEnablementAccountSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
