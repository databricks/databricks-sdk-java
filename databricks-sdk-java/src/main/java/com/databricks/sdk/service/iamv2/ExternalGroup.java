// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A group from your identity provider (IdP), identified by its ID in your IdP. This resource is
 * read-only. Getting an external group syncs its name and parent groups from your IdP, and adds it
 * to your account if it isn't already there. If your account has group visibility filters, the
 * group must match them.
 */
@Generated
public class ExternalGroup {
  /** The ID of the account that contains the group. */
  @JsonProperty("account_id")
  private String accountId;

  /** The name of the group, from your IdP. It's the same as the group's `group_name`. */
  @JsonProperty("display_name")
  private String displayName;

  /** The ID of the group in your IdP. */
  @JsonProperty("external_group_id")
  private String externalGroupId;

  /** The Databricks ID of the group. Use it as the `group_id` in the group APIs. */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external group, in one of these formats: - Account APIs:
   * `accounts/{account_id}/external-groups/{external_group_id}` - Workspace APIs:
   * `external-groups/{external_group_id}`
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
