// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SubmitTaskPb {
  @JsonProperty("clean_rooms_notebook_task")
  private CleanRoomsNotebookTask cleanRoomsNotebookTask;

  @JsonProperty("condition_task")
  private ConditionTask conditionTask;

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

  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  @JsonProperty("environment_key")
  private String environmentKey;

  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  @JsonProperty("for_each_task")
  private ForEachTask forEachTask;

  @JsonProperty("gen_ai_compute_task")
  private GenAiComputeTask genAiComputeTask;

  @JsonProperty("health")
  private JobsHealthRules health;

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

  @JsonProperty("run_if")
  private RunIf runIf;

  @JsonProperty("run_job_task")
  private RunJobTask runJobTask;

  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;

  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  @JsonProperty("task_key")
  private String taskKey;

  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public SubmitTaskPb setCleanRoomsNotebookTask(CleanRoomsNotebookTask cleanRoomsNotebookTask) {
    this.cleanRoomsNotebookTask = cleanRoomsNotebookTask;
    return this;
  }

  public CleanRoomsNotebookTask getCleanRoomsNotebookTask() {
    return cleanRoomsNotebookTask;
  }

  public SubmitTaskPb setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }

  public SubmitTaskPb setDashboardTask(DashboardTask dashboardTask) {
    this.dashboardTask = dashboardTask;
    return this;
  }

  public DashboardTask getDashboardTask() {
    return dashboardTask;
  }

  public SubmitTaskPb setDbtCloudTask(DbtCloudTask dbtCloudTask) {
    this.dbtCloudTask = dbtCloudTask;
    return this;
  }

  public DbtCloudTask getDbtCloudTask() {
    return dbtCloudTask;
  }

  public SubmitTaskPb setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public SubmitTaskPb setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }

  public SubmitTaskPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SubmitTaskPb setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public SubmitTaskPb setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public SubmitTaskPb setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public SubmitTaskPb setForEachTask(ForEachTask forEachTask) {
    this.forEachTask = forEachTask;
    return this;
  }

  public ForEachTask getForEachTask() {
    return forEachTask;
  }

  public SubmitTaskPb setGenAiComputeTask(GenAiComputeTask genAiComputeTask) {
    this.genAiComputeTask = genAiComputeTask;
    return this;
  }

  public GenAiComputeTask getGenAiComputeTask() {
    return genAiComputeTask;
  }

  public SubmitTaskPb setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public SubmitTaskPb setLibraries(
      Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public SubmitTaskPb setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  public SubmitTaskPb setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public SubmitTaskPb setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public SubmitTaskPb setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public SubmitTaskPb setPowerBiTask(PowerBiTask powerBiTask) {
    this.powerBiTask = powerBiTask;
    return this;
  }

  public PowerBiTask getPowerBiTask() {
    return powerBiTask;
  }

  public SubmitTaskPb setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public SubmitTaskPb setRunIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
  }

  public RunIf getRunIf() {
    return runIf;
  }

  public SubmitTaskPb setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
  }

  public SubmitTaskPb setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public SubmitTaskPb setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public SubmitTaskPb setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public SubmitTaskPb setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public SubmitTaskPb setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public SubmitTaskPb setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public SubmitTaskPb setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    SubmitTaskPb that = (SubmitTaskPb) o;
    return Objects.equals(cleanRoomsNotebookTask, that.cleanRoomsNotebookTask)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dashboardTask, that.dashboardTask)
        && Objects.equals(dbtCloudTask, that.dbtCloudTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(dependsOn, that.dependsOn)
        && Objects.equals(description, that.description)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(environmentKey, that.environmentKey)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(forEachTask, that.forEachTask)
        && Objects.equals(genAiComputeTask, that.genAiComputeTask)
        && Objects.equals(health, that.health)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(powerBiTask, that.powerBiTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(runIf, that.runIf)
        && Objects.equals(runJobTask, that.runJobTask)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask)
        && Objects.equals(taskKey, that.taskKey)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cleanRoomsNotebookTask,
        conditionTask,
        dashboardTask,
        dbtCloudTask,
        dbtTask,
        dependsOn,
        description,
        emailNotifications,
        environmentKey,
        existingClusterId,
        forEachTask,
        genAiComputeTask,
        health,
        libraries,
        newCluster,
        notebookTask,
        notificationSettings,
        pipelineTask,
        powerBiTask,
        pythonWheelTask,
        runIf,
        runJobTask,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask,
        taskKey,
        timeoutSeconds,
        webhookNotifications);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitTaskPb.class)
        .add("cleanRoomsNotebookTask", cleanRoomsNotebookTask)
        .add("conditionTask", conditionTask)
        .add("dashboardTask", dashboardTask)
        .add("dbtCloudTask", dbtCloudTask)
        .add("dbtTask", dbtTask)
        .add("dependsOn", dependsOn)
        .add("description", description)
        .add("emailNotifications", emailNotifications)
        .add("environmentKey", environmentKey)
        .add("existingClusterId", existingClusterId)
        .add("forEachTask", forEachTask)
        .add("genAiComputeTask", genAiComputeTask)
        .add("health", health)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("powerBiTask", powerBiTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("runIf", runIf)
        .add("runJobTask", runJobTask)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .add("taskKey", taskKey)
        .add("timeoutSeconds", timeoutSeconds)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
