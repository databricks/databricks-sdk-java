// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class BaseJob {
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

  /** The canonical identifier for this job. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
  @JsonProperty("settings")
  private JobSettings settings;

  public BaseJob setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  public Long getCreatedTime() {
    return createdTime;
  }

  public BaseJob setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public BaseJob setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public BaseJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public BaseJob setSettings(JobSettings settings) {
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
    BaseJob that = (BaseJob) o;
    return Objects.equals(createdTime, that.createdTime)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, creatorUserName, effectiveBudgetPolicyId, jobId, settings);
  }

  @Override
  public String toString() {
    return new ToStringer(BaseJob.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("jobId", jobId)
        .add("settings", settings)
        .toString();
  }
}
