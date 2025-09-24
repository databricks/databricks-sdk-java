// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Anomaly Detection Configurations. */
@Generated
public class AnomalyDetectionConfig {
  /**
   * The id of the workflow that detects the anomaly. This field will only be returned in the
   * Get/Update response, if the request comes from the workspace where this anomaly detection job
   * is created.
   */
  @JsonProperty("anomaly_detection_workflow_id")
  private Long anomalyDetectionWorkflowId;

  /** The type of the last run of the workflow. */
  @JsonProperty("job_type")
  private AnomalyDetectionJobType jobType;

  /** If the health indicator should be shown. */
  @JsonProperty("publish_health_indicator")
  private Boolean publishHealthIndicator;

  public AnomalyDetectionConfig setAnomalyDetectionWorkflowId(Long anomalyDetectionWorkflowId) {
    this.anomalyDetectionWorkflowId = anomalyDetectionWorkflowId;
    return this;
  }

  public Long getAnomalyDetectionWorkflowId() {
    return anomalyDetectionWorkflowId;
  }

  public AnomalyDetectionConfig setJobType(AnomalyDetectionJobType jobType) {
    this.jobType = jobType;
    return this;
  }

  public AnomalyDetectionJobType getJobType() {
    return jobType;
  }

  public AnomalyDetectionConfig setPublishHealthIndicator(Boolean publishHealthIndicator) {
    this.publishHealthIndicator = publishHealthIndicator;
    return this;
  }

  public Boolean getPublishHealthIndicator() {
    return publishHealthIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnomalyDetectionConfig that = (AnomalyDetectionConfig) o;
    return Objects.equals(anomalyDetectionWorkflowId, that.anomalyDetectionWorkflowId)
        && Objects.equals(jobType, that.jobType)
        && Objects.equals(publishHealthIndicator, that.publishHealthIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyDetectionWorkflowId, jobType, publishHealthIndicator);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfig.class)
        .add("anomalyDetectionWorkflowId", anomalyDetectionWorkflowId)
        .add("jobType", jobType)
        .add("publishHealthIndicator", publishHealthIndicator)
        .toString();
  }
}
