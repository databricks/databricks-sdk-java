// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ResolvedValues {
  /** */
  @JsonProperty("condition_task")
  private ResolvedConditionTaskValues conditionTask;

  /** */
  @JsonProperty("dbt_task")
  private ResolvedDbtTaskValues dbtTask;

  /** */
  @JsonProperty("notebook_task")
  private ResolvedNotebookTaskValues notebookTask;

  /** */
  @JsonProperty("python_wheel_task")
  private ResolvedPythonWheelTaskValues pythonWheelTask;

  /** */
  @JsonProperty("run_job_task")
  private ResolvedRunJobTaskValues runJobTask;

  /** */
  @JsonProperty("simulation_task")
  private ResolvedParamPairValues simulationTask;

  /** */
  @JsonProperty("spark_jar_task")
  private ResolvedStringParamsValues sparkJarTask;

  /** */
  @JsonProperty("spark_python_task")
  private ResolvedStringParamsValues sparkPythonTask;

  /** */
  @JsonProperty("spark_submit_task")
  private ResolvedStringParamsValues sparkSubmitTask;

  /** */
  @JsonProperty("sql_task")
  private ResolvedParamPairValues sqlTask;

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
    return Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(notebookTask, that.notebookTask)
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
        conditionTask,
        dbtTask,
        notebookTask,
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
        .add("conditionTask", conditionTask)
        .add("dbtTask", dbtTask)
        .add("notebookTask", notebookTask)
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
