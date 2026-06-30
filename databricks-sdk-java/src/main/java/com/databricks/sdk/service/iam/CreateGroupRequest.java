// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateGroupRequest {
  /** String that represents a human-readable group name */
  @JsonProperty("displayName")
  private String displayName;

  /**
   * Entitlements assigned to the group. See [assigning entitlements] for a full list of supported
   * values.
   *
   * <p>[assigning entitlements]:
   * https://docs.databricks.com/administration-guide/users-groups/index.html#assigning-entitlements
   */
  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** */
  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  /** Databricks group ID */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("members")
  private Collection<ComplexValue> members;

  /** Container for the group identifier. Workspace local versus account. */
  @JsonProperty("meta")
  private ResourceMeta meta;

  /** Corresponds to AWS instance profile/arn role. */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  /** The schema of the group. */
  @JsonProperty("schemas")
  private Collection<GroupSchema> schemas;

  public CreateGroupRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateGroupRequest setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public CreateGroupRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public CreateGroupRequest setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public CreateGroupRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateGroupRequest setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public Collection<ComplexValue> getMembers() {
    return members;
  }

  public CreateGroupRequest setMeta(ResourceMeta meta) {
    this.meta = meta;
    return this;
  }

  public ResourceMeta getMeta() {
    return meta;
  }

  public CreateGroupRequest setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public CreateGroupRequest setSchemas(Collection<GroupSchema> schemas) {
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
    CreateGroupRequest that = (CreateGroupRequest) o;
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
    return new ToStringer(CreateGroupRequest.class)
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
}
