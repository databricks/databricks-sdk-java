// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SubscriberPb {
  @JsonProperty("destination_subscriber")
  private SubscriptionSubscriberDestination destinationSubscriber;

  @JsonProperty("user_subscriber")
  private SubscriptionSubscriberUser userSubscriber;

  public SubscriberPb setDestinationSubscriber(
      SubscriptionSubscriberDestination destinationSubscriber) {
    this.destinationSubscriber = destinationSubscriber;
    return this;
  }

  public SubscriptionSubscriberDestination getDestinationSubscriber() {
    return destinationSubscriber;
  }

  public SubscriberPb setUserSubscriber(SubscriptionSubscriberUser userSubscriber) {
    this.userSubscriber = userSubscriber;
    return this;
  }

  public SubscriptionSubscriberUser getUserSubscriber() {
    return userSubscriber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriberPb that = (SubscriberPb) o;
    return Objects.equals(destinationSubscriber, that.destinationSubscriber)
        && Objects.equals(userSubscriber, that.userSubscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationSubscriber, userSubscriber);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriberPb.class)
        .add("destinationSubscriber", destinationSubscriber)
        .add("userSubscriber", userSubscriber)
        .toString();
  }
}
