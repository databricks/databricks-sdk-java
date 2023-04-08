// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

/** Delete Custom OAuth App Integration */
public class DeleteCustomAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public DeleteCustomAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }
}
