// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A range of default values for a SQL parameter. */
@Generated
public class GenieAgentSqlParameterDefaultRange {
  /** The upper end of the range. */
  @JsonProperty("max")
  private String max;

  /** The lower end of the range. */
  @JsonProperty("min")
  private String min;

  public GenieAgentSqlParameterDefaultRange setMax(String max) {
    this.max = max;
    return this;
  }

  public String getMax() {
    return max;
  }

  public GenieAgentSqlParameterDefaultRange setMin(String min) {
    this.min = min;
    return this;
  }

  public String getMin() {
    return min;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentSqlParameterDefaultRange that = (GenieAgentSqlParameterDefaultRange) o;
    return Objects.equals(max, that.max) && Objects.equals(min, that.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentSqlParameterDefaultRange.class)
        .add("max", max)
        .add("min", min)
        .toString();
  }
}
