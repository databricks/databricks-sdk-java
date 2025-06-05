// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SubscriptionSubscriberDestinationPb {
  @JsonProperty("destination_id")
  private String destinationId;

  public SubscriptionSubscriberDestinationPb setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriberDestinationPb that = (SubscriptionSubscriberDestinationPb) o;
    return Objects.equals(destinationId, that.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriberDestinationPb.class)
        .add("destinationId", destinationId)
        .toString();
  }
}
