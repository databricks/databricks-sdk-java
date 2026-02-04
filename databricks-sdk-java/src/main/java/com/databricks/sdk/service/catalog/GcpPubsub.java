// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GcpPubsub {
  /** Unique identifier included in the name of file events managed cloud resources. */
  @JsonProperty("managed_resource_id")
  private String managedResourceId;

  /**
   * The Pub/Sub subscription name in the format projects/{project}/subscriptions/{subscription
   * name}. Only required for provided_pubsub.
   */
  @JsonProperty("subscription_name")
  private String subscriptionName;

  public GcpPubsub setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public GcpPubsub setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

  public String getSubscriptionName() {
    return subscriptionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpPubsub that = (GcpPubsub) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(subscriptionName, that.subscriptionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, subscriptionName);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpPubsub.class)
        .add("managedResourceId", managedResourceId)
        .add("subscriptionName", subscriptionName)
        .toString();
  }
}
