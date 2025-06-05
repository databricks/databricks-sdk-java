// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListDashboardsResponsePb {
  @JsonProperty("dashboards")
  private Collection<Dashboard> dashboards;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDashboardsResponsePb setDashboards(Collection<Dashboard> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public Collection<Dashboard> getDashboards() {
    return dashboards;
  }

  public ListDashboardsResponsePb setNextPageToken(String nextPageToken) {
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
    ListDashboardsResponsePb that = (ListDashboardsResponsePb) o;
    return Objects.equals(dashboards, that.dashboards)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsResponsePb.class)
        .add("dashboards", dashboards)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
