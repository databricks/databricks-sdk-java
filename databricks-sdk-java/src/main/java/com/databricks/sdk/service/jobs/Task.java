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

@Generated
@JsonSerialize(using = Task.TaskSerializer.class)
@JsonDeserialize(using = Task.TaskDeserializer.class)
public class Task {
  /**
   * The task runs a [clean rooms] notebook when the `clean_rooms_notebook_task` field is present.
   *
   * <p>[clean rooms]: https://docs.databricks.com/en/clean-rooms/index.html
   */
  private CleanRoomsNotebookTask cleanRoomsNotebookTask;

  /**
   * The task evaluates a condition that can be used to control the execution of other tasks when
   * the `condition_task` field is present. The condition task does not require a cluster to execute
   * and does not support retries or notifications.
   */
  private ConditionTask conditionTask;

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
   * in this field must complete before executing this task. The task will run only if the `run_if`
   * condition is true. The key is `task_key`, and the value is the name assigned to the dependent
   * task.
   */
  private Collection<TaskDependency> dependsOn;

  /** An optional description for this task. */
  private String description;

  /** An option to disable auto optimization in serverless */
  private Boolean disableAutoOptimization;

  /**
   * An optional set of email addresses that is notified when runs of this task begin or complete as
   * well as when this task is deleted. The default behavior is to not send any emails.
   */
  private TaskEmailNotifications emailNotifications;

  /**
   * The key that references an environment spec in a job. This field is required for Python script,
   * Python wheel and dbt tasks when using serverless compute.
   */
  private String environmentKey;

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
  private ForEachTask forEachTask;

  /** */
  private GenAiComputeTask genAiComputeTask;

  /** An optional set of health rules that can be defined for this job. */
  private JobsHealthRules health;

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

  /**
   * An optional maximum number of times to retry an unsuccessful run. A run is considered to be
   * unsuccessful if it completes with the `FAILED` result_state or `INTERNAL_ERROR`
   * `life_cycle_state`. The value `-1` means to retry indefinitely and the value `0` means to never
   * retry.
   */
  private Long maxRetries;

  /**
   * An optional minimal interval in milliseconds between the start of the failed run and the
   * subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
   */
  private Long minRetryIntervalMillis;

  /** If new_cluster, a description of a new cluster that is created for each run. */
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  /** The task runs a notebook when the `notebook_task` field is present. */
  private NotebookTask notebookTask;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this task.
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

  /**
   * An optional policy to specify whether to retry a job when it times out. The default behavior is
   * to not retry on timeout.
   */
  private Boolean retryOnTimeout;

  /**
   * An optional value specifying the condition determining whether the task is run once its
   * dependencies have been completed.
   *
   * <p>* `ALL_SUCCESS`: All dependencies have executed and succeeded * `AT_LEAST_ONE_SUCCESS`: At
   * least one dependency has succeeded * `NONE_FAILED`: None of the dependencies have failed and at
   * least one was executed * `ALL_DONE`: All dependencies have been completed *
   * `AT_LEAST_ONE_FAILED`: At least one dependency failed * `ALL_FAILED`: ALl dependencies have
   * failed
   */
  private RunIf runIf;

  /** The task triggers another job when the `run_job_task` field is present. */
  private RunJobTask runJobTask;

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
   * A unique name for the task. This field is used to refer to this task from other tasks. This
   * field is required and must be unique within its parent job. On Update or Reset, this field is
   * used to reference the tasks to be updated or reset.
   */
  private String taskKey;

  /** An optional timeout applied to each run of this job task. A value of `0` means no timeout. */
  private Long timeoutSeconds;

  /**
   * A collection of system notification IDs to notify when runs of this task begin or complete. The
   * default behavior is to not send any system notifications.
   */
  private WebhookNotifications webhookNotifications;

  public Task setCleanRoomsNotebookTask(CleanRoomsNotebookTask cleanRoomsNotebookTask) {
    this.cleanRoomsNotebookTask = cleanRoomsNotebookTask;
    return this;
  }

  public CleanRoomsNotebookTask getCleanRoomsNotebookTask() {
    return cleanRoomsNotebookTask;
  }

  public Task setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }

  public Task setDashboardTask(DashboardTask dashboardTask) {
    this.dashboardTask = dashboardTask;
    return this;
  }

  public DashboardTask getDashboardTask() {
    return dashboardTask;
  }

  public Task setDbtCloudTask(DbtCloudTask dbtCloudTask) {
    this.dbtCloudTask = dbtCloudTask;
    return this;
  }

  public DbtCloudTask getDbtCloudTask() {
    return dbtCloudTask;
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

  public Task setDisableAutoOptimization(Boolean disableAutoOptimization) {
    this.disableAutoOptimization = disableAutoOptimization;
    return this;
  }

  public Boolean getDisableAutoOptimization() {
    return disableAutoOptimization;
  }

  public Task setEmailNotifications(TaskEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public TaskEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public Task setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public Task setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public Task setForEachTask(ForEachTask forEachTask) {
    this.forEachTask = forEachTask;
    return this;
  }

  public ForEachTask getForEachTask() {
    return forEachTask;
  }

  public Task setGenAiComputeTask(GenAiComputeTask genAiComputeTask) {
    this.genAiComputeTask = genAiComputeTask;
    return this;
  }

  public GenAiComputeTask getGenAiComputeTask() {
    return genAiComputeTask;
  }

  public Task setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
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

  public Task setPowerBiTask(PowerBiTask powerBiTask) {
    this.powerBiTask = powerBiTask;
    return this;
  }

  public PowerBiTask getPowerBiTask() {
    return powerBiTask;
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

  public Task setRunIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
  }

  public RunIf getRunIf() {
    return runIf;
  }

  public Task setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
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

  public Task setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    Task that = (Task) o;
    return Objects.equals(cleanRoomsNotebookTask, that.cleanRoomsNotebookTask)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dashboardTask, that.dashboardTask)
        && Objects.equals(dbtCloudTask, that.dbtCloudTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(dependsOn, that.dependsOn)
        && Objects.equals(description, that.description)
        && Objects.equals(disableAutoOptimization, that.disableAutoOptimization)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(environmentKey, that.environmentKey)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(forEachTask, that.forEachTask)
        && Objects.equals(genAiComputeTask, that.genAiComputeTask)
        && Objects.equals(health, that.health)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(maxRetries, that.maxRetries)
        && Objects.equals(minRetryIntervalMillis, that.minRetryIntervalMillis)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(powerBiTask, that.powerBiTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(retryOnTimeout, that.retryOnTimeout)
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
        disableAutoOptimization,
        emailNotifications,
        environmentKey,
        existingClusterId,
        forEachTask,
        genAiComputeTask,
        health,
        jobClusterKey,
        libraries,
        maxRetries,
        minRetryIntervalMillis,
        newCluster,
        notebookTask,
        notificationSettings,
        pipelineTask,
        powerBiTask,
        pythonWheelTask,
        retryOnTimeout,
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
    return new ToStringer(Task.class)
        .add("cleanRoomsNotebookTask", cleanRoomsNotebookTask)
        .add("conditionTask", conditionTask)
        .add("dashboardTask", dashboardTask)
        .add("dbtCloudTask", dbtCloudTask)
        .add("dbtTask", dbtTask)
        .add("dependsOn", dependsOn)
        .add("description", description)
        .add("disableAutoOptimization", disableAutoOptimization)
        .add("emailNotifications", emailNotifications)
        .add("environmentKey", environmentKey)
        .add("existingClusterId", existingClusterId)
        .add("forEachTask", forEachTask)
        .add("genAiComputeTask", genAiComputeTask)
        .add("health", health)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("maxRetries", maxRetries)
        .add("minRetryIntervalMillis", minRetryIntervalMillis)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("powerBiTask", powerBiTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("retryOnTimeout", retryOnTimeout)
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

  TaskPb toPb() {
    TaskPb pb = new TaskPb();
    pb.setCleanRoomsNotebookTask(cleanRoomsNotebookTask);
    pb.setConditionTask(conditionTask);
    pb.setDashboardTask(dashboardTask);
    pb.setDbtCloudTask(dbtCloudTask);
    pb.setDbtTask(dbtTask);
    pb.setDependsOn(dependsOn);
    pb.setDescription(description);
    pb.setDisableAutoOptimization(disableAutoOptimization);
    pb.setEmailNotifications(emailNotifications);
    pb.setEnvironmentKey(environmentKey);
    pb.setExistingClusterId(existingClusterId);
    pb.setForEachTask(forEachTask);
    pb.setGenAiComputeTask(genAiComputeTask);
    pb.setHealth(health);
    pb.setJobClusterKey(jobClusterKey);
    pb.setLibraries(libraries);
    pb.setMaxRetries(maxRetries);
    pb.setMinRetryIntervalMillis(minRetryIntervalMillis);
    pb.setNewCluster(newCluster);
    pb.setNotebookTask(notebookTask);
    pb.setNotificationSettings(notificationSettings);
    pb.setPipelineTask(pipelineTask);
    pb.setPowerBiTask(powerBiTask);
    pb.setPythonWheelTask(pythonWheelTask);
    pb.setRetryOnTimeout(retryOnTimeout);
    pb.setRunIf(runIf);
    pb.setRunJobTask(runJobTask);
    pb.setSparkJarTask(sparkJarTask);
    pb.setSparkPythonTask(sparkPythonTask);
    pb.setSparkSubmitTask(sparkSubmitTask);
    pb.setSqlTask(sqlTask);
    pb.setTaskKey(taskKey);
    pb.setTimeoutSeconds(timeoutSeconds);
    pb.setWebhookNotifications(webhookNotifications);

    return pb;
  }

  static Task fromPb(TaskPb pb) {
    Task model = new Task();
    model.setCleanRoomsNotebookTask(pb.getCleanRoomsNotebookTask());
    model.setConditionTask(pb.getConditionTask());
    model.setDashboardTask(pb.getDashboardTask());
    model.setDbtCloudTask(pb.getDbtCloudTask());
    model.setDbtTask(pb.getDbtTask());
    model.setDependsOn(pb.getDependsOn());
    model.setDescription(pb.getDescription());
    model.setDisableAutoOptimization(pb.getDisableAutoOptimization());
    model.setEmailNotifications(pb.getEmailNotifications());
    model.setEnvironmentKey(pb.getEnvironmentKey());
    model.setExistingClusterId(pb.getExistingClusterId());
    model.setForEachTask(pb.getForEachTask());
    model.setGenAiComputeTask(pb.getGenAiComputeTask());
    model.setHealth(pb.getHealth());
    model.setJobClusterKey(pb.getJobClusterKey());
    model.setLibraries(pb.getLibraries());
    model.setMaxRetries(pb.getMaxRetries());
    model.setMinRetryIntervalMillis(pb.getMinRetryIntervalMillis());
    model.setNewCluster(pb.getNewCluster());
    model.setNotebookTask(pb.getNotebookTask());
    model.setNotificationSettings(pb.getNotificationSettings());
    model.setPipelineTask(pb.getPipelineTask());
    model.setPowerBiTask(pb.getPowerBiTask());
    model.setPythonWheelTask(pb.getPythonWheelTask());
    model.setRetryOnTimeout(pb.getRetryOnTimeout());
    model.setRunIf(pb.getRunIf());
    model.setRunJobTask(pb.getRunJobTask());
    model.setSparkJarTask(pb.getSparkJarTask());
    model.setSparkPythonTask(pb.getSparkPythonTask());
    model.setSparkSubmitTask(pb.getSparkSubmitTask());
    model.setSqlTask(pb.getSqlTask());
    model.setTaskKey(pb.getTaskKey());
    model.setTimeoutSeconds(pb.getTimeoutSeconds());
    model.setWebhookNotifications(pb.getWebhookNotifications());

    return model;
  }

  public static class TaskSerializer extends JsonSerializer<Task> {
    @Override
    public void serialize(Task value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TaskDeserializer extends JsonDeserializer<Task> {
    @Override
    public Task deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TaskPb pb = mapper.readValue(p, TaskPb.class);
      return Task.fromPb(pb);
    }
  }
}
