// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DashboardPageSnapshotPb {
  @JsonProperty("page_display_name")
  private String pageDisplayName;

  @JsonProperty("widget_error_details")
  private Collection<WidgetErrorDetail> widgetErrorDetails;

  public DashboardPageSnapshotPb setPageDisplayName(String pageDisplayName) {
    this.pageDisplayName = pageDisplayName;
    return this;
  }

  public String getPageDisplayName() {
    return pageDisplayName;
  }

  public DashboardPageSnapshotPb setWidgetErrorDetails(
      Collection<WidgetErrorDetail> widgetErrorDetails) {
    this.widgetErrorDetails = widgetErrorDetails;
    return this;
  }

  public Collection<WidgetErrorDetail> getWidgetErrorDetails() {
    return widgetErrorDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardPageSnapshotPb that = (DashboardPageSnapshotPb) o;
    return Objects.equals(pageDisplayName, that.pageDisplayName)
        && Objects.equals(widgetErrorDetails, that.widgetErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageDisplayName, widgetErrorDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardPageSnapshotPb.class)
        .add("pageDisplayName", pageDisplayName)
        .add("widgetErrorDetails", widgetErrorDetails)
        .toString();
  }
}
