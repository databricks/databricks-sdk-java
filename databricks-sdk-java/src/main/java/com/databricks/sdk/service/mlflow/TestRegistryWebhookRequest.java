// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public TestRegistryWebhookRequest setEvent(RegistryWebhookEvent event) {
    this.event = event;
    return this;
  }

  public RegistryWebhookEvent getEvent() {
    return event;
  }

  public TestRegistryWebhookRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookRequest that = (TestRegistryWebhookRequest) o;
    return Objects.equals(event, that.event) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, id);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookRequest.class)
        .add("event", event)
        .add("id", id)
        .toString();
  }
}
