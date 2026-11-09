// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A user in your Databricks account. */
@Generated
public class User {
  /** The ID of the account that contains the user. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Whether the user is active in the account. New users are active unless you set this to
   * `INACTIVE`.
   */
  @JsonProperty("account_user_status")
  private State accountUserStatus;

  /** The ID of the user in your identity provider (IdP). */
  @JsonProperty("external_id")
  private String externalId;

  /** The user's name. */
  @JsonProperty("full_name")
  private UserFullName fullName;

  /**
   * The resource name of the user, in one of these formats: - Account APIs:
   * `accounts/{account_id}/users/{user_id}` - Workspace APIs: `users/{user_id}`
   */
  @JsonProperty("name")
  private String name;

  /**
   * The resource name of the account that contains the user, in the format `accounts/{account_id}`.
   * Workspace APIs return the same format.
   */
  @JsonProperty("parent")
  private String parent;

  /** The Databricks ID of the user. */
  @JsonProperty("user_id")
  private String userId;

  /**
   * The user's username, which is their email address. It can't be changed after the user is
   * created.
   */
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

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public User setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
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
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(userId, that.userId)
        && Objects.equals(username, that.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, accountUserStatus, externalId, fullName, name, parent, userId, username);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
        .add("accountId", accountId)
        .add("accountUserStatus", accountUserStatus)
        .add("externalId", externalId)
        .add("fullName", fullName)
        .add("name", name)
        .add("parent", parent)
        .add("userId", userId)
        .add("username", username)
        .toString();
  }
}
