// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The default value of a SQL parameter: a list of values or a range. */
@Generated
public class GenieAgentSqlParameterDefaultValue {
  /** The default range. */
  @JsonProperty("value_range")
  private GenieAgentSqlParameterDefaultRange valueRange;

  /** The default values. A single default is a one-element list. */
  @JsonProperty("values")
  private Collection<String> values;

  public GenieAgentSqlParameterDefaultValue setValueRange(
      GenieAgentSqlParameterDefaultRange valueRange) {
    this.valueRange = valueRange;
    return this;
  }

  public GenieAgentSqlParameterDefaultRange getValueRange() {
    return valueRange;
  }

  public GenieAgentSqlParameterDefaultValue setValues(Collection<String> values) {
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
    GenieAgentSqlParameterDefaultValue that = (GenieAgentSqlParameterDefaultValue) o;
    return Objects.equals(valueRange, that.valueRange) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueRange, values);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlParameterDefaultValue.class)
        .add("valueRange", valueRange)
        .add("values", values)
        .toString();
  }
}
