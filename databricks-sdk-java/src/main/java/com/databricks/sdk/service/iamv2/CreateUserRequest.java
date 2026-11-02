// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateUserRequest {
  /**
   * The parent resource name of the account in which to create the user. Format:
   * accounts/{account_id}
   */
  @JsonIgnore private String parent;

  /** Required. User to be created in Databricks */
  @JsonProperty("user")
  private User user;

  public CreateUserRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateUserRequest setUser(User user) {
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
    CreateUserRequest that = (CreateUserRequest) o;
    return Objects.equals(parent, that.parent) && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, user);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateUserRequest.class)
        .add("parent", parent)
        .add("user", user)
        .toString();
  }
}
