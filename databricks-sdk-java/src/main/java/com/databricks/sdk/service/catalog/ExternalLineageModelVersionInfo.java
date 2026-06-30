// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents the model version information in the lineage event. */
@Generated
public class ExternalLineageModelVersionInfo {
  /** Timestamp of the lineage event. */
  @JsonProperty("event_time")
  private String eventTime;

  /** Name of the model. */
  @JsonProperty("model_name")
  private String modelName;

  /** Version number of the model. */
  @JsonProperty("version")
  private Long version;

  public ExternalLineageModelVersionInfo setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  public String getEventTime() {
    return eventTime;
  }

  public ExternalLineageModelVersionInfo setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ExternalLineageModelVersionInfo setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageModelVersionInfo that = (ExternalLineageModelVersionInfo) o;
    return Objects.equals(eventTime, that.eventTime)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, modelName, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageModelVersionInfo.class)
        .add("eventTime", eventTime)
        .add("modelName", modelName)
        .add("version", version)
        .toString();
  }
}
