// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, WrappedBudgetWithStatus.class);
  }

  @Override
  public void delete(DeleteBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    return apiClient.GET(path, request, WrappedBudgetWithStatus.class, "application/json");
  }

  @Override
  public BudgetList list() {
    String path = String.format("/api/2.0/accounts/%s/budget", apiClient.configuredAccountID());
    return apiClient.GET(path, BudgetList.class, "application/json");
  }

  @Override
  public void update(WrappedBudget request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    apiClient.PATCH(path, request, Void.class);
  }
}
