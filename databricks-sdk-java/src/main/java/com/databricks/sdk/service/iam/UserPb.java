// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UserPb {
  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("emails")
  private Collection<ComplexValue> emails;

  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private Name name;

  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  @JsonProperty("schemas")
  private Collection<UserSchema> schemas;

  @JsonProperty("userName")
  private String userName;

  public UserPb setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public UserPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UserPb setEmails(Collection<ComplexValue> emails) {
    this.emails = emails;
    return this;
  }

  public Collection<ComplexValue> getEmails() {
    return emails;
  }

  public UserPb setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public UserPb setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public UserPb setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public UserPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UserPb setName(Name name) {
    this.name = name;
    return this;
  }

  public Name getName() {
    return name;
  }

  public UserPb setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public UserPb setSchemas(Collection<UserSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<UserSchema> getSchemas() {
    return schemas;
  }

  public UserPb setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserPb that = (UserPb) o;
    return Objects.equals(active, that.active)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(emails, that.emails)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groups, that.groups)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(roles, that.roles)
        && Objects.equals(schemas, that.schemas)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active,
        displayName,
        emails,
        entitlements,
        externalId,
        groups,
        id,
        name,
        roles,
        schemas,
        userName);
  }

  @Override
  public String toString() {
    return new ToStringer(UserPb.class)
        .add("active", active)
        .add("displayName", displayName)
        .add("emails", emails)
        .add("entitlements", entitlements)
        .add("externalId", externalId)
        .add("groups", groups)
        .add("id", id)
        .add("name", name)
        .add("roles", roles)
        .add("schemas", schemas)
        .add("userName", userName)
        .toString();
  }
}
