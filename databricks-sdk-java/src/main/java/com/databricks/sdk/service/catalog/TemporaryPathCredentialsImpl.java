// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of TemporaryPathCredentials */
@Generated
class TemporaryPathCredentialsImpl implements TemporaryPathCredentialsService {
  private final ApiClient apiClient;

  public TemporaryPathCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GenerateTemporaryPathCredentialResponse generateTemporaryPathCredentials(
      GenerateTemporaryPathCredentialRequest request) {
    String path = "/api/2.0/unity-catalog/temporary-path-credentials";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, GenerateTemporaryPathCredentialResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
