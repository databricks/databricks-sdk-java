// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateAccountUserRequest {
  /** If this user is active */
  @JsonProperty("active")
  private Boolean active;

  /** String that represents a concatenation of given and family names. For example `John Smith`. */
  @JsonProperty("displayName")
  private String displayName;

  /** All the emails associated with the Databricks user. */
  @JsonProperty("emails")
  private Collection<ComplexValue> emails;

  /** External ID is not currently supported. It is reserved for future use. */
  @JsonProperty("externalId")
  private String externalId;

  /** Databricks user ID. */
  @JsonIgnore private String id;

  /** */
  @JsonProperty("name")
  private Name name;

  /** Indicates if the group has the admin role. */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  /** Email address of the Databricks user. */
  @JsonProperty("userName")
  private String userName;

  public UpdateAccountUserRequest setActive(Boolean active) {
    this.active = active;
    return this;
  }

  public Boolean getActive() {
    return active;
  }

  public UpdateAccountUserRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateAccountUserRequest setEmails(Collection<ComplexValue> emails) {
    this.emails = emails;
    return this;
  }

  public Collection<ComplexValue> getEmails() {
    return emails;
  }

  public UpdateAccountUserRequest setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public UpdateAccountUserRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAccountUserRequest setName(Name name) {
    this.name = name;
    return this;
  }

  public Name getName() {
    return name;
  }

  public UpdateAccountUserRequest setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  public UpdateAccountUserRequest setUserName(String userName) {
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
    UpdateAccountUserRequest that = (UpdateAccountUserRequest) o;
    return Objects.equals(active, that.active)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(emails, that.emails)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(roles, that.roles)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, displayName, emails, externalId, id, name, roles, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAccountUserRequest.class)
        .add("active", active)
        .add("displayName", displayName)
        .add("emails", emails)
        .add("externalId", externalId)
        .add("id", id)
        .add("name", name)
        .add("roles", roles)
        .add("userName", userName)
        .toString();
  }
}
