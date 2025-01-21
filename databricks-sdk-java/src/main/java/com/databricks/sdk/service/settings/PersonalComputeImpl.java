// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of PersonalCompute */
@Generated
class PersonalComputeImpl implements PersonalComputeService {
  private final ApiClient apiClient;

  public PersonalComputeImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeletePersonalComputeSettingResponse delete(DeletePersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE", path, request, DeletePersonalComputeSettingResponse.class, headers);
  }

  @Override
  public PersonalComputeSetting get(GetPersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, PersonalComputeSetting.class, headers);
  }

  @Override
  public PersonalComputeSetting update(UpdatePersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, PersonalComputeSetting.class, headers);
  }
}
