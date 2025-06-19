// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = RepairRun.RepairRunSerializer.class)
@JsonDeserialize(using = RepairRun.RepairRunDeserializer.class)
public class RepairRun {
  /**
   * An array of commands to execute for jobs with the dbt task, for example `"dbt_commands": ["dbt
   * deps", "dbt seed", "dbt deps", "dbt seed", "dbt run"]`
   */
  private Collection<String> dbtCommands;

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
  private Collection<String> jarParams;

  /** Job-level parameters used in the run. for example `"param": "overriding_val"` */
  private Map<String, String> jobParameters;

  /**
   * The ID of the latest repair. This parameter is not required when repairing a run for the first
   * time, but must be provided on subsequent requests to repair the same run.
   */
  private Long latestRepairId;

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
  private Map<String, String> notebookParams;

  /**
   * The performance mode on a serverless job. The performance target determines the level of
   * compute performance or cost-efficiency for the run. This field overrides the performance target
   * defined on the job level.
   *
   * <p>* `STANDARD`: Enables cost-efficient execution of serverless workloads. *
   * `PERFORMANCE_OPTIMIZED`: Prioritizes fast startup and execution times through rapid scaling and
   * optimized cluster performance.
   */
  private PerformanceTarget performanceTarget;

  /** Controls whether the pipeline should perform a full refresh */
  private PipelineParams pipelineParams;

  /** */
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
  private Collection<String> pythonParams;

  /**
   * If true, repair all failed tasks. Only one of `rerun_tasks` or `rerun_all_failed_tasks` can be
   * used.
   */
  private Boolean rerunAllFailedTasks;

  /**
   * If true, repair all tasks that depend on the tasks in `rerun_tasks`, even if they were
   * previously successful. Can be also used in combination with `rerun_all_failed_tasks`.
   */
  private Boolean rerunDependentTasks;

  /** The task keys of the task runs to repair. */
  private Collection<String> rerunTasks;

  /** The job run ID of the run to repair. The run must not be in progress. */
  private Long runId;

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
  private Collection<String> sparkSubmitParams;

  /**
   * A map from keys to values for jobs with SQL task, for example `"sql_params": {"name": "john
   * doe", "age": "35"}`. The SQL alert task does not support custom parameters.
   */
  private Map<String, String> sqlParams;

  public RepairRun setDbtCommands(Collection<String> dbtCommands) {
    this.dbtCommands = dbtCommands;
    return this;
  }

  public Collection<String> getDbtCommands() {
    return dbtCommands;
  }

  public RepairRun setJarParams(Collection<String> jarParams) {
    this.jarParams = jarParams;
    return this;
  }

  public Collection<String> getJarParams() {
    return jarParams;
  }

  public RepairRun setJobParameters(Map<String, String> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Map<String, String> getJobParameters() {
    return jobParameters;
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

  public RepairRun setPerformanceTarget(PerformanceTarget performanceTarget) {
    this.performanceTarget = performanceTarget;
    return this;
  }

  public PerformanceTarget getPerformanceTarget() {
    return performanceTarget;
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

  public RepairRun setPythonParams(Collection<String> pythonParams) {
    this.pythonParams = pythonParams;
    return this;
  }

  public Collection<String> getPythonParams() {
    return pythonParams;
  }

  public RepairRun setRerunAllFailedTasks(Boolean rerunAllFailedTasks) {
    this.rerunAllFailedTasks = rerunAllFailedTasks;
    return this;
  }

  public Boolean getRerunAllFailedTasks() {
    return rerunAllFailedTasks;
  }

  public RepairRun setRerunDependentTasks(Boolean rerunDependentTasks) {
    this.rerunDependentTasks = rerunDependentTasks;
    return this;
  }

  public Boolean getRerunDependentTasks() {
    return rerunDependentTasks;
  }

  public RepairRun setRerunTasks(Collection<String> rerunTasks) {
    this.rerunTasks = rerunTasks;
    return this;
  }

  public Collection<String> getRerunTasks() {
    return rerunTasks;
  }

  public RepairRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public RepairRun setSparkSubmitParams(Collection<String> sparkSubmitParams) {
    this.sparkSubmitParams = sparkSubmitParams;
    return this;
  }

  public Collection<String> getSparkSubmitParams() {
    return sparkSubmitParams;
  }

  public RepairRun setSqlParams(Map<String, String> sqlParams) {
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
    RepairRun that = (RepairRun) o;
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
    return new ToStringer(RepairRun.class)
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

  RepairRunPb toPb() {
    RepairRunPb pb = new RepairRunPb();
    pb.setDbtCommands(dbtCommands);
    pb.setJarParams(jarParams);
    pb.setJobParameters(jobParameters);
    pb.setLatestRepairId(latestRepairId);
    pb.setNotebookParams(notebookParams);
    pb.setPerformanceTarget(performanceTarget);
    pb.setPipelineParams(pipelineParams);
    pb.setPythonNamedParams(pythonNamedParams);
    pb.setPythonParams(pythonParams);
    pb.setRerunAllFailedTasks(rerunAllFailedTasks);
    pb.setRerunDependentTasks(rerunDependentTasks);
    pb.setRerunTasks(rerunTasks);
    pb.setRunId(runId);
    pb.setSparkSubmitParams(sparkSubmitParams);
    pb.setSqlParams(sqlParams);

    return pb;
  }

  static RepairRun fromPb(RepairRunPb pb) {
    RepairRun model = new RepairRun();
    model.setDbtCommands(pb.getDbtCommands());
    model.setJarParams(pb.getJarParams());
    model.setJobParameters(pb.getJobParameters());
    model.setLatestRepairId(pb.getLatestRepairId());
    model.setNotebookParams(pb.getNotebookParams());
    model.setPerformanceTarget(pb.getPerformanceTarget());
    model.setPipelineParams(pb.getPipelineParams());
    model.setPythonNamedParams(pb.getPythonNamedParams());
    model.setPythonParams(pb.getPythonParams());
    model.setRerunAllFailedTasks(pb.getRerunAllFailedTasks());
    model.setRerunDependentTasks(pb.getRerunDependentTasks());
    model.setRerunTasks(pb.getRerunTasks());
    model.setRunId(pb.getRunId());
    model.setSparkSubmitParams(pb.getSparkSubmitParams());
    model.setSqlParams(pb.getSqlParams());

    return model;
  }

  public static class RepairRunSerializer extends JsonSerializer<RepairRun> {
    @Override
    public void serialize(RepairRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepairRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepairRunDeserializer extends JsonDeserializer<RepairRun> {
    @Override
    public RepairRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepairRunPb pb = mapper.readValue(p, RepairRunPb.class);
      return RepairRun.fromPb(pb);
    }
  }
}
