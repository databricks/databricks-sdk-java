// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get budget */
@Generated
class GetBudgetConfigurationRequestPb {
  @JsonIgnore private String budgetId;

  public GetBudgetConfigurationRequestPb setBudgetId(String budgetId) {
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
    GetBudgetConfigurationRequestPb that = (GetBudgetConfigurationRequestPb) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetConfigurationRequestPb.class)
        .add("budgetId", budgetId)
        .toString();
  }
}
