// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RunOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RunOutput {
  /** The output of a dbt task, if available. */
  @JsonProperty("dbt_output")
  private DbtOutput dbtOutput;

  /**
   * An error message indicating why a task failed or why output is not available. The message is
   * unstructured, and its exact format is subject to change.
   */
  @JsonProperty("error")
  private String error;

  /** If there was an error executing the run, this field contains any available stack traces. */
  @JsonProperty("error_trace")
  private String errorTrace;

  /**
   * The output from tasks that write to standard streams (stdout/stderr) such as spark_jar_task,
   * spark_python_task, python_wheel_task.
   *
   * <p>It's not supported for the notebook_task, pipeline_task or spark_submit_task.
   *
   * <p>Databricks restricts this API to return the last 5 MB of these logs.
   */
  @JsonProperty("logs")
  private String logs;

  /** Whether the logs are truncated. */
  @JsonProperty("logs_truncated")
  private Boolean logsTruncated;

  /** All details of the run except for its output. */
  @JsonProperty("metadata")
  private Run metadata;

  /**
   * The output of a notebook task, if available. A notebook task that terminates (either
   * successfully or with a failure) without calling `dbutils.notebook.exit()` is considered to have
   * an empty output. This field is set but its result value is empty. <Databricks> restricts this
   * API to return the first 5 MB of the output. To return a larger result, use the
   * [ClusterLogConf](/dev-tools/api/latest/clusters.html#clusterlogconf) field to configure log
   * storage for the job cluster.
   */
  @JsonProperty("notebook_output")
  private NotebookOutput notebookOutput;

  /** The output of a SQL task, if available. */
  @JsonProperty("sql_output")
  private SqlOutput sqlOutput;

  /**
   * <p>Setter for the field <code>dbtOutput</code>.</p>
   *
   * @param dbtOutput a {@link com.databricks.sdk.service.jobs.DbtOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setDbtOutput(DbtOutput dbtOutput) {
    this.dbtOutput = dbtOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>dbtOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.DbtOutput} object
   */
  public DbtOutput getDbtOutput() {
    return dbtOutput;
  }

  /**
   * <p>Setter for the field <code>error</code>.</p>
   *
   * @param error a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setError(String error) {
    this.error = error;
    return this;
  }

  /**
   * <p>Getter for the field <code>error</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getError() {
    return error;
  }

  /**
   * <p>Setter for the field <code>errorTrace</code>.</p>
   *
   * @param errorTrace a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setErrorTrace(String errorTrace) {
    this.errorTrace = errorTrace;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorTrace</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorTrace() {
    return errorTrace;
  }

  /**
   * <p>Setter for the field <code>logs</code>.</p>
   *
   * @param logs a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  /**
   * <p>Getter for the field <code>logs</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLogs() {
    return logs;
  }

  /**
   * <p>Setter for the field <code>logsTruncated</code>.</p>
   *
   * @param logsTruncated a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setLogsTruncated(Boolean logsTruncated) {
    this.logsTruncated = logsTruncated;
    return this;
  }

  /**
   * <p>Getter for the field <code>logsTruncated</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getLogsTruncated() {
    return logsTruncated;
  }

  /**
   * <p>Setter for the field <code>metadata</code>.</p>
   *
   * @param metadata a {@link com.databricks.sdk.service.jobs.Run} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setMetadata(Run metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * <p>Getter for the field <code>metadata</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run getMetadata() {
    return metadata;
  }

  /**
   * <p>Setter for the field <code>notebookOutput</code>.</p>
   *
   * @param notebookOutput a {@link com.databricks.sdk.service.jobs.NotebookOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setNotebookOutput(NotebookOutput notebookOutput) {
    this.notebookOutput = notebookOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebookOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.NotebookOutput} object
   */
  public NotebookOutput getNotebookOutput() {
    return notebookOutput;
  }

  /**
   * <p>Setter for the field <code>sqlOutput</code>.</p>
   *
   * @param sqlOutput a {@link com.databricks.sdk.service.jobs.SqlOutput} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput setSqlOutput(SqlOutput sqlOutput) {
    this.sqlOutput = sqlOutput;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlOutput</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutput} object
   */
  public SqlOutput getSqlOutput() {
    return sqlOutput;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunOutput that = (RunOutput) o;
    return Objects.equals(dbtOutput, that.dbtOutput)
        && Objects.equals(error, that.error)
        && Objects.equals(errorTrace, that.errorTrace)
        && Objects.equals(logs, that.logs)
        && Objects.equals(logsTruncated, that.logsTruncated)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(notebookOutput, that.notebookOutput)
        && Objects.equals(sqlOutput, that.sqlOutput);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        dbtOutput, error, errorTrace, logs, logsTruncated, metadata, notebookOutput, sqlOutput);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunOutput.class)
        .add("dbtOutput", dbtOutput)
        .add("error", error)
        .add("errorTrace", errorTrace)
        .add("logs", logs)
        .add("logsTruncated", logsTruncated)
        .add("metadata", metadata)
        .add("notebookOutput", notebookOutput)
        .add("sqlOutput", sqlOutput)
        .toString();
  }
}
