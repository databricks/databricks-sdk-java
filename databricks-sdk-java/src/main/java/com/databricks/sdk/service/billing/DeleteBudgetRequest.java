// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete budget */
@Generated
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteBudgetRequest that = (DeleteBudgetRequest) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteBudgetRequest.class).add("budgetId", budgetId).toString();
  }
}
