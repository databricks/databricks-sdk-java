// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing Monitors. */
@Generated
public class ListMonitorResponse {
  /** */
  @JsonProperty("monitors")
  private Collection<Monitor> monitors;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMonitorResponse setMonitors(Collection<Monitor> monitors) {
    this.monitors = monitors;
    return this;
  }

  public Collection<Monitor> getMonitors() {
    return monitors;
  }

  public ListMonitorResponse setNextPageToken(String nextPageToken) {
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
    ListMonitorResponse that = (ListMonitorResponse) o;
    return Objects.equals(monitors, that.monitors)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMonitorResponse.class)
        .add("monitors", monitors)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
