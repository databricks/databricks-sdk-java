// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GroupPb {
  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  @JsonProperty("id")
  private String id;

  @JsonProperty("members")
  private Collection<ComplexValue> members;

  @JsonProperty("meta")
  private ResourceMeta meta;

  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  @JsonProperty("schemas")
  private Collection<GroupSchema> schemas;

  public GroupPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public GroupPb setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public GroupPb setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public GroupPb setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public GroupPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GroupPb setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public Collection<ComplexValue> getMembers() {
    return members;
  }

  public GroupPb setMeta(ResourceMeta meta) {
    this.meta = meta;
    return this;
  }

  public ResourceMeta getMeta() {
    return meta;
  }

  public GroupPb setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public GroupPb setSchemas(Collection<GroupSchema> schemas) {
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
    GroupPb that = (GroupPb) o;
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
    return new ToStringer(GroupPb.class)
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
