// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateUserRequest {
  /** If this user is active */
  @JsonProperty("active")
  private Boolean active;

  /**
   * String that represents a concatenation of given and family names. For example `John Smith`.
   * This field cannot be updated through the Workspace SCIM APIs when [identity federation is
   * enabled]. Use Account SCIM APIs to update `displayName`.
   *
   * <p>[identity federation is enabled]:
   * https://docs.databricks.com/administration-guide/users-groups/best-practices.html#enable-identity-federation
   */
  @JsonProperty("displayName")
  private String displayName;

  /** All the emails associated with the Databricks user. */
  @JsonProperty("emails")
  private Collection<ComplexValue> emails;

  /**
   * Entitlements assigned to the user. See [assigning entitlements] for a full list of supported
   * values.
   *
   * <p>[assigning entitlements]:
   * https://docs.databricks.com/administration-guide/users-groups/index.html#assigning-entitlements
   */
  @JsonProperty("entitlements")
  private Collection<ComplexValue> entitlements;

  /** External ID is not currently supported. It is reserved for future use. */
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

  /** Corresponds to AWS instance profile/arn role. */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  /** The schema of the user. */
  @JsonProperty("schemas")
  private Collection<UserSchema> schemas;

  /** Email address of the Databricks user. */
  @JsonProperty("userName")
  private String userName;

  public CreateUserRequest setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public CreateUserRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateUserRequest setEmails(Collection<ComplexValue> emails) {
    this.emails = emails;
    return this;
  }

  public Collection<ComplexValue> getEmails() {
    return emails;
  }

  public CreateUserRequest setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public CreateUserRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public CreateUserRequest setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  public CreateUserRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CreateUserRequest setName(Name name) {
    this.name = name;
    return this;
  }

  public Name getName() {
    return name;
  }

  public CreateUserRequest setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public CreateUserRequest setSchemas(Collection<UserSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<UserSchema> getSchemas() {
    return schemas;
  }

  public CreateUserRequest setUserName(String userName) {
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
    CreateUserRequest that = (CreateUserRequest) o;
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
    return new ToStringer(CreateUserRequest.class)
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
