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

/** Get job permissions */
@Generated
@JsonSerialize(using = GetJobPermissionsRequest.GetJobPermissionsRequestSerializer.class)
@JsonDeserialize(using = GetJobPermissionsRequest.GetJobPermissionsRequestDeserializer.class)
public class GetJobPermissionsRequest {
  /** The job for which to get or manage permissions. */
  private String jobId;

  public GetJobPermissionsRequest setJobId(String jobId) {
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
    GetJobPermissionsRequest that = (GetJobPermissionsRequest) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobPermissionsRequest.class).add("jobId", jobId).toString();
  }

  GetJobPermissionsRequestPb toPb() {
    GetJobPermissionsRequestPb pb = new GetJobPermissionsRequestPb();
    pb.setJobId(jobId);

    return pb;
  }

  static GetJobPermissionsRequest fromPb(GetJobPermissionsRequestPb pb) {
    GetJobPermissionsRequest model = new GetJobPermissionsRequest();
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class GetJobPermissionsRequestSerializer
      extends JsonSerializer<GetJobPermissionsRequest> {
    @Override
    public void serialize(
        GetJobPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetJobPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetJobPermissionsRequestDeserializer
      extends JsonDeserializer<GetJobPermissionsRequest> {
    @Override
    public GetJobPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetJobPermissionsRequestPb pb = mapper.readValue(p, GetJobPermissionsRequestPb.class);
      return GetJobPermissionsRequest.fromPb(pb);
    }
  }
}
