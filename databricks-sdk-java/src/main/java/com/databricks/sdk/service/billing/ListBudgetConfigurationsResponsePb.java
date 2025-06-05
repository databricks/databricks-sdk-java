// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListBudgetConfigurationsResponsePb {
  @JsonProperty("budgets")
  private Collection<BudgetConfiguration> budgets;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBudgetConfigurationsResponsePb setBudgets(Collection<BudgetConfiguration> budgets) {
    this.budgets = budgets;
    return this;
  }

  public Collection<BudgetConfiguration> getBudgets() {
    return budgets;
  }

  public ListBudgetConfigurationsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBudgetConfigurationsResponsePb that = (ListBudgetConfigurationsResponsePb) o;
    return Objects.equals(budgets, that.budgets)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetConfigurationsResponsePb.class)
        .add("budgets", budgets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
