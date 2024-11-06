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
  public CreateBudgetConfigurationResponse create(CreateBudgetConfigurationRequest request) {
    String path = String.format("/api/2.1/accounts/%s/budgets", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateBudgetConfigurationResponse.class, headers);
  }

  @Override
  public void delete(DeleteBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteBudgetConfigurationResponse.class, headers);
  }

  @Override
  public GetBudgetConfigurationResponse get(GetBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetBudgetConfigurationResponse.class, headers);
  }

  @Override
  public ListBudgetConfigurationsResponse list(ListBudgetConfigurationsRequest request) {
    String path = String.format("/api/2.1/accounts/%s/budgets", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListBudgetConfigurationsResponse.class, headers);
  }

  @Override
  public UpdateBudgetConfigurationResponse update(UpdateBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, UpdateBudgetConfigurationResponse.class, headers);
  }
}
