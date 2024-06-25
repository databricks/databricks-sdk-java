// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDashboardsResponse {
  /** */
  @JsonProperty("dashboards")
  private Collection<Dashboard> dashboards;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent dashboards.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDashboardsResponse setDashboards(Collection<Dashboard> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public Collection<Dashboard> getDashboards() {
    return dashboards;
  }

  public ListDashboardsResponse setNextPageToken(String nextPageToken) {
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
    ListDashboardsResponse that = (ListDashboardsResponse) o;
    return Objects.equals(dashboards, that.dashboards)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsResponse.class)
        .add("dashboards", dashboards)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
