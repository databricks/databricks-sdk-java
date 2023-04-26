// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WrappedBudgetWithStatus class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WrappedBudgetWithStatus {
  /** Budget configuration with daily status. */
  @JsonProperty("budget")
  private BudgetWithStatus budget;

  /**
   * <p>Setter for the field <code>budget</code>.</p>
   *
   * @param budget a {@link com.databricks.sdk.service.billing.BudgetWithStatus} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  public WrappedBudgetWithStatus setBudget(BudgetWithStatus budget) {
    this.budget = budget;
    return this;
  }

  /**
   * <p>Getter for the field <code>budget</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.BudgetWithStatus} object
   */
  public BudgetWithStatus getBudget() {
    return budget;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedBudgetWithStatus that = (WrappedBudgetWithStatus) o;
    return Objects.equals(budget, that.budget);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WrappedBudgetWithStatus.class).add("budget", budget).toString();
  }
}
