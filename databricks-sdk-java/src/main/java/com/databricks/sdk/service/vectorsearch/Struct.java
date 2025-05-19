// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Struct {
  /** Data entry, corresponding to a row in a vector index. */
  @JsonProperty("fields")
  private Collection<MapStringValueEntry> fields;

  public Struct setFields(Collection<MapStringValueEntry> fields) {
    this.fields = fields;
    return this;
  }

  public Collection<MapStringValueEntry> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Struct that = (Struct) o;
    return Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    return new ToStringer(Struct.class).add("fields", fields).toString();
  }
}
