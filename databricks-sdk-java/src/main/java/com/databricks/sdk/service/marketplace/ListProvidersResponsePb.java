// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListProvidersResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("providers")
  private Collection<ProviderInfo> providers;

  public ListProvidersResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProvidersResponsePb setProviders(Collection<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  public Collection<ProviderInfo> getProviders() {
    return providers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersResponsePb that = (ListProvidersResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, providers);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("providers", providers)
        .toString();
  }
}
