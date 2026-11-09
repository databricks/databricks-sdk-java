// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of group visibility filters. */
@Generated
public class ListIdentityVisibilityFiltersResponse {
  /** The filters on this page. These are the rules, not the groups they match. */
  @JsonProperty("identity_visibility_filters")
  private Collection<IdentityVisibilityFilter> identityVisibilityFilters;

  /** The token for the next page. Not set on the last page. */
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
