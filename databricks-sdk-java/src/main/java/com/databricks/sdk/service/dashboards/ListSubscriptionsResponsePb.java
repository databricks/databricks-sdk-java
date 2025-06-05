// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListSubscriptionsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("subscriptions")
  private Collection<Subscription> subscriptions;

  public ListSubscriptionsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSubscriptionsResponsePb setSubscriptions(Collection<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<Subscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSubscriptionsResponsePb that = (ListSubscriptionsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSubscriptionsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
