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
@JsonSerialize(using = UpdateJob.UpdateJobSerializer.class)
@JsonDeserialize(using = UpdateJob.UpdateJobDeserializer.class)
public class UpdateJob {
  /**
   * Remove top-level fields in the job settings. Removing nested fields is not supported, except
   * for tasks and job clusters (`tasks/task_1`). This field is optional.
   */
  private Collection<String> fieldsToRemove;

  /** The canonical identifier of the job to update. This field is required. */
  private Long jobId;

  /**
   * The new settings for the job.
   *
   * <p>Top-level fields specified in `new_settings` are completely replaced, except for arrays
   * which are merged. That is, new and existing entries are completely replaced based on the
   * respective key fields, i.e. `task_key` or `job_cluster_key`, while previous entries are kept.
   *
   * <p>Partially updating nested fields is not supported.
   *
   * <p>Changes to the field `JobSettings.timeout_seconds` are applied to active runs. Changes to
   * other fields are applied to future runs only.
   */
  private JobSettings newSettings;

  public UpdateJob setFieldsToRemove(Collection<String> fieldsToRemove) {
    this.fieldsToRemove = fieldsToRemove;
    return this;
  }

  public Collection<String> getFieldsToRemove() {
    return fieldsToRemove;
  }

  public UpdateJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public UpdateJob setNewSettings(JobSettings newSettings) {
    this.newSettings = newSettings;
    return this;
  }

  public JobSettings getNewSettings() {
    return newSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateJob that = (UpdateJob) o;
    return Objects.equals(fieldsToRemove, that.fieldsToRemove)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(newSettings, that.newSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldsToRemove, jobId, newSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateJob.class)
        .add("fieldsToRemove", fieldsToRemove)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }

  UpdateJobPb toPb() {
    UpdateJobPb pb = new UpdateJobPb();
    pb.setFieldsToRemove(fieldsToRemove);
    pb.setJobId(jobId);
    pb.setNewSettings(newSettings);

    return pb;
  }

  static UpdateJob fromPb(UpdateJobPb pb) {
    UpdateJob model = new UpdateJob();
    model.setFieldsToRemove(pb.getFieldsToRemove());
    model.setJobId(pb.getJobId());
    model.setNewSettings(pb.getNewSettings());

    return model;
  }

  public static class UpdateJobSerializer extends JsonSerializer<UpdateJob> {
    @Override
    public void serialize(UpdateJob value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateJobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateJobDeserializer extends JsonDeserializer<UpdateJob> {
    @Override
    public UpdateJob deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateJobPb pb = mapper.readValue(p, UpdateJobPb.class);
      return UpdateJob.fromPb(pb);
    }
  }
}
