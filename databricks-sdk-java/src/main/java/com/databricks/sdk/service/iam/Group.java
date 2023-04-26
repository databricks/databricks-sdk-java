// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Group class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>displayName</code>.</p>
   *
   * @param displayName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setDisplayName(String displayName) {
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
   * <p>Setter for the field <code>entitlements</code>.</p>
   *
   * @param entitlements a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setEntitlements(Collection<ComplexValue> entitlements) {
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
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setExternalId(String externalId) {
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
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setGroups(Collection<ComplexValue> groups) {
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
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setId(String id) {
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
   * <p>Setter for the field <code>members</code>.</p>
   *
   * @param members a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  /**
   * <p>Getter for the field <code>members</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ComplexValue> getMembers() {
    return members;
  }

  /**
   * <p>Setter for the field <code>roles</code>.</p>
   *
   * @param roles a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.Group} object
   */
  public Group setRoles(Collection<ComplexValue> roles) {
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(displayName, entitlements, externalId, groups, id, members, roles);
  }

  /** {@inheritDoc} */
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
