// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DashboardTaskOutput {
  /** Should only be populated for manual PDF download jobs. */
  @JsonProperty("page_snapshots")
  private Collection<DashboardPageSnapshot> pageSnapshots;

  public DashboardTaskOutput setPageSnapshots(Collection<DashboardPageSnapshot> pageSnapshots) {
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
    DashboardTaskOutput that = (DashboardTaskOutput) o;
    return Objects.equals(pageSnapshots, that.pageSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSnapshots);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTaskOutput.class).add("pageSnapshots", pageSnapshots).toString();
  }
}
