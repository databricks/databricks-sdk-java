// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SystemSchemaInfoPb {
  @JsonProperty("schema")
  private String schema;

  @JsonProperty("state")
  private String state;

  public SystemSchemaInfoPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public SystemSchemaInfoPb setState(String state) {
    this.state = state;
    return this;
  }

  public String getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SystemSchemaInfoPb that = (SystemSchemaInfoPb) o;
    return Objects.equals(schema, that.schema) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, state);
  }

  @Override
  public String toString() {
    return new ToStringer(SystemSchemaInfoPb.class)
        .add("schema", schema)
        .add("state", state)
        .toString();
  }
}
