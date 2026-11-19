// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A group in your Databricks account. To address a group, put its resource name in the URL: `GET
 * /api/2.0/identity/accounts/{account_id}/groups/{group_id}` in account APIs, or `GET
 * /api/2.0/identity/groups/{group_id}` in workspace APIs.
 */
@Generated
public class Group {
  /** The ID of the account that contains the group. */
  @JsonProperty("account_id")
  private String accountId;

  /** The ID of the group in your identity provider (IdP). */
  @JsonProperty("external_id")
  private String externalId;

  /**
   * The Databricks ID of the group. It is a numeric string that Databricks assigns when the group
   * is created, and it is the `{group_id}` segment of `name`.
   */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * The display name of the group. It must be unique in the account, must not be blank, and must be
   * shorter than 255 characters. Databricks trims surrounding whitespace. You can't use the name of
   * a group that Databricks manages, such as `admins` or `users`.
   */
  @JsonProperty("group_name")
  private String groupName;

  /**
   * The resource name of the group, in one of these formats: - Account APIs:
   * `accounts/{account_id}/groups/{group_id}` - Workspace APIs: `groups/{group_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The resource name of the account that contains the group, in the format
   * `accounts/{account_id}`. Workspace APIs return the same format.
   */
  @JsonProperty("parent")
  private String parent;

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

  public Group setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Group setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Group that = (Group) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, groupId, groupName, name, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(Group.class)
        .add("accountId", accountId)
        .add("externalId", externalId)
        .add("groupId", groupId)
        .add("groupName", groupName)
        .add("name", name)
        .add("parent", parent)
        .toString();
  }
}
