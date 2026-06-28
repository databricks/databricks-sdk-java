// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateBudgetConfigurationRequest {
  /** Properties of the new budget configuration. */
  @JsonProperty("budget")
  private CreateBudgetConfigurationBudget budget;

  public CreateBudgetConfigurationRequest setBudget(CreateBudgetConfigurationBudget budget) {
    this.budget = budget;
    return this;
  }

  public CreateBudgetConfigurationBudget getBudget() {
    return budget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetConfigurationRequest that = (CreateBudgetConfigurationRequest) o;
    return Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationRequest.class).add("budget", budget).toString();
  }
}
