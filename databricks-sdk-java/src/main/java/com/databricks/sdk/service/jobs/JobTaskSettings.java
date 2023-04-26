// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>JobTaskSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobTaskSettings {
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
  private Collection<Object /* MISSING TYPE */> libraries;

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
  private Object /* MISSING TYPE */ newCluster;

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

  /**
   * <p>Setter for the field <code>dbtTask</code>.</p>
   *
   * @param dbtTask a {@link com.databricks.sdk.service.jobs.DbtTask} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setDbtTask(DbtTask dbtTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setDependsOn(Collection<TaskDependenciesItem> dependsOn) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setDescription(String description) {
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
   * <p>Setter for the field <code>emailNotifications</code>.</p>
   *
   * @param emailNotifications a {@link com.databricks.sdk.service.jobs.TaskEmailNotifications} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setEmailNotifications(TaskEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  /**
   * <p>Getter for the field <code>emailNotifications</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TaskEmailNotifications} object
   */
  public TaskEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  /**
   * <p>Setter for the field <code>existingClusterId</code>.</p>
   *
   * @param existingClusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setExistingClusterId(String existingClusterId) {
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
   * <p>Setter for the field <code>jobClusterKey</code>.</p>
   *
   * @param jobClusterKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobClusterKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJobClusterKey() {
    return jobClusterKey;
  }

  /**
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setLibraries(Collection<Object /* MISSING TYPE */> libraries) {
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
   * <p>Setter for the field <code>maxRetries</code>.</p>
   *
   * @param maxRetries a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setMaxRetries(Long maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

  /**
   * <p>Getter for the field <code>maxRetries</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMaxRetries() {
    return maxRetries;
  }

  /**
   * <p>Setter for the field <code>minRetryIntervalMillis</code>.</p>
   *
   * @param minRetryIntervalMillis a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setMinRetryIntervalMillis(Long minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
  }

  /**
   * <p>Getter for the field <code>minRetryIntervalMillis</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinRetryIntervalMillis() {
    return minRetryIntervalMillis;
  }

  /**
   * <p>Setter for the field <code>newCluster</code>.</p>
   *
   * @param newCluster a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setNewCluster(Object /* MISSING TYPE */ newCluster) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setNotebookTask(NotebookTask notebookTask) {
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
   * <p>Setter for the field <code>notificationSettings</code>.</p>
   *
   * @param notificationSettings a {@link com.databricks.sdk.service.jobs.TaskNotificationSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  /**
   * <p>Getter for the field <code>notificationSettings</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TaskNotificationSettings} object
   */
  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  /**
   * <p>Setter for the field <code>pipelineTask</code>.</p>
   *
   * @param pipelineTask a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setPipelineTask(PipelineTask pipelineTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setPythonWheelTask(PythonWheelTask pythonWheelTask) {
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
   * <p>Setter for the field <code>retryOnTimeout</code>.</p>
   *
   * @param retryOnTimeout a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setRetryOnTimeout(Boolean retryOnTimeout) {
    this.retryOnTimeout = retryOnTimeout;
    return this;
  }

  /**
   * <p>Getter for the field <code>retryOnTimeout</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getRetryOnTimeout() {
    return retryOnTimeout;
  }

  /**
   * <p>Setter for the field <code>sparkJarTask</code>.</p>
   *
   * @param sparkJarTask a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setSparkJarTask(SparkJarTask sparkJarTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setSparkPythonTask(SparkPythonTask sparkPythonTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setSqlTask(SqlTask sqlTask) {
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
   * <p>Setter for the field <code>taskKey</code>.</p>
   *
   * @param taskKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setTaskKey(String taskKey) {
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

  /**
   * <p>Setter for the field <code>timeoutSeconds</code>.</p>
   *
   * @param timeoutSeconds a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.JobTaskSettings} object
   */
  public JobTaskSettings setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * <p>Getter for the field <code>timeoutSeconds</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobTaskSettings that = (JobTaskSettings) o;
    return Objects.equals(dbtTask, that.dbtTask)
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobTaskSettings.class)
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
