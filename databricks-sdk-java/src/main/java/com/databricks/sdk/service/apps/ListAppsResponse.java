// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAppsResponse {
  /** */
  @JsonProperty("apps")
  private Collection<App> apps;

  /** Pagination token to request the next page of apps. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListAppsResponse setApps(Collection<App> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<App> getApps() {
    return apps;
  }

  public ListAppsResponse setNextPageToken(String nextPageToken) {
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
    ListAppsResponse that = (ListAppsResponse) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppsResponse.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
