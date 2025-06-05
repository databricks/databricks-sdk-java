// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class RunNowPb {
  @JsonProperty("dbt_commands")
  private Collection<String> dbtCommands;

  @JsonProperty("idempotency_token")
  private String idempotencyToken;

  @JsonProperty("jar_params")
  private Collection<String> jarParams;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("job_parameters")
  private Map<String, String> jobParameters;

  @JsonProperty("notebook_params")
  private Map<String, String> notebookParams;

  @JsonProperty("only")
  private Collection<String> only;

  @JsonProperty("performance_target")
  private PerformanceTarget performanceTarget;

  @JsonProperty("pipeline_params")
  private PipelineParams pipelineParams;

  @JsonProperty("python_named_params")
  private Map<String, String> pythonNamedParams;

  @JsonProperty("python_params")
  private Collection<String> pythonParams;

  @JsonProperty("queue")
  private QueueSettings queue;

  @JsonProperty("spark_submit_params")
  private Collection<String> sparkSubmitParams;

  @JsonProperty("sql_params")
  private Map<String, String> sqlParams;

  public RunNowPb setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  public RunNowPb setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public RunNowPb setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public Collection<String> getJarParams() {
    return jarParams;
  }

  public RunNowPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public RunNowPb setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public RunNowPb setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  public RunNowPb setOnly(Collection<String> only) {
    this.only = only;
    return this;
  }

  public Collection<String> getOnly() {
    return only;
  }

  public RunNowPb setPerformanceTarget(PerformanceTarget performanceTarget) {
    this.performanceTarget = performanceTarget;
    return this;
  }

  public PerformanceTarget getPerformanceTarget() {
    return performanceTarget;
  }

  public RunNowPb setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  public RunNowPb setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  public RunNowPb setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  public RunNowPb setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public RunNowPb setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RunNowPb setSqlParams(Map<String, String> sqlParams) {
    this.sqlParams = sqlParams;
    return this;
  }

  public Map<String, String> getSqlParams() {
    return sqlParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunNowPb that = (RunNowPb) o;
    return Objects.equals(dbtCommands, that.dbtCommands)
        && Objects.equals(idempotencyToken, that.idempotencyToken)
        && Objects.equals(jarParams, that.jarParams)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(notebookParams, that.notebookParams)
        && Objects.equals(only, that.only)
        && Objects.equals(performanceTarget, that.performanceTarget)
        && Objects.equals(pipelineParams, that.pipelineParams)
        && Objects.equals(pythonNamedParams, that.pythonNamedParams)
        && Objects.equals(pythonParams, that.pythonParams)
        && Objects.equals(queue, that.queue)
        && Objects.equals(sparkSubmitParams, that.sparkSubmitParams)
        && Objects.equals(sqlParams, that.sqlParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbtCommands,
        idempotencyToken,
        jarParams,
        jobId,
        jobParameters,
        notebookParams,
        only,
        performanceTarget,
        pipelineParams,
        pythonNamedParams,
        pythonParams,
        queue,
        sparkSubmitParams,
        sqlParams);
  }

  @Override
  public String toString() {
    return new ToStringer(RunNowPb.class)
        .add("dbtCommands", dbtCommands)
        .add("idempotencyToken", idempotencyToken)
        .add("jarParams", jarParams)
        .add("jobId", jobId)
        .add("jobParameters", jobParameters)
        .add("notebookParams", notebookParams)
        .add("only", only)
        .add("performanceTarget", performanceTarget)
        .add("pipelineParams", pipelineParams)
        .add("pythonNamedParams", pythonNamedParams)
        .add("pythonParams", pythonParams)
        .add("queue", queue)
        .add("sparkSubmitParams", sparkSubmitParams)
        .add("sqlParams", sqlParams)
        .toString();
  }
}
