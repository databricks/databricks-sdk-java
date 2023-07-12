// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class SubmitTask {
  /**
   * If condition_task, specifies a condition with an outcome that can be used
   * to control the execution of other tasks. Does not require a cluster to
   * execute and does not support retries or notifications.
   */
  @JsonProperty("condition_task")
  private ConditionTask conditionTask;
  
  /**
   * An optional array of objects specifying the dependency graph of the task.
   * All tasks specified in this field must complete successfully before
   * executing this task. The key is `task_key`, and the value is the name
   * assigned to the dependent task.
   */
  @JsonProperty("depends_on")
  private Collection<TaskDependency> dependsOn;
  
  /**
   * An optional set of email addresses notified when the task run begins or
   * completes. The default behavior is to not send any emails.
   */
  @JsonProperty("email_notifications")
  private JobEmailNotifications emailNotifications;
  
  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all
   * runs of this task. When running tasks on an existing cluster, you may need
   * to manually restart the cluster if it stops responding. We suggest running
   * jobs on new clusters for greater reliability.
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;
  
  /**
   * An optional list of libraries to be installed on the cluster that executes
   * the task. The default value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<com.databricks.sdk.service.compute.Library> libraries;
  
  /**
   * If new_cluster, a description of a cluster that is created for each run.
   */
  @JsonProperty("new_cluster")
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;
  
  /**
   * If notebook_task, indicates that this task must run a notebook. This field
   * may not be specified in conjunction with spark_jar_task.
   */
  @JsonProperty("notebook_task")
  private NotebookTask notebookTask;
  
  /**
   * Optional notification settings that are used when sending email
   * notifications for this task run.
   */
  @JsonProperty("notification_settings")
  private TaskNotificationSettings notificationSettings;
  
  /**
   * If pipeline_task, indicates that this task must execute a Pipeline.
   */
  @JsonProperty("pipeline_task")
  private PipelineTask pipelineTask;
  
  /**
   * If python_wheel_task, indicates that this job must execute a PythonWheel.
   */
  @JsonProperty("python_wheel_task")
  private PythonWheelTask pythonWheelTask;
  
  /**
   * If spark_jar_task, indicates that this task must run a JAR.
   */
  @JsonProperty("spark_jar_task")
  private SparkJarTask sparkJarTask;
  
  /**
   * If spark_python_task, indicates that this task must run a Python file.
   */
  @JsonProperty("spark_python_task")
  private SparkPythonTask sparkPythonTask;
  
  /**
   * If spark_submit_task, indicates that this task must be launched by the
   * spark submit script. This task can run only on new clusters.
   */
  @JsonProperty("spark_submit_task")
  private SparkSubmitTask sparkSubmitTask;
  
  /**
   * If sql_task, indicates that this job must execute a SQL.
   */
  @JsonProperty("sql_task")
  private SqlTask sqlTask;
  
  /**
   * A unique name for the task. This field is used to refer to this task from
   * other tasks. This field is required and must be unique within its parent
   * job. On Update or Reset, this field is used to reference the tasks to be
   * updated or reset. The maximum length is 100 characters.
   */
  @JsonProperty("task_key")
  private String taskKey;
  
  /**
   * An optional timeout applied to each run of this job task. The default
   * behavior is to have no timeout.
   */
  @JsonProperty("timeout_seconds")
  private Long timeoutSeconds;
  
  public SubmitTask setConditionTask(ConditionTask conditionTask) {
    this.conditionTask = conditionTask;
    return this;
  }

  public ConditionTask getConditionTask() {
    return conditionTask;
  }
  
  public SubmitTask setDependsOn(Collection<TaskDependency> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  public Collection<TaskDependency> getDependsOn() {
    return dependsOn;
  }
  
  public SubmitTask setEmailNotifications(JobEmailNotifications emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public JobEmailNotifications getEmailNotifications() {
    return emailNotifications;
  }
  
  public SubmitTask setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
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
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmitTask that = (SubmitTask) o;
    return Objects.equals(conditionTask, that.conditionTask)
    && Objects.equals(dependsOn, that.dependsOn)
    && Objects.equals(emailNotifications, that.emailNotifications)
    && Objects.equals(existingClusterId, that.existingClusterId)
    && Objects.equals(libraries, that.libraries)
    && Objects.equals(newCluster, that.newCluster)
    && Objects.equals(notebookTask, that.notebookTask)
    && Objects.equals(notificationSettings, that.notificationSettings)
    && Objects.equals(pipelineTask, that.pipelineTask)
    && Objects.equals(pythonWheelTask, that.pythonWheelTask)
    && Objects.equals(sparkJarTask, that.sparkJarTask)
    && Objects.equals(sparkPythonTask, that.sparkPythonTask)
    && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
    && Objects.equals(sqlTask, that.sqlTask)
    && Objects.equals(taskKey, that.taskKey)
    && Objects.equals(timeoutSeconds, that.timeoutSeconds)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionTask, dependsOn, emailNotifications, existingClusterId, libraries, newCluster, notebookTask, notificationSettings, pipelineTask, pythonWheelTask, sparkJarTask, sparkPythonTask, sparkSubmitTask, sqlTask, taskKey, timeoutSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(SubmitTask.class)
      .add("conditionTask", conditionTask)
      .add("dependsOn", dependsOn)
      .add("emailNotifications", emailNotifications)
      .add("existingClusterId", existingClusterId)
      .add("libraries", libraries)
      .add("newCluster", newCluster)
      .add("notebookTask", notebookTask)
      .add("notificationSettings", notificationSettings)
      .add("pipelineTask", pipelineTask)
      .add("pythonWheelTask", pythonWheelTask)
      .add("sparkJarTask", sparkJarTask)
      .add("sparkPythonTask", sparkPythonTask)
      .add("sparkSubmitTask", sparkSubmitTask)
      .add("sqlTask", sqlTask)
      .add("taskKey", taskKey)
      .add("timeoutSeconds", timeoutSeconds).toString();
  }
}
