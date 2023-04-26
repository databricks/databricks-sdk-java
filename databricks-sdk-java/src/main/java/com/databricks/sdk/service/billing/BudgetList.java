// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * List of budgets.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BudgetList {
  /** */
  @JsonProperty("budgets")
  private Collection<BudgetWithStatus> budgets;

  /**
   * <p>Setter for the field <code>budgets</code>.</p>
   *
   * @param budgets a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.billing.BudgetList} object
   */
  public BudgetList setBudgets(Collection<BudgetWithStatus> budgets) {
    this.budgets = budgets;
    return this;
  }

  /**
   * <p>Getter for the field <code>budgets</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<BudgetWithStatus> getBudgets() {
    return budgets;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetList that = (BudgetList) o;
    return Objects.equals(budgets, that.budgets);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(budgets);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(BudgetList.class).add("budgets", budgets).toString();
  }
}
