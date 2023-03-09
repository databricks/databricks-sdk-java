// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage budget configuration including notifications for exceeding
 * a budget for a period. They can also retrieve the status of each budget.
 */
public class BudgetsAPI implements BudgetsService {
    private final ApiClient apiClient;

    public BudgetsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new budget.
     * 
     * Creates a new budget in the specified account.
     */
    @Override
    public WrappedBudgetWithStatus create(WrappedBudget request) {
        String path = String.format("/api/2.0/accounts//budget");
        return apiClient.POST(path, request, WrappedBudgetWithStatus.class);
    }
    
	/**
     * Delete budget.
     * 
     * Deletes the budget specified by its UUID.
     */
    @Override
    public void delete(DeleteBudgetRequest request) {
        String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get budget and its status.
     * 
     * Gets the budget specified by its UUID, including noncumulative status for
     * each day that the budget is configured to include.
     */
    @Override
    public WrappedBudgetWithStatus get(GetBudgetRequest request) {
        String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
        return apiClient.GET(path, request, WrappedBudgetWithStatus.class);
    }
    
	/**
     * Get all budgets.
     * 
     * Gets all budgets associated with this account, including noncumulative
     * status for each day that the budget is configured to include.
     */
    @Override
    public BudgetList list() {
        String path = String.format("/api/2.0/accounts//budget");
        return apiClient.GET(path, BudgetList.class);
    }
    
	/**
     * Modify budget.
     * 
     * Modifies a budget in this account. Budget properties are completely
     * overwritten.
     */
    @Override
    public void update(WrappedBudget request) {
        String path = String.format("/api/2.0/accounts//budget/%s", request.getBudgetId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}