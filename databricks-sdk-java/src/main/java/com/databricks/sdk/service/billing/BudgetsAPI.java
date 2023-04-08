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
public class BudgetsAPI {
    private final BudgetsService impl;

    /** Regular-use constructor */
    public BudgetsAPI(ApiClient apiClient) {
        impl = new BudgetsImpl(apiClient);
    }

    /** Constructor for mocks */
    public BudgetsAPI(BudgetsService mock) {
        impl = mock;
    }
	
	/**
     * Create a new budget.
     * 
     * Creates a new budget in the specified account.
     */
    public WrappedBudgetWithStatus create(WrappedBudget request) {
        return impl.create(request);
    }
    
	/**
     * Delete budget.
     * 
     * Deletes the budget specified by its UUID.
     */
    public void delete(DeleteBudgetRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get budget and its status.
     * 
     * Gets the budget specified by its UUID, including noncumulative status for
     * each day that the budget is configured to include.
     */
    public WrappedBudgetWithStatus get(GetBudgetRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get all budgets.
     * 
     * Gets all budgets associated with this account, including noncumulative
     * status for each day that the budget is configured to include.
     */
    public BudgetList list() {
        return impl.list();
    }
    
	/**
     * Modify budget.
     * 
     * Modifies a budget in this account. Budget properties are completely
     * overwritten.
     */
    public void update(WrappedBudget request) {
        impl.update(request);
    }
    
    public BudgetsService impl() {
        return impl;
    }
}