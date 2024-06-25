// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Subscriber {
  /**
   * The destination to receive the subscription email. This parameter is mutually exclusive with
   * `user_subscriber`.
   */
  @JsonProperty("destination_subscriber")
  private SubscriptionSubscriberDestination destinationSubscriber;

  /**
   * The user to receive the subscription email. This parameter is mutually exclusive with
   * `destination_subscriber`.
   */
  @JsonProperty("user_subscriber")
  private SubscriptionSubscriberUser userSubscriber;

  public Subscriber setDestinationSubscriber(
      SubscriptionSubscriberDestination destinationSubscriber) {
    this.destinationSubscriber = destinationSubscriber;
    return this;
  }

  public SubscriptionSubscriberDestination getDestinationSubscriber() {
    return destinationSubscriber;
  }

  public Subscriber setUserSubscriber(SubscriptionSubscriberUser userSubscriber) {
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
    Subscriber that = (Subscriber) o;
    return Objects.equals(destinationSubscriber, that.destinationSubscriber)
        && Objects.equals(userSubscriber, that.userSubscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationSubscriber, userSubscriber);
  }

  @Override
  public String toString() {
    return new ToStringer(Subscriber.class)
        .add("destinationSubscriber", destinationSubscriber)
        .add("userSubscriber", userSubscriber)
        .toString();
  }
}
