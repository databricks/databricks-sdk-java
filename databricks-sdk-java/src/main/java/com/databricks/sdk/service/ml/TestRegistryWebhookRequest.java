// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TestRegistryWebhookRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TestRegistryWebhookRequest {
  /**
   * If `event` is specified, the test trigger uses the specified event. If `event` is not
   * specified, the test trigger uses a randomly chosen event associated with the webhook.
   */
  @JsonProperty("event")
  private RegistryWebhookEvent event;

  /** Webhook ID */
  @JsonProperty("id")
  private String id;

  /**
   * <p>Setter for the field <code>event</code>.</p>
   *
   * @param event a {@link com.databricks.sdk.service.ml.RegistryWebhookEvent} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookRequest} object
   */
  public TestRegistryWebhookRequest setEvent(RegistryWebhookEvent event) {
    this.event = event;
    return this;
  }

  /**
   * <p>Getter for the field <code>event</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.RegistryWebhookEvent} object
   */
  public RegistryWebhookEvent getEvent() {
    return event;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhookRequest} object
   */
  public TestRegistryWebhookRequest setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookRequest that = (TestRegistryWebhookRequest) o;
    return Objects.equals(event, that.event) && Objects.equals(id, that.id);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(event, id);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookRequest.class)
        .add("event", event)
        .add("id", id)
        .toString();
  }
}
