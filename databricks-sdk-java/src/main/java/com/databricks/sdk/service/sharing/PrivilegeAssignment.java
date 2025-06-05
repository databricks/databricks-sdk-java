// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = PrivilegeAssignment.PrivilegeAssignmentSerializer.class)
@JsonDeserialize(using = PrivilegeAssignment.PrivilegeAssignmentDeserializer.class)
public class PrivilegeAssignment {
  /** The principal (user email address or group name). */
  private String principal;

  /** The privileges assigned to the principal. */
  private Collection<Privilege> privileges;

  public PrivilegeAssignment setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public PrivilegeAssignment setPrivileges(Collection<Privilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Collection<Privilege> getPrivileges() {
    return privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivilegeAssignment that = (PrivilegeAssignment) o;
    return Objects.equals(principal, that.principal) && Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(PrivilegeAssignment.class)
        .add("principal", principal)
        .add("privileges", privileges)
        .toString();
  }

  PrivilegeAssignmentPb toPb() {
    PrivilegeAssignmentPb pb = new PrivilegeAssignmentPb();
    pb.setPrincipal(principal);
    pb.setPrivileges(privileges);

    return pb;
  }

  static PrivilegeAssignment fromPb(PrivilegeAssignmentPb pb) {
    PrivilegeAssignment model = new PrivilegeAssignment();
    model.setPrincipal(pb.getPrincipal());
    model.setPrivileges(pb.getPrivileges());

    return model;
  }

  public static class PrivilegeAssignmentSerializer extends JsonSerializer<PrivilegeAssignment> {
    @Override
    public void serialize(PrivilegeAssignment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PrivilegeAssignmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PrivilegeAssignmentDeserializer
      extends JsonDeserializer<PrivilegeAssignment> {
    @Override
    public PrivilegeAssignment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PrivilegeAssignmentPb pb = mapper.readValue(p, PrivilegeAssignmentPb.class);
      return PrivilegeAssignment.fromPb(pb);
    }
  }
}
