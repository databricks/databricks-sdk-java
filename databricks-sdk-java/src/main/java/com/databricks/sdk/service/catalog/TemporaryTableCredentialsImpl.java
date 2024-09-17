// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, GenerateTemporaryTableCredentialResponse.class, headers);
  }
}
