// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateWebhookResponsePb {
  @JsonProperty("webhook")
  private RegistryWebhook webhook;

  public CreateWebhookResponsePb setWebhook(RegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  public RegistryWebhook getWebhook() {
    return webhook;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWebhookResponsePb that = (CreateWebhookResponsePb) o;
    return Objects.equals(webhook, that.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWebhookResponsePb.class).add("webhook", webhook).toString();
  }
}
