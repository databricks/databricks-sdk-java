// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = EffectivePrivilegeAssignment.EffectivePrivilegeAssignmentSerializer.class)
@JsonDeserialize(
    using = EffectivePrivilegeAssignment.EffectivePrivilegeAssignmentDeserializer.class)
public class EffectivePrivilegeAssignment {
  /** The principal (user email address or group name). */
  private String principal;

  /** The privileges conveyed to the principal (either directly or via inheritance). */
  private Collection<EffectivePrivilege> privileges;

  public EffectivePrivilegeAssignment setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public EffectivePrivilegeAssignment setPrivileges(Collection<EffectivePrivilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Collection<EffectivePrivilege> getPrivileges() {
    return privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePrivilegeAssignment that = (EffectivePrivilegeAssignment) o;
    return Objects.equals(principal, that.principal) && Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePrivilegeAssignment.class)
        .add("principal", principal)
        .add("privileges", privileges)
        .toString();
  }

  EffectivePrivilegeAssignmentPb toPb() {
    EffectivePrivilegeAssignmentPb pb = new EffectivePrivilegeAssignmentPb();
    pb.setPrincipal(principal);
    pb.setPrivileges(privileges);

    return pb;
  }

  static EffectivePrivilegeAssignment fromPb(EffectivePrivilegeAssignmentPb pb) {
    EffectivePrivilegeAssignment model = new EffectivePrivilegeAssignment();
    model.setPrincipal(pb.getPrincipal());
    model.setPrivileges(pb.getPrivileges());

    return model;
  }

  public static class EffectivePrivilegeAssignmentSerializer
      extends JsonSerializer<EffectivePrivilegeAssignment> {
    @Override
    public void serialize(
        EffectivePrivilegeAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EffectivePrivilegeAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EffectivePrivilegeAssignmentDeserializer
      extends JsonDeserializer<EffectivePrivilegeAssignment> {
    @Override
    public EffectivePrivilegeAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EffectivePrivilegeAssignmentPb pb = mapper.readValue(p, EffectivePrivilegeAssignmentPb.class);
      return EffectivePrivilegeAssignment.fromPb(pb);
    }
  }
}
