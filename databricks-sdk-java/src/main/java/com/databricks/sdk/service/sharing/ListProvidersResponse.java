// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListProvidersResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** An array of provider information objects. */
  @JsonProperty("providers")
  private Collection<ProviderInfo> providers;

  public ListProvidersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListProvidersResponse setProviders(Collection<ProviderInfo> providers) {
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
    ListProvidersResponse that = (ListProvidersResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, providers);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("providers", providers)
        .toString();
  }
}
