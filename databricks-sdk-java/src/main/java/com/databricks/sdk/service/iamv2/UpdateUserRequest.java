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
  /** Required. Internal ID of the user in Databricks. */
  @JsonIgnore private Long internalId;

  /** Optional. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** Required. User to be updated in <Databricks> */
  @JsonProperty("user")
  private User user;

  public UpdateUserRequest setInternalId(Long internalId) {
    this.internalId = internalId;
    return this;
  }

  public Long getInternalId() {
    return internalId;
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
    return Objects.equals(internalId, that.internalId)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId, updateMask, user);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateUserRequest.class)
        .add("internalId", internalId)
        .add("updateMask", updateMask)
        .add("user", user)
        .toString();
  }
}
