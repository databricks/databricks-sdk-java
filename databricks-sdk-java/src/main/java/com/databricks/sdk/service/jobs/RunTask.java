// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RunTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RunTask {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0\. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` \> 0), subsequent runs are created with an `original_attempt_run_id` of the
   * original attempt’s ID and an incrementing `attempt_number`. Runs are retried only until they
   * succeed, and the maximum `attempt_number` is the same as the `max_retries` value for the job.
   */
  @JsonProperty("attempt_number")
  private Long attemptNumber;

  /**
   * The time in milliseconds it took to terminate the cluster and clean up any associated
   * artifacts. The duration of a task run is the sum of the `setup_duration`, `execution_duration`,
   * and the `cleanup_duration`. The `cleanup_duration` field is set to 0 for multitask job runs.
   * The total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("cleanup_duration")
  private Long cleanupDuration;

  /**
   * The cluster used for this run. If the run is specified to use a new cluster, this field is set
   * once the Jobs service has requested a cluster for the run.
   */
  @JsonProperty("cluster_instance")
  private ClusterInstance clusterInstance;

  /**
   * If dbt_task, indicates that this must execute a dbt task. It requires both Databricks SQL and
   * the ability to use a serverless or a pro SQL warehouse.
   */
  @JsonProperty("dbt_task")
  private DbtTask dbtTask;

  /**
   * An optional array of objects specifying the dependency graph of the task. All tasks specified
   * in this field must complete successfully before executing this task. The key is `task_key`, and
   * the value is the name assigned to the dependent task. This field is required when a job
   * consists of more than one task.
   */
  @JsonProperty("depends_on")
  private Collection<TaskDependenciesItem> dependsOn;

  /** An optional description for this task. The maximum length is 4096 bytes. */
  @JsonProperty("description")
  private String description;

  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  @JsonProperty("end_time")
  private Long endTime;

  /**
   * The time in milliseconds it took to execute the commands in the JAR or notebook until they
   * completed, failed, timed out, were cancelled, or encountered an unexpected error. The duration
   * of a task run is the sum of the `setup_duration`, `execution_duration`, and the
   * `cleanup_duration`. The `execution_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("execution_duration")
  private Long executionDuration;

  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs of this job.
   * When running jobs on an existing cluster, you may need to manually restart the cluster if it
   * stops responding. We suggest running jobs on new clusters for greater reliability.
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  /**
   * An optional specification for a remote repository containing the notebooks used by this job's
   * notebook tasks.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * An optional list of libraries to be installed on the cluster that executes the job. The default
   * value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<Object /* MISSING TYPE */> libraries;

  /** If new_cluster, a description of a new cluster that is created only for this task. */
  @JsonProperty("new_cluster")
  private Object /* MISSING TYPE */ newCluster;

  /**
   * If notebook_task, indicates that this job must run a notebook. This field may not be specified
   * in conjunction with spark_jar_task.
   */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;

  /** If pipeline_task, indicates that this job must execute a Pipeline. */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;

  /** If python_wheel_task, indicates that this job must execute a PythonWheel. */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;

  /** The ID of the task run. */
  @JsonProperty("run_id")
  private Long runId;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("setup_duration")
  private Long setupDuration;

  /** If spark_jar_task, indicates that this job must run a JAR. */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  /** If spark_python_task, indicates that this job must run a Python file. */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  /**
   * If spark_submit_task, indicates that this task must be launched by the spark submit script.
   * This task can run only on new clusters
   */
  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;

  /** If sql_task, indicates that this job must execute a SQL. */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  /**
   * The time at which this run was started in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   * This may not be the time when the job task starts executing, for example, if the job is
   * scheduled to run on a new cluster, this is the time the cluster creation call is issued.
   */
  @JsonProperty("start_time")
  private Long startTime;

  /** The result and lifecycle states of the run. */
  @JsonProperty("state")
  private RunState state;

  /**
   * A unique name for the task. This field is used to refer to this task from other tasks. This
   * field is required and must be unique within its parent job. On Update or Reset, this field is
   * used to reference the tasks to be updated or reset. The maximum length is 100 characters.
   */
  @JsonProperty("task_key")
  private String taskKey;

  /**
   * <p>Setter for the field <code>attemptNumber</code>.</p>
   *
   * @param attemptNumber a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  /**
   * <p>Getter for the field <code>attemptNumber</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAttemptNumber() {
    return attemptNumber;
  }

  /**
   * <p>Setter for the field <code>cleanupDuration</code>.</p>
   *
   * @param cleanupDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>cleanupDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  /**
   * <p>Setter for the field <code>clusterInstance</code>.</p>
   *
   * @param clusterInstance a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterInstance</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   */
  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  /**
   * <p>Setter for the field <code>dbtTask</code>.</p>
   *
   * @param dbtTask a {@link com.databricks.sdk.service.jobs.DbtTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>dbtTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask getDbtTask() {
    return dbtTask;
  }

  /**
   * <p>Setter for the field <code>dependsOn</code>.</p>
   *
   * @param dependsOn a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setDependsOn(Collection<TaskDependenciesItem> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  /**
   * <p>Getter for the field <code>dependsOn</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<TaskDependenciesItem> getDependsOn() {
    return dependsOn;
  }

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>executionDuration</code>.</p>
   *
   * @param executionDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>executionDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutionDuration() {
    return executionDuration;
  }

  /**
   * <p>Setter for the field <code>existingClusterId</code>.</p>
   *
   * @param existingClusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  /**
   * <p>Getter for the field <code>existingClusterId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExistingClusterId() {
    return existingClusterId;
  }

  /**
   * <p>Setter for the field <code>gitSource</code>.</p>
   *
   * @param gitSource a {@link com.databricks.sdk.service.jobs.GitSource} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitSource</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource getGitSource() {
    return gitSource;
  }

  /**
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setLibraries(Collection<Object /* MISSING TYPE */> libraries) {
    this.libraries = libraries;
    return this;
  }

  /**
   * <p>Getter for the field <code>libraries</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Object /* MISSING TYPE */> getLibraries() {
    return libraries;
  }

  /**
   * <p>Setter for the field <code>newCluster</code>.</p>
   *
   * @param newCluster a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setNewCluster(Object /* MISSING TYPE */ newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  /**
   * <p>Getter for the field <code>newCluster</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getNewCluster() {
    return newCluster;
  }

  /**
   * <p>Setter for the field <code>notebookTask</code>.</p>
   *
   * @param notebookTask a {@link com.databricks.sdk.service.jobs.NotebookTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebookTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.NotebookTask} object
   */
  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  /**
   * <p>Setter for the field <code>pipelineTask</code>.</p>
   *
   * @param pipelineTask a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>pipelineTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   */
  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  /**
   * <p>Setter for the field <code>pythonWheelTask</code>.</p>
   *
   * @param pythonWheelTask a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>pythonWheelTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   */
  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setRunId(Long runId) {
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
   * <p>Setter for the field <code>setupDuration</code>.</p>
   *
   * @param setupDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>setupDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getSetupDuration() {
    return setupDuration;
  }

  /**
   * <p>Setter for the field <code>sparkJarTask</code>.</p>
   *
   * @param sparkJarTask a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkJarTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   */
  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  /**
   * <p>Setter for the field <code>sparkPythonTask</code>.</p>
   *
   * @param sparkPythonTask a {@link com.databricks.sdk.service.jobs.SparkPythonTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkPythonTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SparkPythonTask} object
   */
  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  /**
   * <p>Setter for the field <code>sparkSubmitTask</code>.</p>
   *
   * @param sparkSubmitTask a {@link com.databricks.sdk.service.jobs.SparkSubmitTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkSubmitTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SparkSubmitTask} object
   */
  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  /**
   * <p>Setter for the field <code>sqlTask</code>.</p>
   *
   * @param sqlTask a {@link com.databricks.sdk.service.jobs.SqlTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlTask</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SqlTask} object
   */
  public SqlTask getSqlTask() {
    return sqlTask;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.jobs.RunState} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setState(RunState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>taskKey</code>.</p>
   *
   * @param taskKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunTask} object
   */
  public RunTask setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>taskKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTaskKey() {
    return taskKey;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunTask that = (RunTask) o;
    return Objects.equals(attemptNumber, that.attemptNumber)
        && Objects.equals(cleanupDuration, that.cleanupDuration)
        && Objects.equals(clusterInstance, that.clusterInstance)
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
        && Objects.equals(runId, that.runId)
        && Objects.equals(setupDuration, that.setupDuration)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(taskKey, that.taskKey);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        attemptNumber,
        cleanupDuration,
        clusterInstance,
        dbtTask,
        dependsOn,
        description,
        endTime,
        executionDuration,
        existingClusterId,
        gitSource,
        libraries,
        newCluster,
        notebookTask,
        pipelineTask,
        pythonWheelTask,
        runId,
        setupDuration,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask,
        startTime,
        state,
        taskKey);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunTask.class)
        .add("attemptNumber", attemptNumber)
        .add("cleanupDuration", cleanupDuration)
        .add("clusterInstance", clusterInstance)
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
        .add("runId", runId)
        .add("setupDuration", setupDuration)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .add("startTime", startTime)
        .add("state", state)
        .add("taskKey", taskKey)
        .toString();
  }
}
