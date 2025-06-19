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
@JsonSerialize(using = Group.GroupSerializer.class)
@JsonDeserialize(using = Group.GroupDeserializer.class)
public class Group {
  /** String that represents a human-readable group name */
  private String displayName;

  /**
   * Entitlements assigned to the group. See [assigning entitlements] for a full list of supported
   * values.
   *
   * <p>[assigning entitlements]:
   * https://docs.databricks.com/administration-guide/users-groups/index.html#assigning-entitlements
   */
  private Collection<ComplexValue> entitlements;

  /** */
  private String externalId;

  /** */
  private Collection<ComplexValue> groups;

  /** Databricks group ID */
  private String id;

  /** */
  private Collection<ComplexValue> members;

  /** Container for the group identifier. Workspace local versus account. */
  private ResourceMeta meta;

  /** Corresponds to AWS instance profile/arn role. */
  private Collection<ComplexValue> roles;

  /** The schema of the group. */
  private Collection<GroupSchema> schemas;

  public Group setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Group setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public Group setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public Group setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public Group setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Group setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public Collection<ComplexValue> getMembers() {
    return members;
  }

  public Group setMeta(ResourceMeta meta) {
    this.meta = meta;
    return this;
  }

  public ResourceMeta getMeta() {
    return meta;
  }

  public Group setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public Group setSchemas(Collection<GroupSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<GroupSchema> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Group that = (Group) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groups, that.groups)
        && Objects.equals(id, that.id)
        && Objects.equals(members, that.members)
        && Objects.equals(meta, that.meta)
        && Objects.equals(roles, that.roles)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName, entitlements, externalId, groups, id, members, meta, roles, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(Group.class)
        .add("displayName", displayName)
        .add("entitlements", entitlements)
        .add("externalId", externalId)
        .add("groups", groups)
        .add("id", id)
        .add("members", members)
        .add("meta", meta)
        .add("roles", roles)
        .add("schemas", schemas)
        .toString();
  }

  GroupPb toPb() {
    GroupPb pb = new GroupPb();
    pb.setDisplayName(displayName);
    pb.setEntitlements(entitlements);
    pb.setExternalId(externalId);
    pb.setGroups(groups);
    pb.setId(id);
    pb.setMembers(members);
    pb.setMeta(meta);
    pb.setRoles(roles);
    pb.setSchemas(schemas);

    return pb;
  }

  static Group fromPb(GroupPb pb) {
    Group model = new Group();
    model.setDisplayName(pb.getDisplayName());
    model.setEntitlements(pb.getEntitlements());
    model.setExternalId(pb.getExternalId());
    model.setGroups(pb.getGroups());
    model.setId(pb.getId());
    model.setMembers(pb.getMembers());
    model.setMeta(pb.getMeta());
    model.setRoles(pb.getRoles());
    model.setSchemas(pb.getSchemas());

    return model;
  }

  public static class GroupSerializer extends JsonSerializer<Group> {
    @Override
    public void serialize(Group value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GroupPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GroupDeserializer extends JsonDeserializer<Group> {
    @Override
    public Group deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GroupPb pb = mapper.readValue(p, GroupPb.class);
      return Group.fromPb(pb);
    }
  }
}
