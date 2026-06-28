// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A single field definition within a FlatSchema, specifying the field name and its scalar data
 * type. Does not support nested or complex types (arrays, maps, structs).
 */
@Generated
public class FieldDefinition {
  /** The scalar data type of the field. */
  @JsonProperty("data_type")
  private ScalarDataType dataType;

  /** The name of the field. */
  @JsonProperty("name")
  private String name;

  public FieldDefinition setDataType(ScalarDataType dataType) {
    this.dataType = dataType;
    return this;
  }

  public ScalarDataType getDataType() {
    return dataType;
  }

  public FieldDefinition setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FieldDefinition that = (FieldDefinition) o;
    return Objects.equals(dataType, that.dataType) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FieldDefinition.class)
        .add("dataType", dataType)
        .add("name", name)
        .toString();
  }
}
