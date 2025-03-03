// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SubmitTask {
  /**
   * The task runs a [clean rooms] notebook when the `clean_rooms_notebook_task` field is present.
   *
   * <p>[clean rooms]: https://docs.databricks.com/en/clean-rooms/index.html
   */
  @JsonProperty("clean_rooms_notebook_task")
  private CleanRoomsNotebookTask cleanRoomsNotebookTask;

  /**
   * The task evaluates a condition that can be used to control the execution of other tasks when
   * the `condition_task` field is present. The condition task does not require a cluster to execute
   * and does not support retries or notifications.
   */
  @JsonProperty("condition_task")
  private ConditionTask conditionTask;

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
   * The key that references an environment spec in a job. This field is required for Python script,
   * Python wheel and dbt tasks when using serverless compute.
   */
  @JsonProperty("environment_key")
  private String environmentKey;

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
  private ForEachTask forEachTask;

  /** Next field: 9 */
  @JsonProperty("gen_ai_compute_task")
  private GenAiComputeTask genAiComputeTask;

  /** An optional set of health rules that can be defined for this job. */
  @JsonProperty("health")
  private JobsHealthRules health;

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

  public SubmitTask setCleanRoomsNotebookTask(CleanRoomsNotebookTask cleanRoomsNotebookTask) {
    this.cleanRoomsNotebookTask = cleanRoomsNotebookTask;
    return this;
  }

  public CleanRoomsNotebookTask getCleanRoomsNotebookTask() {
    return cleanRoomsNotebookTask;
  }

  public SubmitTask setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }

  public SubmitTask setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public SubmitTask setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }

  public SubmitTask setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SubmitTask setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public SubmitTask setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public SubmitTask setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public SubmitTask setForEachTask(ForEachTask forEachTask) {
    this.forEachTask = forEachTask;
    return this;
  }

  public ForEachTask getForEachTask() {
    return forEachTask;
  }

  public SubmitTask setGenAiComputeTask(GenAiComputeTask genAiComputeTask) {
    this.genAiComputeTask = genAiComputeTask;
    return this;
  }

  public GenAiComputeTask getGenAiComputeTask() {
    return genAiComputeTask;
  }

  public SubmitTask setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public SubmitTask setLibraries(Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public SubmitTask setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  public SubmitTask setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public SubmitTask setNotificationSettings(TaskNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public TaskNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public SubmitTask setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public SubmitTask setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public SubmitTask setRunIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
  }

  public RunIf getRunIf() {
    return runIf;
  }

  public SubmitTask setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
  }

  public SubmitTask setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public SubmitTask setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public SubmitTask setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public SubmitTask setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public SubmitTask setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  public SubmitTask setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public SubmitTask setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    SubmitTask that = (SubmitTask) o;
    return Objects.equals(cleanRoomsNotebookTask, that.cleanRoomsNotebookTask)
        && Objects.equals(conditionTask, that.conditionTask)
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
    return new ToStringer(SubmitTask.class)
        .add("cleanRoomsNotebookTask", cleanRoomsNotebookTask)
        .add("conditionTask", conditionTask)
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
