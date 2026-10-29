// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListBudgetSpendStatuses. */
@Generated
public class ListBudgetSpendStatusesResponse {
  /** The calling user's spend status, one entry per returned budget. */
  @JsonProperty("budget_spend_statuses")
  private Collection<BudgetSpendStatus> budgetSpendStatuses;

  /**
   * Token to pass as `page_token` to retrieve the next page. Absent when there are no more results.
   * A page can contain fewer results than `page_size`, or none, while this token is still set, so
   * keep paging until it's absent.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBudgetSpendStatusesResponse setBudgetSpendStatuses(
      Collection<BudgetSpendStatus> budgetSpendStatuses) {
    this.budgetSpendStatuses = budgetSpendStatuses;
    return this;
  }

  public Collection<BudgetSpendStatus> getBudgetSpendStatuses() {
    return budgetSpendStatuses;
  }

  public ListBudgetSpendStatusesResponse setNextPageToken(String nextPageToken) {
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
    ListBudgetSpendStatusesResponse that = (ListBudgetSpendStatusesResponse) o;
    return Objects.equals(budgetSpendStatuses, that.budgetSpendStatuses)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetSpendStatuses, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetSpendStatusesResponse.class)
        .add("budgetSpendStatuses", budgetSpendStatuses)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
