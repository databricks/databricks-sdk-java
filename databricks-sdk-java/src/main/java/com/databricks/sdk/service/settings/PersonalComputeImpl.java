// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeletePersonalComputeSettingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PersonalComputeSetting get(GetPersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PersonalComputeSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PersonalComputeSetting update(UpdatePersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PersonalComputeSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
