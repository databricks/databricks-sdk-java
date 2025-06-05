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
@JsonSerialize(using = ResetJob.ResetJobSerializer.class)
@JsonDeserialize(using = ResetJob.ResetJobDeserializer.class)
public class ResetJob {
  /** The canonical identifier of the job to reset. This field is required. */
  private Long jobId;

  /**
   * The new settings of the job. These settings completely replace the old settings.
   *
   * <p>Changes to the field `JobBaseSettings.timeout_seconds` are applied to active runs. Changes
   * to other fields are applied to future runs only.
   */
  private JobSettings newSettings;

  public ResetJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public ResetJob setNewSettings(JobSettings newSettings) {
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
    ResetJob that = (ResetJob) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(newSettings, that.newSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, newSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(ResetJob.class)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }

  ResetJobPb toPb() {
    ResetJobPb pb = new ResetJobPb();
    pb.setJobId(jobId);
    pb.setNewSettings(newSettings);

    return pb;
  }

  static ResetJob fromPb(ResetJobPb pb) {
    ResetJob model = new ResetJob();
    model.setJobId(pb.getJobId());
    model.setNewSettings(pb.getNewSettings());

    return model;
  }

  public static class ResetJobSerializer extends JsonSerializer<ResetJob> {
    @Override
    public void serialize(ResetJob value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResetJobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResetJobDeserializer extends JsonDeserializer<ResetJob> {
    @Override
    public ResetJob deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResetJobPb pb = mapper.readValue(p, ResetJobPb.class);
      return ResetJob.fromPb(pb);
    }
  }
}
