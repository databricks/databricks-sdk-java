// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BudgetConfigurationFilterWorkspaceIdClause {
  /** */
  @JsonProperty("operator")
  private BudgetConfigurationFilterOperator operator;

  /** */
  @JsonProperty("values")
  private Collection<Long> values;

  public BudgetConfigurationFilterWorkspaceIdClause setOperator(
      BudgetConfigurationFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  public BudgetConfigurationFilterOperator getOperator() {
    return operator;
  }

  public BudgetConfigurationFilterWorkspaceIdClause setValues(Collection<Long> values) {
    this.values = values;
    return this;
  }

  public Collection<Long> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterWorkspaceIdClause that =
        (BudgetConfigurationFilterWorkspaceIdClause) o;
    return Objects.equals(operator, that.operator) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterWorkspaceIdClause.class)
        .add("operator", operator)
        .add("values", values)
        .toString();
  }
}
