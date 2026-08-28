// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An external group from the customer's Identity Provider, resolved into Databricks. This is a
 * read-only resource keyed by the IdP external ID. The Get method may trigger an idempotent sync
 * from the customer's IdP to provision or refresh the group's data in Databricks.
 */
@Generated
public class ExternalGroup {
  /** The parent account ID, from Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** Display name of the group from the customer's IdP. */
  @JsonProperty("display_name")
  private String displayName;

  /** The external ID of the group in the customer's IdP. */
  @JsonProperty("external_group_id")
  private String externalGroupId;

  /** Internal groupId of the group in Databricks. */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external group. The format depends on the API that returned it: -
   * Account-scoped: accounts/{account_id}/external-groups/{external_group_id} - Workspace-scoped:
   * external-groups/{external_group_id}
   */
  @JsonProperty("name")
  private String name;

  public ExternalGroup setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public ExternalGroup setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ExternalGroup setExternalGroupId(String externalGroupId) {
    this.externalGroupId = externalGroupId;
    return this;
  }

  public String getExternalGroupId() {
    return externalGroupId;
  }

  public ExternalGroup setInternalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  public String getInternalId() {
    return internalId;
  }

  public ExternalGroup setName(String name) {
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
    ExternalGroup that = (ExternalGroup) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalGroupId, that.externalGroupId)
        && Objects.equals(internalId, that.internalId)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, externalGroupId, internalId, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalGroup.class)
        .add("accountId", accountId)
        .add("displayName", displayName)
        .add("externalGroupId", externalGroupId)
        .add("internalId", internalId)
        .add("name", name)
        .toString();
  }
}
