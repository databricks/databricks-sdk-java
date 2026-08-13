// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a principal that is a direct member of a group, with its source of membership. */
@Generated
public class DirectGroupMember {
  /** Display name of the principal. */
  @JsonProperty("display_name")
  private String displayName;

  /** The external ID of the principal in Databricks. */
  @JsonProperty("external_id")
  private String externalId;

  /** The source of group membership (internal or from identity provider). */
  @JsonProperty("membership_source")
  private GroupMembershipSource membershipSource;

  /** Internal ID of the principal in Databricks. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** The type of the principal (user/service principal/group). */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  public DirectGroupMember setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public DirectGroupMember setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public DirectGroupMember setMembershipSource(GroupMembershipSource membershipSource) {
    this.membershipSource = membershipSource;
    return this;
  }

  public GroupMembershipSource getMembershipSource() {
    return membershipSource;
  }

  public DirectGroupMember setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public DirectGroupMember setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DirectGroupMember that = (DirectGroupMember) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(membershipSource, that.membershipSource)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, externalId, membershipSource, principalId, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectGroupMember.class)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("membershipSource", membershipSource)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .toString();
  }
}
