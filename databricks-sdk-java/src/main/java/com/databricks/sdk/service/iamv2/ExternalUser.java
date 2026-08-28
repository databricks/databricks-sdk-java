// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * An external user from the customer's Identity Provider, resolved into Databricks. This is a
 * read-only resource that allows customers to look up external user identities by their IdP
 * external ID and retrieve the corresponding Databricks internal ID and metadata. The Get method
 * may trigger an idempotent sync from the customer's IdP to provision or refresh the user's data in
 * Databricks.
 */
@Generated
public class ExternalUser {
  /** The parent account ID, from Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** The activity status of the user in the Databricks account. */
  @JsonProperty("account_user_status")
  private State accountUserStatus;

  /** Display name of the user from the customer's IdP. */
  @JsonProperty("display_name")
  private String displayName;

  /** The external ID of the user in the customer's IdP. */
  @JsonProperty("external_user_id")
  private String externalUserId;

  /** The full name of the user, from the customer's IdP. */
  @JsonProperty("full_name")
  private FullName fullName;

  /** Internal userId of the user in Databricks. */
  @JsonProperty("internal_id")
  private String internalId;

  /**
   * The resource name of the external user. The format depends on the API that returned it: -
   * Account-scoped: accounts/{account_id}/external-users/{external_user_id} - Workspace-scoped:
   * external-users/{external_user_id}
   */
  @JsonProperty("name")
  private String name;

  /** Username/email of the user, from Databricks. */
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
