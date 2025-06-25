// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A DatabaseInstanceRole represents a Postgres role in a database instance. */
@Generated
public class DatabaseInstanceRole {
  /** API-exposed Postgres role attributes */
  @JsonProperty("attributes")
  private DatabaseInstanceRoleAttributes attributes;

  /** The type of the role. */
  @JsonProperty("identity_type")
  private DatabaseInstanceRoleIdentityType identityType;

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

  public DatabaseInstanceRole setIdentityType(DatabaseInstanceRoleIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public DatabaseInstanceRoleIdentityType getIdentityType() {
    return identityType;
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
        && Objects.equals(identityType, that.identityType)
        && Objects.equals(membershipRole, that.membershipRole)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, identityType, membershipRole, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstanceRole.class)
        .add("attributes", attributes)
        .add("identityType", identityType)
        .add("membershipRole", membershipRole)
        .add("name", name)
        .toString();
  }
}
