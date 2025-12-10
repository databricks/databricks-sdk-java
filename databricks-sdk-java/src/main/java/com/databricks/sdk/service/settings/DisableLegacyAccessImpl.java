// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteDisableLegacyAccessResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DisableLegacyAccess get(GetDisableLegacyAccessRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_access/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DisableLegacyAccess.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DisableLegacyAccess update(UpdateDisableLegacyAccessRequest request) {
    String path = "/api/2.0/settings/types/disable_legacy_access/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DisableLegacyAccess.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
