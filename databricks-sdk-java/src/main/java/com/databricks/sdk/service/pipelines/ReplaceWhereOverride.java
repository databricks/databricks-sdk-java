// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Specifies a replace_where predicate override for a replace where flow. */
@Generated
public class ReplaceWhereOverride {
  /** Name of the flow to apply this override to. */
  @JsonProperty("flow_name")
  private String flowName;

  /**
   * SQL predicate string to use as replace_where condition. Example: `date = '2024-10-10' AND city
   * = 'xyz'`
   */
  @JsonProperty("predicate_override")
  private String predicateOverride;

  public ReplaceWhereOverride setFlowName(String flowName) {
    this.flowName = flowName;
    return this;
  }

  public String getFlowName() {
    return flowName;
  }

  public ReplaceWhereOverride setPredicateOverride(String predicateOverride) {
    this.predicateOverride = predicateOverride;
    return this;
  }

  public String getPredicateOverride() {
    return predicateOverride;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReplaceWhereOverride that = (ReplaceWhereOverride) o;
    return Objects.equals(flowName, that.flowName)
        && Objects.equals(predicateOverride, that.predicateOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowName, predicateOverride);
  }

  @Override
  public String toString() {
    return new ToStringer(ReplaceWhereOverride.class)
        .add("flowName", flowName)
        .add("predicateOverride", predicateOverride)
        .toString();
  }
}
