// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateUserProxyRequest {
  /**
   * The resource name of the account to create the user in, in the format `accounts/{account_id}`.
   * Defaults to the account that contains this workspace. Any other account is rejected.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  /** The user to create. */
  @JsonProperty("user")
  private User user;

  public CreateUserProxyRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateUserProxyRequest setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateUserProxyRequest that = (CreateUserProxyRequest) o;
    return Objects.equals(parent, that.parent) && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, user);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateUserProxyRequest.class)
        .add("parent", parent)
        .add("user", user)
        .toString();
  }
}
