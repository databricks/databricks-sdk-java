// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateBudgetConfigurationRequestPb {
  @JsonProperty("budget")
  private UpdateBudgetConfigurationBudget budget;

  @JsonIgnore private String budgetId;

  public UpdateBudgetConfigurationRequestPb setBudget(UpdateBudgetConfigurationBudget budget) {
    this.budget = budget;
    return this;
  }

  public UpdateBudgetConfigurationBudget getBudget() {
    return budget;
  }

  public UpdateBudgetConfigurationRequestPb setBudgetId(String budgetId) {
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
    UpdateBudgetConfigurationRequestPb that = (UpdateBudgetConfigurationRequestPb) o;
    return Objects.equals(budget, that.budget) && Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBudgetConfigurationRequestPb.class)
        .add("budget", budget)
        .add("budgetId", budgetId)
        .toString();
  }
}
