// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QualityMonitorPb {
  @JsonProperty("anomaly_detection_config")
  private AnomalyDetectionConfig anomalyDetectionConfig;

  @JsonProperty("object_id")
  private String objectId;

  @JsonProperty("object_type")
  private String objectType;

  public QualityMonitorPb setAnomalyDetectionConfig(AnomalyDetectionConfig anomalyDetectionConfig) {
    this.anomalyDetectionConfig = anomalyDetectionConfig;
    return this;
  }

  public AnomalyDetectionConfig getAnomalyDetectionConfig() {
    return anomalyDetectionConfig;
  }

  public QualityMonitorPb setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public QualityMonitorPb setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QualityMonitorPb that = (QualityMonitorPb) o;
    return Objects.equals(anomalyDetectionConfig, that.anomalyDetectionConfig)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyDetectionConfig, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(QualityMonitorPb.class)
        .add("anomalyDetectionConfig", anomalyDetectionConfig)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
