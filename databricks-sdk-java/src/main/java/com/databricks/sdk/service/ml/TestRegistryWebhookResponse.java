// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TestRegistryWebhookResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TestRegistryWebhookResponse {
  /** Test webhook response object. */
  @JsonProperty("webhook")
  private TestRegistryWebhook webhook;

  /**
   * <p>Setter for the field <code>webhook</code>.</p>
   *
   * @param webhook a {@link com.databricks.sdk.service.ml.TestRegistryWebhook} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookResponse} object
   */
  public TestRegistryWebhookResponse setWebhook(TestRegistryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

  /**
   * <p>Getter for the field <code>webhook</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhook} object
   */
  public TestRegistryWebhook getWebhook() {
    return webhook;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookResponse that = (TestRegistryWebhookResponse) o;
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
    return new ToStringer(TestRegistryWebhookResponse.class).add("webhook", webhook).toString();
  }
}
