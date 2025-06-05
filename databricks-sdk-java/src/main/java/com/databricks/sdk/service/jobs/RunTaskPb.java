// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Used when outputting a child run, in GetRun or ListRuns. */
@Generated
class RunTaskPb {
  @JsonProperty("attempt_number")
  private Long attemptNumber;

  @JsonProperty("clean_rooms_notebook_task")
  private CleanRoomsNotebookTask cleanRoomsNotebookTask;

  @JsonProperty("cleanup_duration")
  private Long cleanupDuration;

  @JsonProperty("cluster_instance")
  private ClusterInstance clusterInstance;

  @JsonProperty("condition_task")
  private RunConditionTask conditionTask;

  @JsonProperty("dashboard_task")
  private DashboardTask dashboardTask;

  @JsonProperty("dbt_cloud_task")
  private DbtCloudTask dbtCloudTask;

  @JsonProperty("dbt_task")
  private DbtTask dbtTask;

  @JsonProperty("depends_on")
  private Collection<TaskDependency> dependsOn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("disabled")
  private Boolean disabled;

  @JsonProperty("effective_performance_target")
  private PerformanceTarget effectivePerformanceTarget;

  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("environment_key")
  private String environmentKey;

  @JsonProperty("execution_duration")
  private Long executionDuration;

  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  @JsonProperty("for_each_task")
  private RunForEachTask forEachTask;

  @JsonProperty("gen_ai_compute_task")
  private GenAiComputeTask genAiComputeTask;

  @JsonProperty("git_source")
  private GitSource gitSource;

  @JsonProperty("job_cluster_key")
  private String jobClusterKey;

  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;

  @JsonProperty("notification_settings")
  private TaskNotificationSettings notificationSettings;

  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;

  @JsonProperty("power_bi_task")
  private PowerBiTask powerBiTask;

  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;

  @JsonProperty("queue_duration")
  private Long queueDuration;

  @JsonProperty("resolved_values")
  private ResolvedValues resolvedValues;

  @JsonProperty("run_duration")
  private Long runDuration;

  @JsonProperty("run_id")
  private Long runId;

  @JsonProperty("run_if")
  private RunIf runIf;

  @JsonProperty("run_job_task")
  private RunJobTask runJobTask;

  @JsonProperty("run_page_url")
  private String runPageUrl;

  @JsonProperty("setup_duration")
  private Long setupDuration;

  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;

  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("state")
  private RunState state;

  @JsonProperty("status")
  private RunStatus status;

  @JsonProperty("task_key")
  private String taskKey;

  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public RunTaskPb setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }

  public RunTaskPb setCleanRoomsNotebookTask(CleanRoomsNotebookTask cleanRoomsNotebookTask) {
    this.cleanRoomsNotebookTask = cleanRoomsNotebookTask;
    return this;
  }

  public CleanRoomsNotebookTask getCleanRoomsNotebookTask() {
    return cleanRoomsNotebookTask;
  }

  public RunTaskPb setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  public RunTaskPb setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  public RunTaskPb setConditionTask(RunConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public RunConditionTask getConditionTask() {
    return conditionTask;
  }

  public RunTaskPb setDashboardTask(DashboardTask dashboardTask) {
    this.dashboardTask = dashboardTask;
    return this;
  }

  public DashboardTask getDashboardTask() {
    return dashboardTask;
  }

  public RunTaskPb setDbtCloudTask(DbtCloudTask dbtCloudTask) {
    this.dbtCloudTask = dbtCloudTask;
    return this;
  }

  public DbtCloudTask getDbtCloudTask() {
    return dbtCloudTask;
  }

  public RunTaskPb setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public RunTaskPb setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }

  public RunTaskPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RunTaskPb setDisabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public RunTaskPb setEffectivePerformanceTarget(PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public RunTaskPb setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public RunTaskPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public RunTaskPb setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public RunTaskPb setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  public Long getExecutionDuration() {
    return executionDuration;
  }

  public RunTaskPb setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public RunTaskPb setForEachTask(RunForEachTask forEachTask) {
    this.forEachTask = forEachTask;
    return this;
  }

  public RunForEachTask getForEachTask() {
    return forEachTask;
  }

  public RunTaskPb setGenAiComputeTask(GenAiComputeTask genAiComputeTask) {
    this.genAiComputeTask = genAiComputeTask;
    return this;
  }

  public GenAiComputeTask getGenAiComputeTask() {
    return genAiComputeTask;
  }

  public RunTaskPb setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public RunTaskPb setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public RunTaskPb setLibraries(Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public RunTaskPb setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  public RunTaskPb setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public RunTaskPb setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public RunTaskPb setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public RunTaskPb setPowerBiTask(PowerBiTask powerBiTask) {
    this.powerBiTask = powerBiTask;
    return this;
  }

  public PowerBiTask getPowerBiTask() {
    return powerBiTask;
  }

  public RunTaskPb setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public RunTaskPb setQueueDuration(Long queueDuration) {
    this.queueDuration = queueDuration;
    return this;
  }

  public Long getQueueDuration() {
    return queueDuration;
  }

  public RunTaskPb setResolvedValues(ResolvedValues resolvedValues) {
    this.resolvedValues = resolvedValues;
    return this;
  }

  public ResolvedValues getResolvedValues() {
    return resolvedValues;
  }

  public RunTaskPb setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public RunTaskPb setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public RunTaskPb setRunIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
  }

  public RunIf getRunIf() {
    return runIf;
  }

  public RunTaskPb setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
  }

  public RunTaskPb setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  public String getRunPageUrl() {
    return runPageUrl;
  }

  public RunTaskPb setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  public Long getSetupDuration() {
    return setupDuration;
  }

  public RunTaskPb setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public RunTaskPb setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public RunTaskPb setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public RunTaskPb setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public RunTaskPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public RunTaskPb setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public RunTaskPb setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public RunTaskPb setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public RunTaskPb setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public RunTaskPb setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    RunTaskPb that = (RunTaskPb) o;
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
    return new ToStringer(RunTaskPb.class)
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
}
