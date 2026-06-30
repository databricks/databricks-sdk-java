// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SubscriptionSubscriber {
  /**
   * A snapshot of the dashboard will be sent to the destination when the `destination_id` field is
   * present.
   */
  @JsonProperty("destination_id")
  private String destinationId;

  /**
   * A snapshot of the dashboard will be sent to the user's email when the `user_name` field is
   * present.
   */
  @JsonProperty("user_name")
  private String userName;

  public SubscriptionSubscriber setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public SubscriptionSubscriber setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriber that = (SubscriptionSubscriber) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriber.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }
}
