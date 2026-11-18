// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class BudgetConfigurationFilterTagClause {
  /**
   * The custom tag key to match, exactly as it appears in your usage data. A key can appear in at
   * most one clause per operator.
   */
  @JsonProperty("key")
  private String key;

  /**
   * The tag values to match for `key`. Usage is included when its value for `key` is one of the
   * listed values.
   */
  @JsonProperty("value")
  private BudgetConfigurationFilterClause value;

  public BudgetConfigurationFilterTagClause setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public BudgetConfigurationFilterTagClause setValue(BudgetConfigurationFilterClause value) {
    this.value = value;
    return this;
  }

  public BudgetConfigurationFilterClause getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterTagClause that = (BudgetConfigurationFilterTagClause) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterTagClause.class)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
