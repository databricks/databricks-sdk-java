// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCustomAppIntegrationsOutput {
  /** Array of Custom OAuth App Integrations defined for the account. */
  @JsonProperty("apps")
  private java.util.List<GetCustomAppIntegrationOutput> apps;

  public GetCustomAppIntegrationsOutput setApps(
      java.util.List<GetCustomAppIntegrationOutput> apps) {
    this.apps = apps;
    return this;
  }

  public java.util.List<GetCustomAppIntegrationOutput> getApps() {
    return apps;
  }
}
