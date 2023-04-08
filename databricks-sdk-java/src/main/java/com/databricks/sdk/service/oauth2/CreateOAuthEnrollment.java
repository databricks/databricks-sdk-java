// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
