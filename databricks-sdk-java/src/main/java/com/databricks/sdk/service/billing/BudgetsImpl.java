// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Budgets */
class BudgetsImpl implements BudgetsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for BudgetsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public BudgetsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public WrappedBudgetWithStatus create(WrappedBudget request) {
    String path = String.format("/api/2.0/accounts/%s/budget", apiClient.configuredAccountID());
    return apiClient.POST(path, request, WrappedBudgetWithStatus.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    return apiClient.GET(path, request, WrappedBudgetWithStatus.class);
  }

  /** {@inheritDoc} */
  @Override
  public BudgetList list() {
    String path = String.format("/api/2.0/accounts/%s/budget", apiClient.configuredAccountID());
    return apiClient.GET(path, BudgetList.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(WrappedBudget request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/budget/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    apiClient.PATCH(path, request, Void.class);
  }
}
