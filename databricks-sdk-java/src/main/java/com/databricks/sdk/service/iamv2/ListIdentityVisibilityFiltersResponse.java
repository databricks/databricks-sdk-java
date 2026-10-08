// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message containing a page of identity-visibility filters in the account. */
@Generated
public class ListIdentityVisibilityFiltersResponse {
  /** */
  @JsonProperty("identity_visibility_filters")
  private Collection<IdentityVisibilityFilter> identityVisibilityFilters;

  /**
   * A token, which can be sent as page_token to retrieve the next page. If omitted, there are no
   * subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListIdentityVisibilityFiltersResponse setIdentityVisibilityFilters(
      Collection<IdentityVisibilityFilter> identityVisibilityFilters) {
    this.identityVisibilityFilters = identityVisibilityFilters;
    return this;
  }

  public Collection<IdentityVisibilityFilter> getIdentityVisibilityFilters() {
    return identityVisibilityFilters;
  }

  public ListIdentityVisibilityFiltersResponse setNextPageToken(String nextPageToken) {
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
    ListIdentityVisibilityFiltersResponse that = (ListIdentityVisibilityFiltersResponse) o;
    return Objects.equals(identityVisibilityFilters, that.identityVisibilityFilters)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVisibilityFilters, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListIdentityVisibilityFiltersResponse.class)
        .add("identityVisibilityFilters", identityVisibilityFilters)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
