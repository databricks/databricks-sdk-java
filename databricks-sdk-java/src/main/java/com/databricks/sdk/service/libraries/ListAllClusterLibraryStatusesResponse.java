// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListAllClusterLibraryStatusesResponse {
  /** A list of cluster statuses. */
  @JsonProperty("statuses")
  private Collection<ClusterLibraryStatuses> statuses;

  public ListAllClusterLibraryStatusesResponse setStatuses(
      Collection<ClusterLibraryStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<ClusterLibraryStatuses> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllClusterLibraryStatusesResponse that = (ListAllClusterLibraryStatusesResponse) o;
    return Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllClusterLibraryStatusesResponse.class)
        .add("statuses", statuses)
        .toString();
  }
}
