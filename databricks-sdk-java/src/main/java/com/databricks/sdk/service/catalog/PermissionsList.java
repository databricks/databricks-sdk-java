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
@JsonSerialize(using = PermissionsList.PermissionsListSerializer.class)
@JsonDeserialize(using = PermissionsList.PermissionsListDeserializer.class)
public class PermissionsList {
  /** The privileges assigned to each principal */
  private Collection<PrivilegeAssignment> privilegeAssignments;

  public PermissionsList setPrivilegeAssignments(
      Collection<PrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<PrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsList that = (PermissionsList) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }

  PermissionsListPb toPb() {
    PermissionsListPb pb = new PermissionsListPb();
    pb.setPrivilegeAssignments(privilegeAssignments);

    return pb;
  }

  static PermissionsList fromPb(PermissionsListPb pb) {
    PermissionsList model = new PermissionsList();
    model.setPrivilegeAssignments(pb.getPrivilegeAssignments());

    return model;
  }

  public static class PermissionsListSerializer extends JsonSerializer<PermissionsList> {
    @Override
    public void serialize(PermissionsList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionsListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionsListDeserializer extends JsonDeserializer<PermissionsList> {
    @Override
    public PermissionsList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionsListPb pb = mapper.readValue(p, PermissionsListPb.class);
      return PermissionsList.fromPb(pb);
    }
  }
}
