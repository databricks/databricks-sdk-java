// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class BudgetConfigurationFilterClausePb {
  @JsonProperty("operator")
  private BudgetConfigurationFilterOperator operator;

  @JsonProperty("values")
  private Collection<String> values;

  public BudgetConfigurationFilterClausePb setOperator(BudgetConfigurationFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  public BudgetConfigurationFilterOperator getOperator() {
    return operator;
  }

  public BudgetConfigurationFilterClausePb setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterClausePb that = (BudgetConfigurationFilterClausePb) o;
    return Objects.equals(operator, that.operator) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterClausePb.class)
        .add("operator", operator)
        .add("values", values)
        .toString();
  }
}
