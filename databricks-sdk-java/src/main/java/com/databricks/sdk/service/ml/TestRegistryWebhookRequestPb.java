// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TestRegistryWebhookRequestPb {
  @JsonProperty("event")
  private RegistryWebhookEvent event;

  @JsonProperty("id")
  private String id;

  public TestRegistryWebhookRequestPb setEvent(RegistryWebhookEvent event) {
    this.event = event;
    return this;
  }

  public RegistryWebhookEvent getEvent() {
    return event;
  }

  public TestRegistryWebhookRequestPb setId(String id) {
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
    TestRegistryWebhookRequestPb that = (TestRegistryWebhookRequestPb) o;
    return Objects.equals(event, that.event) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, id);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookRequestPb.class)
        .add("event", event)
        .add("id", id)
        .toString();
  }
}
