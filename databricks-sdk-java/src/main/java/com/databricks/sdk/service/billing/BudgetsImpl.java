// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Budgets */
@Generated
class BudgetsImpl implements BudgetsService {
  private final ApiClient apiClient;

  public BudgetsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public WrappedBudgetWithStatus create(WrappedBudget request) {
    String path = String.format("/api/2.0/accounts/%s/budget", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, WrappedBudgetWithStatus.class, headers);
  }

  @Override
  public void delete(DeleteBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, WrappedBudgetWithStatus.class, headers);
  }

  @Override
  public BudgetList list() {
    String path = String.format("/api/2.0/accounts/%s/budget", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, BudgetList.class, headers);
  }

  @Override
  public void update(WrappedBudget request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, UpdateResponse.class, headers);
  }
}
