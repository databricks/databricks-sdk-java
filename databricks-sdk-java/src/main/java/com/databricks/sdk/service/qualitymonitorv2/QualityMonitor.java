// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QualityMonitor {
  /** */
  @JsonProperty("anomaly_detection_config")
  private AnomalyDetectionConfig anomalyDetectionConfig;

  /** The uuid of the request object. For example, schema id. */
  @JsonProperty("object_id")
  private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  @JsonProperty("object_type")
  private String objectType;

  /** Validity check configurations for anomaly detection. */
  @JsonProperty("validity_check_configurations")
  private Collection<ValidityCheckConfiguration> validityCheckConfigurations;

  public QualityMonitor setAnomalyDetectionConfig(AnomalyDetectionConfig anomalyDetectionConfig) {
    this.anomalyDetectionConfig = anomalyDetectionConfig;
    return this;
  }

  public AnomalyDetectionConfig getAnomalyDetectionConfig() {
    return anomalyDetectionConfig;
  }

  public QualityMonitor setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public QualityMonitor setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public QualityMonitor setValidityCheckConfigurations(
      Collection<ValidityCheckConfiguration> validityCheckConfigurations) {
    this.validityCheckConfigurations = validityCheckConfigurations;
    return this;
  }

  public Collection<ValidityCheckConfiguration> getValidityCheckConfigurations() {
    return validityCheckConfigurations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QualityMonitor that = (QualityMonitor) o;
    return Objects.equals(anomalyDetectionConfig, that.anomalyDetectionConfig)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(validityCheckConfigurations, that.validityCheckConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyDetectionConfig, objectId, objectType, validityCheckConfigurations);
  }

  @Override
  public String toString() {
    return new ToStringer(QualityMonitor.class)
        .add("anomalyDetectionConfig", anomalyDetectionConfig)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("validityCheckConfigurations", validityCheckConfigurations)
        .toString();
  }
}
