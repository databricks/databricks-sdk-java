// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateUserProxyRequest {
  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** Required. User to be updated in <Databricks> */
  @JsonProperty("user")
  private User user;

  /** Required. Internal ID of the user in Databricks. */
  @JsonIgnore private String userId;

  public UpdateUserProxyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateUserProxyRequest setUser(User user) {
    this.user = user;
    return this;
  }

  public User getUser() {
    return user;
  }

  public UpdateUserProxyRequest setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateUserProxyRequest that = (UpdateUserProxyRequest) o;
    return Objects.equals(updateMask, that.updateMask)
        && Objects.equals(user, that.user)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateMask, user, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateUserProxyRequest.class)
        .add("updateMask", updateMask)
        .add("user", user)
        .add("userId", userId)
        .toString();
  }
}
