// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class RepairRunPb {
  @JsonProperty("dbt_commands")
  private Collection<String> dbtCommands;

  @JsonProperty("jar_params")
  private Collection<String> jarParams;

  @JsonProperty("job_parameters")
  private Map<String, String> jobParameters;

  @JsonProperty("latest_repair_id")
  private Long latestRepairId;

  @JsonProperty("notebook_params")
  private Map<String, String> notebookParams;

  @JsonProperty("performance_target")
  private PerformanceTarget performanceTarget;

  @JsonProperty("pipeline_params")
  private PipelineParams pipelineParams;

  @JsonProperty("python_named_params")
  private Map<String, String> pythonNamedParams;

  @JsonProperty("python_params")
  private Collection<String> pythonParams;

  @JsonProperty("rerun_all_failed_tasks")
  private Boolean rerunAllFailedTasks;

  @JsonProperty("rerun_dependent_tasks")
  private Boolean rerunDependentTasks;

  @JsonProperty("rerun_tasks")
  private Collection<String> rerunTasks;

  @JsonProperty("run_id")
  private Long runId;

  @JsonProperty("spark_submit_params")
  private Collection<String> sparkSubmitParams;

  @JsonProperty("sql_params")
  private Map<String, String> sqlParams;

  public RepairRunPb setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  public RepairRunPb setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public Collection<String> getJarParams() {
    return jarParams;
  }

  public RepairRunPb setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public RepairRunPb setLatestRepairId(Long latestRepairId) {
    this.latestRepairId = latestRepairId;
    return this;
  }

  public Long getLatestRepairId() {
    return latestRepairId;
  }

  public RepairRunPb setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  public RepairRunPb setPerformanceTarget(PerformanceTarget performanceTarget) {
    this.performanceTarget = performanceTarget;
    return this;
  }

  public PerformanceTarget getPerformanceTarget() {
    return performanceTarget;
  }

  public RepairRunPb setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  public RepairRunPb setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  public RepairRunPb setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  public RepairRunPb setRerunAllFailedTasks(Boolean rerunAllFailedTasks) {
    this.rerunAllFailedTasks = rerunAllFailedTasks;
    return this;
  }

  public Boolean getRerunAllFailedTasks() {
    return rerunAllFailedTasks;
  }

  public RepairRunPb setRerunDependentTasks(Boolean rerunDependentTasks) {
    this.rerunDependentTasks = rerunDependentTasks;
    return this;
  }

  public Boolean getRerunDependentTasks() {
    return rerunDependentTasks;
  }

  public RepairRunPb setRerunTasks(Collection<String> rerunTasks) {
    this.rerunTasks = rerunTasks;
    return this;
  }

  public Collection<String> getRerunTasks() {
    return rerunTasks;
  }

  public RepairRunPb setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public RepairRunPb setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RepairRunPb setSqlParams(Map<String, String> sqlParams) {
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
    RepairRunPb that = (RepairRunPb) o;
    return Objects.equals(dbtCommands, that.dbtCommands)
        && Objects.equals(jarParams, that.jarParams)
        && Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(latestRepairId, that.latestRepairId)
        && Objects.equals(notebookParams, that.notebookParams)
        && Objects.equals(performanceTarget, that.performanceTarget)
        && Objects.equals(pipelineParams, that.pipelineParams)
        && Objects.equals(pythonNamedParams, that.pythonNamedParams)
        && Objects.equals(pythonParams, that.pythonParams)
        && Objects.equals(rerunAllFailedTasks, that.rerunAllFailedTasks)
        && Objects.equals(rerunDependentTasks, that.rerunDependentTasks)
        && Objects.equals(rerunTasks, that.rerunTasks)
        && Objects.equals(runId, that.runId)
        && Objects.equals(sparkSubmitParams, that.sparkSubmitParams)
        && Objects.equals(sqlParams, that.sqlParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbtCommands,
        jarParams,
        jobParameters,
        latestRepairId,
        notebookParams,
        performanceTarget,
        pipelineParams,
        pythonNamedParams,
        pythonParams,
        rerunAllFailedTasks,
        rerunDependentTasks,
        rerunTasks,
        runId,
        sparkSubmitParams,
        sqlParams);
  }

  @Override
  public String toString() {
    return new ToStringer(RepairRunPb.class)
        .add("dbtCommands", dbtCommands)
        .add("jarParams", jarParams)
        .add("jobParameters", jobParameters)
        .add("latestRepairId", latestRepairId)
        .add("notebookParams", notebookParams)
        .add("performanceTarget", performanceTarget)
        .add("pipelineParams", pipelineParams)
        .add("pythonNamedParams", pythonNamedParams)
        .add("pythonParams", pythonParams)
        .add("rerunAllFailedTasks", rerunAllFailedTasks)
        .add("rerunDependentTasks", rerunDependentTasks)
        .add("rerunTasks", rerunTasks)
        .add("runId", runId)
        .add("sparkSubmitParams", sparkSubmitParams)
        .add("sqlParams", sqlParams)
        .toString();
  }
}
