// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Additional details about what triggered the run */
@Generated
public class TriggerInfo {
  /**
   * Additional details for job runs triggered by a job completion trigger (trigger:
   * "JOB_COMPLETION")
   */
  @JsonProperty("job_completion")
  private JobCompletionTriggerRunInfoDetails jobCompletion;

  /** The run id of the Run Job task run */
  @JsonProperty("run_id")
  private Long runId;

  /** SQL condition evaluation details for this run */
  @JsonProperty("sql_condition")
  private SqlConditionRunInfoDetails sqlCondition;

  public TriggerInfo setJobCompletion(JobCompletionTriggerRunInfoDetails jobCompletion) {
    this.jobCompletion = jobCompletion;
    return this;
  }

  public JobCompletionTriggerRunInfoDetails getJobCompletion() {
    return jobCompletion;
  }

  public TriggerInfo setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public TriggerInfo setSqlCondition(SqlConditionRunInfoDetails sqlCondition) {
    this.sqlCondition = sqlCondition;
    return this;
  }

  public SqlConditionRunInfoDetails getSqlCondition() {
    return sqlCondition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerInfo that = (TriggerInfo) o;
    return Objects.equals(jobCompletion, that.jobCompletion)
        && Objects.equals(runId, that.runId)
        && Objects.equals(sqlCondition, that.sqlCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobCompletion, runId, sqlCondition);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerInfo.class)
        .add("jobCompletion", jobCompletion)
        .add("runId", runId)
        .add("sqlCondition", sqlCondition)
        .toString();
  }
}
