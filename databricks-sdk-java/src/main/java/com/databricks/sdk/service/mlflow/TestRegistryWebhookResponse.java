// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookResponse that = (TestRegistryWebhookResponse) o;
    return Objects.equals(webhook, that.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookResponse.class).add("webhook", webhook).toString();
  }
}
