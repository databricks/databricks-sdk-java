// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class BaseRunPb {
  @JsonProperty("attempt_number")
  private Long attemptNumber;

  @JsonProperty("cleanup_duration")
  private Long cleanupDuration;

  @JsonProperty("cluster_instance")
  private ClusterInstance clusterInstance;

  @JsonProperty("cluster_spec")
  private ClusterSpec clusterSpec;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("effective_performance_target")
  private PerformanceTarget effectivePerformanceTarget;

  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("execution_duration")
  private Long executionDuration;

  @JsonProperty("git_source")
  private GitSource gitSource;

  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("job_clusters")
  private Collection<JobCluster> jobClusters;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("job_parameters")
  private Collection<JobParameter> jobParameters;

  @JsonProperty("job_run_id")
  private Long jobRunId;

  @JsonProperty("number_in_job")
  private Long numberInJob;

  @JsonProperty("original_attempt_run_id")
  private Long originalAttemptRunId;

  @JsonProperty("overriding_parameters")
  private RunParameters overridingParameters;

  @JsonProperty("queue_duration")
  private Long queueDuration;

  @JsonProperty("repair_history")
  private Collection<RepairHistoryItem> repairHistory;

  @JsonProperty("run_duration")
  private Long runDuration;

  @JsonProperty("run_id")
  private Long runId;

  @JsonProperty("run_name")
  private String runName;

  @JsonProperty("run_page_url")
  private String runPageUrl;

  @JsonProperty("run_type")
  private RunType runType;

  @JsonProperty("schedule")
  private CronSchedule schedule;

  @JsonProperty("setup_duration")
  private Long setupDuration;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("state")
  private RunState state;

  @JsonProperty("status")
  private RunStatus status;

  @JsonProperty("tasks")
  private Collection<RunTask> tasks;

  @JsonProperty("trigger")
  private TriggerType trigger;

  @JsonProperty("trigger_info")
  private TriggerInfo triggerInfo;

  public BaseRunPb setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }

  public BaseRunPb setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  public BaseRunPb setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  public BaseRunPb setClusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
  }

  public ClusterSpec getClusterSpec() {
    return clusterSpec;
  }

  public BaseRunPb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public BaseRunPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public BaseRunPb setEffectivePerformanceTarget(PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public BaseRunPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public BaseRunPb setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  public Long getExecutionDuration() {
    return executionDuration;
  }

  public BaseRunPb setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public BaseRunPb setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public BaseRunPb setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  public BaseRunPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public BaseRunPb setJobParameters(Collection<JobParameter> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Collection<JobParameter> getJobParameters() {
    return jobParameters;
  }

  public BaseRunPb setJobRunId(Long jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public Long getJobRunId() {
    return jobRunId;
  }

  public BaseRunPb setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public BaseRunPb setOriginalAttemptRunId(Long originalAttemptRunId) {
    this.originalAttemptRunId = originalAttemptRunId;
    return this;
  }

  public Long getOriginalAttemptRunId() {
    return originalAttemptRunId;
  }

  public BaseRunPb setOverridingParameters(RunParameters overridingParameters) {
    this.overridingParameters = overridingParameters;
    return this;
  }

  public RunParameters getOverridingParameters() {
    return overridingParameters;
  }

  public BaseRunPb setQueueDuration(Long queueDuration) {
    this.queueDuration = queueDuration;
    return this;
  }

  public Long getQueueDuration() {
    return queueDuration;
  }

  public BaseRunPb setRepairHistory(Collection<RepairHistoryItem> repairHistory) {
    this.repairHistory = repairHistory;
    return this;
  }

  public Collection<RepairHistoryItem> getRepairHistory() {
    return repairHistory;
  }

  public BaseRunPb setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public BaseRunPb setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public BaseRunPb setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public BaseRunPb setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  public String getRunPageUrl() {
    return runPageUrl;
  }

  public BaseRunPb setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  public RunType getRunType() {
    return runType;
  }

  public BaseRunPb setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public BaseRunPb setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  public Long getSetupDuration() {
    return setupDuration;
  }

  public BaseRunPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public BaseRunPb setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public BaseRunPb setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public BaseRunPb setTasks(Collection<RunTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<RunTask> getTasks() {
    return tasks;
  }

  public BaseRunPb setTrigger(TriggerType trigger) {
    this.trigger = trigger;
    return this;
  }

  public TriggerType getTrigger() {
    return trigger;
  }

  public BaseRunPb setTriggerInfo(TriggerInfo triggerInfo) {
    this.triggerInfo = triggerInfo;
    return this;
  }

  public TriggerInfo getTriggerInfo() {
    return triggerInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseRunPb that = (BaseRunPb) o;
    return Objects.equals(attemptNumber, that.attemptNumber)
        && Objects.equals(cleanupDuration, that.cleanupDuration)
        && Objects.equals(clusterInstance, that.clusterInstance)
        && Objects.equals(clusterSpec, that.clusterSpec)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(description, that.description)
        && Objects.equals(effectivePerformanceTarget, that.effectivePerformanceTarget)
        && Objects.equals(endTime, that.endTime)
        && Objects.equals(executionDuration, that.executionDuration)
        && Objects.equals(gitSource, that.gitSource)
        && Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobClusters, that.jobClusters)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(jobParameters, that.jobParameters)
        && Objects.equals(jobRunId, that.jobRunId)
        && Objects.equals(numberInJob, that.numberInJob)
        && Objects.equals(originalAttemptRunId, that.originalAttemptRunId)
        && Objects.equals(overridingParameters, that.overridingParameters)
        && Objects.equals(queueDuration, that.queueDuration)
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
        && Objects.equals(status, that.status)
        && Objects.equals(tasks, that.tasks)
        && Objects.equals(trigger, that.trigger)
        && Objects.equals(triggerInfo, that.triggerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attemptNumber,
        cleanupDuration,
        clusterInstance,
        clusterSpec,
        creatorUserName,
        description,
        effectivePerformanceTarget,
        endTime,
        executionDuration,
        gitSource,
        hasMore,
        jobClusters,
        jobId,
        jobParameters,
        jobRunId,
        numberInJob,
        originalAttemptRunId,
        overridingParameters,
        queueDuration,
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
        status,
        tasks,
        trigger,
        triggerInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(BaseRunPb.class)
        .add("attemptNumber", attemptNumber)
        .add("cleanupDuration", cleanupDuration)
        .add("clusterInstance", clusterInstance)
        .add("clusterSpec", clusterSpec)
        .add("creatorUserName", creatorUserName)
        .add("description", description)
        .add("effectivePerformanceTarget", effectivePerformanceTarget)
        .add("endTime", endTime)
        .add("executionDuration", executionDuration)
        .add("gitSource", gitSource)
        .add("hasMore", hasMore)
        .add("jobClusters", jobClusters)
        .add("jobId", jobId)
        .add("jobParameters", jobParameters)
        .add("jobRunId", jobRunId)
        .add("numberInJob", numberInJob)
        .add("originalAttemptRunId", originalAttemptRunId)
        .add("overridingParameters", overridingParameters)
        .add("queueDuration", queueDuration)
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
        .add("status", status)
        .add("tasks", tasks)
        .add("trigger", trigger)
        .add("triggerInfo", triggerInfo)
        .toString();
  }
}
