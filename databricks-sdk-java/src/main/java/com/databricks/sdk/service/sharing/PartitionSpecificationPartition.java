// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PartitionSpecificationPartition {
  /** An array of partition values. */
  @JsonProperty("values")
  private Collection<PartitionValue> values;

  public PartitionSpecificationPartition setValues(Collection<PartitionValue> values) {
    this.values = values;
    return this;
  }

  public Collection<PartitionValue> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartitionSpecificationPartition that = (PartitionSpecificationPartition) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(PartitionSpecificationPartition.class).add("values", values).toString();
  }
}
