// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The calling user's live spend against the blocking thresholds of a single budget. */
@Generated
public class BudgetSpendStatus {
  /**
   * The calling user's spend against each blocking threshold on this budget, one entry per scope
   * type and time period. A blocking threshold is a threshold that, once reached, blocks further
   * requests through Unity Gateway.
   */
  @JsonProperty("alert_spend_statuses")
  private Collection<AlertSpendStatus> alertSpendStatuses;

  /**
   * The resource name of this budget spend status, of the form
   * `accounts/{account_id}/budget-spend-statuses/{budget_id}`.
   */
  @JsonProperty("name")
  private String name;

  public BudgetSpendStatus setAlertSpendStatuses(Collection<AlertSpendStatus> alertSpendStatuses) {
    this.alertSpendStatuses = alertSpendStatuses;
    return this;
  }

  public Collection<AlertSpendStatus> getAlertSpendStatuses() {
    return alertSpendStatuses;
  }

  public BudgetSpendStatus setName(String name) {
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
    BudgetSpendStatus that = (BudgetSpendStatus) o;
    return Objects.equals(alertSpendStatuses, that.alertSpendStatuses)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertSpendStatuses, name);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetSpendStatus.class)
        .add("alertSpendStatuses", alertSpendStatuses)
        .add("name", name)
        .toString();
  }
}
