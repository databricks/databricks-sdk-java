// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A user, service principal, or group that's a direct member of a group. */
@Generated
public class DirectGroupMember {
  /** The member's display name. */
  @JsonProperty("display_name")
  private String displayName;

  /** The ID of the member in your identity provider (IdP). */
  @JsonProperty("external_id")
  private String externalId;

  /** The Databricks ID of the group. */
  @JsonProperty("group_id")
  private Long groupId;

  /** Where the membership comes from. */
  @JsonProperty("membership_source")
  private GroupMembershipSource membershipSource;

  /**
   * The resource name of the membership, in one of these formats: - Account APIs:
   * `accounts/{account_id}/groups/{group_id}/direct-members/{principal_id}` - Workspace APIs:
   * `groups/{group_id}/direct-members/{principal_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The resource name of the group, in one of these formats: - Account APIs:
   * `accounts/{account_id}/groups/{group_id}` - Workspace APIs: `groups/{group_id}`
   */
  @JsonProperty("parent")
  private String parent;

  /** The Databricks ID of the member. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** Whether the member is a user, service principal, or group. */
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

  public DirectGroupMember setGroupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public Long getGroupId() {
    return groupId;
  }

  public DirectGroupMember setMembershipSource(GroupMembershipSource membershipSource) {
    this.membershipSource = membershipSource;
    return this;
  }

  public GroupMembershipSource getMembershipSource() {
    return membershipSource;
  }

  public DirectGroupMember setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DirectGroupMember setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
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
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(membershipSource, that.membershipSource)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        displayName,
        externalId,
        groupId,
        membershipSource,
        name,
        parent,
        principalId,
        principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(DirectGroupMember.class)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("groupId", groupId)
        .add("membershipSource", membershipSource)
        .add("name", name)
        .add("parent", parent)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .toString();
  }
}
