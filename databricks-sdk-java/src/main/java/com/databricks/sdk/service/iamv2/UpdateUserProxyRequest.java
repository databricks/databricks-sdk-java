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
  /**
   * The resource name of the user. The format depends on the API that returned it: -
   * Account-scoped: accounts/{account_id}/users/{user_id} - Workspace-scoped: users/{user_id}
   */
  @JsonIgnore private String name;

  /** Required. The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  /** Required. User to be updated in Databricks */
  @JsonProperty("user")
  private User user;

  public UpdateUserProxyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateUserProxyRequest that = (UpdateUserProxyRequest) o;
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
    return new ToStringer(UpdateUserProxyRequest.class)
        .add("name", name)
        .add("updateMask", updateMask)
        .add("user", user)
        .toString();
  }
}
