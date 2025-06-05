// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class RunParametersPb {
  @JsonProperty("dbt_commands")
  private Collection<String> dbtCommands;

  @JsonProperty("jar_params")
  private Collection<String> jarParams;

  @JsonProperty("notebook_params")
  private Map<String, String> notebookParams;

  @JsonProperty("pipeline_params")
  private PipelineParams pipelineParams;

  @JsonProperty("python_named_params")
  private Map<String, String> pythonNamedParams;

  @JsonProperty("python_params")
  private Collection<String> pythonParams;

  @JsonProperty("spark_submit_params")
  private Collection<String> sparkSubmitParams;

  @JsonProperty("sql_params")
  private Map<String, String> sqlParams;

  public RunParametersPb setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  public RunParametersPb setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public Collection<String> getJarParams() {
    return jarParams;
  }

  public RunParametersPb setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  public RunParametersPb setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  public RunParametersPb setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  public RunParametersPb setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  public RunParametersPb setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RunParametersPb setSqlParams(Map<String, String> sqlParams) {
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
    RunParametersPb that = (RunParametersPb) o;
    return Objects.equals(dbtCommands, that.dbtCommands)
        && Objects.equals(jarParams, that.jarParams)
        && Objects.equals(notebookParams, that.notebookParams)
        && Objects.equals(pipelineParams, that.pipelineParams)
        && Objects.equals(pythonNamedParams, that.pythonNamedParams)
        && Objects.equals(pythonParams, that.pythonParams)
        && Objects.equals(sparkSubmitParams, that.sparkSubmitParams)
        && Objects.equals(sqlParams, that.sqlParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbtCommands,
        jarParams,
        notebookParams,
        pipelineParams,
        pythonNamedParams,
        pythonParams,
        sparkSubmitParams,
        sqlParams);
  }

  @Override
  public String toString() {
    return new ToStringer(RunParametersPb.class)
        .add("dbtCommands", dbtCommands)
        .add("jarParams", jarParams)
        .add("notebookParams", notebookParams)
        .add("pipelineParams", pipelineParams)
        .add("pythonNamedParams", pythonNamedParams)
        .add("pythonParams", pythonParams)
        .add("sparkSubmitParams", sparkSubmitParams)
        .add("sqlParams", sqlParams)
        .toString();
  }
}
