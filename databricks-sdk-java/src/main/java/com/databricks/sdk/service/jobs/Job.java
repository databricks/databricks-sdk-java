// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Job was retrieved successfully. */
@Generated
public class Job {
  /**
   * The time at which this job was created in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   */
  @JsonProperty("created_time")
  private Long createdTime;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /**
   * The id of the budget policy used by this job for cost attribution purposes. This may be set
   * through (in order of precedence): 1. Budget admins through the account or workspace console 2.
   * Jobs UI in the job details page and Jobs API using `budget_policy_id` 3. Inferred default based
   * on accessible budget policies of the run_as identity on job creation or modification.
   */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** The id of the usage policy used by this job for cost attribution purposes. */
  @JsonProperty("effective_usage_policy_id")
  private String effectiveUsagePolicyId;

  /**
   * Indicates if the job has more array properties (`tasks`, `job_clusters`) that are not shown.
   * They can be accessed via :method:jobs/get endpoint. It is only relevant for API 2.2
   * :method:jobs/list requests with `expand_tasks=true`.
   */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /** The canonical identifier for this job. */
  @JsonProperty("job_id")
  private Long jobId;

  /** A token that can be used to list the next page of array properties. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * The email of an active workspace user or the application ID of a service principal that the job
   * runs as. This value can be changed by setting the `run_as` field when creating or updating a
   * job.
   *
   * <p>By default, `run_as_user_name` is based on the current job settings and is set to the
   * creator of the job if job access control is disabled or to the user with the `is_owner`
   * permission if job access control is enabled.
   */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
  @JsonProperty("settings")
  private JobSettings settings;

  /** State of the trigger associated with the job. */
  @JsonProperty("trigger_state")
  private TriggerStateProto triggerState;

  public Job setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  public Long getCreatedTime() {
    return createdTime;
  }

  public Job setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public Job setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public Job setEffectiveUsagePolicyId(String effectiveUsagePolicyId) {
    this.effectiveUsagePolicyId = effectiveUsagePolicyId;
    return this;
  }

  public String getEffectiveUsagePolicyId() {
    return effectiveUsagePolicyId;
  }

  public Job setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public Job setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public Job setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public Job setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public Job setSettings(JobSettings settings) {
    this.settings = settings;
    return this;
  }

  public JobSettings getSettings() {
    return settings;
  }

  public Job setTriggerState(TriggerStateProto triggerState) {
    this.triggerState = triggerState;
    return this;
  }

  public TriggerStateProto getTriggerState() {
    return triggerState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job that = (Job) o;
    return Objects.equals(createdTime, that.createdTime)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(effectiveUsagePolicyId, that.effectiveUsagePolicyId)
        && Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(settings, that.settings)
        && Objects.equals(triggerState, that.triggerState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdTime,
        creatorUserName,
        effectiveBudgetPolicyId,
        effectiveUsagePolicyId,
        hasMore,
        jobId,
        nextPageToken,
        runAsUserName,
        settings,
        triggerState);
  }

  @Override
  public String toString() {
    return new ToStringer(Job.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("effectiveUsagePolicyId", effectiveUsagePolicyId)
        .add("hasMore", hasMore)
        .add("jobId", jobId)
        .add("nextPageToken", nextPageToken)
        .add("runAsUserName", runAsUserName)
        .add("settings", settings)
        .add("triggerState", triggerState)
        .toString();
  }
}
