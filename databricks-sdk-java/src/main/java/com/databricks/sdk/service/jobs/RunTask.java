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
import java.util.Objects;

/** Used when outputting a child run, in GetRun or ListRuns. */
@Generated
@JsonSerialize(using = RunTask.RunTaskSerializer.class)
@JsonDeserialize(using = RunTask.RunTaskDeserializer.class)
public class RunTask {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` > 0), subsequent runs are created with an `original_attempt_run_id` of the
   * original attempt’s ID and an incrementing `attempt_number`. Runs are retried only until they
   * succeed, and the maximum `attempt_number` is the same as the `max_retries` value for the job.
   */
  private Long attemptNumber;

  /**
   * The task runs a [clean rooms] notebook when the `clean_rooms_notebook_task` field is present.
   *
   * <p>[clean rooms]: https://docs.databricks.com/en/clean-rooms/index.html
   */
  private CleanRoomsNotebookTask cleanRoomsNotebookTask;

  /**
   * The time in milliseconds it took to terminate the cluster and clean up any associated
   * artifacts. The duration of a task run is the sum of the `setup_duration`, `execution_duration`,
   * and the `cleanup_duration`. The `cleanup_duration` field is set to 0 for multitask job runs.
   * The total duration of a multitask job run is the value of the `run_duration` field.
   */
  private Long cleanupDuration;

  /**
   * The cluster used for this run. If the run is specified to use a new cluster, this field is set
   * once the Jobs service has requested a cluster for the run.
   */
  private ClusterInstance clusterInstance;

  /**
   * The task evaluates a condition that can be used to control the execution of other tasks when
   * the `condition_task` field is present. The condition task does not require a cluster to execute
   * and does not support retries or notifications.
   */
  private RunConditionTask conditionTask;

  /** The task refreshes a dashboard and sends a snapshot to subscribers. */
  private DashboardTask dashboardTask;

  /** Task type for dbt cloud */
  private DbtCloudTask dbtCloudTask;

  /**
   * The task runs one or more dbt commands when the `dbt_task` field is present. The dbt task
   * requires both Databricks SQL and the ability to use a serverless or a pro SQL warehouse.
   */
  private DbtTask dbtTask;

  /**
   * An optional array of objects specifying the dependency graph of the task. All tasks specified
   * in this field must complete successfully before executing this task. The key is `task_key`, and
   * the value is the name assigned to the dependent task.
   */
  private Collection<TaskDependency> dependsOn;

  /** An optional description for this task. */
  private String description;

  /** Deprecated, field was never used in production. */
  private Boolean disabled;

  /**
   * The actual performance target used by the serverless run during execution. This can differ from
   * the client-set performance target on the request depending on whether the performance mode is
   * supported by the job type.
   *
   * <p>* `STANDARD`: Enables cost-efficient execution of serverless workloads. *
   * `PERFORMANCE_OPTIMIZED`: Prioritizes fast startup and execution times through rapid scaling and
   * optimized cluster performance.
   */
  private PerformanceTarget effectivePerformanceTarget;

  /**
   * An optional set of email addresses notified when the task run begins or completes. The default
   * behavior is to not send any emails.
   */
  private JobEmailNotifications emailNotifications;

  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  private Long endTime;

  /**
   * The key that references an environment spec in a job. This field is required for Python script,
   * Python wheel and dbt tasks when using serverless compute.
   */
  private String environmentKey;

  /**
   * The time in milliseconds it took to execute the commands in the JAR or notebook until they
   * completed, failed, timed out, were cancelled, or encountered an unexpected error. The duration
   * of a task run is the sum of the `setup_duration`, `execution_duration`, and the
   * `cleanup_duration`. The `execution_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  private Long executionDuration;

  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs. When running
   * jobs or tasks on an existing cluster, you may need to manually restart the cluster if it stops
   * responding. We suggest running jobs and tasks on new clusters for greater reliability
   */
  private String existingClusterId;

  /**
   * The task executes a nested task for every input provided when the `for_each_task` field is
   * present.
   */
  private RunForEachTask forEachTask;

  /** */
  private GenAiComputeTask genAiComputeTask;

  /**
   * An optional specification for a remote Git repository containing the source code used by tasks.
   * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File
   * tasks. If `git_source` is set, these tasks retrieve the file from the remote repository by
   * default. However, this behavior can be overridden by setting `source` to `WORKSPACE` on the
   * task. Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File
   * tasks are used, `git_source` must be defined on the job.
   */
  private GitSource gitSource;

  /**
   * If job_cluster_key, this task is executed reusing the cluster specified in
   * `job.settings.job_clusters`.
   */
  private String jobClusterKey;

  /**
   * An optional list of libraries to be installed on the cluster. The default value is an empty
   * list.
   */
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  /** If new_cluster, a description of a new cluster that is created for each run. */
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  /** The task runs a notebook when the `notebook_task` field is present. */
  private NotebookTask notebookTask;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this task run.
   */
  private TaskNotificationSettings notificationSettings;

  /**
   * The task triggers a pipeline update when the `pipeline_task` field is present. Only pipelines
   * configured to use triggered more are supported.
   */
  private PipelineTask pipelineTask;

  /**
   * The task triggers a Power BI semantic model update when the `power_bi_task` field is present.
   */
  private PowerBiTask powerBiTask;

  /** The task runs a Python wheel when the `python_wheel_task` field is present. */
  private PythonWheelTask pythonWheelTask;

  /** The time in milliseconds that the run has spent in the queue. */
  private Long queueDuration;

  /** Parameter values including resolved references */
  private ResolvedValues resolvedValues;

  /** The time in milliseconds it took the job run and all of its repairs to finish. */
  private Long runDuration;

  /** The ID of the task run. */
  private Long runId;

  /**
   * An optional value indicating the condition that determines whether the task should be run once
   * its dependencies have been completed. When omitted, defaults to `ALL_SUCCESS`. See
   * :method:jobs/create for a list of possible values.
   */
  private RunIf runIf;

  /** The task triggers another job when the `run_job_task` field is present. */
  private RunJobTask runJobTask;

  /** */
  private String runPageUrl;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  private Long setupDuration;

  /** The task runs a JAR when the `spark_jar_task` field is present. */
  private SparkJarTask sparkJarTask;

  /** The task runs a Python file when the `spark_python_task` field is present. */
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
  private SparkSubmitTask sparkSubmitTask;

  /**
   * The task runs a SQL query or file, or it refreshes a SQL alert or a legacy SQL dashboard when
   * the `sql_task` field is present.
   */
  private SqlTask sqlTask;

  /**
   * The time at which this run was started in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   * This may not be the time when the job task starts executing, for example, if the job is
   * scheduled to run on a new cluster, this is the time the cluster creation call is issued.
   */
  private Long startTime;

  /** Deprecated. Please use the `status` field instead. */
  private RunState state;

  /** The current status of the run */
  private RunStatus status;

  /**
   * A unique name for the task. This field is used to refer to this task from other tasks. This
   * field is required and must be unique within its parent job. On Update or Reset, this field is
   * used to reference the tasks to be updated or reset.
   */
  private String taskKey;

  /** An optional timeout applied to each run of this job task. A value of `0` means no timeout. */
  private Long timeoutSeconds;

  /**
   * A collection of system notification IDs to notify when the run begins or completes. The default
   * behavior is to not send any system notifications. Task webhooks respect the task notification
   * settings.
   */
  private WebhookNotifications webhookNotifications;

  public RunTask setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }

  public RunTask setCleanRoomsNotebookTask(CleanRoomsNotebookTask cleanRoomsNotebookTask) {
    this.cleanRoomsNotebookTask = cleanRoomsNotebookTask;
    return this;
  }

  public CleanRoomsNotebookTask getCleanRoomsNotebookTask() {
    return cleanRoomsNotebookTask;
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

  public RunTask setDashboardTask(DashboardTask dashboardTask) {
    this.dashboardTask = dashboardTask;
    return this;
  }

  public DashboardTask getDashboardTask() {
    return dashboardTask;
  }

  public RunTask setDbtCloudTask(DbtCloudTask dbtCloudTask) {
    this.dbtCloudTask = dbtCloudTask;
    return this;
  }

  public DbtCloudTask getDbtCloudTask() {
    return dbtCloudTask;
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

  public RunTask setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public RunTask setEffectivePerformanceTarget(PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
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

  public RunTask setGenAiComputeTask(GenAiComputeTask genAiComputeTask) {
    this.genAiComputeTask = genAiComputeTask;
    return this;
  }

  public GenAiComputeTask getGenAiComputeTask() {
    return genAiComputeTask;
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

  public RunTask setPowerBiTask(PowerBiTask powerBiTask) {
    this.powerBiTask = powerBiTask;
    return this;
  }

  public PowerBiTask getPowerBiTask() {
    return powerBiTask;
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
        && Objects.equals(cleanRoomsNotebookTask, that.cleanRoomsNotebookTask)
        && Objects.equals(cleanupDuration, that.cleanupDuration)
        && Objects.equals(clusterInstance, that.clusterInstance)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dashboardTask, that.dashboardTask)
        && Objects.equals(dbtCloudTask, that.dbtCloudTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(dependsOn, that.dependsOn)
        && Objects.equals(description, that.description)
        && Objects.equals(disabled, that.disabled)
        && Objects.equals(effectivePerformanceTarget, that.effectivePerformanceTarget)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(environmentKey, that.environmentKey)
        && Objects.equals(executionDuration, that.executionDuration)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(forEachTask, that.forEachTask)
        && Objects.equals(genAiComputeTask, that.genAiComputeTask)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(powerBiTask, that.powerBiTask)
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
        cleanRoomsNotebookTask,
        cleanupDuration,
        clusterInstance,
        conditionTask,
        dashboardTask,
        dbtCloudTask,
        dbtTask,
        dependsOn,
        description,
        disabled,
        effectivePerformanceTarget,
        emailNotifications,
        endTime,
        environmentKey,
        executionDuration,
        existingClusterId,
        forEachTask,
        genAiComputeTask,
        gitSource,
        jobClusterKey,
        libraries,
        newCluster,
        notebookTask,
        notificationSettings,
        pipelineTask,
        powerBiTask,
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
        .add("cleanRoomsNotebookTask", cleanRoomsNotebookTask)
        .add("cleanupDuration", cleanupDuration)
        .add("clusterInstance", clusterInstance)
        .add("conditionTask", conditionTask)
        .add("dashboardTask", dashboardTask)
        .add("dbtCloudTask", dbtCloudTask)
        .add("dbtTask", dbtTask)
        .add("dependsOn", dependsOn)
        .add("description", description)
        .add("disabled", disabled)
        .add("effectivePerformanceTarget", effectivePerformanceTarget)
        .add("emailNotifications", emailNotifications)
        .add("endTime", endTime)
        .add("environmentKey", environmentKey)
        .add("executionDuration", executionDuration)
        .add("existingClusterId", existingClusterId)
        .add("forEachTask", forEachTask)
        .add("genAiComputeTask", genAiComputeTask)
        .add("gitSource", gitSource)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("powerBiTask", powerBiTask)
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

  RunTaskPb toPb() {
    RunTaskPb pb = new RunTaskPb();
    pb.setAttemptNumber(attemptNumber);
    pb.setCleanRoomsNotebookTask(cleanRoomsNotebookTask);
    pb.setCleanupDuration(cleanupDuration);
    pb.setClusterInstance(clusterInstance);
    pb.setConditionTask(conditionTask);
    pb.setDashboardTask(dashboardTask);
    pb.setDbtCloudTask(dbtCloudTask);
    pb.setDbtTask(dbtTask);
    pb.setDependsOn(dependsOn);
    pb.setDescription(description);
    pb.setDisabled(disabled);
    pb.setEffectivePerformanceTarget(effectivePerformanceTarget);
    pb.setEmailNotifications(emailNotifications);
    pb.setEndTime(endTime);
    pb.setEnvironmentKey(environmentKey);
    pb.setExecutionDuration(executionDuration);
    pb.setExistingClusterId(existingClusterId);
    pb.setForEachTask(forEachTask);
    pb.setGenAiComputeTask(genAiComputeTask);
    pb.setGitSource(gitSource);
    pb.setJobClusterKey(jobClusterKey);
    pb.setLibraries(libraries);
    pb.setNewCluster(newCluster);
    pb.setNotebookTask(notebookTask);
    pb.setNotificationSettings(notificationSettings);
    pb.setPipelineTask(pipelineTask);
    pb.setPowerBiTask(powerBiTask);
    pb.setPythonWheelTask(pythonWheelTask);
    pb.setQueueDuration(queueDuration);
    pb.setResolvedValues(resolvedValues);
    pb.setRunDuration(runDuration);
    pb.setRunId(runId);
    pb.setRunIf(runIf);
    pb.setRunJobTask(runJobTask);
    pb.setRunPageUrl(runPageUrl);
    pb.setSetupDuration(setupDuration);
    pb.setSparkJarTask(sparkJarTask);
    pb.setSparkPythonTask(sparkPythonTask);
    pb.setSparkSubmitTask(sparkSubmitTask);
    pb.setSqlTask(sqlTask);
    pb.setStartTime(startTime);
    pb.setState(state);
    pb.setStatus(status);
    pb.setTaskKey(taskKey);
    pb.setTimeoutSeconds(timeoutSeconds);
    pb.setWebhookNotifications(webhookNotifications);

    return pb;
  }

  static RunTask fromPb(RunTaskPb pb) {
    RunTask model = new RunTask();
    model.setAttemptNumber(pb.getAttemptNumber());
    model.setCleanRoomsNotebookTask(pb.getCleanRoomsNotebookTask());
    model.setCleanupDuration(pb.getCleanupDuration());
    model.setClusterInstance(pb.getClusterInstance());
    model.setConditionTask(pb.getConditionTask());
    model.setDashboardTask(pb.getDashboardTask());
    model.setDbtCloudTask(pb.getDbtCloudTask());
    model.setDbtTask(pb.getDbtTask());
    model.setDependsOn(pb.getDependsOn());
    model.setDescription(pb.getDescription());
    model.setDisabled(pb.getDisabled());
    model.setEffectivePerformanceTarget(pb.getEffectivePerformanceTarget());
    model.setEmailNotifications(pb.getEmailNotifications());
    model.setEndTime(pb.getEndTime());
    model.setEnvironmentKey(pb.getEnvironmentKey());
    model.setExecutionDuration(pb.getExecutionDuration());
    model.setExistingClusterId(pb.getExistingClusterId());
    model.setForEachTask(pb.getForEachTask());
    model.setGenAiComputeTask(pb.getGenAiComputeTask());
    model.setGitSource(pb.getGitSource());
    model.setJobClusterKey(pb.getJobClusterKey());
    model.setLibraries(pb.getLibraries());
    model.setNewCluster(pb.getNewCluster());
    model.setNotebookTask(pb.getNotebookTask());
    model.setNotificationSettings(pb.getNotificationSettings());
    model.setPipelineTask(pb.getPipelineTask());
    model.setPowerBiTask(pb.getPowerBiTask());
    model.setPythonWheelTask(pb.getPythonWheelTask());
    model.setQueueDuration(pb.getQueueDuration());
    model.setResolvedValues(pb.getResolvedValues());
    model.setRunDuration(pb.getRunDuration());
    model.setRunId(pb.getRunId());
    model.setRunIf(pb.getRunIf());
    model.setRunJobTask(pb.getRunJobTask());
    model.setRunPageUrl(pb.getRunPageUrl());
    model.setSetupDuration(pb.getSetupDuration());
    model.setSparkJarTask(pb.getSparkJarTask());
    model.setSparkPythonTask(pb.getSparkPythonTask());
    model.setSparkSubmitTask(pb.getSparkSubmitTask());
    model.setSqlTask(pb.getSqlTask());
    model.setStartTime(pb.getStartTime());
    model.setState(pb.getState());
    model.setStatus(pb.getStatus());
    model.setTaskKey(pb.getTaskKey());
    model.setTimeoutSeconds(pb.getTimeoutSeconds());
    model.setWebhookNotifications(pb.getWebhookNotifications());

    return model;
  }

  public static class RunTaskSerializer extends JsonSerializer<RunTask> {
    @Override
    public void serialize(RunTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunTaskDeserializer extends JsonDeserializer<RunTask> {
    @Override
    public RunTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunTaskPb pb = mapper.readValue(p, RunTaskPb.class);
      return RunTask.fromPb(pb);
    }
  }
}
