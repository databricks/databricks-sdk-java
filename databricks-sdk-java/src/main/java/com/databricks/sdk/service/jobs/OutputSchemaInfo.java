// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Stores the catalog name, schema name, and the output schema expiration time for the clean room
 * run.
 */
@Generated
public class OutputSchemaInfo {
  /** */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The expiration time for the output schema as a Unix timestamp in milliseconds. */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /** */
  @JsonProperty("schema_name")
  private String schemaName;

  public OutputSchemaInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public OutputSchemaInfo setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public OutputSchemaInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OutputSchemaInfo that = (OutputSchemaInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, expirationTime, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(OutputSchemaInfo.class)
        .add("catalogName", catalogName)
        .add("expirationTime", expirationTime)
        .add("schemaName", schemaName)
        .toString();
  }
}
