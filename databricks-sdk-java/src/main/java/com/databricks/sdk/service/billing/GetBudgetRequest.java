// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

/** Get budget and its status */
public class GetBudgetRequest {
  /** Budget ID */
  private String budgetId;

  public GetBudgetRequest setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  public String getBudgetId() {
    return budgetId;
  }
}
