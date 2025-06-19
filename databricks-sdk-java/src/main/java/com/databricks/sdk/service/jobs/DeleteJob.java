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
@JsonSerialize(using = DeleteJob.DeleteJobSerializer.class)
@JsonDeserialize(using = DeleteJob.DeleteJobDeserializer.class)
public class DeleteJob {
  /** The canonical identifier of the job to delete. This field is required. */
  private Long jobId;

  public DeleteJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteJob that = (DeleteJob) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteJob.class).add("jobId", jobId).toString();
  }

  DeleteJobPb toPb() {
    DeleteJobPb pb = new DeleteJobPb();
    pb.setJobId(jobId);

    return pb;
  }

  static DeleteJob fromPb(DeleteJobPb pb) {
    DeleteJob model = new DeleteJob();
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class DeleteJobSerializer extends JsonSerializer<DeleteJob> {
    @Override
    public void serialize(DeleteJob value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteJobPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteJobDeserializer extends JsonDeserializer<DeleteJob> {
    @Override
    public DeleteJob deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteJobPb pb = mapper.readValue(p, DeleteJobPb.class);
      return DeleteJob.fromPb(pb);
    }
  }
}
