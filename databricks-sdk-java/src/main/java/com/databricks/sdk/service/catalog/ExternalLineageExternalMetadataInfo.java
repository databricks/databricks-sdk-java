// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents the external metadata object in the lineage event. */
@Generated
public class ExternalLineageExternalMetadataInfo {
  /** Type of entity represented by the external metadata object. */
  @JsonProperty("entity_type")
  private String entityType;

  /** Timestamp of the lineage event. */
  @JsonProperty("event_time")
  private String eventTime;

  /** Name of the external metadata object. */
  @JsonProperty("name")
  private String name;

  /** Type of external system. */
  @JsonProperty("system_type")
  private SystemType systemType;

  public ExternalLineageExternalMetadataInfo setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public ExternalLineageExternalMetadataInfo setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  public String getEventTime() {
    return eventTime;
  }

  public ExternalLineageExternalMetadataInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalLineageExternalMetadataInfo setSystemType(SystemType systemType) {
    this.systemType = systemType;
    return this;
  }

  public SystemType getSystemType() {
    return systemType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageExternalMetadataInfo that = (ExternalLineageExternalMetadataInfo) o;
    return Objects.equals(entityType, that.entityType)
        && Objects.equals(eventTime, that.eventTime)
        && Objects.equals(name, that.name)
        && Objects.equals(systemType, that.systemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, eventTime, name, systemType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageExternalMetadataInfo.class)
        .add("entityType", entityType)
        .add("eventTime", eventTime)
        .add("name", name)
        .add("systemType", systemType)
        .toString();
  }
}
