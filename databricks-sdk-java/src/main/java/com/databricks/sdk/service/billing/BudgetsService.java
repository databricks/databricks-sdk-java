// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage budget configuration including notifications for exceeding
 * a budget for a period. They can also retrieve the status of each budget.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BudgetsService {
	/**
   * Create a new budget.
   * 
   * Creates a new budget in the specified account.
   */
  WrappedBudgetWithStatus create(WrappedBudget wrappedBudget);
  
	/**
   * Delete budget.
   * 
   * Deletes the budget specified by its UUID.
   */
  void delete(DeleteBudgetRequest deleteBudgetRequest);
  
	/**
   * Get budget and its status.
   * 
   * Gets the budget specified by its UUID, including noncumulative status for
   * each day that the budget is configured to include.
   */
  WrappedBudgetWithStatus get(GetBudgetRequest getBudgetRequest);
  
	/**
   * Get all budgets.
   * 
   * Gets all budgets associated with this account, including noncumulative
   * status for each day that the budget is configured to include.
   */
  BudgetList list();
  
	/**
   * Modify budget.
   * 
   * Modifies a budget in this account. Budget properties are completely
   * overwritten.
   */
  void update(WrappedBudget wrappedBudget);
  
}