// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents the path information in the lineage event. */
@Generated
public class ExternalLineageFileInfo {
  /** Timestamp of the lineage event. */
  @JsonProperty("event_time")
  private String eventTime;

  /** URL of the path. */
  @JsonProperty("path")
  private String path;

  /** The full name of the securable on the path. */
  @JsonProperty("securable_name")
  private String securableName;

  /** The securable type of the securable on the path. */
  @JsonProperty("securable_type")
  private String securableType;

  /** The storage location associated with securable on the path. */
  @JsonProperty("storage_location")
  private String storageLocation;

  public ExternalLineageFileInfo setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  public String getEventTime() {
    return eventTime;
  }

  public ExternalLineageFileInfo setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ExternalLineageFileInfo setSecurableName(String securableName) {
    this.securableName = securableName;
    return this;
  }

  public String getSecurableName() {
    return securableName;
  }

  public ExternalLineageFileInfo setSecurableType(String securableType) {
    this.securableType = securableType;
    return this;
  }

  public String getSecurableType() {
    return securableType;
  }

  public ExternalLineageFileInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageFileInfo that = (ExternalLineageFileInfo) o;
    return Objects.equals(eventTime, that.eventTime)
        && Objects.equals(path, that.path)
        && Objects.equals(securableName, that.securableName)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(storageLocation, that.storageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, path, securableName, securableType, storageLocation);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageFileInfo.class)
        .add("eventTime", eventTime)
        .add("path", path)
        .add("securableName", securableName)
        .add("securableType", securableType)
        .add("storageLocation", storageLocation)
        .toString();
  }
}
