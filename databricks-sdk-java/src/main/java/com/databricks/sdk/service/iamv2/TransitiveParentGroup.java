// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A group that a principal belongs to, either directly or through another group. */
@Generated
public class TransitiveParentGroup {
  /** The ID of the account that contains the group. */
  @JsonProperty("account_id")
  private String accountId;

  /** The ID of the group in your identity provider (IdP). */
  @JsonProperty("external_id")
  private String externalId;

  /** The Databricks ID of the group. */
  @JsonProperty("group_id")
  private String groupId;

  /**
   * The resource name of the parent group, in one of these formats: - Account APIs:
   * `accounts/{account_id}/principals/{principal_id}/transitive-parent-groups/{group_id}` -
   * Workspace APIs: `principals/{principal_id}/transitive-parent-groups/{group_id}`
   */
  @JsonProperty("name")
  private String name;

  public TransitiveParentGroup setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public TransitiveParentGroup setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public TransitiveParentGroup setGroupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getGroupId() {
    return groupId;
  }

  public TransitiveParentGroup setName(String name) {
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
    TransitiveParentGroup that = (TransitiveParentGroup) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groupId, that.groupId)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, groupId, name);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitiveParentGroup.class)
        .add("accountId", accountId)
        .add("externalId", externalId)
        .add("groupId", groupId)
        .add("name", name)
        .toString();
  }
}
