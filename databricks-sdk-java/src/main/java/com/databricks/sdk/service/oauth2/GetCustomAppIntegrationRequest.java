// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

/** Get OAuth Custom App Integration */
public class GetCustomAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public GetCustomAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }
}
