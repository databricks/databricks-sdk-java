// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListQualityMonitorResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("quality_monitors")
  private Collection<QualityMonitor> qualityMonitors;

  public ListQualityMonitorResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQualityMonitorResponsePb setQualityMonitors(
      Collection<QualityMonitor> qualityMonitors) {
    this.qualityMonitors = qualityMonitors;
    return this;
  }

  public Collection<QualityMonitor> getQualityMonitors() {
    return qualityMonitors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQualityMonitorResponsePb that = (ListQualityMonitorResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(qualityMonitors, that.qualityMonitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, qualityMonitors);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQualityMonitorResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("qualityMonitors", qualityMonitors)
        .toString();
  }
}
