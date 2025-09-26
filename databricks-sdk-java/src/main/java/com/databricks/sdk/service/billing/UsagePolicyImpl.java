// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of UsagePolicy */
@Generated
class UsagePolicyImpl implements UsagePolicyService {
  private final ApiClient apiClient;

  public UsagePolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public UsagePolicy create(CreateUsagePolicyRequest request) {
    String path =
        String.format("/api/2.1/accounts/%s/usage-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UsagePolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteUsagePolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/usage-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UsagePolicy get(GetUsagePolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/usage-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, UsagePolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListUsagePoliciesResponse list(ListUsagePoliciesRequest request) {
    String path =
        String.format("/api/2.1/accounts/%s/usage-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListUsagePoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UsagePolicy update(UpdateUsagePolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/usage-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UsagePolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
