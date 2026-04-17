// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A flat (non-nested) schema for request-time fields, defined as an ordered list of field
 * definitions. This schema only supports scalar types.
 */
@Generated
public class FlatSchema {
  /** The list of fields in this schema. */
  @JsonProperty("fields")
  private Collection<FieldDefinition> fields;

  public FlatSchema setFields(Collection<FieldDefinition> fields) {
    this.fields = fields;
    return this;
  }

  public Collection<FieldDefinition> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FlatSchema that = (FlatSchema) o;
    return Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    return new ToStringer(FlatSchema.class).add("fields", fields).toString();
  }
}
