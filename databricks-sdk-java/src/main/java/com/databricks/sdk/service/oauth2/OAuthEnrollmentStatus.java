// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class OAuthEnrollmentStatus {
  /** Is OAuth enrolled for the account. */
  @JsonProperty("is_enabled")
  private Boolean isEnabled;

  public OAuthEnrollmentStatus setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OAuthEnrollmentStatus that = (OAuthEnrollmentStatus) o;
    return Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(OAuthEnrollmentStatus.class).add("isEnabled", isEnabled).toString();
  }
}
