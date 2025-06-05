// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of TemporaryTableCredentials */
@Generated
class TemporaryTableCredentialsImpl implements TemporaryTableCredentialsService {
  private final ApiClient apiClient;

  public TemporaryTableCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GenerateTemporaryTableCredentialResponse generateTemporaryTableCredentials(
      GenerateTemporaryTableCredentialRequest request) {
    String path = "/api/2.0/unity-catalog/temporary-table-credentials";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, GenerateTemporaryTableCredentialResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
