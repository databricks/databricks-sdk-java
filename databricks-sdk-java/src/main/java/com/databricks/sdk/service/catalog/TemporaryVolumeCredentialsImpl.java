// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of TemporaryVolumeCredentials */
@Generated
class TemporaryVolumeCredentialsImpl implements TemporaryVolumeCredentialsService {
  private final ApiClient apiClient;

  public TemporaryVolumeCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GenerateTemporaryVolumeCredentialResponse generateTemporaryVolumeCredentials(
      GenerateTemporaryVolumeCredentialRequest request) {
    String path = "/api/2.0/unity-catalog/temporary-volume-credentials";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, GenerateTemporaryVolumeCredentialResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
