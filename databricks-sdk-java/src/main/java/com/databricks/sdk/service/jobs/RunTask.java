// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Used when outputting a child run, in GetRun or ListRuns. */
@Generated
public class RunTask {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` > 0), subsequent runs are created with an `original_attempt_run_id` of the
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
   * The task evaluates a condition that can be used to control the execution of other tasks when
   * the `condition_task` field is present. The condition task does not require a cluster to execute
   * and does not support retries or notifications.
   */
  @JsonProperty("condition_task")
  private RunConditionTask conditionTask;

  /**
   * The task runs one or more dbt commands when the `dbt_task` field is present. The dbt task
   * requires both Databricks SQL and the ability to use a serverless or a pro SQL warehouse.
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

  /** An optional description for this task. */
  @JsonProperty("description")
  private String description;

  /**
   * An optional set of email addresses notified when the task run begins or completes. The default
   * behavior is to not send any emails.
   */
  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  @JsonProperty("end_time")
  private Long endTime;

  /**
   * The key that references an environment spec in a job. This field is required for Python script,
   * Python wheel and dbt tasks when using serverless compute.
   */
  @JsonProperty("environment_key")
  private String environmentKey;

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
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs. When running
   * jobs or tasks on an existing cluster, you may need to manually restart the cluster if it stops
   * responding. We suggest running jobs and tasks on new clusters for greater reliability
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  /**
   * The task executes a nested task for every input provided when the `for_each_task` field is
   * present.
   */
  @JsonProperty("for_each_task")
  private RunForEachTask forEachTask;

  /**
   * An optional specification for a remote Git repository containing the source code used by tasks.
   * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File
   * tasks. If `git_source` is set, these tasks retrieve the file from the remote repository by
   * default. However, this behavior can be overridden by setting `source` to `WORKSPACE` on the
   * task. Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File
   * tasks are used, `git_source` must be defined on the job.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * If job_cluster_key, this task is executed reusing the cluster specified in
   * `job.settings.job_clusters`.
   */
  @JsonProperty("job_cluster_key")
  private String jobClusterKey;

  /**
   * An optional list of libraries to be installed on the cluster. The default value is an empty
   * list.
   */
  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  /** If new_cluster, a description of a new cluster that is created for each run. */
  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  /** The task runs a notebook when the `notebook_task` field is present. */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this task run.
   */
  @JsonProperty("notification_settings")
  private TaskNotificationSettings notificationSettings;

  /**
   * The task triggers a pipeline update when the `pipeline_task` field is present. Only pipelines
   * configured to use triggered more are supported.
   */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;

  /** The task runs a Python wheel when the `python_wheel_task` field is present. */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;

  /** The time in milliseconds that the run has spent in the queue. */
  @JsonProperty("queue_duration")
  private Long queueDuration;

  /** Parameter values including resolved references */
  @JsonProperty("resolved_values")
  private ResolvedValues resolvedValues;

  /** The time in milliseconds it took the job run and all of its repairs to finish. */
  @JsonProperty("run_duration")
  private Long runDuration;

  /** The ID of the task run. */
  @JsonProperty("run_id")
  private Long runId;

  /**
   * An optional value indicating the condition that determines whether the task should be run once
   * its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`. See
   * :method:jobs/create for a list of possible values.
   */
  @JsonProperty("run_if")
  private RunIf runIf;

  /** The task triggers another job when the `run_job_task` field is present. */
  @JsonProperty("run_job_task")
  private RunJobTask runJobTask;

  /** */
  @JsonProperty("run_page_url")
  private String runPageUrl;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("setup_duration")
  private Long setupDuration;

  /** The task runs a JAR when the `spark_jar_task` field is present. */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  /** The task runs a Python file when the `spark_python_task` field is present. */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  /**
   * (Legacy) The task runs the spark-submit script when the `spark_submit_task` field is present.
   * This task can run only on new clusters and is not compatible with serverless compute.
   *
   * <p>In the `new_cluster` specification, `libraries` and `spark_conf` are not supported. Instead,
   * use `--jars` and `--py-files` to add Java and Python libraries and `--conf` to set the Spark
   * configurations.
   *
   * <p>`master`, `deploy-mode`, and `executor-cores` are automatically configured by Databricks;
   * you _cannot_ specify them in parameters.
   *
   * <p>By default, the Spark submit job uses all available memory (excluding reserved memory for
   * Databricks services). You can set `--driver-memory`, and `--executor-memory` to a smaller value
   * to leave some room for off-heap usage.
   *
   * <p>The `--jars`, `--py-files`, `--files` arguments support DBFS and S3 paths.
   */
  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;

  /**
   * The task runs a SQL query or file, or it refreshes a SQL alert or a legacy SQL dashboard when
   * the `sql_task` field is present.
   */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  /**
   * The time at which this run was started in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   * This may not be the time when the job task starts executing, for example, if the job is
   * scheduled to run on a new cluster, this is the time the cluster creation call is issued.
   */
  @JsonProperty("start_time")
  private Long startTime;

  /** Deprecated. Please use the `status` field instead. */
  @JsonProperty("state")
  private RunState state;

  /** The current status of the run */
  @JsonProperty("status")
  private RunStatus status;

  /**
   * A unique name for the task. This field is used to refer to this task from other tasks. This
   * field is required and must be unique within its parent job. On Update or Reset, this field is
   * used to reference the tasks to be updated or reset.
   */
  @JsonProperty("task_key")
  private String taskKey;

  /** An optional timeout applied to each run of this job task. A value of `0` means no timeout. */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  /**
   * A collection of system notification IDs to notify when the run begins or completes. The default
   * behavior is to not send any system notifications. Task webhooks respect the task notification
   * settings.
   */
  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

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

  public RunTask setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public RunTask setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RunTask setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
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

  public RunTask setForEachTask(RunForEachTask forEachTask) {
    this.forEachTask = forEachTask;
    return this;
  }

  public RunForEachTask getForEachTask() {
    return forEachTask;
  }

  public RunTask setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public RunTask setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
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

  public RunTask setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
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

  public RunTask setQueueDuration(Long queueDuration) {
    this.queueDuration = queueDuration;
    return this;
  }

  public Long getQueueDuration() {
    return queueDuration;
  }

  public RunTask setResolvedValues(ResolvedValues resolvedValues) {
    this.resolvedValues = resolvedValues;
    return this;
  }

  public ResolvedValues getResolvedValues() {
    return resolvedValues;
  }

  public RunTask setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
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

  public RunTask setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  public String getRunPageUrl() {
    return runPageUrl;
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

  public RunTask setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public RunTask setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public RunTask setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public RunTask setWebhookNotifications(WebhookNotifications webhookNotifications) {
    this.webhookNotifications = webhookNotifications;
    return this;
  }

  public WebhookNotifications getWebhookNotifications() {
    return webhookNotifications;
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
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(environmentKey, that.environmentKey)
        && Objects.equals(executionDuration, that.executionDuration)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(forEachTask, that.forEachTask)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(queueDuration, that.queueDuration)
        && Objects.equals(resolvedValues, that.resolvedValues)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runIf, that.runIf)
        && Objects.equals(runJobTask, that.runJobTask)
        && Objects.equals(runPageUrl, that.runPageUrl)
        && Objects.equals(setupDuration, that.setupDuration)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status)
        && Objects.equals(taskKey, that.taskKey)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attemptNumber,
        cleanupDuration,
        clusterInstance,
        conditionTask,
        dbtTask,
        dependsOn,
        description,
        emailNotifications,
        endTime,
        environmentKey,
        executionDuration,
        existingClusterId,
        forEachTask,
        gitSource,
        jobClusterKey,
        libraries,
        newCluster,
        notebookTask,
        notificationSettings,
        pipelineTask,
        pythonWheelTask,
        queueDuration,
        resolvedValues,
        runDuration,
        runId,
        runIf,
        runJobTask,
        runPageUrl,
        setupDuration,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask,
        startTime,
        state,
        status,
        taskKey,
        timeoutSeconds,
        webhookNotifications);
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
        .add("emailNotifications", emailNotifications)
        .add("endTime", endTime)
        .add("environmentKey", environmentKey)
        .add("executionDuration", executionDuration)
        .add("existingClusterId", existingClusterId)
        .add("forEachTask", forEachTask)
        .add("gitSource", gitSource)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("queueDuration", queueDuration)
        .add("resolvedValues", resolvedValues)
        .add("runDuration", runDuration)
        .add("runId", runId)
        .add("runIf", runIf)
        .add("runJobTask", runJobTask)
        .add("runPageUrl", runPageUrl)
        .add("setupDuration", setupDuration)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .add("startTime", startTime)
        .add("state", state)
        .add("status", status)
        .add("taskKey", taskKey)
        .add("timeoutSeconds", timeoutSeconds)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
