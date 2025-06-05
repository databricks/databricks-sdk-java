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
@JsonSerialize(using = ClusterCompliance.ClusterComplianceSerializer.class)
@JsonDeserialize(using = ClusterCompliance.ClusterComplianceDeserializer.class)
public class ClusterCompliance {
  /** Canonical unique identifier for a cluster. */
  private String clusterId;

  /** Whether this cluster is in compliance with the latest version of its policy. */
  private Boolean isCompliant;

  /**
   * An object containing key-value mappings representing the first 200 policy validation errors.
   * The keys indicate the path where the policy validation error is occurring. The values indicate
   * an error message describing the policy validation error.
   */
  private Map<String, String> violations;

  public ClusterCompliance setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterCompliance setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
    return this;
  }

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public ClusterCompliance setViolations(Map<String, String> violations) {
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
    ClusterCompliance that = (ClusterCompliance) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(isCompliant, that.isCompliant)
        && Objects.equals(violations, that.violations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, isCompliant, violations);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterCompliance.class)
        .add("clusterId", clusterId)
        .add("isCompliant", isCompliant)
        .add("violations", violations)
        .toString();
  }

  ClusterCompliancePb toPb() {
    ClusterCompliancePb pb = new ClusterCompliancePb();
    pb.setClusterId(clusterId);
    pb.setIsCompliant(isCompliant);
    pb.setViolations(violations);

    return pb;
  }

  static ClusterCompliance fromPb(ClusterCompliancePb pb) {
    ClusterCompliance model = new ClusterCompliance();
    model.setClusterId(pb.getClusterId());
    model.setIsCompliant(pb.getIsCompliant());
    model.setViolations(pb.getViolations());

    return model;
  }

  public static class ClusterComplianceSerializer extends JsonSerializer<ClusterCompliance> {
    @Override
    public void serialize(ClusterCompliance value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterCompliancePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterComplianceDeserializer extends JsonDeserializer<ClusterCompliance> {
    @Override
    public ClusterCompliance deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterCompliancePb pb = mapper.readValue(p, ClusterCompliancePb.class);
      return ClusterCompliance.fromPb(pb);
    }
  }
}
