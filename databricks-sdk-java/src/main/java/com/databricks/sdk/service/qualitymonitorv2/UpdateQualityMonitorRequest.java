// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a quality monitor */
@Generated
public class UpdateQualityMonitorRequest {
  /** The uuid of the request object. For example, schema id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  @JsonIgnore private String objectType;

  /** */
  @JsonProperty("quality_monitor")
  private QualityMonitor qualityMonitor;

  public UpdateQualityMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public UpdateQualityMonitorRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public UpdateQualityMonitorRequest setQualityMonitor(QualityMonitor qualityMonitor) {
    this.qualityMonitor = qualityMonitor;
    return this;
  }

  public QualityMonitor getQualityMonitor() {
    return qualityMonitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateQualityMonitorRequest that = (UpdateQualityMonitorRequest) o;
    return Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(qualityMonitor, that.qualityMonitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, qualityMonitor);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateQualityMonitorRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("qualityMonitor", qualityMonitor)
        .toString();
  }
}
