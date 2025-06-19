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
import java.util.Objects;

/** Job was retrieved successfully. */
@Generated
@JsonSerialize(using = Job.JobSerializer.class)
@JsonDeserialize(using = Job.JobDeserializer.class)
public class Job {
  /**
   * The time at which this job was created in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   */
  private Long createdTime;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  private String creatorUserName;

  /**
   * The id of the budget policy used by this job for cost attribution purposes. This may be set
   * through (in order of precedence): 1. Budget admins through the account or workspace console 2.
   * Jobs UI in the job details page and Jobs API using `budget_policy_id` 3. Inferred default based
   * on accessible budget policies of the run_as identity on job creation or modification.
   */
  private String effectiveBudgetPolicyId;

  /**
   * Indicates if the job has more array properties (`tasks`, `job_clusters`) that are not shown.
   * They can be accessed via :method:jobs/get endpoint. It is only relevant for API 2.2
   * :method:jobs/list requests with `expand_tasks=true`.
   */
  private Boolean hasMore;

  /** The canonical identifier for this job. */
  private Long jobId;

  /** A token that can be used to list the next page of array properties. */
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
  private String runAsUserName;

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
  private JobSettings settings;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job that = (Job) o;
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
    return new ToStringer(Job.class)
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

  JobPb toPb() {
    JobPb pb = new JobPb();
    pb.setCreatedTime(createdTime);
    pb.setCreatorUserName(creatorUserName);
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);
    pb.setHasMore(hasMore);
    pb.setJobId(jobId);
    pb.setNextPageToken(nextPageToken);
    pb.setRunAsUserName(runAsUserName);
    pb.setSettings(settings);

    return pb;
  }

  static Job fromPb(JobPb pb) {
    Job model = new Job();
    model.setCreatedTime(pb.getCreatedTime());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());
    model.setHasMore(pb.getHasMore());
    model.setJobId(pb.getJobId());
    model.setNextPageToken(pb.getNextPageToken());
    model.setRunAsUserName(pb.getRunAsUserName());
    model.setSettings(pb.getSettings());

    return model;
  }

  public static class JobSerializer extends JsonSerializer<Job> {
    @Override
    public void serialize(Job value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobDeserializer extends JsonDeserializer<Job> {
    @Override
    public Job deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobPb pb = mapper.readValue(p, JobPb.class);
      return Job.fromPb(pb);
    }
  }
}
