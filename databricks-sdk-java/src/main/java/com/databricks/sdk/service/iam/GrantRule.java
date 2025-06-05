// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = GrantRule.GrantRuleSerializer.class)
@JsonDeserialize(using = GrantRule.GrantRuleDeserializer.class)
public class GrantRule {
  /**
   * Principals this grant rule applies to. A principal can be a user (for end users), a service
   * principal (for applications and compute workloads), or an account group. Each principal has its
   * own identifier format: * users/<USERNAME> * groups/<GROUP_NAME> *
   * servicePrincipals/<SERVICE_PRINCIPAL_APPLICATION_ID>
   */
  private Collection<String> principals;

  /** Role that is assigned to the list of principals. */
  private String role;

  public GrantRule setPrincipals(Collection<String> principals) {
    this.principals = principals;
    return this;
  }

  public Collection<String> getPrincipals() {
    return principals;
  }

  public GrantRule setRole(String role) {
    this.role = role;
    return this;
  }

  public String getRole() {
    return role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GrantRule that = (GrantRule) o;
    return Objects.equals(principals, that.principals) && Objects.equals(role, that.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, role);
  }

  @Override
  public String toString() {
    return new ToStringer(GrantRule.class)
        .add("principals", principals)
        .add("role", role)
        .toString();
  }

  GrantRulePb toPb() {
    GrantRulePb pb = new GrantRulePb();
    pb.setPrincipals(principals);
    pb.setRole(role);

    return pb;
  }

  static GrantRule fromPb(GrantRulePb pb) {
    GrantRule model = new GrantRule();
    model.setPrincipals(pb.getPrincipals());
    model.setRole(pb.getRole());

    return model;
  }

  public static class GrantRuleSerializer extends JsonSerializer<GrantRule> {
    @Override
    public void serialize(GrantRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GrantRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GrantRuleDeserializer extends JsonDeserializer<GrantRule> {
    @Override
    public GrantRule deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GrantRulePb pb = mapper.readValue(p, GrantRulePb.class);
      return GrantRule.fromPb(pb);
    }
  }
}
