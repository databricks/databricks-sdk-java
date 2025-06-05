// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Job was retrieved successfully. */
@Generated
class JobPb {
  @JsonProperty("created_time")
  private Long createdTime;

  @JsonProperty("creator_user_name")
  private String creatorUserName;

  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  @JsonProperty("has_more")
  private Boolean hasMore;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  @JsonProperty("settings")
  private JobSettings settings;

  public JobPb setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  public Long getCreatedTime() {
    return createdTime;
  }

  public JobPb setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public JobPb setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public JobPb setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public JobPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public JobPb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public JobPb setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public JobPb setSettings(JobSettings settings) {
    this.settings = settings;
    return this;
  }

  public JobSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobPb that = (JobPb) o;
    return Objects.equals(createdTime, that.createdTime)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdTime,
        creatorUserName,
        effectiveBudgetPolicyId,
        hasMore,
        jobId,
        nextPageToken,
        runAsUserName,
        settings);
  }

  @Override
  public String toString() {
    return new ToStringer(JobPb.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("hasMore", hasMore)
        .add("jobId", jobId)
        .add("nextPageToken", nextPageToken)
        .add("runAsUserName", runAsUserName)
        .add("settings", settings)
        .toString();
  }
}
