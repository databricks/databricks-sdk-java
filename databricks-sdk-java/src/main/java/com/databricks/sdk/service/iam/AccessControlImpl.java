// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccessControl */
@Generated
class AccessControlImpl implements AccessControlService {
  private final ApiClient apiClient;

  public AccessControlImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CheckPolicyResponse checkPolicy(CheckPolicyRequest request) {
    String path = "/api/2.0/access-control/check-policy-v2";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CheckPolicyResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
