// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListExchangeFiltersResponse {
  /** */
  @JsonProperty("filters")
  private Collection<ExchangeFilter> filters;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListExchangeFiltersResponse setFilters(Collection<ExchangeFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<ExchangeFilter> getFilters() {
    return filters;
  }

  public ListExchangeFiltersResponse setNextPageToken(String nextPageToken) {
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
    ListExchangeFiltersResponse that = (ListExchangeFiltersResponse) o;
    return Objects.equals(filters, that.filters)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangeFiltersResponse.class)
        .add("filters", filters)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
