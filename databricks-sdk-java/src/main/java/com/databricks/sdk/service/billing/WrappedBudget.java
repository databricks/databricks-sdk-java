// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrappedBudget {
  /** Budget configuration to be created. */
  @JsonProperty("budget")
  private Budget budget;

  /** Budget ID */
  private String budgetId;

  public WrappedBudget setBudget(Budget budget) {
    this.budget = budget;
    return this;
  }

  public Budget getBudget() {
    return budget;
  }

  public WrappedBudget setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  public String getBudgetId() {
    return budgetId;
  }
}
