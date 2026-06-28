// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlTaskSubscription {
  /**
   * The canonical identifier of the destination to receive email notification. This parameter is
   * mutually exclusive with user_name. You cannot set both destination_id and user_name for
   * subscription notifications.
   */
  @JsonProperty("destination_id")
  private String destinationId;

  /**
   * The user name to receive the subscription email. This parameter is mutually exclusive with
   * destination_id. You cannot set both destination_id and user_name for subscription
   * notifications.
   */
  @JsonProperty("user_name")
  private String userName;

  public SqlTaskSubscription setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public SqlTaskSubscription setUserName(String userName) {
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
    SqlTaskSubscription that = (SqlTaskSubscription) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskSubscription.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }
}
