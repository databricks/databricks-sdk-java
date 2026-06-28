// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SubscriptionSubscriberUser {
  /** UserId of the subscriber. */
  @JsonProperty("user_id")
  private Long userId;

  public SubscriptionSubscriberUser setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriberUser that = (SubscriptionSubscriberUser) o;
    return Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriberUser.class).add("userId", userId).toString();
  }
}
