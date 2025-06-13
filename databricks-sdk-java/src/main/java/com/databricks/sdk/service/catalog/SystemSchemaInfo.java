// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SystemSchemaInfo {
  /** Name of the system schema. */
  @JsonProperty("schema")
  private String schema;

  /**
   * The current state of enablement for the system schema. An empty string means the system schema
   * is available and ready for opt-in. Possible values: AVAILABLE | ENABLE_INITIALIZED |
   * ENABLE_COMPLETED | DISABLE_INITIALIZED | UNAVAILABLE | MANAGED
   */
  @JsonProperty("state")
  private String state;

  public SystemSchemaInfo setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public SystemSchemaInfo setState(String state) {
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
    SystemSchemaInfo that = (SystemSchemaInfo) o;
    return Objects.equals(schema, that.schema) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, state);
  }

  @Override
  public String toString() {
    return new ToStringer(SystemSchemaInfo.class)
        .add("schema", schema)
        .add("state", state)
        .toString();
  }
}
