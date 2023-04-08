// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
  /** String that represents a human-readable group name */
  @JsonProperty("displayName")
  private String displayName;

  /** */
  @JsonProperty("entitlements")
  private java.util.List<ComplexValue> entitlements;

  /** */
  @JsonProperty("externalId")
  private String externalId;

  /** */
  @JsonProperty("groups")
  private java.util.List<ComplexValue> groups;

  /** Databricks group ID */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("members")
  private java.util.List<ComplexValue> members;

  /** */
  @JsonProperty("roles")
  private java.util.List<ComplexValue> roles;

  public Group setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Group setEntitlements(java.util.List<ComplexValue> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public java.util.List<ComplexValue> getEntitlements() {
    return entitlements;
  }

  public Group setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public Group setGroups(java.util.List<ComplexValue> groups) {
    this.groups = groups;
    return this;
  }

  public java.util.List<ComplexValue> getGroups() {
    return groups;
  }

  public Group setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Group setMembers(java.util.List<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public java.util.List<ComplexValue> getMembers() {
    return members;
  }

  public Group setRoles(java.util.List<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public java.util.List<ComplexValue> getRoles() {
    return roles;
  }
}
