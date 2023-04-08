// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

/** Get OAuth Published App Integration */
public class GetPublishedAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public GetPublishedAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }
}
