// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = GetClusterComplianceResponse.GetClusterComplianceResponseSerializer.class)
@JsonDeserialize(
    using = GetClusterComplianceResponse.GetClusterComplianceResponseDeserializer.class)
public class GetClusterComplianceResponse {
  /**
   * Whether the cluster is compliant with its policy or not. Clusters could be out of compliance if
   * the policy was updated after the cluster was last edited.
   */
  private Boolean isCompliant;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. The values indicate
   * an error message describing the policy validation error.
   */
  private Map<String, String> violations;

  public GetClusterComplianceResponse setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public GetClusterComplianceResponse setViolations(Map<String, String> violations) {
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
    GetClusterComplianceResponse that = (GetClusterComplianceResponse) o;
    return Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterComplianceResponse.class)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }

  GetClusterComplianceResponsePb toPb() {
    GetClusterComplianceResponsePb pb = new GetClusterComplianceResponsePb();
    pb.setIsCompliant(isCompliant);
    pb.setViolations(violations);

    return pb;
  }

  static GetClusterComplianceResponse fromPb(GetClusterComplianceResponsePb pb) {
    GetClusterComplianceResponse model = new GetClusterComplianceResponse();
    model.setIsCompliant(pb.getIsCompliant());
    model.setViolations(pb.getViolations());

    return model;
  }

  public static class GetClusterComplianceResponseSerializer
      extends JsonSerializer<GetClusterComplianceResponse> {
    @Override
    public void serialize(
        GetClusterComplianceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterComplianceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterComplianceResponseDeserializer
      extends JsonDeserializer<GetClusterComplianceResponse> {
    @Override
    public GetClusterComplianceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterComplianceResponsePb pb = mapper.readValue(p, GetClusterComplianceResponsePb.class);
      return GetClusterComplianceResponse.fromPb(pb);
    }
  }
}
