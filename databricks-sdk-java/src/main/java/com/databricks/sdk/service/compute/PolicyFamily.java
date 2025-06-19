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
import java.util.Objects;

@Generated
@JsonSerialize(using = PolicyFamily.PolicyFamilySerializer.class)
@JsonDeserialize(using = PolicyFamily.PolicyFamilyDeserializer.class)
public class PolicyFamily {
  /**
   * Policy definition document expressed in [Databricks Cluster Policy Definition Language].
   *
   * <p>[Databricks Cluster Policy Definition Language]:
   * https://docs.databricks.com/administration-guide/clusters/policy-definition.html
   */
  private String definition;

  /** Human-readable description of the purpose of the policy family. */
  private String description;

  /** Name of the policy family. */
  private String name;

  /** Unique identifier for the policy family. */
  private String policyFamilyId;

  public PolicyFamily setDefinition(String definition) {
    this.definition = definition;
    return this;
  }

  public String getDefinition() {
    return definition;
  }

  public PolicyFamily setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PolicyFamily setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PolicyFamily setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyFamily that = (PolicyFamily) o;
    return Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(policyFamilyId, that.policyFamilyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, description, name, policyFamilyId);
  }

  @Override
  public String toString() {
    return new ToStringer(PolicyFamily.class)
        .add("definition", definition)
        .add("description", description)
        .add("name", name)
        .add("policyFamilyId", policyFamilyId)
        .toString();
  }

  PolicyFamilyPb toPb() {
    PolicyFamilyPb pb = new PolicyFamilyPb();
    pb.setDefinition(definition);
    pb.setDescription(description);
    pb.setName(name);
    pb.setPolicyFamilyId(policyFamilyId);

    return pb;
  }

  static PolicyFamily fromPb(PolicyFamilyPb pb) {
    PolicyFamily model = new PolicyFamily();
    model.setDefinition(pb.getDefinition());
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setPolicyFamilyId(pb.getPolicyFamilyId());

    return model;
  }

  public static class PolicyFamilySerializer extends JsonSerializer<PolicyFamily> {
    @Override
    public void serialize(PolicyFamily value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PolicyFamilyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PolicyFamilyDeserializer extends JsonDeserializer<PolicyFamily> {
    @Override
    public PolicyFamily deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PolicyFamilyPb pb = mapper.readValue(p, PolicyFamilyPb.class);
      return PolicyFamily.fromPb(pb);
    }
  }
}
