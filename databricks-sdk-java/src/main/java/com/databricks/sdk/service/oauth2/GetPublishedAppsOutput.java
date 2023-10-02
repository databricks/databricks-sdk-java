// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetPublishedAppsOutput {
  /** Array of Published OAuth Apps. */
  @JsonProperty("apps")
  private Collection<PublishedAppOutput> apps;

  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetPublishedAppsOutput setApps(Collection<PublishedAppOutput> apps) {
    this.apps = apps;
    return this;
  }

  public Collection<PublishedAppOutput> getApps() {
    return apps;
  }

  public GetPublishedAppsOutput setNextPageToken(String nextPageToken) {
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
    GetPublishedAppsOutput that = (GetPublishedAppsOutput) o;
    return Objects.equals(apps, that.apps) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppsOutput.class)
        .add("apps", apps)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
