// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListBudgetConfigurationsResponse {
  /** */
  @JsonProperty("budgets")
  private Collection<BudgetConfiguration> budgets;

  /**
   * Token which can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no subsequent budgets.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBudgetConfigurationsResponse setBudgets(Collection<BudgetConfiguration> budgets) {
    this.budgets = budgets;
    return this;
  }

  public Collection<BudgetConfiguration> getBudgets() {
    return budgets;
  }

  public ListBudgetConfigurationsResponse setNextPageToken(String nextPageToken) {
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
    ListBudgetConfigurationsResponse that = (ListBudgetConfigurationsResponse) o;
    return Objects.equals(budgets, that.budgets)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgets, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetConfigurationsResponse.class)
        .add("budgets", budgets)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
