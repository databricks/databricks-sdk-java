// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class RunTask {
  /**
   * The sequence number of this run attempt for a triggered job run. The
   * initial attempt of a run has an attempt_number of 0\. If the initial run
   * attempt fails, and the job has a retry policy (`max_retries` \> 0),
   * subsequent runs are created with an `original_attempt_run_id` of the
   * original attempt’s ID and an incrementing `attempt_number`. Runs are
   * retried only until they succeed, and the maximum `attempt_number` is the
   * same as the `max_retries` value for the job.
   */
  @JsonProperty("attempt_number")
  private Long attemptNumber;
  
  /**
   * The time in milliseconds it took to terminate the cluster and clean up any
   * associated artifacts. The duration of a task run is the sum of the
   * `setup_duration`, `execution_duration`, and the `cleanup_duration`. The
   * `cleanup_duration` field is set to 0 for multitask job runs. The total
   * duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("cleanup_duration")
  private Long cleanupDuration;
  
  /**
   * The cluster used for this run. If the run is specified to use a new
   * cluster, this field is set once the Jobs service has requested a cluster
   * for the run.
   */
  @JsonProperty("cluster_instance")
  private ClusterInstance clusterInstance;
  
  /**
   * If condition_task, specifies a condition with an outcome that can be used
   * to control the execution of other tasks. Does not require a cluster to
   * execute and does not support retries or notifications.
   */
  @JsonProperty("condition_task")
  private RunConditionTask conditionTask;
  
  /**
   * If dbt_task, indicates that this must execute a dbt task. It requires both
   * Databricks SQL and the ability to use a serverless or a pro SQL warehouse.
   */
  @JsonProperty("dbt_task")
  private DbtTask dbtTask;
  
  /**
   * An optional array of objects specifying the dependency graph of the task.
   * All tasks specified in this field must complete successfully before
   * executing this task. The key is `task_key`, and the value is the name
   * assigned to the dependent task.
   */
  @JsonProperty("depends_on")
  private Collection<TaskDependency> dependsOn;
  
  /**
   * An optional description for this task. The maximum length is 4096 bytes.
   */
  @JsonProperty("description")
  private String description;
  
  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since
   * 1/1/1970 UTC). This field is set to 0 if the job is still running.
   */
  @JsonProperty("end_time")
  private Long endTime;
  
  /**
   * The time in milliseconds it took to execute the commands in the JAR or
   * notebook until they completed, failed, timed out, were cancelled, or
   * encountered an unexpected error. The duration of a task run is the sum of
   * the `setup_duration`, `execution_duration`, and the `cleanup_duration`. The
   * `execution_duration` field is set to 0 for multitask job runs. The total
   * duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("execution_duration")
  private Long executionDuration;
  
  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all
   * runs of this job. When running jobs on an existing cluster, you may need to
   * manually restart the cluster if it stops responding. We suggest running
   * jobs on new clusters for greater reliability.
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;
  
  /**
   * An optional specification for a remote repository containing the notebooks
   * used by this job's notebook tasks.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;
  
  /**
   * An optional list of libraries to be installed on the cluster that executes
   * the job. The default value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;
  
  /**
   * If new_cluster, a description of a new cluster that is created only for
   * this task.
   */
  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;
  
  /**
   * If notebook_task, indicates that this job must run a notebook. This field
   * may not be specified in conjunction with spark_jar_task.
   */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;
  
  /**
   * If pipeline_task, indicates that this job must execute a Pipeline.
   */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;
  
  /**
   * If python_wheel_task, indicates that this job must execute a PythonWheel.
   */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;
  
  /**
   * Parameter values including resolved references
   */
  @JsonProperty("resolved_values")
  private ResolvedValues resolvedValues;
  
  /**
   * The ID of the task run.
   */
  @JsonProperty("run_id")
  private Long runId;
  
  /**
   * An optional value indicating the condition that determines whether the task
   * should be run once its dependencies have been completed. When omitted,
   * defaults to `ALL_SUCCESS`. See :method:jobs/create for a list of possible
   * values.
   */
  @JsonProperty("run_if")
  private RunIf runIf;
  
  /**
   * If run_job_task, indicates that this task must execute another job.
   */
  @JsonProperty("run_job_task")
  private RunJobTask runJobTask;
  
  /**
   * The time in milliseconds it took to set up the cluster. For runs that run
   * on new clusters this is the cluster creation time, for runs that run on
   * existing clusters this time should be very short. The duration of a task
   * run is the sum of the `setup_duration`, `execution_duration`, and the
   * `cleanup_duration`. The `setup_duration` field is set to 0 for multitask
   * job runs. The total duration of a multitask job run is the value of the
   * `run_duration` field.
   */
  @JsonProperty("setup_duration")
  private Long setupDuration;
  
  /**
   * If spark_jar_task, indicates that this job must run a JAR.
   */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;
  
  /**
   * If spark_python_task, indicates that this job must run a Python file.
   */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;
  
  /**
   * If spark_submit_task, indicates that this task must be launched by the
   * spark submit script. This task can run only on new clusters
   */
  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;
  
  /**
   * If sql_task, indicates that this job must execute a SQL.
   */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;
  
  /**
   * The time at which this run was started in epoch milliseconds (milliseconds
   * since 1/1/1970 UTC). This may not be the time when the job task starts
   * executing, for example, if the job is scheduled to run on a new cluster,
   * this is the time the cluster creation call is issued.
   */
  @JsonProperty("start_time")
  private Long startTime;
  
  /**
   * The current state of the run.
   */
  @JsonProperty("state")
  private RunState state;
  
  /**
   * A unique name for the task. This field is used to refer to this task from
   * other tasks. This field is required and must be unique within its parent
   * job. On Update or Reset, this field is used to reference the tasks to be
   * updated or reset. The maximum length is 100 characters.
   */
  @JsonProperty("task_key")
  private String taskKey;
  
  public RunTask setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }
  
  public RunTask setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  public Long getCleanupDuration() {
    return cleanupDuration;
  }
  
  public RunTask setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }
  
  public RunTask setConditionTask(RunConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public RunConditionTask getConditionTask() {
    return conditionTask;
  }
  
  public RunTask setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }
  
  public RunTask setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }
  
  public RunTask setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }
  
  public RunTask setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }
  
  public RunTask setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  public Long getExecutionDuration() {
    return executionDuration;
  }
  
  public RunTask setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }
  
  public RunTask setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }
  
  public RunTask setLibraries(Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }
  
  public RunTask setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }
  
  public RunTask setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }
  
  public RunTask setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }
  
  public RunTask setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }
  
  public RunTask setResolvedValues(ResolvedValues resolvedValues) {
    this.resolvedValues = resolvedValues;
    return this;
  }

  public ResolvedValues getResolvedValues() {
    return resolvedValues;
  }
  
  public RunTask setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }
  
  public RunTask setRunIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
  }

  public RunIf getRunIf() {
    return runIf;
  }
  
  public RunTask setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
  }
  
  public RunTask setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  public Long getSetupDuration() {
    return setupDuration;
  }
  
  public RunTask setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }
  
  public RunTask setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }
  
  public RunTask setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }
  
  public RunTask setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }
  
  public RunTask setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }
  
  public RunTask setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }
  
  public RunTask setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunTask that = (RunTask) o;
    return Objects.equals(attemptNumber, that.attemptNumber)
    && Objects.equals(cleanupDuration, that.cleanupDuration)
    && Objects.equals(clusterInstance, that.clusterInstance)
    && Objects.equals(conditionTask, that.conditionTask)
    && Objects.equals(dbtTask, that.dbtTask)
    && Objects.equals(dependsOn, that.dependsOn)
    && Objects.equals(description, that.description)
    && Objects.equals(endTime, that.endTime)
    && Objects.equals(executionDuration, that.executionDuration)
    && Objects.equals(existingClusterId, that.existingClusterId)
    && Objects.equals(gitSource, that.gitSource)
    && Objects.equals(libraries, that.libraries)
    && Objects.equals(newCluster, that.newCluster)
    && Objects.equals(notebookTask, that.notebookTask)
    && Objects.equals(pipelineTask, that.pipelineTask)
    && Objects.equals(pythonWheelTask, that.pythonWheelTask)
    && Objects.equals(resolvedValues, that.resolvedValues)
    && Objects.equals(runId, that.runId)
    && Objects.equals(runIf, that.runIf)
    && Objects.equals(runJobTask, that.runJobTask)
    && Objects.equals(setupDuration, that.setupDuration)
    && Objects.equals(sparkJarTask, that.sparkJarTask)
    && Objects.equals(sparkPythonTask, that.sparkPythonTask)
    && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
    && Objects.equals(sqlTask, that.sqlTask)
    && Objects.equals(startTime, that.startTime)
    && Objects.equals(state, that.state)
    && Objects.equals(taskKey, that.taskKey)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptNumber, cleanupDuration, clusterInstance, conditionTask, dbtTask, dependsOn, description, endTime, executionDuration, existingClusterId, gitSource, libraries, newCluster, notebookTask, pipelineTask, pythonWheelTask, resolvedValues, runId, runIf, runJobTask, setupDuration, sparkJarTask, sparkPythonTask, sparkSubmitTask, sqlTask, startTime, state, taskKey);
  }

  @Override
  public String toString() {
    return new ToStringer(RunTask.class)
      .add("attemptNumber", attemptNumber)
      .add("cleanupDuration", cleanupDuration)
      .add("clusterInstance", clusterInstance)
      .add("conditionTask", conditionTask)
      .add("dbtTask", dbtTask)
      .add("dependsOn", dependsOn)
      .add("description", description)
      .add("endTime", endTime)
      .add("executionDuration", executionDuration)
      .add("existingClusterId", existingClusterId)
      .add("gitSource", gitSource)
      .add("libraries", libraries)
      .add("newCluster", newCluster)
      .add("notebookTask", notebookTask)
      .add("pipelineTask", pipelineTask)
      .add("pythonWheelTask", pythonWheelTask)
      .add("resolvedValues", resolvedValues)
      .add("runId", runId)
      .add("runIf", runIf)
      .add("runJobTask", runJobTask)
      .add("setupDuration", setupDuration)
      .add("sparkJarTask", sparkJarTask)
      .add("sparkPythonTask", sparkPythonTask)
      .add("sparkSubmitTask", sparkSubmitTask)
      .add("sqlTask", sqlTask)
      .add("startTime", startTime)
      .add("state", state)
      .add("taskKey", taskKey).toString();
  }
}
