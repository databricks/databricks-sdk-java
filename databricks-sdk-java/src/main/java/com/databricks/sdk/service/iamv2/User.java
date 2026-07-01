// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The details of a User resource. */
@Generated
public class User {
  /** The accountId parent of the user in Databricks. */
  @JsonProperty("account_id")
  private String accountId;

  /** The activity status of a user in a Databricks account. */
  @JsonProperty("account_user_status")
  private State accountUserStatus;

  /** ExternalId of the user in the customer's IdP. */
  @JsonProperty("external_id")
  private String externalId;

  /** */
  @JsonProperty("full_name")
  private UserFullName fullName;

  /** Internal userId of the user in Databricks. */
  @JsonProperty("internal_id")
  private Long internalId;

  /** Username/email of the user. */
  @JsonProperty("username")
  private String username;

  public User setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public User setAccountUserStatus(State accountUserStatus) {
    this.accountUserStatus = accountUserStatus;
    return this;
  }

  public State getAccountUserStatus() {
    return accountUserStatus;
  }

  public User setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public String getExternalId() {
    return externalId;
  }

  public User setFullName(UserFullName fullName) {
    this.fullName = fullName;
    return this;
  }

  public UserFullName getFullName() {
    return fullName;
  }

  public User setInternalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

  public Long getInternalId() {
    return internalId;
  }

  public User setUsername(String username) {
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
    User that = (User) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(accountUserStatus, that.accountUserStatus)
        && Objects.equals(externalId, that.externalId)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(internalId, that.internalId)
        && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountUserStatus, externalId, fullName, internalId, username);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
        .add("accountId", accountId)
        .add("accountUserStatus", accountUserStatus)
        .add("externalId", externalId)
        .add("fullName", fullName)
        .add("internalId", internalId)
        .add("username", username)
        .toString();
  }
}
