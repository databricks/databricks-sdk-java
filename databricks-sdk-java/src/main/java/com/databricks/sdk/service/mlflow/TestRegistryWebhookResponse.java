// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestRegistryWebhookResponse {
  /** Test webhook response object. */
  @JsonProperty("webhook")
  private TestRegistryWebhook webhook;

  public TestRegistryWebhookResponse setWebhook(TestRegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  public TestRegistryWebhook getWebhook() {
    return webhook;
  }
}
