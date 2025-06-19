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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetPolicyComplianceResponse.GetPolicyComplianceResponseSerializer.class)
@JsonDeserialize(using = GetPolicyComplianceResponse.GetPolicyComplianceResponseDeserializer.class)
public class GetPolicyComplianceResponse {
  /**
   * Whether the job is compliant with its policies or not. Jobs could be out of compliance if a
   * policy they are using was updated after the job was last edited and some of its job clusters no
   * longer comply with their updated policies.
   */
  private Boolean isCompliant;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. An identifier for
   * the job cluster is prepended to the path. The values indicate an error message describing the
   * policy validation error.
   */
  private Map<String, String> violations;

  public GetPolicyComplianceResponse setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public GetPolicyComplianceResponse setViolations(Map<String, String> violations) {
    this.violations = violations;
    return this;
  }

  public Map<String, String> getViolations() {
    return violations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPolicyComplianceResponse that = (GetPolicyComplianceResponse) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyComplianceResponse.class)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }

  GetPolicyComplianceResponsePb toPb() {
    GetPolicyComplianceResponsePb pb = new GetPolicyComplianceResponsePb();
    pb.setIsCompliant(isCompliant);
    pb.setViolations(violations);

    return pb;
  }

  static GetPolicyComplianceResponse fromPb(GetPolicyComplianceResponsePb pb) {
    GetPolicyComplianceResponse model = new GetPolicyComplianceResponse();
    model.setIsCompliant(pb.getIsCompliant());
    model.setViolations(pb.getViolations());

    return model;
  }

  public static class GetPolicyComplianceResponseSerializer
      extends JsonSerializer<GetPolicyComplianceResponse> {
    @Override
    public void serialize(
        GetPolicyComplianceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPolicyComplianceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPolicyComplianceResponseDeserializer
      extends JsonDeserializer<GetPolicyComplianceResponse> {
    @Override
    public GetPolicyComplianceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPolicyComplianceResponsePb pb = mapper.readValue(p, GetPolicyComplianceResponsePb.class);
      return GetPolicyComplianceResponse.fromPb(pb);
    }
  }
}
