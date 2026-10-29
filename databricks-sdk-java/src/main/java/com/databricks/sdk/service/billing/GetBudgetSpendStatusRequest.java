// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetBudgetSpendStatusRequest {
  /**
   * The resource name of the budget spend status to read, of the form
   * `accounts/{account_id}/budget-spend-statuses/{budget_id}`. A `budget_id` that isn't a valid
   * UUID fails with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore private String name;

  public GetBudgetSpendStatusRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBudgetSpendStatusRequest that = (GetBudgetSpendStatusRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetSpendStatusRequest.class).add("name", name).toString();
  }
}
