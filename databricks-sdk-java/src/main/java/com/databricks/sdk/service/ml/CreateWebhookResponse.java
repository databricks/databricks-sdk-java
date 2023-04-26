// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateWebhookResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateWebhookResponse {
  /** */
  @JsonProperty("webhook")
  private RegistryWebhook webhook;

  /**
   * <p>Setter for the field <code>webhook</code>.</p>
   *
   * @param webhook a {@link com.databricks.sdk.service.ml.RegistryWebhook} object
   * @return a {@link com.databricks.sdk.service.ml.CreateWebhookResponse} object
   */
  public CreateWebhookResponse setWebhook(RegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  /**
   * <p>Getter for the field <code>webhook</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RegistryWebhook} object
   */
  public RegistryWebhook getWebhook() {
    return webhook;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWebhookResponse that = (CreateWebhookResponse) o;
    return Objects.equals(webhook, that.webhook);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(webhook);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateWebhookResponse.class).add("webhook", webhook).toString();
  }
}
