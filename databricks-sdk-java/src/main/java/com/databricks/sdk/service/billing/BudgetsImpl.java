// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateBudgetConfigurationResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
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
  public GetBudgetConfigurationResponse get(GetBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetBudgetConfigurationResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListBudgetConfigurationsResponse list(ListBudgetConfigurationsRequest request) {
    String path = String.format("/api/2.1/accounts/%s/budgets", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListBudgetConfigurationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateBudgetConfigurationResponse update(UpdateBudgetConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.1/accounts/%s/budgets/%s",
            apiClient.configuredAccountID(), request.getBudgetId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateBudgetConfigurationResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
