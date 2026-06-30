// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateAccountGroupRequest {
  /** String that represents a human-readable group name */
  @JsonProperty("displayName")
  private String displayName;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** Databricks group ID */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("members")
  private Collection<ComplexValue> members;

  /** Container for the group identifier. Workspace local versus account. */
  @JsonProperty("meta")
  private ResourceMeta meta;

  /** Indicates if the group has the admin role. */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  public CreateAccountGroupRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateAccountGroupRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public CreateAccountGroupRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateAccountGroupRequest setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public Collection<ComplexValue> getMembers() {
    return members;
  }

  public CreateAccountGroupRequest setMeta(ResourceMeta meta) {
    this.meta = meta;
    return this;
  }

  public ResourceMeta getMeta() {
    return meta;
  }

  public CreateAccountGroupRequest setRoles(Collection<ComplexValue> roles) {
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
    CreateAccountGroupRequest that = (CreateAccountGroupRequest) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(id, that.id)
        && Objects.equals(members, that.members)
        && Objects.equals(meta, that.meta)
        && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, externalId, id, members, meta, roles);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountGroupRequest.class)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("id", id)
        .add("members", members)
        .add("meta", meta)
        .add("roles", roles)
        .toString();
  }
}
