// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** List of budgets. */
@Generated
public class BudgetList {
  /** */
  @JsonProperty("budgets")
  private Collection<BudgetWithStatus> budgets;

  public BudgetList setBudgets(Collection<BudgetWithStatus> budgets) {
    this.budgets = budgets;
    return this;
  }

  public Collection<BudgetWithStatus> getBudgets() {
    return budgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetList that = (BudgetList) o;
    return Objects.equals(budgets, that.budgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgets);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetList.class).add("budgets", budgets).toString();
  }
}
