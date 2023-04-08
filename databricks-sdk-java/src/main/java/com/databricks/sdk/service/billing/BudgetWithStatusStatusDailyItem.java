// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
