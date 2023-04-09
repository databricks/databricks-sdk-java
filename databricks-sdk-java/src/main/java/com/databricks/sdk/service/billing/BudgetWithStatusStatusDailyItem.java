// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class BudgetWithStatusStatusDailyItem {
  /** Amount used in this day in USD. */
  @JsonProperty("amount")
  private String amount;

  /** */
  @JsonProperty("date")
  private String date;

  public BudgetWithStatusStatusDailyItem setAmount(String amount) {
    this.amount = amount;
    return this;
  }

  public String getAmount() {
    return amount;
  }

  public BudgetWithStatusStatusDailyItem setDate(String date) {
    this.date = date;
    return this;
  }

  public String getDate() {
    return date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetWithStatusStatusDailyItem that = (BudgetWithStatusStatusDailyItem) o;
    return Objects.equals(amount, that.amount) && Objects.equals(date, that.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetWithStatusStatusDailyItem.class)
        .add("amount", amount)
        .add("date", date)
        .toString();
  }
}
