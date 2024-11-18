// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class RunNow {
  /**
   * An array of commands to execute for jobs with the dbt task, for example `"dbt_commands": ["dbt
   * deps", "dbt seed", "dbt deps", "dbt seed", "dbt run"]`
   */
  @JsonProperty("dbt_commands")
  private Collection<String> dbtCommands;

  /**
   * An optional token to guarantee the idempotency of job run requests. If a run with the provided
   * token already exists, the request does not create a new run but returns the ID of the existing
   * run instead. If a run with the provided token is deleted, an error is returned.
   *
   * <p>If you specify the idempotency token, upon failure you can retry until the request succeeds.
   * Databricks guarantees that exactly one run is launched with that idempotency token.
   *
   * <p>This token must have at most 64 characters.
   *
   * <p>For more information, see [How to ensure idempotency for jobs].
   *
   * <p>[How to ensure idempotency for jobs]: https://kb.databricks.com/jobs/jobs-idempotency.html
   */
  @JsonProperty("idempotency_token")
  private String idempotencyToken;

  /**
   * A list of parameters for jobs with Spark JAR tasks, for example `"jar_params": ["john doe",
   * "35"]`. The parameters are used to invoke the main function of the main class specified in the
   * Spark JAR task. If not specified upon `run-now`, it defaults to an empty list. jar_params
   * cannot be specified in conjunction with notebook_params. The JSON representation of this field
   * (for example `{"jar_params":["john doe","35"]}`) cannot exceed 10,000 bytes.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("jar_params")
  private Collection<String> jarParams;

  /** The ID of the job to be executed */
  @JsonProperty("job_id")
  private Long jobId;

  /** Job-level parameters used in the run. for example `"param": "overriding_val"` */
  @JsonProperty("job_parameters")
  private Map<String, String> jobParameters;

  /**
   * A map from keys to values for jobs with notebook task, for example `"notebook_params": {"name":
   * "john doe", "age": "35"}`. The map is passed to the notebook and is accessible through the
   * [dbutils.widgets.get] function.
   *
   * <p>If not specified upon `run-now`, the triggered run uses the job’s base parameters.
   *
   * <p>notebook_params cannot be specified in conjunction with jar_params.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>The JSON representation of this field (for example `{"notebook_params":{"name":"john
   * doe","age":"35"}}`) cannot exceed 10,000 bytes.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   * [dbutils.widgets.get]: https://docs.databricks.com/dev-tools/databricks-utils.html
   */
  @JsonProperty("notebook_params")
  private Map<String, String> notebookParams;

  /**
   * A list of task keys to run inside of the job. If this field is not provided, all tasks in the
   * job will be run.
   */
  @JsonProperty("only")
  private Collection<String> only;

  /** Controls whether the pipeline should perform a full refresh */
  @JsonProperty("pipeline_params")
  private PipelineParams pipelineParams;

  /** */
  @JsonProperty("python_named_params")
  private Map<String, String> pythonNamedParams;

  /**
   * A list of parameters for jobs with Python tasks, for example `"python_params": ["john doe",
   * "35"]`. The parameters are passed to Python file as command-line parameters. If specified upon
   * `run-now`, it would overwrite the parameters specified in job setting. The JSON representation
   * of this field (for example `{"python_params":["john doe","35"]}`) cannot exceed 10,000 bytes.
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

  /** The queue settings of the run. */
  @JsonProperty("queue")
  private QueueSettings queue;

  /**
   * A list of parameters for jobs with spark submit task, for example `"spark_submit_params":
   * ["--class", "org.apache.spark.examples.SparkPi"]`. The parameters are passed to spark-submit
   * script as command-line parameters. If specified upon `run-now`, it would overwrite the
   * parameters specified in job setting. The JSON representation of this field (for example
   * `{"python_params":["john doe","35"]}`) cannot exceed 10,000 bytes.
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

  public RunNow setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  public RunNow setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public RunNow setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public Collection<String> getJarParams() {
    return jarParams;
  }

  public RunNow setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public RunNow setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
  }

  public RunNow setNotebookParams(Map<String, String> notebookParams) {
    this.notebookParams = notebookParams;
    return this;
  }

  public Map<String, String> getNotebookParams() {
    return notebookParams;
  }

  public RunNow setOnly(Collection<String> only) {
    this.only = only;
    return this;
  }

  public Collection<String> getOnly() {
    return only;
  }

  public RunNow setPipelineParams(PipelineParams pipelineParams) {
    this.pipelineParams = pipelineParams;
    return this;
  }

  public PipelineParams getPipelineParams() {
    return pipelineParams;
  }

  public RunNow setPythonNamedParams(Map<String, String> pythonNamedParams) {
    this.pythonNamedParams = pythonNamedParams;
    return this;
  }

  public Map<String, String> getPythonNamedParams() {
    return pythonNamedParams;
  }

  public RunNow setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  public RunNow setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public RunNow setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RunNow setSqlParams(Map<String, String> sqlParams) {
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
    RunNow that = (RunNow) o;
    return Objects.equals(dbtCommands, that.dbtCommands)
        && Objects.equals(idempotencyToken, that.idempotencyToken)
        && Objects.equals(jarParams, that.jarParams)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(notebookParams, that.notebookParams)
        && Objects.equals(only, that.only)
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
        pipelineParams,
        pythonNamedParams,
        pythonParams,
        queue,
        sparkSubmitParams,
        sqlParams);
  }

  @Override
  public String toString() {
    return new ToStringer(RunNow.class)
        .add("dbtCommands", dbtCommands)
        .add("idempotencyToken", idempotencyToken)
        .add("jarParams", jarParams)
        .add("jobId", jobId)
        .add("jobParameters", jobParameters)
        .add("notebookParams", notebookParams)
        .add("only", only)
        .add("pipelineParams", pipelineParams)
        .add("pythonNamedParams", pythonNamedParams)
        .add("pythonParams", pythonParams)
        .add("queue", queue)
        .add("sparkSubmitParams", sparkSubmitParams)
        .add("sqlParams", sqlParams)
        .toString();
  }
}
