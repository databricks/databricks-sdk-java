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

/** Get job permission levels */
@Generated
@JsonSerialize(using = GetJobPermissionLevelsRequest.GetJobPermissionLevelsRequestSerializer.class)
@JsonDeserialize(
    using = GetJobPermissionLevelsRequest.GetJobPermissionLevelsRequestDeserializer.class)
public class GetJobPermissionLevelsRequest {
  /** The job for which to get or manage permissions. */
  private String jobId;

  public GetJobPermissionLevelsRequest setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobPermissionLevelsRequest that = (GetJobPermissionLevelsRequest) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobPermissionLevelsRequest.class).add("jobId", jobId).toString();
  }

  GetJobPermissionLevelsRequestPb toPb() {
    GetJobPermissionLevelsRequestPb pb = new GetJobPermissionLevelsRequestPb();
    pb.setJobId(jobId);

    return pb;
  }

  static GetJobPermissionLevelsRequest fromPb(GetJobPermissionLevelsRequestPb pb) {
    GetJobPermissionLevelsRequest model = new GetJobPermissionLevelsRequest();
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class GetJobPermissionLevelsRequestSerializer
      extends JsonSerializer<GetJobPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetJobPermissionLevelsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetJobPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetJobPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetJobPermissionLevelsRequest> {
    @Override
    public GetJobPermissionLevelsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetJobPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetJobPermissionLevelsRequestPb.class);
      return GetJobPermissionLevelsRequest.fromPb(pb);
    }
  }
}
