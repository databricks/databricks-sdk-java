// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class RepairRun {
  /**
   * An array of commands to execute for jobs with the dbt task, for example `"dbt_commands": ["dbt
   * deps", "dbt seed", "dbt run"]`
   */
  @JsonProperty("dbt_commands")
  private java.util.List<String> dbtCommands;

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
  private java.util.List<String> jarParams;

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
  private java.util.List<String> pythonParams;

  /**
   * If true, repair all failed tasks. Only one of rerun_tasks or rerun_all_failed_tasks can be
   * used.
   */
  @JsonProperty("rerun_all_failed_tasks")
  private Boolean rerunAllFailedTasks;

  /** The task keys of the task runs to repair. */
  @JsonProperty("rerun_tasks")
  private java.util.List<String> rerunTasks;

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
  private java.util.List<String> sparkSubmitParams;

  /**
   * A map from keys to values for jobs with SQL task, for example `"sql_params": {"name": "john
   * doe", "age": "35"}`. The SQL alert task does not support custom parameters.
   */
  @JsonProperty("sql_params")
  private Map<String, String> sqlParams;

  public RepairRun setDbtCommands(java.util.List<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public java.util.List<String> getDbtCommands() {
    return dbtCommands;
  }

  public RepairRun setJarParams(java.util.List<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public java.util.List<String> getJarParams() {
    return jarParams;
  }

  public RepairRun setLatestRepairId(Long latestRepairId) {
    this.latestRepairId = latestRepairId;
    return this;
  }

  public Long getLatestRepairId() {
    return latestRepairId;
  }

  public RepairRun setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  public RepairRun setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  public RepairRun setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  public RepairRun setPythonParams(java.util.List<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public java.util.List<String> getPythonParams() {
    return pythonParams;
  }

  public RepairRun setRerunAllFailedTasks(Boolean rerunAllFailedTasks) {
    this.rerunAllFailedTasks = rerunAllFailedTasks;
    return this;
  }

  public Boolean getRerunAllFailedTasks() {
    return rerunAllFailedTasks;
  }

  public RepairRun setRerunTasks(java.util.List<String> rerunTasks) {
    this.rerunTasks = rerunTasks;
    return this;
  }

  public java.util.List<String> getRerunTasks() {
    return rerunTasks;
  }

  public RepairRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public RepairRun setSparkSubmitParams(java.util.List<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public java.util.List<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RepairRun setSqlParams(Map<String, String> sqlParams) {
    this.sqlParams = sqlParams;
    return this;
  }

  public Map<String, String> getSqlParams() {
    return sqlParams;
  }
}
