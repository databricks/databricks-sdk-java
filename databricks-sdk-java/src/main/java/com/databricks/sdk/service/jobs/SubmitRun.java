// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SubmitRun {
  /** List of permissions to set on the job. */
  @JsonProperty("access_control_list")
  private Collection<com.databricks.sdk.service.iam.AccessControlRequest> accessControlList;

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

  /** An optional set of email addresses notified when the run begins or completes. */
  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;

  /**
   * An optional specification for a remote Git repository containing the source code used by tasks.
   * Version-controlled source code is supported by notebook, dbt, Python script, and SQL File
   * tasks.
   *
   * <p>If `git_source` is set, these tasks retrieve the file from the remote repository by default.
   * However, this behavior can be overridden by setting `source` to `WORKSPACE` on the task.
   *
   * <p>Note: dbt and SQL File tasks support only version-controlled sources. If dbt or SQL File
   * tasks are used, `git_source` must be defined on the job.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /** An optional set of health rules that can be defined for this job. */
  @JsonProperty("health")
  private JobsHealthRules health;

  /**
   * An optional token that can be used to guarantee the idempotency of job run requests. If a run
   * with the provided token already exists, the request does not create a new run but returns the
   * ID of the existing run instead. If a run with the provided token is deleted, an error is
   * returned.
   *
   * <p>If you specify the idempotency token, upon failure you can retry until the request succeeds.
   * Databricks guarantees that exactly one run is launched with that idempotency token.
   *
   * <p>This token must have at most 64 characters.
   *
   * <p>For more information, see [How to ensure idempotency for jobs].
   *
   * <p>[How to ensure idempotency for jobs]: https://kb.databricks.com/jobs/jobs-idempotency.html
   */
  @JsonProperty("idempotency_token")
  private String idempotencyToken;

  /**
   * If notebook_task, indicates that this task must run a notebook. This field may not be specified
   * in conjunction with spark_jar_task.
   */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;

  /**
   * Optional notification settings that are used when sending notifications to each of the
   * `email_notifications` and `webhook_notifications` for this run.
   */
  @JsonProperty("notification_settings")
  private JobNotificationSettings notificationSettings;

  /** If pipeline_task, indicates that this task must execute a Pipeline. */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;

  /** If python_wheel_task, indicates that this job must execute a PythonWheel. */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;

  /** The queue settings of the one-time run. */
  @JsonProperty("queue")
  private QueueSettings queue;

  /** If run_job_task, indicates that this task must execute another job. */
  @JsonProperty("run_job_task")
  private RunJobTask runJobTask;

  /** An optional name for the run. The default value is `Untitled`. */
  @JsonProperty("run_name")
  private String runName;

  /** If spark_jar_task, indicates that this task must run a JAR. */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;

  /** If spark_python_task, indicates that this task must run a Python file. */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;

  /**
   * If `spark_submit_task`, indicates that this task must be launched by the spark submit script.
   * This task can run only on new clusters.
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

  /** If sql_task, indicates that this job must execute a SQL task. */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;

  /** */
  @JsonProperty("tasks")
  private Collection<SubmitTask> tasks;

  /** An optional timeout applied to each run of this job. A value of `0` means no timeout. */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;

  /** A collection of system notification IDs to notify when the run begins or completes. */
  @JsonProperty("webhook_notifications")
  private WebhookNotifications webhookNotifications;

  public SubmitRun setAccessControlList(
      Collection<com.databricks.sdk.service.iam.AccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<com.databricks.sdk.service.iam.AccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public SubmitRun setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }

  public SubmitRun setDbtTask(DbtTask dbtTask) {
    this.dbtTask = dbtTask;
    return this;
  }

  public DbtTask getDbtTask() {
    return dbtTask;
  }

  public SubmitRun setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }

  public SubmitRun setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public SubmitRun setHealth(JobsHealthRules health) {
    this.health = health;
    return this;
  }

  public JobsHealthRules getHealth() {
    return health;
  }

  public SubmitRun setIdempotencyToken(String idempotencyToken) {
    this.idempotencyToken = idempotencyToken;
    return this;
  }

  public String getIdempotencyToken() {
    return idempotencyToken;
  }

  public SubmitRun setNotebookTask(NotebookTask notebookTask) {
    this.notebookTask = notebookTask;
    return this;
  }

  public NotebookTask getNotebookTask() {
    return notebookTask;
  }

  public SubmitRun setNotificationSettings(JobNotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  public JobNotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public SubmitRun setPipelineTask(PipelineTask pipelineTask) {
    this.pipelineTask = pipelineTask;
    return this;
  }

  public PipelineTask getPipelineTask() {
    return pipelineTask;
  }

  public SubmitRun setPythonWheelTask(PythonWheelTask pythonWheelTask) {
    this.pythonWheelTask = pythonWheelTask;
    return this;
  }

  public PythonWheelTask getPythonWheelTask() {
    return pythonWheelTask;
  }

  public SubmitRun setQueue(QueueSettings queue) {
    this.queue = queue;
    return this;
  }

  public QueueSettings getQueue() {
    return queue;
  }

  public SubmitRun setRunJobTask(RunJobTask runJobTask) {
    this.runJobTask = runJobTask;
    return this;
  }

  public RunJobTask getRunJobTask() {
    return runJobTask;
  }

  public SubmitRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public SubmitRun setSparkJarTask(SparkJarTask sparkJarTask) {
    this.sparkJarTask = sparkJarTask;
    return this;
  }

  public SparkJarTask getSparkJarTask() {
    return sparkJarTask;
  }

  public SubmitRun setSparkPythonTask(SparkPythonTask sparkPythonTask) {
    this.sparkPythonTask = sparkPythonTask;
    return this;
  }

  public SparkPythonTask getSparkPythonTask() {
    return sparkPythonTask;
  }

  public SubmitRun setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
    this.sparkSubmitTask = sparkSubmitTask;
    return this;
  }

  public SparkSubmitTask getSparkSubmitTask() {
    return sparkSubmitTask;
  }

  public SubmitRun setSqlTask(SqlTask sqlTask) {
    this.sqlTask = sqlTask;
    return this;
  }

  public SqlTask getSqlTask() {
    return sqlTask;
  }

  public SubmitRun setTasks(Collection<SubmitTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<SubmitTask> getTasks() {
    return tasks;
  }

  public SubmitRun setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public SubmitRun setWebhookNotifications(WebhookNotifications webhookNotifications) {
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
    SubmitRun that = (SubmitRun) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(conditionTask, that.conditionTask)
        && Objects.equals(dbtTask, that.dbtTask)
        && Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(health, that.health)
        && Objects.equals(idempotencyToken, that.idempotencyToken)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(notificationSettings, that.notificationSettings)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(queue, that.queue)
        && Objects.equals(runJobTask, that.runJobTask)
        && Objects.equals(runName, that.runName)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(sqlTask, that.sqlTask)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds)
        && Objects.equals(webhookNotifications, that.webhookNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessControlList,
        conditionTask,
        dbtTask,
        emailNotifications,
        gitSource,
        health,
        idempotencyToken,
        notebookTask,
        notificationSettings,
        pipelineTask,
        pythonWheelTask,
        queue,
        runJobTask,
        runName,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        sqlTask,
        tasks,
        timeoutSeconds,
        webhookNotifications);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitRun.class)
        .add("accessControlList", accessControlList)
        .add("conditionTask", conditionTask)
        .add("dbtTask", dbtTask)
        .add("emailNotifications", emailNotifications)
        .add("gitSource", gitSource)
        .add("health", health)
        .add("idempotencyToken", idempotencyToken)
        .add("notebookTask", notebookTask)
        .add("notificationSettings", notificationSettings)
        .add("pipelineTask", pipelineTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("queue", queue)
        .add("runJobTask", runJobTask)
        .add("runName", runName)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("sqlTask", sqlTask)
        .add("tasks", tasks)
        .add("timeoutSeconds", timeoutSeconds)
        .add("webhookNotifications", webhookNotifications)
        .toString();
  }
}
