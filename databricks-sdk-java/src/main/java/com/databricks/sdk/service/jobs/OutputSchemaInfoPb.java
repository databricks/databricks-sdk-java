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
class OutputSchemaInfoPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("expiration_time")
  private Long expirationTime;

  @JsonProperty("schema_name")
  private String schemaName;

  public OutputSchemaInfoPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public OutputSchemaInfoPb setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public OutputSchemaInfoPb setSchemaName(String schemaName) {
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
    OutputSchemaInfoPb that = (OutputSchemaInfoPb) o;
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
    return new ToStringer(OutputSchemaInfoPb.class)
        .add("catalogName", catalogName)
        .add("expirationTime", expirationTime)
        .add("schemaName", schemaName)
        .toString();
  }
}
