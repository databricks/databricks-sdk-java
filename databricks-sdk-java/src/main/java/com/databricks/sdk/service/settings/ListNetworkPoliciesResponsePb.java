// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListNetworkPoliciesResponsePb {
  @JsonProperty("items")
  private Collection<AccountNetworkPolicy> items;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListNetworkPoliciesResponsePb setItems(Collection<AccountNetworkPolicy> items) {
    this.items = items;
    return this;
  }

  public Collection<AccountNetworkPolicy> getItems() {
    return items;
  }

  public ListNetworkPoliciesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNetworkPoliciesResponsePb that = (ListNetworkPoliciesResponsePb) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkPoliciesResponsePb.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
