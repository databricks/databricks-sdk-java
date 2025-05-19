// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListValue {
  /** Repeated field of dynamically typed values. */
  @JsonProperty("values")
  private Collection<Value> values;

  public ListValue setValues(Collection<Value> values) {
    this.values = values;
    return this;
  }

  public Collection<Value> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListValue that = (ListValue) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(ListValue.class).add("values", values).toString();
  }
}
