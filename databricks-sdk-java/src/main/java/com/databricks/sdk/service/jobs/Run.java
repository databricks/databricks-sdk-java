// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Run class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Run {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0\. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` \> 0), subsequent runs are created with an `original_attempt_run_id` of the
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

  /** A snapshot of the job’s cluster specification when this run was created. */
  @JsonProperty("cluster_spec")
  private ClusterSpec clusterSpec;

  /** The continuous trigger that triggered this run. */
  @JsonProperty("continuous")
  private Continuous continuous;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /**
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  @JsonProperty("end_time")
  private Long endTime;

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
   * An optional specification for a remote repository containing the notebooks used by this job's
   * notebook tasks.
   */
  @JsonProperty("git_source")
  private GitSource gitSource;

  /**
   * A list of job cluster specifications that can be shared and reused by tasks of this job.
   * Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in
   * task settings.
   */
  @JsonProperty("job_clusters")
  private Collection<JobCluster> jobClusters;

  /** The canonical identifier of the job that contains this run. */
  @JsonProperty("job_id")
  private Long jobId;

  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  @JsonProperty("number_in_job")
  private Long numberInJob;

  /**
   * If this run is a retry of a prior run attempt, this field contains the run_id of the original
   * attempt; otherwise, it is the same as the run_id.
   */
  @JsonProperty("original_attempt_run_id")
  private Long originalAttemptRunId;

  /** The parameters used for this run. */
  @JsonProperty("overriding_parameters")
  private RunParameters overridingParameters;

  /** The repair history of the run. */
  @JsonProperty("repair_history")
  private Collection<RepairHistoryItem> repairHistory;

  /** The time in milliseconds it took the job run and all of its repairs to finish. */
  @JsonProperty("run_duration")
  private Long runDuration;

  /** The canonical identifier of the run. This ID is unique across all runs of all jobs. */
  @JsonProperty("run_id")
  private Long runId;

  /** An optional name for the run. The maximum allowed length is 4096 bytes in UTF-8 encoding. */
  @JsonProperty("run_name")
  private String runName;

  /** The URL to the detail page of the run. */
  @JsonProperty("run_page_url")
  private String runPageUrl;

  /** This describes an enum */
  @JsonProperty("run_type")
  private RunType runType;

  /** The cron schedule that triggered this run if it was triggered by the periodic scheduler. */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  @JsonProperty("setup_duration")
  private Long setupDuration;

  /**
   * The time at which this run was started in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   * This may not be the time when the job task starts executing, for example, if the job is
   * scheduled to run on a new cluster, this is the time the cluster creation call is issued.
   */
  @JsonProperty("start_time")
  private Long startTime;

  /** The result and lifecycle states of the run. */
  @JsonProperty("state")
  private RunState state;

  /**
   * The list of tasks performed by the run. Each task has its own `run_id` which you can use to
   * call `JobsGetOutput` to retrieve the run resutls.
   */
  @JsonProperty("tasks")
  private Collection<RunTask> tasks;

  /** This describes an enum */
  @JsonProperty("trigger")
  private TriggerType trigger;

  /**
   * <p>Setter for the field <code>attemptNumber</code>.</p>
   *
   * @param attemptNumber a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  /**
   * <p>Getter for the field <code>attemptNumber</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAttemptNumber() {
    return attemptNumber;
  }

  /**
   * <p>Setter for the field <code>cleanupDuration</code>.</p>
   *
   * @param cleanupDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>cleanupDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  /**
   * <p>Setter for the field <code>clusterInstance</code>.</p>
   *
   * @param clusterInstance a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterInstance</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ClusterInstance} object
   */
  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  /**
   * <p>Setter for the field <code>clusterSpec</code>.</p>
   *
   * @param clusterSpec a {@link com.databricks.sdk.service.jobs.ClusterSpec} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setClusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
  }

  /**
   * <p>Getter for the field <code>clusterSpec</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ClusterSpec} object
   */
  public ClusterSpec getClusterSpec() {
    return clusterSpec;
  }

  /**
   * <p>Setter for the field <code>continuous</code>.</p>
   *
   * @param continuous a {@link com.databricks.sdk.service.jobs.Continuous} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setContinuous(Continuous continuous) {
    this.continuous = continuous;
    return this;
  }

  /**
   * <p>Getter for the field <code>continuous</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.Continuous} object
   */
  public Continuous getContinuous() {
    return continuous;
  }

  /**
   * <p>Setter for the field <code>creatorUserName</code>.</p>
   *
   * @param creatorUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>creatorUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatorUserName() {
    return creatorUserName;
  }

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>executionDuration</code>.</p>
   *
   * @param executionDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>executionDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutionDuration() {
    return executionDuration;
  }

  /**
   * <p>Setter for the field <code>gitSource</code>.</p>
   *
   * @param gitSource a {@link com.databricks.sdk.service.jobs.GitSource} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  /**
   * <p>Getter for the field <code>gitSource</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.GitSource} object
   */
  public GitSource getGitSource() {
    return gitSource;
  }

  /**
   * <p>Setter for the field <code>jobClusters</code>.</p>
   *
   * @param jobClusters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobClusters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getJobId() {
    return jobId;
  }

  /**
   * <p>Setter for the field <code>numberInJob</code>.</p>
   *
   * @param numberInJob a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  /**
   * <p>Getter for the field <code>numberInJob</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNumberInJob() {
    return numberInJob;
  }

  /**
   * <p>Setter for the field <code>originalAttemptRunId</code>.</p>
   *
   * @param originalAttemptRunId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setOriginalAttemptRunId(Long originalAttemptRunId) {
    this.originalAttemptRunId = originalAttemptRunId;
    return this;
  }

  /**
   * <p>Getter for the field <code>originalAttemptRunId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getOriginalAttemptRunId() {
    return originalAttemptRunId;
  }

  /**
   * <p>Setter for the field <code>overridingParameters</code>.</p>
   *
   * @param overridingParameters a {@link com.databricks.sdk.service.jobs.RunParameters} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setOverridingParameters(RunParameters overridingParameters) {
    this.overridingParameters = overridingParameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>overridingParameters</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunParameters} object
   */
  public RunParameters getOverridingParameters() {
    return overridingParameters;
  }

  /**
   * <p>Setter for the field <code>repairHistory</code>.</p>
   *
   * @param repairHistory a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRepairHistory(Collection<RepairHistoryItem> repairHistory) {
    this.repairHistory = repairHistory;
    return this;
  }

  /**
   * <p>Getter for the field <code>repairHistory</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RepairHistoryItem> getRepairHistory() {
    return repairHistory;
  }

  /**
   * <p>Setter for the field <code>runDuration</code>.</p>
   *
   * @param runDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>runDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunDuration() {
    return runDuration;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>runName</code>.</p>
   *
   * @param runName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  /**
   * <p>Getter for the field <code>runName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunName() {
    return runName;
  }

  /**
   * <p>Setter for the field <code>runPageUrl</code>.</p>
   *
   * @param runPageUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>runPageUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunPageUrl() {
    return runPageUrl;
  }

  /**
   * <p>Setter for the field <code>runType</code>.</p>
   *
   * @param runType a {@link com.databricks.sdk.service.jobs.RunType} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  /**
   * <p>Getter for the field <code>runType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunType} object
   */
  public RunType getRunType() {
    return runType;
  }

  /**
   * <p>Setter for the field <code>schedule</code>.</p>
   *
   * @param schedule a {@link com.databricks.sdk.service.jobs.CronSchedule} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * <p>Getter for the field <code>schedule</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.CronSchedule} object
   */
  public CronSchedule getSchedule() {
    return schedule;
  }

  /**
   * <p>Setter for the field <code>setupDuration</code>.</p>
   *
   * @param setupDuration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  /**
   * <p>Getter for the field <code>setupDuration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getSetupDuration() {
    return setupDuration;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>state</code>.</p>
   *
   * @param state a {@link com.databricks.sdk.service.jobs.RunState} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setState(RunState state) {
    this.state = state;
    return this;
  }

  /**
   * <p>Getter for the field <code>state</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.RunState} object
   */
  public RunState getState() {
    return state;
  }

  /**
   * <p>Setter for the field <code>tasks</code>.</p>
   *
   * @param tasks a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setTasks(Collection<RunTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  /**
   * <p>Getter for the field <code>tasks</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RunTask> getTasks() {
    return tasks;
  }

  /**
   * <p>Setter for the field <code>trigger</code>.</p>
   *
   * @param trigger a {@link com.databricks.sdk.service.jobs.TriggerType} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run setTrigger(TriggerType trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * <p>Getter for the field <code>trigger</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerType} object
   */
  public TriggerType getTrigger() {
    return trigger;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Run that = (Run) o;
    return Objects.equals(attemptNumber, that.attemptNumber)
        && Objects.equals(cleanupDuration, that.cleanupDuration)
        && Objects.equals(clusterInstance, that.clusterInstance)
        && Objects.equals(clusterSpec, that.clusterSpec)
        && Objects.equals(continuous, that.continuous)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(executionDuration, that.executionDuration)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(numberInJob, that.numberInJob)
        && Objects.equals(originalAttemptRunId, that.originalAttemptRunId)
        && Objects.equals(overridingParameters, that.overridingParameters)
        && Objects.equals(repairHistory, that.repairHistory)
        && Objects.equals(runDuration, that.runDuration)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(runPageUrl, that.runPageUrl)
        && Objects.equals(runType, that.runType)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(setupDuration, that.setupDuration)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(state, that.state)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(trigger, that.trigger);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        attemptNumber,
        cleanupDuration,
        clusterInstance,
        clusterSpec,
        continuous,
        creatorUserName,
        endTime,
        executionDuration,
        gitSource,
        jobClusters,
        jobId,
        numberInJob,
        originalAttemptRunId,
        overridingParameters,
        repairHistory,
        runDuration,
        runId,
        runName,
        runPageUrl,
        runType,
        schedule,
        setupDuration,
        startTime,
        state,
        tasks,
        trigger);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Run.class)
        .add("attemptNumber", attemptNumber)
        .add("cleanupDuration", cleanupDuration)
        .add("clusterInstance", clusterInstance)
        .add("clusterSpec", clusterSpec)
        .add("continuous", continuous)
        .add("creatorUserName", creatorUserName)
        .add("endTime", endTime)
        .add("executionDuration", executionDuration)
        .add("gitSource", gitSource)
        .add("jobClusters", jobClusters)
        .add("jobId", jobId)
        .add("numberInJob", numberInJob)
        .add("originalAttemptRunId", originalAttemptRunId)
        .add("overridingParameters", overridingParameters)
        .add("repairHistory", repairHistory)
        .add("runDuration", runDuration)
        .add("runId", runId)
        .add("runName", runName)
        .add("runPageUrl", runPageUrl)
        .add("runType", runType)
        .add("schedule", schedule)
        .add("setupDuration", setupDuration)
        .add("startTime", startTime)
        .add("state", state)
        .add("tasks", tasks)
        .add("trigger", trigger)
        .toString();
  }
}
