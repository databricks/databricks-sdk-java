// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>BudgetWithStatusStatusDailyItem class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BudgetWithStatusStatusDailyItem {
  /** Amount used in this day in USD. */
  @JsonProperty("amount")
  private String amount;

  /** */
  @JsonProperty("date")
  private String date;

  /**
   * <p>Setter for the field <code>amount</code>.</p>
   *
   * @param amount a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.BudgetWithStatusStatusDailyItem} object
   */
  public BudgetWithStatusStatusDailyItem setAmount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * <p>Getter for the field <code>amount</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAmount() {
    return amount;
  }

  /**
   * <p>Setter for the field <code>date</code>.</p>
   *
   * @param date a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.BudgetWithStatusStatusDailyItem} object
   */
  public BudgetWithStatusStatusDailyItem setDate(String date) {
    this.date = date;
    return this;
  }

  /**
   * <p>Getter for the field <code>date</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDate() {
    return date;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetWithStatusStatusDailyItem that = (BudgetWithStatusStatusDailyItem) o;
    return Objects.equals(amount, that.amount) && Objects.equals(date, that.date);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(amount, date);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(BudgetWithStatusStatusDailyItem.class)
        .add("amount", amount)
        .add("date", date)
        .toString();
  }
}
