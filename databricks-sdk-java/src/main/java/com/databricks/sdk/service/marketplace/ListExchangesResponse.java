// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExchangesResponse {
  /** */
  @JsonProperty("exchanges")
  private Collection<Exchange> exchanges;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExchangesResponse setExchanges(Collection<Exchange> exchanges) {
    this.exchanges = exchanges;
    return this;
  }

  public Collection<Exchange> getExchanges() {
    return exchanges;
  }

  public ListExchangesResponse setNextPageToken(String nextPageToken) {
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
    ListExchangesResponse that = (ListExchangesResponse) o;
    return Objects.equals(exchanges, that.exchanges)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchanges, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesResponse.class)
        .add("exchanges", exchanges)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
