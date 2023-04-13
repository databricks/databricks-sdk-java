// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedBudget that = (WrappedBudget) o;
    return Objects.equals(budget, that.budget) && Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedBudget.class)
        .add("budget", budget)
        .add("budgetId", budgetId)
        .toString();
  }
}
