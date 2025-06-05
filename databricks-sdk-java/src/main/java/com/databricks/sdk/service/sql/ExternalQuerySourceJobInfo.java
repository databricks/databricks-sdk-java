// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = ExternalQuerySourceJobInfo.ExternalQuerySourceJobInfoSerializer.class)
@JsonDeserialize(using = ExternalQuerySourceJobInfo.ExternalQuerySourceJobInfoDeserializer.class)
public class ExternalQuerySourceJobInfo {
  /** The canonical identifier for this job. */
  private String jobId;

  /** The canonical identifier of the run. This ID is unique across all runs of all jobs. */
  private String jobRunId;

  /** The canonical identifier of the task run. */
  private String jobTaskRunId;

  public ExternalQuerySourceJobInfo setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public ExternalQuerySourceJobInfo setJobRunId(String jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public String getJobRunId() {
    return jobRunId;
  }

  public ExternalQuerySourceJobInfo setJobTaskRunId(String jobTaskRunId) {
    this.jobTaskRunId = jobTaskRunId;
    return this;
  }

  public String getJobTaskRunId() {
    return jobTaskRunId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalQuerySourceJobInfo that = (ExternalQuerySourceJobInfo) o;
    return Objects.equals(jobId, that.jobId)
        && Objects.equals(jobRunId, that.jobRunId)
        && Objects.equals(jobTaskRunId, that.jobTaskRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobRunId, jobTaskRunId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalQuerySourceJobInfo.class)
        .add("jobId", jobId)
        .add("jobRunId", jobRunId)
        .add("jobTaskRunId", jobTaskRunId)
        .toString();
  }

  ExternalQuerySourceJobInfoPb toPb() {
    ExternalQuerySourceJobInfoPb pb = new ExternalQuerySourceJobInfoPb();
    pb.setJobId(jobId);
    pb.setJobRunId(jobRunId);
    pb.setJobTaskRunId(jobTaskRunId);

    return pb;
  }

  static ExternalQuerySourceJobInfo fromPb(ExternalQuerySourceJobInfoPb pb) {
    ExternalQuerySourceJobInfo model = new ExternalQuerySourceJobInfo();
    model.setJobId(pb.getJobId());
    model.setJobRunId(pb.getJobRunId());
    model.setJobTaskRunId(pb.getJobTaskRunId());

    return model;
  }

  public static class ExternalQuerySourceJobInfoSerializer
      extends JsonSerializer<ExternalQuerySourceJobInfo> {
    @Override
    public void serialize(
        ExternalQuerySourceJobInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalQuerySourceJobInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalQuerySourceJobInfoDeserializer
      extends JsonDeserializer<ExternalQuerySourceJobInfo> {
    @Override
    public ExternalQuerySourceJobInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalQuerySourceJobInfoPb pb = mapper.readValue(p, ExternalQuerySourceJobInfoPb.class);
      return ExternalQuerySourceJobInfo.fromPb(pb);
    }
  }
}
