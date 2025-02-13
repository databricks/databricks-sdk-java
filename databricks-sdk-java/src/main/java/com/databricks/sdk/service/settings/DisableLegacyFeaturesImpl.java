// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DisableLegacyFeatures */
@Generated
class DisableLegacyFeaturesImpl implements DisableLegacyFeaturesService {
  private final ApiClient apiClient;

  public DisableLegacyFeaturesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteDisableLegacyFeaturesResponse delete(DeleteDisableLegacyFeaturesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/disable_legacy_features/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteDisableLegacyFeaturesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DisableLegacyFeatures get(GetDisableLegacyFeaturesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/disable_legacy_features/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DisableLegacyFeatures.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DisableLegacyFeatures update(UpdateDisableLegacyFeaturesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/disable_legacy_features/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DisableLegacyFeatures.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
