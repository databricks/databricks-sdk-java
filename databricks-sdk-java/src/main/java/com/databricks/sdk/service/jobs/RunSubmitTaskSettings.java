// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RunSubmitTaskSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RunSubmitTaskSettings {
  /**
   * An optional array of objects specifying the dependency graph of the task. All tasks specified
   * in this field must complete successfully before executing this task. The key is `task_key`, and
   * the value is the name assigned to the dependent task. This field is required when a job
   * consists of more than one task.
   */
  @JsonProperty("depends_on")
  private Collection<TaskDependenciesItem> dependsOn;

  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs of this task.
   * When running tasks on an existing cluster, you may need to manually restart the cluster if it
   * stops responding. We suggest running jobs on new clusters for greater reliability.
   */
  @JsonProperty("existing_cluster_id")
  private String existingClusterId;

  /**
   * An optional list of libraries to be installed on the cluster that executes the task. The
   * default value is an empty list.
   */
  @JsonProperty("libraries")
  private Collection<Object /* MISSING TYPE */> libraries;

  /** If new_cluster, a description of a cluster that is created for each run. */
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
   * <p>Setter for the field <code>dependsOn</code>.</p>
   *
   * @param dependsOn a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setDependsOn(Collection<TaskDependenciesItem> dependsOn) {
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
   * <p>Setter for the field <code>existingClusterId</code>.</p>
   *
   * @param existingClusterId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setExistingClusterId(String existingClusterId) {
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
   * <p>Setter for the field <code>libraries</code>.</p>
   *
   * @param libraries a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setLibraries(Collection<Object /* MISSING TYPE */> libraries) {
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
   * <p>Setter for the field <code>newCluster</code>.</p>
   *
   * @param newCluster a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setNewCluster(Object /* MISSING TYPE */ newCluster) {
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
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setNotebookTask(NotebookTask notebookTask) {
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
   * <p>Setter for the field <code>pipelineTask</code>.</p>
   *
   * @param pipelineTask a {@link com.databricks.sdk.service.jobs.PipelineTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setPipelineTask(PipelineTask pipelineTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setPythonWheelTask(PythonWheelTask pythonWheelTask) {
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
   * <p>Setter for the field <code>sparkJarTask</code>.</p>
   *
   * @param sparkJarTask a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setSparkJarTask(SparkJarTask sparkJarTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setSparkPythonTask(SparkPythonTask sparkPythonTask) {
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
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setSparkSubmitTask(SparkSubmitTask sparkSubmitTask) {
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
   * <p>Setter for the field <code>taskKey</code>.</p>
   *
   * @param taskKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setTaskKey(String taskKey) {
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
   * @return a {@link com.databricks.sdk.service.jobs.RunSubmitTaskSettings} object
   */
  public RunSubmitTaskSettings setTimeoutSeconds(Long timeoutSeconds) {
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
    RunSubmitTaskSettings that = (RunSubmitTaskSettings) o;
    return Objects.equals(dependsOn, that.dependsOn)
        && Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster)
        && Objects.equals(notebookTask, that.notebookTask)
        && Objects.equals(pipelineTask, that.pipelineTask)
        && Objects.equals(pythonWheelTask, that.pythonWheelTask)
        && Objects.equals(sparkJarTask, that.sparkJarTask)
        && Objects.equals(sparkPythonTask, that.sparkPythonTask)
        && Objects.equals(sparkSubmitTask, that.sparkSubmitTask)
        && Objects.equals(taskKey, that.taskKey)
        && Objects.equals(timeoutSeconds, that.timeoutSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        dependsOn,
        existingClusterId,
        libraries,
        newCluster,
        notebookTask,
        pipelineTask,
        pythonWheelTask,
        sparkJarTask,
        sparkPythonTask,
        sparkSubmitTask,
        taskKey,
        timeoutSeconds);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RunSubmitTaskSettings.class)
        .add("dependsOn", dependsOn)
        .add("existingClusterId", existingClusterId)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .add("notebookTask", notebookTask)
        .add("pipelineTask", pipelineTask)
        .add("pythonWheelTask", pythonWheelTask)
        .add("sparkJarTask", sparkJarTask)
        .add("sparkPythonTask", sparkPythonTask)
        .add("sparkSubmitTask", sparkSubmitTask)
        .add("taskKey", taskKey)
        .add("timeoutSeconds", timeoutSeconds)
        .toString();
  }
}
