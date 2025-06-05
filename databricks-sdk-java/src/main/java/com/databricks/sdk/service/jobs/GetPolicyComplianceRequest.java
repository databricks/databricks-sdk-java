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

/** Get job policy compliance */
@Generated
@JsonSerialize(using = GetPolicyComplianceRequest.GetPolicyComplianceRequestSerializer.class)
@JsonDeserialize(using = GetPolicyComplianceRequest.GetPolicyComplianceRequestDeserializer.class)
public class GetPolicyComplianceRequest {
  /** The ID of the job whose compliance status you are requesting. */
  private Long jobId;

  public GetPolicyComplianceRequest setJobId(Long jobId) {
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
    GetPolicyComplianceRequest that = (GetPolicyComplianceRequest) o;
    return Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyComplianceRequest.class).add("jobId", jobId).toString();
  }

  GetPolicyComplianceRequestPb toPb() {
    GetPolicyComplianceRequestPb pb = new GetPolicyComplianceRequestPb();
    pb.setJobId(jobId);

    return pb;
  }

  static GetPolicyComplianceRequest fromPb(GetPolicyComplianceRequestPb pb) {
    GetPolicyComplianceRequest model = new GetPolicyComplianceRequest();
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class GetPolicyComplianceRequestSerializer
      extends JsonSerializer<GetPolicyComplianceRequest> {
    @Override
    public void serialize(
        GetPolicyComplianceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPolicyComplianceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPolicyComplianceRequestDeserializer
      extends JsonDeserializer<GetPolicyComplianceRequest> {
    @Override
    public GetPolicyComplianceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPolicyComplianceRequestPb pb = mapper.readValue(p, GetPolicyComplianceRequestPb.class);
      return GetPolicyComplianceRequest.fromPb(pb);
    }
  }
}
