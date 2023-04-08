// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Delete a webhook */
public class DeleteRegistryWebhookRequest {
  /** Webhook ID required to delete a registry webhook. */
  @QueryParam("id")
  private String id;

  public DeleteRegistryWebhookRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
