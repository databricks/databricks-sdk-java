// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AlertV2SubscriptionPb {
  @JsonProperty("destination_id")
  private String destinationId;

  @JsonProperty("user_email")
  private String userEmail;

  public AlertV2SubscriptionPb setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public AlertV2SubscriptionPb setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  public String getUserEmail() {
    return userEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2SubscriptionPb that = (AlertV2SubscriptionPb) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userEmail, that.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userEmail);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2SubscriptionPb.class)
        .add("destinationId", destinationId)
        .add("userEmail", userEmail)
        .toString();
  }
}
