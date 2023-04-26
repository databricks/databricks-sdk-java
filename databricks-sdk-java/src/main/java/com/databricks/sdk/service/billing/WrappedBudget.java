// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>WrappedBudget class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class WrappedBudget {
  /** Budget configuration to be created. */
  @JsonProperty("budget")
  private Budget budget;

  /** Budget ID */
  private String budgetId;

  /**
   * <p>Setter for the field <code>budget</code>.</p>
   *
   * @param budget a {@link com.databricks.sdk.service.billing.Budget} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   */
  public WrappedBudget setBudget(Budget budget) {
    this.budget = budget;
    return this;
  }

  /**
   * <p>Getter for the field <code>budget</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.Budget} object
   */
  public Budget getBudget() {
    return budget;
  }

  /**
   * <p>Setter for the field <code>budgetId</code>.</p>
   *
   * @param budgetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   */
  public WrappedBudget setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  /**
   * <p>Getter for the field <code>budgetId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBudgetId() {
    return budgetId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedBudget that = (WrappedBudget) o;
    return Objects.equals(budget, that.budget) && Objects.equals(budgetId, that.budgetId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(WrappedBudget.class)
        .add("budget", budget)
        .add("budgetId", budgetId)
        .toString();
  }
}
