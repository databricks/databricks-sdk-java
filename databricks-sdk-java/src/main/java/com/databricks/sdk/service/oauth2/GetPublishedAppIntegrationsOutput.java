// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPublishedAppIntegrationsOutput {
  /** Array of Published OAuth App Integrations defined for the account. */
  @JsonProperty("apps")
  private java.util.List<GetPublishedAppIntegrationOutput> apps;

  public GetPublishedAppIntegrationsOutput setApps(
      java.util.List<GetPublishedAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public java.util.List<GetPublishedAppIntegrationOutput> getApps() {
    return apps;
  }
}
