// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class Group {
  /** String that represents a human-readable group name */
  @JsonProperty("displayName")
  private String displayName;

  /** */
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

  /** */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

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

  public Group setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
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
        && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, entitlements, externalId, groups, id, members, roles);
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
        .add("roles", roles)
        .toString();
  }
}
