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
@JsonSerialize(
    using = EnforcePolicyComplianceRequest.EnforcePolicyComplianceRequestSerializer.class)
@JsonDeserialize(
    using = EnforcePolicyComplianceRequest.EnforcePolicyComplianceRequestDeserializer.class)
public class EnforcePolicyComplianceRequest {
  /** The ID of the job you want to enforce policy compliance on. */
  private Long jobId;

  /**
   * If set, previews changes made to the job to comply with its policy, but does not update the
   * job.
   */
  private Boolean validateOnly;

  public EnforcePolicyComplianceRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public EnforcePolicyComplianceRequest setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcePolicyComplianceRequest that = (EnforcePolicyComplianceRequest) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforcePolicyComplianceRequest.class)
        .add("jobId", jobId)
        .add("validateOnly", validateOnly)
        .toString();
  }

  EnforcePolicyComplianceRequestPb toPb() {
    EnforcePolicyComplianceRequestPb pb = new EnforcePolicyComplianceRequestPb();
    pb.setJobId(jobId);
    pb.setValidateOnly(validateOnly);

    return pb;
  }

  static EnforcePolicyComplianceRequest fromPb(EnforcePolicyComplianceRequestPb pb) {
    EnforcePolicyComplianceRequest model = new EnforcePolicyComplianceRequest();
    model.setJobId(pb.getJobId());
    model.setValidateOnly(pb.getValidateOnly());

    return model;
  }

  public static class EnforcePolicyComplianceRequestSerializer
      extends JsonSerializer<EnforcePolicyComplianceRequest> {
    @Override
    public void serialize(
        EnforcePolicyComplianceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnforcePolicyComplianceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnforcePolicyComplianceRequestDeserializer
      extends JsonDeserializer<EnforcePolicyComplianceRequest> {
    @Override
    public EnforcePolicyComplianceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnforcePolicyComplianceRequestPb pb =
          mapper.readValue(p, EnforcePolicyComplianceRequestPb.class);
      return EnforcePolicyComplianceRequest.fromPb(pb);
    }
  }
}
