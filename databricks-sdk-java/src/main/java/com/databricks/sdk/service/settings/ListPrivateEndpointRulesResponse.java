// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The private endpoint rule list was successfully retrieved. */
@Generated
public class ListPrivateEndpointRulesResponse {
  /** */
  @JsonProperty("items")
  private Collection<NccPrivateEndpointRule> items;

  /**
   * A token that can be used to get the next page of results. If null, there are no more results to
   * show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListPrivateEndpointRulesResponse setItems(Collection<NccPrivateEndpointRule> items) {
    this.items = items;
    return this;
  }

  public Collection<NccPrivateEndpointRule> getItems() {
    return items;
  }

  public ListPrivateEndpointRulesResponse setNextPageToken(String nextPageToken) {
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
    ListPrivateEndpointRulesResponse that = (ListPrivateEndpointRulesResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateEndpointRulesResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
