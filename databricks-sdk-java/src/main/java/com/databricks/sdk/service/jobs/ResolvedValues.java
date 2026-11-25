// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ResolvedValues {
  /**
   * Resolved values for an AI Function task: the Delta table input with upstream-task references
   * replaced by concrete values before the run.
   */
  @JsonProperty("ai_function_task")
  private ResolvedValuesAiFunctionTaskResolvedValues aiFunctionTask;

  /**
   * Resolved values for an AI Runtime task — env_vars with `{{tasks.<key>.values.<name>}}`
   * references substituted to concrete values before submission to the training service.
   */
  @JsonProperty("ai_runtime_task")
  private ResolvedValuesAiRuntimeTaskResolvedValues aiRuntimeTask;

  /** Resolved operands of a condition task. */
  @JsonProperty("condition_task")
  private ResolvedConditionTaskValues conditionTask;

  /** Resolved commands of a dbt task. */
  @JsonProperty("dbt_task")
  private ResolvedDbtTaskValues dbtTask;

  /** Resolved parameters of a notebook task. */
  @JsonProperty("notebook_task")
  private ResolvedNotebookTaskValues notebookTask;

  /** Resolved parameters of a pipeline task. */
  @JsonProperty("pipeline_task")
  private ResolvedPipelineTaskValues pipelineTask;

  /** Resolved parameters of a Python wheel task. */
  @JsonProperty("python_wheel_task")
  private ResolvedPythonWheelTaskValues pythonWheelTask;

  /** Resolved parameters of a Run Job task. */
  @JsonProperty("run_job_task")
  private ResolvedRunJobTaskValues runJobTask;

  /** */
  @JsonProperty("simulation_task")
  private ResolvedParamPairValues simulationTask;

  /** Resolved parameters of a JAR task. */
  @JsonProperty("spark_jar_task")
  private ResolvedStringParamsValues sparkJarTask;

  /** Resolved parameters of a Python script task. */
  @JsonProperty("spark_python_task")
  private ResolvedStringParamsValues sparkPythonTask;

  /** Resolved parameters of a spark-submit task. */
  @JsonProperty("spark_submit_task")
  private ResolvedStringParamsValues sparkSubmitTask;

  /** Resolved parameters of a SQL task. */
  @JsonProperty("sql_task")
  private ResolvedParamPairValues sqlTask;

  public ResolvedValues setAiFunctionTask(
      ResolvedValuesAiFunctionTaskResolvedValues aiFunctionTask) {
    this.aiFunctionTask = aiFunctionTask;
    return this;
  }

  public ResolvedValuesAiFunctionTaskResolvedValues getAiFunctionTask() {
    return aiFunctionTask;
  }

  public ResolvedValues setAiRuntimeTask(ResolvedValuesAiRuntimeTaskResolvedValues aiRuntimeTask) {
    this.aiRuntimeTask = aiRuntimeTask;
    return this;
  }

  public ResolvedValuesAiRuntimeTaskResolvedValues getAiRuntimeTask() {
    return aiRuntimeTask;
  }

  public ResolvedValues setConditionTask(ResolvedConditionTaskValues conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ResolvedConditionTaskValues getConditionTask() {
    return conditionTask;
  }

  public ResolvedValues setDbtTask(ResolvedDbtTaskValues dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public ResolvedDbtTaskValues getDbtTask() {
    return dbtTask;
  }

  public ResolvedValues setNotebookTask(ResolvedNotebookTaskValues notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public ResolvedNotebookTaskValues getNotebookTask() {
    return notebookTask;
  }

  public ResolvedValues setPipelineTask(ResolvedPipelineTaskValues pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public ResolvedPipelineTaskValues getPipelineTask() {
    return pipelineTask;
  }

  public ResolvedValues setPythonWheelTask(ResolvedPythonWheelTaskValues pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public ResolvedPythonWheelTaskValues getPythonWheelTask() {
    return pythonWheelTask;
  }

  public ResolvedValues setRunJobTask(ResolvedRunJobTaskValues runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public ResolvedRunJobTaskValues getRunJobTask() {
    return runJobTask;
  }

  public ResolvedValues setSimulationTask(ResolvedParamPairValues simulationTask) {
    this.simulationTask = simulationTask;
    return this;
  }

  public ResolvedParamPairValues getSimulationTask() {
    return simulationTask;
  }

  public ResolvedValues setSparkJarTask(ResolvedStringParamsValues sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkJarTask() {
    return sparkJarTask;
  }

  public ResolvedValues setSparkPythonTask(ResolvedStringParamsValues sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkPythonTask() {
    return sparkPythonTask;
  }

  public ResolvedValues setSparkSubmitTask(ResolvedStringParamsValues sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public ResolvedStringParamsValues getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public ResolvedValues setSqlTask(ResolvedParamPairValues sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public ResolvedParamPairValues getSqlTask() {
    return sqlTask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedValues that = (ResolvedValues) o;
    return Objects.equals(aiFunctionTask, that.aiFunctionTask)
        && Objects.equals(aiRuntimeTask, that.aiRuntimeTask)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(runJobTask, that.runJobTask)
        && Objects.equals(simulationTask, that.simulationTask)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aiFunctionTask,
        aiRuntimeTask,
        conditionTask,
        dbtTask,
        notebookTask,
        pipelineTask,
        pythonWheelTask,
        runJobTask,
        simulationTask,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedValues.class)
        .add("aiFunctionTask", aiFunctionTask)
        .add("aiRuntimeTask", aiRuntimeTask)
        .add("conditionTask", conditionTask)
        .add("dbtTask", dbtTask)
        .add("notebookTask", notebookTask)
        .add("pipelineTask", pipelineTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("runJobTask", runJobTask)
        .add("simulationTask", simulationTask)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .toString();
  }
}
