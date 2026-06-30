// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a subscriber that will receive alert notifications. A subscriber can be either a user
 * (via email) or a notification destination (via destination_id).
 */
@Generated
public class AlertTaskSubscriber {
  /** */
  @JsonProperty("destination_id")
  private String destinationId;

  /** A valid workspace email address. */
  @JsonProperty("user_name")
  private String userName;

  public AlertTaskSubscriber setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public AlertTaskSubscriber setUserName(String userName) {
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
    AlertTaskSubscriber that = (AlertTaskSubscriber) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertTaskSubscriber.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }
}
