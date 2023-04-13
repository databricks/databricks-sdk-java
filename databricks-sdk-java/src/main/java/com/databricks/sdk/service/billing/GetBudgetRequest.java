// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBudgetRequest that = (GetBudgetRequest) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetRequest.class).add("budgetId", budgetId).toString();
  }
}
