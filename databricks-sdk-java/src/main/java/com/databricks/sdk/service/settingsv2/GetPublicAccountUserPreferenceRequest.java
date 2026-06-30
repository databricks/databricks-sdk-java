// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetPublicAccountUserPreferenceRequest {
  /** User Setting name. */
  @JsonIgnore private String name;

  /** User ID of the user whose setting is being retrieved. */
  @JsonIgnore private String userId;

  public GetPublicAccountUserPreferenceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPublicAccountUserPreferenceRequest setUserId(String userId) {
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
    GetPublicAccountUserPreferenceRequest that = (GetPublicAccountUserPreferenceRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublicAccountUserPreferenceRequest.class)
        .add("name", name)
        .add("userId", userId)
        .toString();
  }
}
