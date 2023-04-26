// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>RepairRun class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RepairRun {
  /**
   * An array of commands to execute for jobs with the dbt task, for example `"dbt_commands": ["dbt
   * deps", "dbt seed", "dbt run"]`
   */
  @JsonProperty("dbt_commands")
  private Collection<String> dbtCommands;

  /**
   * A list of parameters for jobs with Spark JAR tasks, for example `\"jar_params\": [\"john doe\",
   * \"35\"]`. The parameters are used to invoke the main function of the main class specified in
   * the Spark JAR task. If not specified upon `run-now`, it defaults to an empty list. jar_params
   * cannot be specified in conjunction with notebook_params. The JSON representation of this field
   * (for example `{\"jar_params\":[\"john doe\",\"35\"]}`) cannot exceed 10,000 bytes.
   *
   * <p>Use [Task parameter variables](/jobs.html"#parameter-variables") to set parameters
   * containing information about job runs.
   */
  @JsonProperty("jar_params")
  private Collection<String> jarParams;

  /**
   * The ID of the latest repair. This parameter is not required when repairing a run for the first
   * time, but must be provided on subsequent requests to repair the same run.
   */
  @JsonProperty("latest_repair_id")
  private Long latestRepairId;

  /**
   * A map from keys to values for jobs with notebook task, for example `\"notebook_params\":
   * {\"name\": \"john doe\", \"age\": \"35\"}`. The map is passed to the notebook and is accessible
   * through the [dbutils.widgets.get] function.
   *
   * <p>If not specified upon `run-now`, the triggered run uses the job’s base parameters.
   *
   * <p>notebook_params cannot be specified in conjunction with jar_params.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>The JSON representation of this field (for example `{\"notebook_params\":{\"name\":\"john
   * doe\",\"age\":\"35\"}}`) cannot exceed 10,000 bytes.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   * [dbutils.widgets.get]: https://docs.databricks.com/dev-tools/databricks-utils.html
   */
  @JsonProperty("notebook_params")
  private Map<String, String> notebookParams;

  /** */
  @JsonProperty("pipeline_params")
  private PipelineParams pipelineParams;

  /**
   * A map from keys to values for jobs with Python wheel task, for example `"python_named_params":
   * {"name": "task", "data": "dbfs:/path/to/data.json"}`.
   */
  @JsonProperty("python_named_params")
  private Map<String, String> pythonNamedParams;

  /**
   * A list of parameters for jobs with Python tasks, for example `\"python_params\": [\"john doe\",
   * \"35\"]`. The parameters are passed to Python file as command-line parameters. If specified
   * upon `run-now`, it would overwrite the parameters specified in job setting. The JSON
   * representation of this field (for example `{\"python_params\":[\"john doe\",\"35\"]}`) cannot
   * exceed 10,000 bytes.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>Important
   *
   * <p>These parameters accept only Latin characters (ASCII character set). Using non-ASCII
   * characters returns an error. Examples of invalid, non-ASCII characters are Chinese, Japanese
   * kanjis, and emojis.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("python_params")
  private Collection<String> pythonParams;

  /**
   * If true, repair all failed tasks. Only one of rerun_tasks or rerun_all_failed_tasks can be
   * used.
   */
  @JsonProperty("rerun_all_failed_tasks")
  private Boolean rerunAllFailedTasks;

  /** The task keys of the task runs to repair. */
  @JsonProperty("rerun_tasks")
  private Collection<String> rerunTasks;

  /** The job run ID of the run to repair. The run must not be in progress. */
  @JsonProperty("run_id")
  private Long runId;

  /**
   * A list of parameters for jobs with spark submit task, for example `\"spark_submit_params\":
   * [\"--class\", \"org.apache.spark.examples.SparkPi\"]`. The parameters are passed to
   * spark-submit script as command-line parameters. If specified upon `run-now`, it would overwrite
   * the parameters specified in job setting. The JSON representation of this field (for example
   * `{\"python_params\":[\"john doe\",\"35\"]}`) cannot exceed 10,000 bytes.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs
   *
   * <p>Important
   *
   * <p>These parameters accept only Latin characters (ASCII character set). Using non-ASCII
   * characters returns an error. Examples of invalid, non-ASCII characters are Chinese, Japanese
   * kanjis, and emojis.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("spark_submit_params")
  private Collection<String> sparkSubmitParams;

  /**
   * A map from keys to values for jobs with SQL task, for example `"sql_params": {"name": "john
   * doe", "age": "35"}`. The SQL alert task does not support custom parameters.
   */
  @JsonProperty("sql_params")
  private Map<String, String> sqlParams;

  /**
   * <p>Setter for the field <code>dbtCommands</code>.</p>
   *
   * @param dbtCommands a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  /**
   * <p>Getter for the field <code>dbtCommands</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  /**
   * <p>Setter for the field <code>jarParams</code>.</p>
   *
   * @param jarParams a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>jarParams</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getJarParams() {
    return jarParams;
  }

  /**
   * <p>Setter for the field <code>latestRepairId</code>.</p>
   *
   * @param latestRepairId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setLatestRepairId(Long latestRepairId) {
    this.latestRepairId = latestRepairId;
    return this;
  }

  /**
   * <p>Getter for the field <code>latestRepairId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLatestRepairId() {
    return latestRepairId;
  }

  /**
   * <p>Setter for the field <code>notebookParams</code>.</p>
   *
   * @param notebookParams a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebookParams</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  /**
   * <p>Setter for the field <code>pipelineParams</code>.</p>
   *
   * @param pipelineParams a {@link com.databricks.sdk.service.jobs.PipelineParams} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineParams</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.PipelineParams} object
   */
  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  /**
   * <p>Setter for the field <code>pythonNamedParams</code>.</p>
   *
   * @param pythonNamedParams a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>pythonNamedParams</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  /**
   * <p>Setter for the field <code>pythonParams</code>.</p>
   *
   * @param pythonParams a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>pythonParams</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  /**
   * <p>Setter for the field <code>rerunAllFailedTasks</code>.</p>
   *
   * @param rerunAllFailedTasks a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setRerunAllFailedTasks(Boolean rerunAllFailedTasks) {
    this.rerunAllFailedTasks = rerunAllFailedTasks;
    return this;
  }

  /**
   * <p>Getter for the field <code>rerunAllFailedTasks</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getRerunAllFailedTasks() {
    return rerunAllFailedTasks;
  }

  /**
   * <p>Setter for the field <code>rerunTasks</code>.</p>
   *
   * @param rerunTasks a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setRerunTasks(Collection<String> rerunTasks) {
    this.rerunTasks = rerunTasks;
    return this;
  }

  /**
   * <p>Getter for the field <code>rerunTasks</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRerunTasks() {
    return rerunTasks;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>sparkSubmitParams</code>.</p>
   *
   * @param sparkSubmitParams a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkSubmitParams</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  /**
   * <p>Setter for the field <code>sqlParams</code>.</p>
   *
   * @param sqlParams a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRun} object
   */
  public RepairRun setSqlParams(Map<String, String> sqlParams) {
    this.sqlParams = sqlParams;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlParams</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getSqlParams() {
    return sqlParams;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepairRun that = (RepairRun) o;
    return Objects.equals(dbtCommands, that.dbtCommands)
        && Objects.equals(jarParams, that.jarParams)
        && Objects.equals(latestRepairId, that.latestRepairId)
        && Objects.equals(notebookParams, that.notebookParams)
        && Objects.equals(pipelineParams, that.pipelineParams)
        && Objects.equals(pythonNamedParams, that.pythonNamedParams)
        && Objects.equals(pythonParams, that.pythonParams)
        && Objects.equals(rerunAllFailedTasks, that.rerunAllFailedTasks)
        && Objects.equals(rerunTasks, that.rerunTasks)
        && Objects.equals(runId, that.runId)
        && Objects.equals(sparkSubmitParams, that.sparkSubmitParams)
        && Objects.equals(sqlParams, that.sqlParams);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        dbtCommands,
        jarParams,
        latestRepairId,
        notebookParams,
        pipelineParams,
        pythonNamedParams,
        pythonParams,
        rerunAllFailedTasks,
        rerunTasks,
        runId,
        sparkSubmitParams,
        sqlParams);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RepairRun.class)
        .add("dbtCommands", dbtCommands)
        .add("jarParams", jarParams)
        .add("latestRepairId", latestRepairId)
        .add("notebookParams", notebookParams)
        .add("pipelineParams", pipelineParams)
        .add("pythonNamedParams", pythonNamedParams)
        .add("pythonParams", pythonParams)
        .add("rerunAllFailedTasks", rerunAllFailedTasks)
        .add("rerunTasks", rerunTasks)
        .add("runId", runId)
        .add("sparkSubmitParams", sparkSubmitParams)
        .add("sqlParams", sqlParams)
        .toString();
  }
}
