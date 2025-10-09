// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A DatabaseInstanceRole represents a Postgres role in a database instance. */
@Generated
public class DatabaseInstanceRole {
  /** The desired API-exposed Postgres role attribute to associate with the role. Optional. */
  @JsonProperty("attributes")
  private DatabaseInstanceRoleAttributes attributes;

  /** The attributes that are applied to the role. */
  @JsonProperty("effective_attributes")
  private DatabaseInstanceRoleAttributes effectiveAttributes;

  /** The type of the role. */
  @JsonProperty("identity_type")
  private DatabaseInstanceRoleIdentityType identityType;

  /** */
  @JsonProperty("instance_name")
  private String instanceName;

  /** An enum value for a standard role that this role is a member of. */
  @JsonProperty("membership_role")
  private DatabaseInstanceRoleMembershipRole membershipRole;

  /** The name of the role. This is the unique identifier for the role in an instance. */
  @JsonProperty("name")
  private String name;

  public DatabaseInstanceRole setAttributes(DatabaseInstanceRoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public DatabaseInstanceRoleAttributes getAttributes() {
    return attributes;
  }

  public DatabaseInstanceRole setEffectiveAttributes(
      DatabaseInstanceRoleAttributes effectiveAttributes) {
    this.effectiveAttributes = effectiveAttributes;
    return this;
  }

  public DatabaseInstanceRoleAttributes getEffectiveAttributes() {
    return effectiveAttributes;
  }

  public DatabaseInstanceRole setIdentityType(DatabaseInstanceRoleIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public DatabaseInstanceRoleIdentityType getIdentityType() {
    return identityType;
  }

  public DatabaseInstanceRole setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  public DatabaseInstanceRole setMembershipRole(DatabaseInstanceRoleMembershipRole membershipRole) {
    this.membershipRole = membershipRole;
    return this;
  }

  public DatabaseInstanceRoleMembershipRole getMembershipRole() {
    return membershipRole;
  }

  public DatabaseInstanceRole setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseInstanceRole that = (DatabaseInstanceRole) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(effectiveAttributes, that.effectiveAttributes)
        && Objects.equals(identityType, that.identityType)
        && Objects.equals(instanceName, that.instanceName)
        && Objects.equals(membershipRole, that.membershipRole)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, effectiveAttributes, identityType, instanceName, membershipRole, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstanceRole.class)
        .add("attributes", attributes)
        .add("effectiveAttributes", effectiveAttributes)
        .add("identityType", identityType)
        .add("instanceName", instanceName)
        .add("membershipRole", membershipRole)
        .add("name", name)
        .toString();
  }
}
