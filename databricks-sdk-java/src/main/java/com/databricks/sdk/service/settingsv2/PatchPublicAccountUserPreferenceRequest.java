// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PatchPublicAccountUserPreferenceRequest {
  /** */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("setting")
  private UserPreference setting;

  /** User ID of the user whose setting is being updated. */
  @JsonIgnore private String userId;

  public PatchPublicAccountUserPreferenceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PatchPublicAccountUserPreferenceRequest setSetting(UserPreference setting) {
    this.setting = setting;
    return this;
  }

  public UserPreference getSetting() {
    return setting;
  }

  public PatchPublicAccountUserPreferenceRequest setUserId(String userId) {
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
    PatchPublicAccountUserPreferenceRequest that = (PatchPublicAccountUserPreferenceRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(setting, that.setting)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, setting, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchPublicAccountUserPreferenceRequest.class)
        .add("name", name)
        .add("setting", setting)
        .add("userId", userId)
        .toString();
  }
}
