// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a group of users, service principals and other groups in the Databricks account.
 * Members inherit the permissions that are granted to the group.
 */
@Generated
public class AccountGroup {
  /** Identifies the Databricks account that the group belongs to. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Identifies the group by a human-readable name. The name must be unique within the account and
   * must not exceed 255 characters.
   */
  @JsonProperty("displayName")
  private String displayName;

  /**
   * Identifies the group in an external identity provider. Identity providers use it to match the
   * groups they manage to Databricks groups, so it should be unique among the groups in the
   * account.
   */
  @JsonProperty("externalId")
  private String externalId;

  /**
   * Identifies the group within Databricks. Databricks generates the ID when the group is created.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Lists the members of the group. Each entry identifies a user, service principal or group in the
   * account by its ID in the value sub-attribute.
   */
  @JsonProperty("members")
  private Collection<ComplexValue> members;

  /** Container for the group identifier. Workspace local versus account. */
  @JsonProperty("meta")
  private ResourceMeta meta;

  /**
   * Lists the account roles that are assigned to the group. The only supported role value is
   * `account_admin`.
   */
  @JsonProperty("roles")
  private Collection<ComplexValue> roles;

  public AccountGroup setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public AccountGroup setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public AccountGroup setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public AccountGroup setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AccountGroup setMembers(Collection<ComplexValue> members) {
    this.members = members;
    return this;
  }

  public Collection<ComplexValue> getMembers() {
    return members;
  }

  public AccountGroup setMeta(ResourceMeta meta) {
    this.meta = meta;
    return this;
  }

  public ResourceMeta getMeta() {
    return meta;
  }

  public AccountGroup setRoles(Collection<ComplexValue> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<ComplexValue> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountGroup that = (AccountGroup) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(id, that.id)
        && Objects.equals(members, that.members)
        && Objects.equals(meta, that.meta)
        && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, displayName, externalId, id, members, meta, roles);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountGroup.class)
        .add("accountId", accountId)
        .add("displayName", displayName)
        .add("externalId", externalId)
        .add("id", id)
        .add("members", members)
        .add("meta", meta)
        .add("roles", roles)
        .toString();
  }
}
