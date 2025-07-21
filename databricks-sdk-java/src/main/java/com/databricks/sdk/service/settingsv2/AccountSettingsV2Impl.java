// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountSettingsV2 */
@Generated
class AccountSettingsV2Impl implements AccountSettingsV2Service {
  private final ApiClient apiClient;

  public AccountSettingsV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Setting getPublicAccountSetting(GetPublicAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/settings/%s", apiClient.configuredAccountID(), request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Setting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Setting patchPublicAccountSetting(PatchPublicAccountSettingRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/settings/%s", apiClient.configuredAccountID(), request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getSetting()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Setting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
