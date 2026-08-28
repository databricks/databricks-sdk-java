// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * RabbitMQ specific options for ingestion. Performance tuning options (consumers_per_task,
 * max_messages_per_fetch, etc.) are intentionally not exposed in the public API. The managed
 * connector uses sensible defaults internally. These can be added later if user demand arises.
 */
@Generated
public class RabbitmqOptions {
  /** (Required) RabbitMQ queue name to consume from. */
  @JsonProperty("queue")
  private String queue;

  public RabbitmqOptions setQueue(String queue) {
    this.queue = queue;
    return this;
  }

  public String getQueue() {
    return queue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RabbitmqOptions that = (RabbitmqOptions) o;
    return Objects.equals(queue, that.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue);
  }

  @Override
  public String toString() {
    return new ToStringer(RabbitmqOptions.class).add("queue", queue).toString();
  }
}
