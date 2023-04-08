// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

/** Delete Published OAuth App Integration */
public class DeletePublishedAppIntegrationRequest {
  /** The oauth app integration ID. */
  private String integrationId;

  public DeletePublishedAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }
}
