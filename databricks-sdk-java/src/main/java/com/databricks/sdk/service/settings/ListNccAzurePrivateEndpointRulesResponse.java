// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The private endpoint rule list was successfully retrieved. */
@Generated
public class ListNccAzurePrivateEndpointRulesResponse {
  /** */
  @JsonProperty("items")
  private Collection<NccAzurePrivateEndpointRule> items;

  /**
   * A token that can be used to get the next page of results. If null, there are no more results to
   * show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListNccAzurePrivateEndpointRulesResponse setItems(
      Collection<NccAzurePrivateEndpointRule> items) {
    this.items = items;
    return this;
  }

  public Collection<NccAzurePrivateEndpointRule> getItems() {
    return items;
  }

  public ListNccAzurePrivateEndpointRulesResponse setNextPageToken(String nextPageToken) {
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
    ListNccAzurePrivateEndpointRulesResponse that = (ListNccAzurePrivateEndpointRulesResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNccAzurePrivateEndpointRulesResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
