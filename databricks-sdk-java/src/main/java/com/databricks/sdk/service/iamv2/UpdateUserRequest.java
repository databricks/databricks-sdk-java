// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateUserRequest {
  /**
   * The resource name of the user, in one of these formats: - Account APIs:
   * `accounts/{account_id}/users/{user_id}` - Workspace APIs: `users/{user_id}`
   */
  @JsonIgnore private String name;

  /**
   * The fields to update, separated by commas. You can update `full_name.given_name`,
   * `full_name.family_name`, `account_user_status`, and `external_id`.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** The user to update. Its `name` identifies the user. */
  @JsonProperty("user")
  private User user;

  public UpdateUserRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateUserRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateUserRequest setUser(User user) {
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
    UpdateUserRequest that = (UpdateUserRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, updateMask, user);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateUserRequest.class)
        .add("name", name)
        .add("updateMask", updateMask)
        .add("user", user)
        .toString();
  }
}
