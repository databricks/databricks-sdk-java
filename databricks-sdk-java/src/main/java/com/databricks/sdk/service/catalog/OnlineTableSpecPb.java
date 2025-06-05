// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specification of an online table. */
@Generated
class OnlineTableSpecPb {
  @JsonProperty("perform_full_copy")
  private Boolean performFullCopy;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("primary_key_columns")
  private Collection<String> primaryKeyColumns;

  @JsonProperty("run_continuously")
  private OnlineTableSpecContinuousSchedulingPolicy runContinuously;

  @JsonProperty("run_triggered")
  private OnlineTableSpecTriggeredSchedulingPolicy runTriggered;

  @JsonProperty("source_table_full_name")
  private String sourceTableFullName;

  @JsonProperty("timeseries_key")
  private String timeseriesKey;

  public OnlineTableSpecPb setPerformFullCopy(Boolean performFullCopy) {
    this.performFullCopy = performFullCopy;
    return this;
  }

  public Boolean getPerformFullCopy() {
    return performFullCopy;
  }

  public OnlineTableSpecPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public OnlineTableSpecPb setPrimaryKeyColumns(Collection<String> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
    return this;
  }

  public Collection<String> getPrimaryKeyColumns() {
    return primaryKeyColumns;
  }

  public OnlineTableSpecPb setRunContinuously(
      OnlineTableSpecContinuousSchedulingPolicy runContinuously) {
    this.runContinuously = runContinuously;
    return this;
  }

  public OnlineTableSpecContinuousSchedulingPolicy getRunContinuously() {
    return runContinuously;
  }

  public OnlineTableSpecPb setRunTriggered(OnlineTableSpecTriggeredSchedulingPolicy runTriggered) {
    this.runTriggered = runTriggered;
    return this;
  }

  public OnlineTableSpecTriggeredSchedulingPolicy getRunTriggered() {
    return runTriggered;
  }

  public OnlineTableSpecPb setSourceTableFullName(String sourceTableFullName) {
    this.sourceTableFullName = sourceTableFullName;
    return this;
  }

  public String getSourceTableFullName() {
    return sourceTableFullName;
  }

  public OnlineTableSpecPb setTimeseriesKey(String timeseriesKey) {
    this.timeseriesKey = timeseriesKey;
    return this;
  }

  public String getTimeseriesKey() {
    return timeseriesKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineTableSpecPb that = (OnlineTableSpecPb) o;
    return Objects.equals(performFullCopy, that.performFullCopy)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(runContinuously, that.runContinuously)
        && Objects.equals(runTriggered, that.runTriggered)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        performFullCopy,
        pipelineId,
        primaryKeyColumns,
        runContinuously,
        runTriggered,
        sourceTableFullName,
        timeseriesKey);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineTableSpecPb.class)
        .add("performFullCopy", performFullCopy)
        .add("pipelineId", pipelineId)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("runContinuously", runContinuously)
        .add("runTriggered", runTriggered)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .toString();
  }
}
