// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class DashboardTaskOutputPb {
  @JsonProperty("page_snapshots")
  private Collection<DashboardPageSnapshot> pageSnapshots;

  public DashboardTaskOutputPb setPageSnapshots(Collection<DashboardPageSnapshot> pageSnapshots) {
    this.pageSnapshots = pageSnapshots;
    return this;
  }

  public Collection<DashboardPageSnapshot> getPageSnapshots() {
    return pageSnapshots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardTaskOutputPb that = (DashboardTaskOutputPb) o;
    return Objects.equals(pageSnapshots, that.pageSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSnapshots);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTaskOutputPb.class)
        .add("pageSnapshots", pageSnapshots)
        .toString();
  }
}
