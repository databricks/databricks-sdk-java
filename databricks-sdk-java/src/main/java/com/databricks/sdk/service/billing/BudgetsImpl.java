// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Budgets */
class BudgetsImpl implements BudgetsService {
  private final ApiClient apiClient;

  public BudgetsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public WrappedBudgetWithStatus create(WrappedBudget request) {
    String path = String.format("/api/2.0/accounts//budget");
    return apiClient.POST(path, request, WrappedBudgetWithStatus.class);
  }

  @Override
  public void delete(DeleteBudgetRequest request) {
    String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
    return apiClient.GET(path, request, WrappedBudgetWithStatus.class);
  }

  @Override
  public BudgetList list() {
    String path = String.format("/api/2.0/accounts//budget");
    return apiClient.GET(path, BudgetList.class);
  }

  @Override
  public void update(WrappedBudget request) {
    String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
    apiClient.PATCH(path, request, Void.class);
  }
}
