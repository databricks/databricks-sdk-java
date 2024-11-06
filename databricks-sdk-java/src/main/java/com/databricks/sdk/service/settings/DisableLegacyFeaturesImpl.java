// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, DeleteDisableLegacyFeaturesResponse.class, headers);
  }

  @Override
  public DisableLegacyFeatures get(GetDisableLegacyFeaturesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/disable_legacy_features/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, DisableLegacyFeatures.class, headers);
  }

  @Override
  public DisableLegacyFeatures update(UpdateDisableLegacyFeaturesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/disable_legacy_features/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, DisableLegacyFeatures.class, headers);
  }
}
