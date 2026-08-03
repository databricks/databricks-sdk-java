// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The details of a Group resource. */
@Generated
public class Group {
  /** The parent account ID for group in Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** ExternalId of the group in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  /** Internal group ID of the group in Databricks. */
  @JsonProperty("group_id")
  private String groupId;

  /** Display name of the group. */
  @JsonProperty("group_name")
  private String groupName;

  public Group setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public Group setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public Group setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public Group setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Group that = (Group) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(groupName, that.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, groupId, groupName);
  }

  @Override
  public String toString() {
    return new ToStringer(Group.class)
        .add("accountId", accountId)
        .add("externalId", externalId)
        .add("groupId", groupId)
        .add("groupName", groupName)
        .toString();
  }
}
