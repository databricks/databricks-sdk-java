// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

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
  private java.util.List<TaskDependenciesItem> dependsOn;

  /** An optional description for this task. The maximum length is 4096 bytes. */
  @JsonProperty("description")
  private String description;

  /**
   * An optional set of email addresses that is notified when runs of this task begin or complete as
   * well as when this task is deleted. The default behavior is to not send any emails.
   */
  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

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
  private java.util.List<Object /* MISSING TYPE */> libraries;

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

  public JobTaskSettings setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public JobTaskSettings setDependsOn(java.util.List<TaskDependenciesItem> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public java.util.List<TaskDependenciesItem> getDependsOn() {
    return dependsOn;
  }

  public JobTaskSettings setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public JobTaskSettings setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public JobTaskSettings setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public JobTaskSettings setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public JobTaskSettings setLibraries(java.util.List<Object /* MISSING TYPE */> libraries) {
    this.libraries = libraries;
    return this;
  }

  public java.util.List<Object /* MISSING TYPE */> getLibraries() {
    return libraries;
  }

  public JobTaskSettings setMaxRetries(Long maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

  public Long getMaxRetries() {
    return maxRetries;
  }

  public JobTaskSettings setMinRetryIntervalMillis(Long minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
  }

  public Long getMinRetryIntervalMillis() {
    return minRetryIntervalMillis;
  }

  public JobTaskSettings setNewCluster(Object /* MISSING TYPE */ newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public Object /* MISSING TYPE */ getNewCluster() {
    return newCluster;
  }

  public JobTaskSettings setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public JobTaskSettings setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public JobTaskSettings setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public JobTaskSettings setRetryOnTimeout(Boolean retryOnTimeout) {
    this.retryOnTimeout = retryOnTimeout;
    return this;
  }

  public Boolean getRetryOnTimeout() {
    return retryOnTimeout;
  }

  public JobTaskSettings setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public JobTaskSettings setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public JobTaskSettings setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public JobTaskSettings setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public JobTaskSettings setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public JobTaskSettings setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }
}
