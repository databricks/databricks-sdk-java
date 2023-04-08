// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/** Delete budget */
public class DeleteBudgetRequest {
  /** Budget ID */
  private String budgetId;

  public DeleteBudgetRequest setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  public String getBudgetId() {
    return budgetId;
  }
}
