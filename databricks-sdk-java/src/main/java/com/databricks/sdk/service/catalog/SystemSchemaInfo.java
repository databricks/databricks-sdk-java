// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A system schema of a metastore, with its current enablement state. System schemas hold
 * Databricks-provided system tables, such as audit logs and billing usage. They live in the
 * `system` catalog unless they are enabled in another supported catalog. See
 * https://docs.databricks.com/aws/en/admin/system-tables/.
 */
@Generated
public class SystemSchemaInfo {
  /** Name of the system schema, without the catalog prefix. */
  @JsonProperty("schema")
  private String schema;

  /**
   * The current enablement state of the system schema. Possible values are `AVAILABLE` (the schema
   * can be enabled), `ENABLE_INITIALIZED` (enablement is in progress), `ENABLE_COMPLETED` (the
   * schema is enabled), `DISABLE_INITIALIZED` (disablement is in progress), `UNAVAILABLE` (the
   * schema cannot be enabled at the moment) and `MANAGED` (Databricks enables the schema
   * automatically).
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
