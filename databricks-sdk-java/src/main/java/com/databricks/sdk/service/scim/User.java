// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class User {
  /** If this user is active */
  @JsonProperty("active")
  private Boolean active;

  /** String that represents a concatenation of given and family names. For example `John Smith`. */
  @JsonProperty("displayName")
  private String displayName;

  /** All the emails associated with the Databricks user. */
  @JsonProperty("emails")
  private Collection<ComplexValue> emails;

  /** */
  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** */
  @JsonProperty("groups")
  private Collection<ComplexValue> groups;

  /** Databricks user ID. */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("name")
  private Name name;

  /** */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  /** Email address of the Databricks user. */
  @JsonProperty("userName")
  private String userName;

  public User setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public User setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public User setEmails(Collection<ComplexValue> emails) {
    this.emails = emails;
    return this;
  }

  public Collection<ComplexValue> getEmails() {
    return emails;
  }

  public User setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public User setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public User setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public User setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public User setName(Name name) {
    this.name = name;
    return this;
  }

  public Name getName() {
    return name;
  }

  public User setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public User setUserName(String userName) {
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
    User that = (User) o;
    return Objects.equals(active, that.active)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(emails, that.emails)
        && Objects.equals(entitlements, that.entitlements)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groups, that.groups)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(roles, that.roles)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        active, displayName, emails, entitlements, externalId, groups, id, name, roles, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
        .add("active", active)
        .add("displayName", displayName)
        .add("emails", emails)
        .add("entitlements", entitlements)
        .add("externalId", externalId)
        .add("groups", groups)
        .add("id", id)
        .add("name", name)
        .add("roles", roles)
        .add("userName", userName)
        .toString();
  }
}
