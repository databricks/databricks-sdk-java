// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Mapping from a column of the source object to a column of the target object. */
@Generated
public class ColumnRelationship {
  /** Name of the column in the source object. */
  @JsonProperty("source")
  private String source;

  /** Name of the column in the target object. */
  @JsonProperty("target")
  private String target;

  public ColumnRelationship setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ColumnRelationship setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnRelationship that = (ColumnRelationship) o;
    return Objects.equals(source, that.source) && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, target);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnRelationship.class)
        .add("source", source)
        .add("target", target)
        .toString();
  }
}
