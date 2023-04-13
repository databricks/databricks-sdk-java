// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateOAuthEnrollment {
  /** If true, enable OAuth for all the published applications in the account. */
  @JsonProperty("enable_all_published_apps")
  private Boolean enableAllPublishedApps;

  public CreateOAuthEnrollment setEnableAllPublishedApps(Boolean enableAllPublishedApps) {
    this.enableAllPublishedApps = enableAllPublishedApps;
    return this;
  }

  public Boolean getEnableAllPublishedApps() {
    return enableAllPublishedApps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOAuthEnrollment that = (CreateOAuthEnrollment) o;
    return Objects.equals(enableAllPublishedApps, that.enableAllPublishedApps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAllPublishedApps);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOAuthEnrollment.class)
        .add("enableAllPublishedApps", enableAllPublishedApps)
        .toString();
  }
}
