// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of BudgetPolicy */
@Generated
class BudgetPolicyImpl implements BudgetPolicyService {
  private final ApiClient apiClient;

  public BudgetPolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BudgetPolicy create(CreateBudgetPolicyRequest request) {
    String path =
        String.format("/api/2.1/accounts/%s/budget-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, BudgetPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteBudgetPolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budget-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public BudgetPolicy get(GetBudgetPolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budget-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, BudgetPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListBudgetPoliciesResponse list(ListBudgetPoliciesRequest request) {
    String path =
        String.format("/api/2.1/accounts/%s/budget-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListBudgetPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public BudgetPolicy update(UpdateBudgetPolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budget-policies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, BudgetPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
