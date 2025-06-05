// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A DatabaseInstanceRole represents a Postgres role in a database instance. */
@Generated
class DatabaseInstanceRolePb {
  @JsonProperty("attributes")
  private DatabaseInstanceRoleAttributes attributes;

  @JsonProperty("identity_type")
  private DatabaseInstanceRoleIdentityType identityType;

  @JsonProperty("membership_role")
  private DatabaseInstanceRoleMembershipRole membershipRole;

  @JsonProperty("name")
  private String name;

  public DatabaseInstanceRolePb setAttributes(DatabaseInstanceRoleAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public DatabaseInstanceRoleAttributes getAttributes() {
    return attributes;
  }

  public DatabaseInstanceRolePb setIdentityType(DatabaseInstanceRoleIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public DatabaseInstanceRoleIdentityType getIdentityType() {
    return identityType;
  }

  public DatabaseInstanceRolePb setMembershipRole(
      DatabaseInstanceRoleMembershipRole membershipRole) {
    this.membershipRole = membershipRole;
    return this;
  }

  public DatabaseInstanceRoleMembershipRole getMembershipRole() {
    return membershipRole;
  }

  public DatabaseInstanceRolePb setName(String name) {
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
    DatabaseInstanceRolePb that = (DatabaseInstanceRolePb) o;
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
    return new ToStringer(DatabaseInstanceRolePb.class)
        .add("attributes", attributes)
        .add("identityType", identityType)
        .add("membershipRole", membershipRole)
        .add("name", name)
        .toString();
  }
}
