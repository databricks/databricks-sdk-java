// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Task {
  /**
   * The key of the compute requirement, specified in `job.settings.compute`, to use for execution
   * of this task.
   */
  @JsonProperty("compute_key")
  private String computeKey;

  /**
   * If condition_task, specifies a condition with an outcome that can be used to control the
   * execution of other tasks. Does not require a cluster to execute and does not support retries or
   * notifications.
   */
  @JsonProperty("condition_task")
  private ConditionTask conditionTask;

  /**
   * If dbt_task, indicates that this must execute a dbt task. It requires both Databricks SQL and
   * the ability to use a serverless or a pro SQL warehouse.
   */
  @JsonProperty("dbt_task")
  private DbtTask dbtTask;

  /**
   * An optional array of objects specifying the dependency graph of the task. All tasks specified
   * in this field must complete successfully before executing this task. The key is `task_key`, and
   * the value is the name assigned to the dependent task.
   */
  @JsonProperty("depends_on")
  private Collection<TaskDependency> dependsOn;

  /** An optional description for this task. The maximum length is 4096 bytes. */
  @JsonProperty("description")
  private String description;

  /**
   * An optional set of email addresses that is notified when runs of this task begin or complete as
   * well as when this task is deleted. The default behavior is to not send any emails.
   */
  @JsonProperty("email_notifications")
  private TaskEmailNotifications emailNotifications;

  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs of this task.
   * When running tasks on an existing cluster, you may need to manually restart the cluster if it
   * stops responding. We suggest running jobs on new clusters for greater reliability.
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  /**
   * If job_cluster_key, this task is executed reusing the cluster specified in
   * `job.settings.job_clusters`.
   */
  @JsonProperty("job_cluster_key")
  private String jobClusterKey;

  /**
   * An optional list of libraries to be installed on the cluster that executes the task. The
   * default value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  /**
   * An optional maximum number of times to retry an unsuccessful run. A run is considered to be
   * unsuccessful if it completes with the `FAILED` result_state or `INTERNAL_ERROR`
   * `life_cycle_state`. The value -1 means to retry indefinitely and the value 0 means to never
   * retry. The default behavior is to never retry.
   */
  @JsonProperty("max_retries")
  private Long maxRetries;

  /**
   * An optional minimal interval in milliseconds between the start of the failed run and the
   * subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
   */
  @JsonProperty("min_retry_interval_millis")
  private Long minRetryIntervalMillis;

  /** If new_cluster, a description of a cluster that is created for only for this task. */
  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  /**
   * If notebook_task, indicates that this task must run a notebook. This field may not be specified
   * in conjunction with spark_jar_task.
   */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` for this task.
   */
  @JsonProperty("notification_settings")
  private TaskNotificationSettings notificationSettings;

  /** If pipeline_task, indicates that this task must execute a Pipeline. */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;

  /** If python_wheel_task, indicates that this job must execute a PythonWheel. */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;

  /**
   * An optional policy to specify whether to retry a task when it times out. The default behavior
   * is to not retry on timeout.
   */
  @JsonProperty("retry_on_timeout")
  private Boolean retryOnTimeout;

  /** If spark_jar_task, indicates that this task must run a JAR. */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  /** If spark_python_task, indicates that this task must run a Python file. */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  /**
   * If spark_submit_task, indicates that this task must be launched by the spark submit script.
   * This task can run only on new clusters.
   */
  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;

  /** If sql_task, indicates that this job must execute a SQL task. */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  /**
   * A unique name for the task. This field is used to refer to this task from other tasks. This
   * field is required and must be unique within its parent job. On Update or Reset, this field is
   * used to reference the tasks to be updated or reset. The maximum length is 100 characters.
   */
  @JsonProperty("task_key")
  private String taskKey;

  /**
   * An optional timeout applied to each run of this job task. The default behavior is to have no
   * timeout.
   */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  public Task setComputeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
  }

  public String getComputeKey() {
    return computeKey;
  }

  public Task setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }

  public Task setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public Task setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }

  public Task setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Task setEmailNotifications(TaskEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public TaskEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public Task setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public Task setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public Task setLibraries(Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public Task setMaxRetries(Long maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

  public Long getMaxRetries() {
    return maxRetries;
  }

  public Task setMinRetryIntervalMillis(Long minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
  }

  public Long getMinRetryIntervalMillis() {
    return minRetryIntervalMillis;
  }

  public Task setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  public Task setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public Task setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public Task setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public Task setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public Task setRetryOnTimeout(Boolean retryOnTimeout) {
    this.retryOnTimeout = retryOnTimeout;
    return this;
  }

  public Boolean getRetryOnTimeout() {
    return retryOnTimeout;
  }

  public Task setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public Task setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public Task setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public Task setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public Task setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public Task setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Task that = (Task) o;
    return Objects.equals(computeKey, that.computeKey)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(dependsOn, that.dependsOn)
        && Objects.equals(description, that.description)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(maxRetries, that.maxRetries)
        && Objects.equals(minRetryIntervalMillis, that.minRetryIntervalMillis)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(retryOnTimeout, that.retryOnTimeout)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask)
        && Objects.equals(taskKey, that.taskKey)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        computeKey,
        conditionTask,
        dbtTask,
        dependsOn,
        description,
        emailNotifications,
        existingClusterId,
        jobClusterKey,
        libraries,
        maxRetries,
        minRetryIntervalMillis,
        newCluster,
        notebookTask,
        notificationSettings,
        pipelineTask,
        pythonWheelTask,
        retryOnTimeout,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask,
        taskKey,
        timeoutSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(Task.class)
        .add("computeKey", computeKey)
        .add("conditionTask", conditionTask)
        .add("dbtTask", dbtTask)
        .add("dependsOn", dependsOn)
        .add("description", description)
        .add("emailNotifications", emailNotifications)
        .add("existingClusterId", existingClusterId)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("maxRetries", maxRetries)
        .add("minRetryIntervalMillis", minRetryIntervalMillis)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("retryOnTimeout", retryOnTimeout)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .add("taskKey", taskKey)
        .add("timeoutSeconds", timeoutSeconds)
        .toString();
  }
}
