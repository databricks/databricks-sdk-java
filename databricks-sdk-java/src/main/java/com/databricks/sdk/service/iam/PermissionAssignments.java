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
@JsonSerialize(using = PermissionAssignments.PermissionAssignmentsSerializer.class)
@JsonDeserialize(using = PermissionAssignments.PermissionAssignmentsDeserializer.class)
public class PermissionAssignments {
  /** Array of permissions assignments defined for a workspace. */
  private Collection<PermissionAssignment> permissionAssignments;

  public PermissionAssignments setPermissionAssignments(
      Collection<PermissionAssignment> permissionAssignments) {
    this.permissionAssignments = permissionAssignments;
    return this;
  }

  public Collection<PermissionAssignment> getPermissionAssignments() {
    return permissionAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionAssignments that = (PermissionAssignments) o;
    return Objects.equals(permissionAssignments, that.permissionAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionAssignments.class)
        .add("permissionAssignments", permissionAssignments)
        .toString();
  }

  PermissionAssignmentsPb toPb() {
    PermissionAssignmentsPb pb = new PermissionAssignmentsPb();
    pb.setPermissionAssignments(permissionAssignments);

    return pb;
  }

  static PermissionAssignments fromPb(PermissionAssignmentsPb pb) {
    PermissionAssignments model = new PermissionAssignments();
    model.setPermissionAssignments(pb.getPermissionAssignments());

    return model;
  }

  public static class PermissionAssignmentsSerializer
      extends JsonSerializer<PermissionAssignments> {
    @Override
    public void serialize(
        PermissionAssignments value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionAssignmentsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionAssignmentsDeserializer
      extends JsonDeserializer<PermissionAssignments> {
    @Override
    public PermissionAssignments deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionAssignmentsPb pb = mapper.readValue(p, PermissionAssignmentsPb.class);
      return PermissionAssignments.fromPb(pb);
    }
  }
}
