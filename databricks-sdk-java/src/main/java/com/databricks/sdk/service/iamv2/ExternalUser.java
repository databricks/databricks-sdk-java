// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A user from your identity provider (IdP), identified by their ID in your IdP. This resource is
 * read-only. Getting an external user syncs the user's details and group memberships from your IdP,
 * and adds the user to your account if they aren't already there.
 */
@Generated
public class ExternalUser {
  /** The ID of the account that contains the user. */
  @JsonProperty("account_id")
  private String accountId;

  /** Whether the user is active in the account. */
  @JsonProperty("account_user_status")
  private State accountUserStatus;

  /** The user's given and family names from your IdP, separated by a space. */
  @JsonProperty("display_name")
  private String displayName;

  /** The ID of the user in your IdP. */
  @JsonProperty("external_user_id")
  private String externalUserId;

  /** The user's name, from your IdP. */
  @JsonProperty("full_name")
  private FullName fullName;

  /** The Databricks ID of the user. Use it as the `user_id` in the user APIs. */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external user, in one of these formats: - Account APIs:
   * `accounts/{account_id}/external-users/{external_user_id}` - Workspace APIs:
   * `external-users/{external_user_id}`
   */
  @JsonProperty("name")
  private String name;

  /** The user's username, which is their email address. */
  @JsonProperty("username")
  private String username;

  public ExternalUser setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public ExternalUser setAccountUserStatus(State accountUserStatus) {
    this.accountUserStatus = accountUserStatus;
    return this;
  }

  public State getAccountUserStatus() {
    return accountUserStatus;
  }

  public ExternalUser setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ExternalUser setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  public String getExternalUserId() {
    return externalUserId;
  }

  public ExternalUser setFullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

  public FullName getFullName() {
    return fullName;
  }

  public ExternalUser setInternalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  public String getInternalId() {
    return internalId;
  }

  public ExternalUser setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalUser setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalUser that = (ExternalUser) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(accountUserStatus, that.accountUserStatus)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(externalUserId, that.externalUserId)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(internalId, that.internalId)
        && Objects.equals(name, that.name)
        && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        accountUserStatus,
        displayName,
        externalUserId,
        fullName,
        internalId,
        name,
        username);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalUser.class)
        .add("accountId", accountId)
        .add("accountUserStatus", accountUserStatus)
        .add("displayName", displayName)
        .add("externalUserId", externalUserId)
        .add("fullName", fullName)
        .add("internalId", internalId)
        .add("name", name)
        .add("username", username)
        .toString();
  }
}
