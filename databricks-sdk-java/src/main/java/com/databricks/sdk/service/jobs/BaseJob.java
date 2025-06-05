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

@Generated
@JsonSerialize(using = BaseJob.BaseJobSerializer.class)
@JsonDeserialize(using = BaseJob.BaseJobDeserializer.class)
public class BaseJob {
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

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
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

  public BaseJob setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
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
        && Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdTime, creatorUserName, effectiveBudgetPolicyId, hasMore, jobId, settings);
  }

  @Override
  public String toString() {
    return new ToStringer(BaseJob.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("hasMore", hasMore)
        .add("jobId", jobId)
        .add("settings", settings)
        .toString();
  }

  BaseJobPb toPb() {
    BaseJobPb pb = new BaseJobPb();
    pb.setCreatedTime(createdTime);
    pb.setCreatorUserName(creatorUserName);
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);
    pb.setHasMore(hasMore);
    pb.setJobId(jobId);
    pb.setSettings(settings);

    return pb;
  }

  static BaseJob fromPb(BaseJobPb pb) {
    BaseJob model = new BaseJob();
    model.setCreatedTime(pb.getCreatedTime());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());
    model.setHasMore(pb.getHasMore());
    model.setJobId(pb.getJobId());
    model.setSettings(pb.getSettings());

    return model;
  }

  public static class BaseJobSerializer extends JsonSerializer<BaseJob> {
    @Override
    public void serialize(BaseJob value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BaseJobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BaseJobDeserializer extends JsonDeserializer<BaseJob> {
    @Override
    public BaseJob deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BaseJobPb pb = mapper.readValue(p, BaseJobPb.class);
      return BaseJob.fromPb(pb);
    }
  }
}
