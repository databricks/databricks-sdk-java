// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WrappedBudgetWithStatus {
  /** Budget configuration with daily status. */
  @JsonProperty("budget")
  private BudgetWithStatus budget;

  public WrappedBudgetWithStatus setBudget(BudgetWithStatus budget) {
    this.budget = budget;
    return this;
  }

  public BudgetWithStatus getBudget() {
    return budget;
  }
}
