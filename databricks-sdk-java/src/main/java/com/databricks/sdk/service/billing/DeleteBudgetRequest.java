// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete budget
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteBudgetRequest {
  /** Budget ID */
  private String budgetId;

  /**
   * <p>Setter for the field <code>budgetId</code>.</p>
   *
   * @param budgetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.DeleteBudgetRequest} object
   */
  public DeleteBudgetRequest setBudgetId(String budgetId) {
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
    DeleteBudgetRequest that = (DeleteBudgetRequest) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteBudgetRequest.class).add("budgetId", budgetId).toString();
  }
}
