// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Represents a group that is a transitive parent of a principal. */
@Generated
public class TransitiveParentGroup {
  /** The parent account ID for group in Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** ExternalId of the group in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  /** Internal group ID of the group in Databricks. */
  @JsonProperty("group_id")
  private String groupId;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransitiveParentGroup that = (TransitiveParentGroup) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(groupId, that.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, externalId, groupId);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitiveParentGroup.class)
        .add("accountId", accountId)
        .add("externalId", externalId)
        .add("groupId", groupId)
        .toString();
  }
}
