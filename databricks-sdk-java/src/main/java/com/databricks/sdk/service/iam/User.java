// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>User class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>active</code>.</p>
   *
   * @param active a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setActive(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * <p>Getter for the field <code>active</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getActive() {
    return active;
  }

  /**
   * <p>Setter for the field <code>displayName</code>.</p>
   *
   * @param displayName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>Getter for the field <code>displayName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * <p>Setter for the field <code>emails</code>.</p>
   *
   * @param emails a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setEmails(Collection<ComplexValue> emails) {
    this.emails = emails;
    return this;
  }

  /**
   * <p>Getter for the field <code>emails</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getEmails() {
    return emails;
  }

  /**
   * <p>Setter for the field <code>entitlements</code>.</p>
   *
   * @param entitlements a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setEntitlements(Collection<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  /**
   * <p>Getter for the field <code>entitlements</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getEntitlements() {
    return entitlements;
  }

  /**
   * <p>Setter for the field <code>externalId</code>.</p>
   *
   * @param externalId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * <p>Getter for the field <code>externalId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * <p>Setter for the field <code>groups</code>.</p>
   *
   * @param groups a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setGroups(Collection<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * <p>Getter for the field <code>groups</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getGroups() {
    return groups;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link com.databricks.sdk.service.iam.Name} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setName(Name name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.Name} object
   */
  public Name getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>roles</code>.</p>
   *
   * @param roles a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * <p>Getter for the field <code>roles</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  /**
   * <p>Setter for the field <code>userName</code>.</p>
   *
   * @param userName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  public User setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <p>Getter for the field <code>userName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserName() {
    return userName;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        active, displayName, emails, entitlements, externalId, groups, id, name, roles, userName);
  }

  /** {@inheritDoc} */
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
