// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents the table information in the lineage event. */
@Generated
public class ExternalLineageTableInfo {
  /** Name of Catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** Timestamp of the lineage event. */
  @JsonProperty("event_time")
  private String eventTime;

  /** Name of Table. */
  @JsonProperty("name")
  private String name;

  /** Name of Schema. */
  @JsonProperty("schema_name")
  private String schemaName;

  public ExternalLineageTableInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ExternalLineageTableInfo setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  public String getEventTime() {
    return eventTime;
  }

  public ExternalLineageTableInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalLineageTableInfo setSchemaName(String schemaName) {
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
    ExternalLineageTableInfo that = (ExternalLineageTableInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(eventTime, that.eventTime)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, eventTime, name, schemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageTableInfo.class)
        .add("catalogName", catalogName)
        .add("eventTime", eventTime)
        .add("name", name)
        .add("schemaName", schemaName)
        .toString();
  }
}
