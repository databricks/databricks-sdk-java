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
@JsonSerialize(using = BaseRun.BaseRunSerializer.class)
@JsonDeserialize(using = BaseRun.BaseRunDeserializer.class)
public class BaseRun {
  /**
   * The sequence number of this run attempt for a triggered job run. The initial attempt of a run
   * has an attempt_number of 0. If the initial run attempt fails, and the job has a retry policy
   * (`max_retries` > 0), subsequent runs are created with an `original_attempt_run_id` of the
   * original attempt’s ID and an incrementing `attempt_number`. Runs are retried only until they
   * succeed, and the maximum `attempt_number` is the same as the `max_retries` value for the job.
   */
  private Long attemptNumber;

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

  /** A snapshot of the job’s cluster specification when this run was created. */
  private ClusterSpec clusterSpec;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  private String creatorUserName;

  /** Description of the run */
  private String description;

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
   * The time at which this run ended in epoch milliseconds (milliseconds since 1/1/1970 UTC). This
   * field is set to 0 if the job is still running.
   */
  private Long endTime;

  /**
   * The time in milliseconds it took to execute the commands in the JAR or notebook until they
   * completed, failed, timed out, were cancelled, or encountered an unexpected error. The duration
   * of a task run is the sum of the `setup_duration`, `execution_duration`, and the
   * `cleanup_duration`. The `execution_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  private Long executionDuration;

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
  private GitSource gitSource;

  /**
   * Indicates if the run has more array properties (`tasks`, `job_clusters`) that are not shown.
   * They can be accessed via :method:jobs/getrun endpoint. It is only relevant for API 2.2
   * :method:jobs/listruns requests with `expand_tasks=true`.
   */
  private Boolean hasMore;

  /**
   * A list of job cluster specifications that can be shared and reused by tasks of this job.
   * Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in
   * task settings. If more than 100 job clusters are available, you can paginate through them using
   * :method:jobs/getrun.
   */
  private Collection<JobCluster> jobClusters;

  /** The canonical identifier of the job that contains this run. */
  private Long jobId;

  /** Job-level parameters used in the run */
  private Collection<JobParameter> jobParameters;

  /**
   * ID of the job run that this run belongs to. For legacy and single-task job runs the field is
   * populated with the job run ID. For task runs, the field is populated with the ID of the job run
   * that the task run belongs to.
   */
  private Long jobRunId;

  /** A unique identifier for this job run. This is set to the same value as `run_id`. */
  private Long numberInJob;

  /**
   * If this run is a retry of a prior run attempt, this field contains the run_id of the original
   * attempt; otherwise, it is the same as the run_id.
   */
  private Long originalAttemptRunId;

  /** The parameters used for this run. */
  private RunParameters overridingParameters;

  /** The time in milliseconds that the run has spent in the queue. */
  private Long queueDuration;

  /** The repair history of the run. */
  private Collection<RepairHistoryItem> repairHistory;

  /** The time in milliseconds it took the job run and all of its repairs to finish. */
  private Long runDuration;

  /** The canonical identifier of the run. This ID is unique across all runs of all jobs. */
  private Long runId;

  /** An optional name for the run. The maximum length is 4096 bytes in UTF-8 encoding. */
  private String runName;

  /** The URL to the detail page of the run. */
  private String runPageUrl;

  /**
   * The type of a run. * `JOB_RUN`: Normal job run. A run created with :method:jobs/runNow. *
   * `WORKFLOW_RUN`: Workflow run. A run created with [dbutils.notebook.run]. * `SUBMIT_RUN`: Submit
   * run. A run created with :method:jobs/submit.
   *
   * <p>[dbutils.notebook.run]:
   * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-workflow
   */
  private RunType runType;

  /** The cron schedule that triggered this run if it was triggered by the periodic scheduler. */
  private CronSchedule schedule;

  /**
   * The time in milliseconds it took to set up the cluster. For runs that run on new clusters this
   * is the cluster creation time, for runs that run on existing clusters this time should be very
   * short. The duration of a task run is the sum of the `setup_duration`, `execution_duration`, and
   * the `cleanup_duration`. The `setup_duration` field is set to 0 for multitask job runs. The
   * total duration of a multitask job run is the value of the `run_duration` field.
   */
  private Long setupDuration;

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
   * The list of tasks performed by the run. Each task has its own `run_id` which you can use to
   * call `JobsGetOutput` to retrieve the run resutls. If more than 100 tasks are available, you can
   * paginate through them using :method:jobs/getrun. Use the `next_page_token` field at the object
   * root to determine if more results are available.
   */
  private Collection<RunTask> tasks;

  /**
   * The type of trigger that fired this run.
   *
   * <p>* `PERIODIC`: Schedules that periodically trigger runs, such as a cron scheduler. *
   * `ONE_TIME`: One time triggers that fire a single run. This occurs you triggered a single run on
   * demand through the UI or the API. * `RETRY`: Indicates a run that is triggered as a retry of a
   * previously failed run. This occurs when you request to re-run the job in case of failures. *
   * `RUN_JOB_TASK`: Indicates a run that is triggered using a Run Job task. * `FILE_ARRIVAL`:
   * Indicates a run that is triggered by a file arrival. * `TABLE`: Indicates a run that is
   * triggered by a table update. * `CONTINUOUS_RESTART`: Indicates a run created by user to
   * manually restart a continuous job run.
   */
  private TriggerType trigger;

  /** Additional details about what triggered the run */
  private TriggerInfo triggerInfo;

  public BaseRun setAttemptNumber(Long attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

  public Long getAttemptNumber() {
    return attemptNumber;
  }

  public BaseRun setCleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
  }

  public Long getCleanupDuration() {
    return cleanupDuration;
  }

  public BaseRun setClusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
    return this;
  }

  public ClusterInstance getClusterInstance() {
    return clusterInstance;
  }

  public BaseRun setClusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
  }

  public ClusterSpec getClusterSpec() {
    return clusterSpec;
  }

  public BaseRun setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public BaseRun setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public BaseRun setEffectivePerformanceTarget(PerformanceTarget effectivePerformanceTarget) {
    this.effectivePerformanceTarget = effectivePerformanceTarget;
    return this;
  }

  public PerformanceTarget getEffectivePerformanceTarget() {
    return effectivePerformanceTarget;
  }

  public BaseRun setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public BaseRun setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

  public Long getExecutionDuration() {
    return executionDuration;
  }

  public BaseRun setGitSource(GitSource gitSource) {
    this.gitSource = gitSource;
    return this;
  }

  public GitSource getGitSource() {
    return gitSource;
  }

  public BaseRun setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public BaseRun setJobClusters(Collection<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
  }

  public Collection<JobCluster> getJobClusters() {
    return jobClusters;
  }

  public BaseRun setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public BaseRun setJobParameters(Collection<JobParameter> jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Collection<JobParameter> getJobParameters() {
    return jobParameters;
  }

  public BaseRun setJobRunId(Long jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public Long getJobRunId() {
    return jobRunId;
  }

  public BaseRun setNumberInJob(Long numberInJob) {
    this.numberInJob = numberInJob;
    return this;
  }

  public Long getNumberInJob() {
    return numberInJob;
  }

  public BaseRun setOriginalAttemptRunId(Long originalAttemptRunId) {
    this.originalAttemptRunId = originalAttemptRunId;
    return this;
  }

  public Long getOriginalAttemptRunId() {
    return originalAttemptRunId;
  }

  public BaseRun setOverridingParameters(RunParameters overridingParameters) {
    this.overridingParameters = overridingParameters;
    return this;
  }

  public RunParameters getOverridingParameters() {
    return overridingParameters;
  }

  public BaseRun setQueueDuration(Long queueDuration) {
    this.queueDuration = queueDuration;
    return this;
  }

  public Long getQueueDuration() {
    return queueDuration;
  }

  public BaseRun setRepairHistory(Collection<RepairHistoryItem> repairHistory) {
    this.repairHistory = repairHistory;
    return this;
  }

  public Collection<RepairHistoryItem> getRepairHistory() {
    return repairHistory;
  }

  public BaseRun setRunDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  public Long getRunDuration() {
    return runDuration;
  }

  public BaseRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public BaseRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public BaseRun setRunPageUrl(String runPageUrl) {
    this.runPageUrl = runPageUrl;
    return this;
  }

  public String getRunPageUrl() {
    return runPageUrl;
  }

  public BaseRun setRunType(RunType runType) {
    this.runType = runType;
    return this;
  }

  public RunType getRunType() {
    return runType;
  }

  public BaseRun setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public BaseRun setSetupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
    return this;
  }

  public Long getSetupDuration() {
    return setupDuration;
  }

  public BaseRun setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public BaseRun setState(RunState state) {
    this.state = state;
    return this;
  }

  public RunState getState() {
    return state;
  }

  public BaseRun setStatus(RunStatus status) {
    this.status = status;
    return this;
  }

  public RunStatus getStatus() {
    return status;
  }

  public BaseRun setTasks(Collection<RunTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Collection<RunTask> getTasks() {
    return tasks;
  }

  public BaseRun setTrigger(TriggerType trigger) {
    this.trigger = trigger;
    return this;
  }

  public TriggerType getTrigger() {
    return trigger;
  }

  public BaseRun setTriggerInfo(TriggerInfo triggerInfo) {
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
    BaseRun that = (BaseRun) o;
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
    return new ToStringer(BaseRun.class)
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

  BaseRunPb toPb() {
    BaseRunPb pb = new BaseRunPb();
    pb.setAttemptNumber(attemptNumber);
    pb.setCleanupDuration(cleanupDuration);
    pb.setClusterInstance(clusterInstance);
    pb.setClusterSpec(clusterSpec);
    pb.setCreatorUserName(creatorUserName);
    pb.setDescription(description);
    pb.setEffectivePerformanceTarget(effectivePerformanceTarget);
    pb.setEndTime(endTime);
    pb.setExecutionDuration(executionDuration);
    pb.setGitSource(gitSource);
    pb.setHasMore(hasMore);
    pb.setJobClusters(jobClusters);
    pb.setJobId(jobId);
    pb.setJobParameters(jobParameters);
    pb.setJobRunId(jobRunId);
    pb.setNumberInJob(numberInJob);
    pb.setOriginalAttemptRunId(originalAttemptRunId);
    pb.setOverridingParameters(overridingParameters);
    pb.setQueueDuration(queueDuration);
    pb.setRepairHistory(repairHistory);
    pb.setRunDuration(runDuration);
    pb.setRunId(runId);
    pb.setRunName(runName);
    pb.setRunPageUrl(runPageUrl);
    pb.setRunType(runType);
    pb.setSchedule(schedule);
    pb.setSetupDuration(setupDuration);
    pb.setStartTime(startTime);
    pb.setState(state);
    pb.setStatus(status);
    pb.setTasks(tasks);
    pb.setTrigger(trigger);
    pb.setTriggerInfo(triggerInfo);

    return pb;
  }

  static BaseRun fromPb(BaseRunPb pb) {
    BaseRun model = new BaseRun();
    model.setAttemptNumber(pb.getAttemptNumber());
    model.setCleanupDuration(pb.getCleanupDuration());
    model.setClusterInstance(pb.getClusterInstance());
    model.setClusterSpec(pb.getClusterSpec());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setDescription(pb.getDescription());
    model.setEffectivePerformanceTarget(pb.getEffectivePerformanceTarget());
    model.setEndTime(pb.getEndTime());
    model.setExecutionDuration(pb.getExecutionDuration());
    model.setGitSource(pb.getGitSource());
    model.setHasMore(pb.getHasMore());
    model.setJobClusters(pb.getJobClusters());
    model.setJobId(pb.getJobId());
    model.setJobParameters(pb.getJobParameters());
    model.setJobRunId(pb.getJobRunId());
    model.setNumberInJob(pb.getNumberInJob());
    model.setOriginalAttemptRunId(pb.getOriginalAttemptRunId());
    model.setOverridingParameters(pb.getOverridingParameters());
    model.setQueueDuration(pb.getQueueDuration());
    model.setRepairHistory(pb.getRepairHistory());
    model.setRunDuration(pb.getRunDuration());
    model.setRunId(pb.getRunId());
    model.setRunName(pb.getRunName());
    model.setRunPageUrl(pb.getRunPageUrl());
    model.setRunType(pb.getRunType());
    model.setSchedule(pb.getSchedule());
    model.setSetupDuration(pb.getSetupDuration());
    model.setStartTime(pb.getStartTime());
    model.setState(pb.getState());
    model.setStatus(pb.getStatus());
    model.setTasks(pb.getTasks());
    model.setTrigger(pb.getTrigger());
    model.setTriggerInfo(pb.getTriggerInfo());

    return model;
  }

  public static class BaseRunSerializer extends JsonSerializer<BaseRun> {
    @Override
    public void serialize(BaseRun value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BaseRunPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BaseRunDeserializer extends JsonDeserializer<BaseRun> {
    @Override
    public BaseRun deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BaseRunPb pb = mapper.readValue(p, BaseRunPb.class);
      return BaseRun.fromPb(pb);
    }
  }
}
