// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class BaseRun {
    /**
     * The sequence number of this run attempt for a triggered job run. The
     * initial attempt of a run has an attempt_number of 0\. If the initial run
     * attempt fails, and the job has a retry policy (`max_retries` \> 0),
     * subsequent runs are created with an `original_attempt_run_id` of the
     * original attempt’s ID and an incrementing `attempt_number`. Runs are
     * retried only until they succeed, and the maximum `attempt_number` is the
     * same as the `max_retries` value for the job.
     */
    @JsonProperty("attempt_number")
    private Long attemptNumber;
    
    /**
     * The time in milliseconds it took to terminate the cluster and clean up
     * any associated artifacts. The duration of a task run is the sum of the
     * `setup_duration`, `execution_duration`, and the `cleanup_duration`. The
     * `cleanup_duration` field is set to 0 for multitask job runs. The total
     * duration of a multitask job run is the value of the `run_duration` field.
     */
    @JsonProperty("cleanup_duration")
    private Long cleanupDuration;
    
    /**
     * The cluster used for this run. If the run is specified to use a new
     * cluster, this field is set once the Jobs service has requested a cluster
     * for the run.
     */
    @JsonProperty("cluster_instance")
    private ClusterInstance clusterInstance;
    
    /**
     * A snapshot of the job’s cluster specification when this run was
     * created.
     */
    @JsonProperty("cluster_spec")
    private ClusterSpec clusterSpec;
    
    /**
     * The continuous trigger that triggered this run.
     */
    @JsonProperty("continuous")
    private Continuous continuous;
    
    /**
     * The creator user name. This field won’t be included in the response if
     * the user has already been deleted.
     */
    @JsonProperty("creator_user_name")
    private String creatorUserName;
    
    /**
     * The time at which this run ended in epoch milliseconds (milliseconds
     * since 1/1/1970 UTC). This field is set to 0 if the job is still running.
     */
    @JsonProperty("end_time")
    private Long endTime;
    
    /**
     * The time in milliseconds it took to execute the commands in the JAR or
     * notebook until they completed, failed, timed out, were cancelled, or
     * encountered an unexpected error. The duration of a task run is the sum of
     * the `setup_duration`, `execution_duration`, and the `cleanup_duration`.
     * The `execution_duration` field is set to 0 for multitask job runs. The
     * total duration of a multitask job run is the value of the `run_duration`
     * field.
     */
    @JsonProperty("execution_duration")
    private Long executionDuration;
    
    /**
     * An optional specification for a remote repository containing the
     * notebooks used by this job's notebook tasks.
     */
    @JsonProperty("git_source")
    private GitSource gitSource;
    
    /**
     * A list of job cluster specifications that can be shared and reused by
     * tasks of this job. Libraries cannot be declared in a shared job cluster.
     * You must declare dependent libraries in task settings.
     */
    @JsonProperty("job_clusters")
    private java.util.List<JobCluster> jobClusters;
    
    /**
     * The canonical identifier of the job that contains this run.
     */
    @JsonProperty("job_id")
    private Long jobId;
    
    /**
     * A unique identifier for this job run. This is set to the same value as
     * `run_id`.
     */
    @JsonProperty("number_in_job")
    private Long numberInJob;
    
    /**
     * If this run is a retry of a prior run attempt, this field contains the
     * run_id of the original attempt; otherwise, it is the same as the run_id.
     */
    @JsonProperty("original_attempt_run_id")
    private Long originalAttemptRunId;
    
    /**
     * The parameters used for this run.
     */
    @JsonProperty("overriding_parameters")
    private RunParameters overridingParameters;
    
    /**
     * The time in milliseconds it took the job run and all of its repairs to
     * finish.
     */
    @JsonProperty("run_duration")
    private Long runDuration;
    
    /**
     * The canonical identifier of the run. This ID is unique across all runs of
     * all jobs.
     */
    @JsonProperty("run_id")
    private Long runId;
    
    /**
     * An optional name for the run. The maximum allowed length is 4096 bytes in
     * UTF-8 encoding.
     */
    @JsonProperty("run_name")
    private String runName;
    
    /**
     * The URL to the detail page of the run.
     */
    @JsonProperty("run_page_url")
    private String runPageUrl;
    
    /**
     * This describes an enum
     */
    @JsonProperty("run_type")
    private RunType runType;
    
    /**
     * The cron schedule that triggered this run if it was triggered by the
     * periodic scheduler.
     */
    @JsonProperty("schedule")
    private CronSchedule schedule;
    
    /**
     * The time in milliseconds it took to set up the cluster. For runs that run
     * on new clusters this is the cluster creation time, for runs that run on
     * existing clusters this time should be very short. The duration of a task
     * run is the sum of the `setup_duration`, `execution_duration`, and the
     * `cleanup_duration`. The `setup_duration` field is set to 0 for multitask
     * job runs. The total duration of a multitask job run is the value of the
     * `run_duration` field.
     */
    @JsonProperty("setup_duration")
    private Long setupDuration;
    
    /**
     * The time at which this run was started in epoch milliseconds
     * (milliseconds since 1/1/1970 UTC). This may not be the time when the job
     * task starts executing, for example, if the job is scheduled to run on a
     * new cluster, this is the time the cluster creation call is issued.
     */
    @JsonProperty("start_time")
    private Long startTime;
    
    /**
     * The result and lifecycle states of the run.
     */
    @JsonProperty("state")
    private RunState state;
    
    /**
     * The list of tasks performed by the run. Each task has its own `run_id`
     * which you can use to call `JobsGetOutput` to retrieve the run resutls.
     */
    @JsonProperty("tasks")
    private java.util.List<RunTask> tasks;
    
    /**
     * This describes an enum
     */
    @JsonProperty("trigger")
    private TriggerType trigger;
    
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
    
    public BaseRun setContinuous(Continuous continuous) {
        this.continuous = continuous;
        return this;
    }

    public Continuous getContinuous() {
        return continuous;
    }
    
    public BaseRun setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }

    public String getCreatorUserName() {
        return creatorUserName;
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
    
    public BaseRun setJobClusters(java.util.List<JobCluster> jobClusters) {
        this.jobClusters = jobClusters;
        return this;
    }

    public java.util.List<JobCluster> getJobClusters() {
        return jobClusters;
    }
    
    public BaseRun setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
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
    
    public BaseRun setTasks(java.util.List<RunTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public java.util.List<RunTask> getTasks() {
        return tasks;
    }
    
    public BaseRun setTrigger(TriggerType trigger) {
        this.trigger = trigger;
        return this;
    }

    public TriggerType getTrigger() {
        return trigger;
    }
    
}
