// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Monitor for the data quality of unity catalog entities such as schema or table. */
@Generated
public class Monitor {
  /** Anomaly Detection Configuration, applicable to `schema` object types. */
  @JsonProperty("anomaly_detection_config")
  private AnomalyDetectionConfig anomalyDetectionConfig;

  /** Data Profiling Configuration, applicable to `table` object types */
  @JsonProperty("data_profiling_config")
  private DataProfilingConfig dataProfilingConfig;

  /** The UUID of the request object. For example, schema id. */
  @JsonProperty("object_id")
  private String objectId;

  /** The type of the monitored object. Can be one of the following: `schema` or `table`. */
  @JsonProperty("object_type")
  private String objectType;

  public Monitor setAnomalyDetectionConfig(AnomalyDetectionConfig anomalyDetectionConfig) {
    this.anomalyDetectionConfig = anomalyDetectionConfig;
    return this;
  }

  public AnomalyDetectionConfig getAnomalyDetectionConfig() {
    return anomalyDetectionConfig;
  }

  public Monitor setDataProfilingConfig(DataProfilingConfig dataProfilingConfig) {
    this.dataProfilingConfig = dataProfilingConfig;
    return this;
  }

  public DataProfilingConfig getDataProfilingConfig() {
    return dataProfilingConfig;
  }

  public Monitor setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public Monitor setObjectType(String objectType) {
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
    Monitor that = (Monitor) o;
    return Objects.equals(anomalyDetectionConfig, that.anomalyDetectionConfig)
        && Objects.equals(dataProfilingConfig, that.dataProfilingConfig)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyDetectionConfig, dataProfilingConfig, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(Monitor.class)
        .add("anomalyDetectionConfig", anomalyDetectionConfig)
        .add("dataProfilingConfig", dataProfilingConfig)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
