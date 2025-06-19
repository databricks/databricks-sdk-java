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
@JsonSerialize(using = EffectivePermissionsList.EffectivePermissionsListSerializer.class)
@JsonDeserialize(using = EffectivePermissionsList.EffectivePermissionsListDeserializer.class)
public class EffectivePermissionsList {
  /** The privileges conveyed to each principal (either directly or via inheritance) */
  private Collection<EffectivePrivilegeAssignment> privilegeAssignments;

  public EffectivePermissionsList setPrivilegeAssignments(
      Collection<EffectivePrivilegeAssignment> privilegeAssignments) {
    this.privilegeAssignments = privilegeAssignments;
    return this;
  }

  public Collection<EffectivePrivilegeAssignment> getPrivilegeAssignments() {
    return privilegeAssignments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePermissionsList that = (EffectivePermissionsList) o;
    return Objects.equals(privilegeAssignments, that.privilegeAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeAssignments);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectivePermissionsList.class)
        .add("privilegeAssignments", privilegeAssignments)
        .toString();
  }

  EffectivePermissionsListPb toPb() {
    EffectivePermissionsListPb pb = new EffectivePermissionsListPb();
    pb.setPrivilegeAssignments(privilegeAssignments);

    return pb;
  }

  static EffectivePermissionsList fromPb(EffectivePermissionsListPb pb) {
    EffectivePermissionsList model = new EffectivePermissionsList();
    model.setPrivilegeAssignments(pb.getPrivilegeAssignments());

    return model;
  }

  public static class EffectivePermissionsListSerializer
      extends JsonSerializer<EffectivePermissionsList> {
    @Override
    public void serialize(
        EffectivePermissionsList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EffectivePermissionsListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EffectivePermissionsListDeserializer
      extends JsonDeserializer<EffectivePermissionsList> {
    @Override
    public EffectivePermissionsList deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EffectivePermissionsListPb pb = mapper.readValue(p, EffectivePermissionsListPb.class);
      return EffectivePermissionsList.fromPb(pb);
    }
  }
}
