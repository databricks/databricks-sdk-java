// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of PolicyFamilies */
@Generated
class PolicyFamiliesImpl implements PolicyFamiliesService {
  private final ApiClient apiClient;

  public PolicyFamiliesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public PolicyFamily get(GetPolicyFamilyRequest request) {
    String path = String.format("/api/2.0/policy-families/%s", request.getPolicyFamilyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PolicyFamily.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest request) {
    String path = "/api/2.0/policy-families";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPolicyFamiliesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
